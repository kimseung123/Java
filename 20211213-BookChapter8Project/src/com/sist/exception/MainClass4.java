package com.sist.exception;
// try~catch ==> �޼ҵ�� , ������ , �ʱ�ȭ��� , Ŭ���� ��Ͽ����� ��� �� �� ���� 
public class MainClass4 {
	// ���� �ϴ� ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ��ü ����ó�� 
		//try
		//{
		    // ������ ���� 
			for(int i=1;i<=10;i++)
			{
				try
				{
					int j=(int)(Math.random()*3);
					// 0,1,2
					int k=i/j;
					System.out.println("k="+k);
				}catch(Exception ex)
				{
					System.out.println(ex.getMessage());
					// i++ ==> �̵�
				}
			}
		//}catch(Exception ex)
		//{
			//System.out.println(ex.getMessage());// ���� �޼��� ��� 
			/*
			 *   getMessage() => ���� ���� �޼����� ��� 
			 *   printStackTrace() => ��� �κ� üũ (�ټ�)
			 */
		//}
	}

}
