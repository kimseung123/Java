package com.sist.exception;
// �ߺ����� ���� �߻� ==> �ζ� (1~45) => 6 => ���� ó�� 
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� �߻� => �Ϲ�
		int[] com=new int[6]; // ����� ���� ��ġ 
		int su=0; // ���� �����ϴ� ���� 
		boolean bCheck=false; // �ߺ� ���� Ȯ���ϴ� ���� 
		// true => �ߺ� , false=> �ߺ��� ���� 
		for(int i=0;i<6;i++) // �Ǹ� ���� 
		{
			// 1. �ߺ����� Ȯ�� 
			bCheck=true;
			while(bCheck)
			{
				// ���� �߻�
				su=(int)(Math.random()*45)+1; // 1~45���� (������ ����)
				// random() ==> 0.0~0.99 => 45 ==> 0.0~44.9999
				// 0~44  +1  => 1~45 
				// Random r=new Random() ==> r.nextInt(45)+1
				// Math => random() , ceil() : �ø� (��������)
				// while ���� 
				bCheck=false; //�ݺ��� => default ���� 
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)// �ߺ��� ���ڰ� �ִ��� Ȯ��
					{
						bCheck=true;
						break;
					}
				}
				// ���� => �ߺ����� Ȯ�� 
			}
			// 2. �ߺ��̸� ==> ���� �ٽ� �߻� 
			// 3. �ߺ��� ������ ==> com�迭�� ���� 
			com[i]=su;
		}
		// ��� ��� ==> ����ó�� ==> 15 , 44
		//try
		//{
			for(int i:com)
			{
				System.out.print(i+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		//}catch(Exception ex) {}
	}

}
