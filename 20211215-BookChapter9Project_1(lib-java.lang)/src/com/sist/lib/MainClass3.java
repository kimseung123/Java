package com.sist.lib;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0(����),1(����),2(��)
		String[] data={"����","����","��"};
        //1. ��ǻ�� 
		int com=(int)(Math.random()*3);
		//System.out.println("��ǻ��:"+data[com]);
		//2. ����� �Է� 
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2):");
		int user=scan.nextInt();
		
		System.out.println("��ǻ��:"+data[com]);
		System.out.println("�����:"+data[user]);
		System.out.println("=====���=====");
		/*
		 *     user    com
		 *     ����(0)
		 *             ����(0)  => 0 (S)
		 *             ����(1)  => -1 (C)
		 *             ��(2)    => -2 (P)
		 *     ����(1)
		 *             ����(0)   => 1 (P)
		 *             ����(1)   => 0 (S)
		 *             ��(2)    => -1 (C)
		 *     ��(2)
		 *             ����(0)  => 2  (C)
		 *             ����(1)  => 1  (P)
		 *             ��(2)    => 0  (S)
		 *             
		 *       C => -1 , 2
		 *       P => -2 , 1
		 * 
		 * 
		 */
		//3. ��� ��� 
		switch(user-com)
		{
		case -1:case 2:
			System.out.println("��ǻ�� Win!!");
			break;
		case -2:case 1:
			System.out.println("Player Win!!");
			break;
		case 0:
			System.out.println("����!!");
		}
	}

}
