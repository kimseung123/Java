package com.sist.munje;
/*
 * 7.	1~30 ¦����,Ȧ������ ����ϴ� ���α׷��� �ۼ�
	���) 
 */
public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0,odd=0;
        for(int i=1;i<=30;i++)
        {
        	if(i%2==0)
        		even+=i;
        	else
        		odd+=i;
        }
        System.out.println("¦�� ��:"+even);
        System.out.println("Ȧ�� ��:"+odd);
	}

}
