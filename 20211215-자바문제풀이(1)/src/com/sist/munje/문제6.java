package com.sist.munje;
/*
 * 6.	100~999 ������ 4�ǹ���� �ƴ� ���� ����,���� ����ϴ� ���α׷� �ۼ�
	���)
 */
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0; //�����̳� ���� => 0���� �ʱ�ȭ 
        for(int i=100;i<=999;i++)
        {
        	if(i%4!=0)// 4�� ����� �ƴ� 
        	{
        		count++;// ���� 
        		sum+=i;//���� 
        	}
        }
        System.out.println("4�� ����� �ƴ� ����:"+count);
        System.out.println("4�� ����� �ƴ� ��:"+sum);
        
	}

}
