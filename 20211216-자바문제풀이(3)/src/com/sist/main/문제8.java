package com.sist.main;
/*
 *  8) 2+4+6+....100������ ������ ���� ���ϰ� ����϶� (for ���)
 *  
 *       1  ��  2  �� 4
 *  for(�ʱⰪ;���ǽ�;������)
 *           ��      ��
 *     �ݺ����� ���� 3 
 */
public class ����8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
        for(int i=2;i<=100;i+=2)
        {
        	sum+=i;
        }
        
        System.out.println("2+4+6+....100������ ������ ��:"+sum);
	}

}
