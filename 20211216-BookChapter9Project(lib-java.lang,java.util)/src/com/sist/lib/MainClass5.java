package com.sist.lib;
import java.util.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �߻� 
		int[] com=new int[3];
		// �ߺ����� ���� �߻� 
		int su=0; // ���� ���� 
		boolean bCheck=false; // �ߺ����� Ȯ�� 
		// �ߺ��� �ִ¸� ���� �ٽ� �߻� , �ߺ��� ���� ��쿡�� com�� ���� 
		// 1~9 ������ ���� �߻�  ==> nextInt(9)+1
		Random r=new Random();
		for(int i=0;i<3;i++)
		{
			bCheck=true;
			while(bCheck) // �ߺ� üũ 
			{
				// ���� �߻� 
				su=r.nextInt(9)+1;
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su) // �ߺ��� �ֳ�?
					{
						bCheck=true; // �ߺ��� �ִٸ� 
						break; // while�� �ٽ� ���� 
					}
				}
			}
			// �ߺ����� ������ �߻� 
			com[i]=su;
		}
		
        //System.out.println(Arrays.toString(com));
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		 
		while(true)
		{
			// ����� �Է�
			System.out.print("3�ڸ� ���� �Է�:");
			int input=scan.nextInt();
			// ����ó�� ==> || , ���� ó�� => &&
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�");
				continue; // whileó������ ���ư��� (while=>���ǽ�)
			}
			//�迭�� ���� ==> 345/100 (3)
			user[0]=input/100;
			user[1]=(input%100)/10; // 345%100 ==> 45/10 => 4
			user[2]=input%10; 
			
			// �ߺ��� ���� �Է��ϸ� �ȵȴ� 
			if(user[0]==user[1] || user[1]==user[2] || 
					user[0]==user[2])
			{
				System.out.println("�ߺ��� ���� ��� �� �� �����ϴ�!!");
				// �ٽ� ó������ ���� 
				continue;
			}
			// 0�� ����� �� ���� 
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0�� ��� �� �� �����ϴ�!!");
				continue;
			}
			// ��Ʈ
			int s=0;// �ڸ��� 
			int b=0;// ���� 
			/*
			 *    345  => 378 ==> 1S-0B
			 *    345  => 789 ==> 0S-0B
			 *    345  => 459 ==> 0S-2B 
			 *    
			 *    3 4 5
			 *    |
			 *    3 7 8
			 */
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j])// ���� ���� �ֳ�?
					{
						if(i==j) // ���� �ڸ��� �ִٸ� 
							s++;
						else  // �ٸ� �ڸ��� ���� ���� ���� 
							b++;
					}
				}
			}
		    System.out.printf("Input Numer:%d,Result:%dS-%dB\n",
		    		    input , s ,b);
			// ���Ῡ�� Ȯ��
		    if(s==3)
		    {
		    	System.out.println("Game Over!!");
		    	break;// ���� System.exit(0)
		    }
		}
		 
	}

}








