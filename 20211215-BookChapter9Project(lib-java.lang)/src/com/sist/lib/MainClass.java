package com.sist.lib;
/*
 *    ���̺귯�� (�ڹٿ��� ���� , �ܺξ�ü ����)=> ������ ���Ǵ� ���̺귯��
 *             ==========   ========== open source
 *                           �� (Map) , ũ�Ѹ� , �����ͺ��̽� ���� 
 *                           ������ 
 *    java.lang : �ڹ� �ڵ� �⺻�� �Ǵ� ���̺귯�� 
 *      **Object => ��� Ŭ������ ����� ���� Ŭ���� (�ֻ��� Ŭ����) 
 *        = ��� 
 *          1) toString() => ���ڿ� ��ȯ 
 *          2) clone() => ��ü�޸� ���� (���ο� �޸𸮰� ����)
 *          3) finalize() => ��ü �Ҹ�� �ڵ� ȣ��Ǵ� �޼ҵ� 
 *             ========== ������ �÷��� (���α׷��� ����� �޸� ����)
 *                        ==========
 *                        = ��ü�� null
 *                        = ������� �ʴ� ������ �ִ� ��� 
 *                        = �������� ����� �޸� 
 *                        = new 
 *                        = �������� , �Ű����� => �޸� ��ü ����(����)
 *      **String 
 *      **StringBuffer
 *      StringBuilder 
 *      **Math
 *      **Wrapper (��ü �⺻ �������� => Ŭ����)
 *      System
 *    =============== import�� ������ �� �ִ� 
 *    java.util
 *    java.io
 *    java.text
 *    java.net
 *    ========== java�� �����ϴ� ��Ű�� (JDk1.0)
 *    javax.xml , javax.http
 */
// toString() => ȣ�� => ��ü�� ��� => toString()�� ȣ���Ѵ� 
class Card
{
	String kind; // null
	int num; // 0
	// �ʱ�ȭ => {} �ʱ�ȭ ��� , ������() 
	public Card() // ����Ʈ ������ 
	{
		kind="��";
		num=1;
	}
	// �����ε� : �ߺ� �޼ҵ� ����
	public Card(String kind,int num)
	{
		this.kind=kind;
		this.num=num;
	}
	// Object�� ������ �ִ� �޼ҵ带 ������ (�������̵�: �޼ҵ� ���Ǹ� ����)
	public String toString()
	{
		return kind+":"+num;
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Card c1=new Card();
        /*
         *   kind="��";
		     num=1;
         */
        Card c2=new Card("��",2);
        /*
         *   kind="��"
         *   num=2
         */
        
        // ���
        System.out.println(c1); // c1.toString()
        System.out.println(c2); // c2.toString() => �ּҰ� 
        
        // ��Ÿ 
        Class c3=c1.getClass();
        System.out.println(c3);
        try
        {
          Class c4=Class.forName("com.sist.lib.Card");
          System.out.println(c4);
        }catch(ClassNotFoundException e) {}
        
	}

}
