package com.sist.munje;
/*
 * 13.	������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� 
	�迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
	��) ������ ������ : 3 6 3 6 1 3 8 9 6 9 
	����� 5.4
	[Hint] 1���� 10���� ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.
	int i  = (int)(Math.random()*10)+1;
 */
public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        int sum=0;
        for(int i=0;i<10;i++)
        {
        	arr[i]=(int)(Math.random()*10)+1;
        	sum+=arr[i];
        }
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.printf("���:%.2f",(sum/10.0));
	}

}
