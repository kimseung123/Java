package com.sist.main;
/*
 *  2) �� ���� ������ �Է� �޾� 3�� ������� �Ǻ��Ͽ� ����϶�
 *     if(i%3==0)
 *     {
 *     }
 *     else
 *     {
 *     }
 */
import java.util.*;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        int num=scan.nextInt();
        if(num%3==0)
        {
        	System.out.println(num+"��(��) 3�� �����");
        }
        else
        {
        	System.out.println(num+"��(��) 3�� ����� �ƴϴ�");
        }
	}

}
