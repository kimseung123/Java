package com.sist.main;

import java.util.Scanner;

/*
 *  11) �� ���� ������ �Է� �޾� 1���� �Է� ���� ���������� ���� ����϶�
 */
public class ����11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        int num=scan.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
        	sum+=i;
        }
        System.out.println("1���� "+num+"������ ��:"+sum);
	}

}
