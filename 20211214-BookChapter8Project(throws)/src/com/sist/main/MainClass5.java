package com.sist.main;
// ����� ���� ����ó�� (�ڹٿ��� �������� �ʴ� ���ܰ� �߻��ÿ� ���� ���� ó��)
// 439������ (���󵵴� ���� ����)
// try~catch , throws 
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg); // ExceptionŬ������ ������ 
		// this => MyExeptionŬ������ ��ü => static  
	}
}
/*
 *      class A
 *      {
 *      }
 *      
 *      => 1. Ŭ���� ���� 
 *            =========
 *            A a=new A(); // ���÷���  Class.forName()
 *            => JVM => this=a; => ��ü ���� �ּҸ� ����ϰ� �ִ� 
 *            
 *         2. ��� (�ӵ��� ���� => JOIN (Subquery) ==> ����ȭ 
 *            �޸� �Ҵ� ==> ��� ������ Ŭ���� �޸� �Ҵ�
 *                          ��� �޴� Ŭ���� �޸� �Ҵ� 
 */
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����� ���� ����ó���� �ڵ����� ã�� �� ���� (���� ȣ��)
		// �̹� �ڹٿ� ������ ����ó���� �ڵ� ȣ���� ���� 
		/*
		 *    1. ������ ȣ�� 
		 *       new ������()
		 *    2. ����ó�� ȣ�� 
		 *       throw new ������() => ���� ������ (����ó���� ã�´�)
		 *       
		 *       
		 *    break , continue , return , throw => �ؿ� �ҽ� �ڵ��� �Ұ��� 
		 */
		try
		{
			int a=11;
			if(a%2==0)
			{
				// �ҽ� �ڵ��� ���� 
				throw new MyException("¦���Դϴ�"); // catch����
				// throw �ؿ��� �ҽ��ڵ��� �� �� ���� 
				// System.out.println("Hello");
			}
			else
			{
				throw new MyException("Ȧ���Դϴ�");
			}
		}catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}

}







