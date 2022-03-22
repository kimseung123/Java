package com.sist.main;
// 450~456 Object
/*
 *   �ڹ� ���̺귯�� 
 *   Ŭ���� 
 *   =====
 *     1. ����� ���� Ŭ���� 
 *          = ������ ����� (���� => �б�/����) => ĸ��ȭ 
 *          = ���(��û) ó�� (�޼ҵ�) => ���(����)
 *          = ���� => �������̽� 
 *     2. ���̺귯�� (�ڹ� ���� , �ܺο��� ���� => Jsoup , lombok)
 *     3. ���� Ŭ���� (main() => Ŭ����)
 *   �ڹ��� ���̺귯�� 
 *   =============
 *      java , javax = (Ȯ��� ����:XML,��,JSON...) => JDK1.2 
 *      =====
 *       java.lang : �ڹ��� �⺻ ���̺귯�� => Ŭ����(Ư����=> final)
 *                   => ����� �޾Ƽ� �������̵��� �� �� ���� 
 *                   => �ִ� �״�� ��� => ����Ŭ���� 
 *                   => ������ Ŭ���� 
 *       ========== �ش� Ŭ���� ============
 *       1. Object 
 *          => �ڹ��� �ֻ��� Ŭ���� (��� Ŭ������ ��� ������ Ŭ����)
 *          => �����Ϸ��� �ڵ����� ����� ������ ó�� (��� Object�κ��� ����)
 *          => Object Ŭ������ ��� ������������ ���� �� �ִ� Ŭ���� 
 *             Object i=10;
 *             Object i=10.5;
 *             Object i='A';
 *             Object i="aaa"; ==> ���� ū ��������
 *             ���� => ����ȯ 
 *             �迭 => ���� �������� 
 *             Object[] obj={"ȫ�浿",20,'A',10.5}
 *             int[] i={10,20,'A','b'...}
 *             int i='A'
 *                   ==== �ڵ� ����ȯ (65)
 *          => ��� (��� Ŭ����) 
 *             1) clone : �޸� �������Ŀ� ���ο� �޸𸮸� ����� �ش� 
 *                        => prototype : ���� �ƹ�Ÿ ���� 
 *                           ========== ������(�̱���=>prototype)
 *             2) toString() : ������ ���� , ��ü�� ������ �ִ� ������ ���ڿ�
 *                ===> ���� ���� �������̵�
 *                Object obj=new Object();
 *                System.out.println(obj);
 *                System.out.println(obj.toString()); 
 *             3) finalize() : �Ҹ����Լ� (��ü �޸� ����) �ڵ� ȣ��Ǵ� �޼ҵ�
 *                ========== ������ �÷��� 
 *       2. String 
 *            => Ŭ���� / �Ϲ� �������� => ���ڿ��� �����ϴ� Ŭ����
 *               �Ϲ� �������� 
 *                 String s=""; (*******)
 *               Ŭ���� 
 *                 String s=new String("");
 *               *** "" => ���ڿ�(���ڸ� ������ ������ ����)
 *                      => ���ڿ� ��ü�� �ּҴ� 
 *               *** String a="Hello";
 *               if("Hello".equals(a))  ""=>String�� ������ �ִ� ��� �ޙ�,�ѻ�� 
 *            => char[]�� �̿��ؼ� ���� ���α׷� 
 *            => ���(�޼ҵ�) 
 *               1. length() : ���� ����
 *               2. substring() : ���ϴ� �κ��� ������ �ڸ��� 
 *               3. indexOf() / lastIndexOf() : �ش� ����.���ڿ�
 *                  =========   =============
 *                   �տ���         �ڿ��� 
 *               4. replace() / replaceAll() => ������ ���¸� ����� 
 *                                              �ش系�� ���� 
 *                                              => ���Խ�
 *                                              [��-�R],[A-Z]
 *                                              [a-z],[0-9]
 *                                              .*Hello*.
 *                                              ^[��-�R]
 *                                              [A-Z]$ =====> AI
 *                  =========
 *                    Ư�� ����.���ڿ� ���� 
 *               5. equals() : �޸𸮾ȿ� ����� ���ڿ��� ������ ���� 
 *                             �α��� , ���̵�ã�� , ���̵��ߺ� 
 *               6. trim() : �¿��� �������� 
 *                           <a> Hello</a>
 *                           ������� �Ǽ� => space
 *               7. valueOf() : �Ϲݵ�������(�⺻)�� ���ڿ������� ���� 
 *                              valueOf(10) => "10"
 *               8. split() : ���й��ڷ� ���� => �迭 
 *                  ======= ���Խ� (��������) 
 *               9. contains() => ���� ���� (��õ)
 *               10. �ڵ��ϼ��� : startsWith(),endsWith()
 *       3. StringBuffer(�ӽ�������� ������ => �����͸� �� ����ش�)
 *            => append() => ���ڿ� ���� 
 *            => toString() : ����� ��� ������ ��� 
 *            => ���ڿ������� ����ȭ => ��뷮 ���ڿ� 
 *       4. Math => ���а��� ��� 
 *            => random() => 0.0~0.99 ������ ������ ���� ����
 *            => ceil() => ����¡ ��� (��������) => �ø� 
 *               => 10.1  ==> 11 , 10.0 ==> 10
 *            => round() => �ݿø� 
 *            => ����Ŭ�ȿ��� ������ �Լ��� ���� 
 *       5. Wrapper
 *            => 
 *            �⺻��      Ŭ����   ==> �⺻�� �����͸� ���� ����
 *                 <=== ��ڽ�
 *            int       Integer
 *            double    Double
 *            float     Float
 *            boolean   Boolean 
 *            long      Long
 *                  ===> �ڽ�(����ڽ�)
 *                  
 *            Integer i=10; �ڽ�
 *            int i=new Integer(1); ��ڽ� ==> int , Integer
 *                                  ==> ���׸��� 
 *                                      <int>(X) <Integer>(Ŭ������)
 *            ==> ���ڿ� => �ش� ������������ ���� 
 *                Integer.parseInt("10") => 10
 *                Double.parseDouble("10.5") => 10.5
 *                Boolean.parseBoolean("true") => true
 *       6. System
 *            ==> System.out => ǥ�� ��� => print, println,printf
 *                System.in  => ǥ�� �Է� => read
 *                System.exit(0) => ���α׷� ���� ����
 *                System.gc() => �޸� ���� ��û (������ �÷���)
 *       java.util
 *            ==> Date , Calendar , StringTokenizer
 *                Date:�ý����� ��¥.�ð� ���� 
 *                Calendar : �� (0~11) ==> month-1
 *                           ���� (1~7) ==> week-1
 *                StringTokenizer
 *                 = countTokens() : �ڸ� ����
 *                 = hasMoreTokens() : �ڸ� ������ ���� 
 *                 = nextToken() : �ڸ� �����͸� �о� �´� 
 *            ==> Collection
 *       java.text
 *       java.io
 *       java.net
 *       
 *   �ܺο��� �����ϴ� ���̺귯��(���� �ҽ�) => mvnrepository  
 *   =====================
 */
class B
{
	
}
class A
{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello A!!";
	}
	
}
public class ����_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
        System.out.println(a);
        B b=new B();
        System.out.println(b);// ��ü �ּҰ� ��� 
	}

}
