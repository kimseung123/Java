package com.sist.main;
/*
 *  12) 1���� 30������ �������� ¦���� �� �ٿ� 3���� ����϶�
 
    13) 1-2+3-4+5-6+7-8+9-10 ��� ���� for���� �̿��Ͽ� ����϶� 

    14) 1~10 ������ ���� �� 3�� ����� �����ϰ� ����϶� (continue ���)

 */
public class ����12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=30;i++)
        {
        	if(i%2==0)
        	{
        		
        		System.out.printf("%2d ",i);
        		if(i%3==0)
        			System.out.println();
        		
        	}
        }
        System.out.println();
        int sum=0;
        for(int i=1;i<=10;i++)
        {
        	if(i%2==0)
        		sum-=i;
        	else
        		sum+=i;
        }
        System.out.println("1-2+...+7-8+9-10 ��:"+sum);
        
        System.out.println();
        for(int i=1;i<=10;i++)
        {
        	if(i%3==0)
        		continue; // 3�� ��� ���� 
        	System.out.print(i+" ");
        }
	}

}
