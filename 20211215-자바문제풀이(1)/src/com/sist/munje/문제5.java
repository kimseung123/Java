package com.sist.munje;
/*
 * 5.	100~999���̿� 7�� ����� ������ ���� ����ϴ� ���α׷� �ۼ�
	���)
 */
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0,sum=0; //�����̳� ���� => 0���� �ʱ�ȭ 
        for(int i=100;i<=999;i++)
        {
        	if(i%7==0)// 7�� ���
        	{
        		count++;// ���� 
        		sum+=i;//���� 
        	}
        }
        System.out.println("7�� ��� ����:"+count);
        System.out.println("7�� ��� ��:"+sum);
        
	}

}
