package com.sist.lib;
import java.util.*;
// ���� => toUpperCase(����-32) , toLowerCase(����+32)
// ���� ==> && (����), ||(������)
/*
 *   if(score>=0 && score<=100) => BETWEEN 0 AND 100
 *   if(score<0 || score>100) => ���� ó�� 
 */
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �Է°� �ޱ� 
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� �Է�:");
		String data=scan.next();
		// ASC 
		/*
		 *   A => 65 
		 *   a => 97
		 *   '0'=> 48 '1' '2' 
		 */
		// �빮�ڷ� ��ȯ => toUpperCase()
		/*for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(c>='a' && c<='z') // �ҹ��ڶ�� 
			{
				System.out.print((char)(c-32));
			}
		}*/
		// �ҹ��� ��ȯ  => toLowerCase()
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(c>='A' && c<='Z') // �ҹ��ڶ�� 
			{
				System.out.print((char)(c+32));
			}
		}
		System.out.println((int)'0');
	}

}
