package com.sist.main;
/*
 * 4. throw�� ���� �������� Ʋ�� ���� �����Դϱ�?
�� ���ܸ� ���ʷ� �߻���Ű�� �ڵ��̴�.
�� ���ܸ� ȣ���� ������ ���ѱ�� ���� �޼ҵ� ����ο� �ۼ��ȴ�. => throws 
                  ========== ���� �ϰ� �Ѿ�� (JVM)
�� throw�� �߻��� ���ܴ� �Ϲ������� �����ڳ� �޼ҵ� ����ο� throws�� ���Ѱ�����.
�� throw Ű���� �ڿ��� ���� ��ü ���� �ڵ尡 �´�
   ����ó�� a=new ����ó��();
   throw a;
   
   throw new ����ó��()

 */
class A
{
	public void display()
	{
		System.out.println("A:Call...");
	}
}
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A(); // int malloc()
        a.display();
        
        new A().display();
	}

}
