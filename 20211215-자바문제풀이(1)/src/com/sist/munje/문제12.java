package com.sist.munje;
/*
 * 12.	int[] num = { 94, 85, 95, 88, 90 };
	
	���� �迭���� �ִ밪,�ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	
 */
public class ����12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 94, 85, 95, 88, 90 };
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
				max=num[i];
			if(min>num[i])
				min=num[i];
		}
		
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);
	}

}
