package com.sist.main;
// ���� ����Ǿ� �ִ� �ҽ� 
/*
 *     �޼ҵ�() throws ����ó���� ������ ....
 *     
 *     => ȣ��ÿ� ����ó���� �ϰ� ��� 
 *        1. �޼ҵ�() throws (����:Exception,Throwable) 
 *        2. �޼ҵ�()
 *           {
 *              try
 *              {
 *              }catch(Exception,Throwable){}
 *           }
 */
public class MainClass2 {
    // ���� (���̺귯��) => ����Ŭ
	// IO , Network , Oracle ...
	String name;
	public static MainClass2 createClass() throws Exception
	{
		// Ŭ�����̸����� �޸� �Ҵ��� ���� (���÷���)
		// ������ => Ŭ���� �̸��� �����ϸ� => �޸� �Ҵ� (Ŭ���� ����)
		// ������ => Ŭ���� ���� 
		Class clsName=Class.forName("com.sist.main.MainClass2");
		Object obj=clsName.getDeclaredConstructor().newInstance();
		return (MainClass2)obj;
		// ���ռ�(�ٸ� ������ �ִ��� ����) , ������(�޼ҵ�) 
	}
	// �̹� �ڵ尡 �Ǿ� �ִ� ���� => throws (��������)
	// �ڵ尡 ���� ���� => try~catch(����)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
          MainClass2 m=createClass(); // �ݵ�� ����ó���� �����Ѵ�
          m.name="ȫ�浿";
          System.out.println(m.name);
        // try~catch 
        // ���� throws 
		}catch(Exception e) {}
	}

}
