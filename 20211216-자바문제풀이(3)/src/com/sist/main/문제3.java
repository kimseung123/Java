package com.sist.main;
/*
 *  3) Scanner Ŭ������ �̿��Ͽ� �� ���� ������ �Է� �޾� ������ ���밪�� ����϶�
 *     if(num<0)
 *     {
 *         System.out.println(num+"�� ���밪�� "+num*-1)
 *         num+"�� ���밪�� "+(num+1)
 *         num+"�� ���밪�� "+(num-1) ==> ���� 
 *         num+"�� ���밪�� "+num*1
 *         num+"�� ���밪�� "+num/1
 *     }
 *     else
 *     {
 *        System.out.println(num+"�� ���밪�� "+num)
 *     }
 */
import java.util.*;
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        int num=scan.nextInt();
        System.out.println(num+"�� ���밪�� "+Math.abs(num));
	}

}
