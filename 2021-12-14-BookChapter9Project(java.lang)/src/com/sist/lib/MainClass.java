package com.sist.lib;
/*
 *   �ڹ� 
 *   1) ���� 
 *      =========> 1~8�� (���� , �迭 , Ŭ���� , ������ , ���,�޼ҵ�)
 *   2) �뵵 
 *      =========> Ŭ����,�޼ҵ� , ���� (�ν��Ͻ� , static)
 *                 ===== ���� �������̽� , �޼ҵ� (������,�Ű�����)
 *                 ===== ����ó�� (try~catch , throws)
 *   3) ���� 
 *      ����� ���� Ŭ���� + ���̺귯�� 
 *   4) ���� (�˰���) 
 *      => �ҽ��� �ϱ� => ���� 
 *      => �ڹٿ��� ���� ���� ���α׷� 
 *         =====================
 *          ��Ʈ��ũ / �����ͺ��̽� =====> ��� �����ڰ� ���� �ڵ� (ǥ��ȭ)
 *      => ������ / ������ (����)
 *         2�� for   1�� for 
 *   ==> �ݺ� / ��ġ Ȯ�� / CV ==> �м� 
 *   450page 
 *   java.lang    java.util   java.io    java.net  java.sql  java.text
 *   javax.xml    org.w3c.dom  org.w3c.sax 
 *   javax.http(JSP)
 *   
 *   1. java.lang ==> import�� ������ �� �ִ� 
 *      =========
 *      1) Object : ��� Ŭ����(���������,���̺귯��)�� ����� ������ Ŭ���� 
 *         class A (extends Object) ������ �ȴ� 
 *         = toString(��ü�� ���ڿ�ȭ)
 *         = finalize() : �Ҹ��� �޼ҵ� (��ü�� �޸𸮿��� ���� �ڵ� ȣ��Ǵ� �޼ҵ�)
 *         = clone() : ���� ==> ������ (prototype)
 *      2) String / StringBuffer / StringBuilder
 *         ���̺귯�� : ���� , �뵵 
 *           ���� 
 *           public int length()
 *         = String (���ڿ� �����ϴ� �޼ҵ�)
 *           = length() : ���� ���� => ...
 *             ����) public int length()
 *           = equals() : ���ڿ��� �� (==(X)) => �α��� , id�ߺ�üũ
 *             (��ҹ��� ����) 
 *             ����) public boolean equals(String s)
 *           = equalsIgnoreCase() : ���ڿ� �� (��ҹ��� ���� ����)
 *             �˻��� 
 *             ����) public boolean equalsIgnoreCase(String s)
 *           = substring() : ���ϴ� �κи� ���ڿ��� �ڸ��� ���� 
 *             ����)
 *                  public String substring(int start)
 *                  public String substring(int start,int end)
 *           = trim() : �¿� ������ �����Ҷ� ��� 
 *             => ����ڰ� �Ǽ��� space�� ��� => ���ʿ� ������ �־ 
 *                ã�Ⱑ ��ƴ� 
 *             => public String trim() => ���鹮�� ������ �ٽ� ����
 *           = indexOf ==> ���ڸ� ã�� (�տ���)
 *             => public int indexOf(String s)
 *                public int indexOf(char c)
 *           = lastIndexOf ==> ���ڸ� ã�� (�ڿ���)
 *             => public int lastIndexOf(String s)
 *                public int lastIndexOf(char c)
 *           = split() ==> ���ڿ��� �и� 
 *             => public String[] split(String regex) 
 *           = replace() ==> �����Ѱ� ���� 
 *             => public String replace(char c1,char c2)
 *                public String replace(String c1,String c2)
 *           = replaceAll() ==> ���� ��ü ����(���Խ�)
 *             => public String replaceAll(String s1,String s2)
 *                �ѱ� [��-�R]
 *                ���� [A-Za-z]
 *                ���� [0-9]
 *           = charAt() => ���ڿ��߿� �����Ѱ� �ڸ��� ���
 *             => public char charAt(int index) 
 *           ======================================
 *           = startsWith : ���۹��ڿ�
 *             => public boolean startsWith(String s)
 *           = endsWith : ������ ���ڿ� 
 *             => public boolean endsWith(String s)
 *           �ڵ��ϼ��� (������Ʈ) ==> �˻��� , Cookie���� 
 *           ======================================
 *           = toUpperCase : �빮�� ��ȯ
 *             => public String toUpperCase()
 *           = toLowerCase : �ҹ��� ��ȯ 
 *           => public String toLowerCase()
 *           = valueOf() :��� ���������� ���ڿ��� ��ȯ 
 *           => valueOf(3) ==> "3"
 *              valueOf(true) ==> "true"
 *              public static String valueOf(int a)
 *              public static String valueOf(boolean a)
 *              public static String valueOf(char a)
 *              public static String valueOf(float a)
 *              ..
 *              ..
 *              ..
 *      3) Math 
 *          => ceil : �ø� 
 *          => random : ���� 
 *      4) Wrapper : ��� ���������� Ŭ���� 
 *         =========
 *          byte ==> Byte 
 *          short ==> Short 
 *          int  ==> Integer
 *          double ==> Double 
 *          float  ==> Float 
 *          boolean ==> Boolean
 *      5) System 
 *         =========
 *           System.in
 *           System.out
 *           System.gc() => ��Ƽ�̵�� , ȭ�� ...
 */
/*
 *   Object : ��� Ŭ������ �ֻ��� Ŭ���� (��� Ŭ������ Object�� ���� ���)
 *   => Object�� ������ �ִ� ��� �޼ҵ带 ����� �� �ִ� 
 *   => �ڹ� Ŭ���� 
 *      class A extends Object
 *              =============== �ڵ� ������ �����ϰ� ���� 
 *      = toString()
 *      = finalize() 
 *      = clone() 
 *      = ��ü ��� ��� 
 *        = ����
 *        = ���� 
 */
class Sawon /* extends Object */
{
	private String name;
	public Sawon(String name)
	{
		// ������ => ������ �ʱ�ȭ 
		System.out.println("Sawon ��ü �޸𸮿� ����");
		this.name=name;
	}
	//��� 
	public void print()
	{
		// ��ü ��� Ȱ��
		System.out.println("�̸�:"+name);
	}
	//�޸𸮿� ���� 
	//��ü�� �޸𸮿��� ������� �ڵ�ȣ��Ǵ� �޼ҵ� (�Ҹ���)
	/*
	 *   A()  ==> new 
	 *   ~A() ==> �޸� ���� delete (GC) => �ڵ� �޸� ���� 
	 */
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Sawon ��ü �޸� ����...");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sawon�� ������ �ִ� �̸��� "+name+"�Դϴ�";
	}
	
	// Object���� ������ (�������̵�) => toString()
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��� ��� ��� 
		// 1. �޸𸮿� ���� 
		Sawon s=new Sawon("ȫ�浿");
		// com.sist.lib.Sawon@5e91993f
		System.out.println(s.toString());// �ּҰ��� ���
		System.out.println(s);
		// 2. Ȱ�� 
		s.print();
		// 3. �޸� ���� => s=null (GC)
		s=null; // ������� �ʴ´� 
		// 4. ���� ���� 
		System.gc(); // �������÷��� ȣ�� (�޸𸮿��� ������� �ʰų� , null�϶� ȸ��)
		// finalize()�� ȣ��Ǹ� �޸𸮿��� ����
		
	}

}



