package com.sist.main;

import java.util.Scanner;

/*
 *   4) �⵵�� �Է� �޾� �������� �ƴ����� �Ǻ��ϴ� ����� if~else������ ����϶�
 *      if((year%4==0 && year%100!=0) || (year%400==0))
 */
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("�⵵ �Է�:");
        int year=scan.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0))
        {
        	System.out.println(year+"�⵵�� �����Դϴ�");
        }
        else
        {
        	System.out.println(year+"�⵵�� ������ �ƴմϴ�");
        }
	}

}




