package com.sist.main;

import java.util.Scanner;

/*
 *  5) 100�� �������� ������ �Է� �޾� 90~100�̸� A,80~89�̸� B,70~79�̸� C, 60~69�̸� D,
   60�� ���ϸ� F�� ����϶� (���� if ���)
   
   if(���ǹ�)
   {
      ���ǹ��� true => ���� ������ => ����
      ���ǹ��� false => �Ʒ��ִ� ���ǹ����� �̵� 
   }
   else if(���ǹ�)
   {
      ���ǹ��� true => ���� ������ => ����
      ���ǹ��� false => �Ʒ��ִ� ���ǹ����� �̵�
   }
   else if(���ǹ�)
   {
      ���ǹ��� true => ���� ������ => ����
      ���ǹ��� false => �Ʒ��ִ� ���ǹ����� �̵�
   }
   else if(���ǹ�)
   {
      ���ǹ��� true => ���� ������ => ����
      ���ǹ��� false => �Ʒ��ִ� ���ǹ����� �̵�
   }
   else
   {
       �ش� ������ ���� ��� �����ϴ� ���� 
   }

 */
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.print("���� �Է�:");
        int score=scan.nextInt();
        
        char c='A';
        if(score>=90)
        	c='A';
        else if(score>=80)
        	c='B';
        else if(score>=70)
        	c='C';
        else if(score>=60)
        	c='D';
        else
        	c='F';
        
        System.out.println("����:"+c);
	}

}
