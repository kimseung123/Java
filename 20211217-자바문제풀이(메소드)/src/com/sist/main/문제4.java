package com.sist.main;
/*
 *  3. �⵵�� �Է� �޾� ���⿩�θ� Ȯ���ϴ� ���α׷� �ۼ�
    �⵵ �Է� �޼ҵ�
    ���� ó�� 
    ��� 

 */
import java.util.*;
public class ����4 {
    public int input()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("�⵵ �Է�:");
    	return scan.nextInt(); // �Է��� ���� �Ѱ��ش�  
    }
    public boolean isYear(int year)
    {
    	boolean bCheck=false;// default 
    	if((year%4==0 && year%100!=0)||(year%400==0))
    		 bCheck=true;
    	return bCheck;
    }
    public void print(int year)// �޼ҵ� ��ü���� ó�� 
    {
    	if(isYear(year)) // �����̶�� 
    	{
    		System.out.println(year+"�⵵�� �����Դϴ�!!");
    	}
    	else // ������ �ƴϸ� 
    	{
    		System.out.println(year+"�⵵�� ������ �ƴմϴ�!!");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �޼ҵ尡 ������ �ȵ�
		����4 m=new ����4();
		int year=m.input();
		m.print(year);
		
	}

}
