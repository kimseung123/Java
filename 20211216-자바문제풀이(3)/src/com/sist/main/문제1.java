package com.sist.main;
/*
 *  1) Scanner Ŭ������ �̿��Ͽ� �� ���� ������ �Է� �޾� ������� �������� �Ǻ��Ͽ� ����϶�
 *     if(���ǹ�)
 *     {
 *        ���ǹ� true 
 *     }
 *     else
 *     {
 *        ���ǹ� false
 *     }
 *     
 *     ���� ? ���1 : ���2 ==> �� 
 */
import java.util.*;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        int num=scan.nextInt();
        ///////// 1��
        /*if(num>0)
        {
        	System.out.println(num+"��(��) ����Դϴ�");
        }
        else
        {
        	System.out.println(num+"��(��)  �����Դϴ�");
        }*/
        ////////
        // ���׿����� 
        System.out.println(num>0?num+"��(��) ����Դϴ�":num+"��(��)  �����Դϴ�");
	}

}








