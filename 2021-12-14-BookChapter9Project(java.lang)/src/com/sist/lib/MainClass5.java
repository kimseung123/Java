package com.sist.lib;
// compareTo => ���ڿ��� �� 
// contains = ���� 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int compareTo(String s) 
		// => ���̺귯�� ������, �Ű�����, �޼ҵ�� , ��� 
		//1.String ���ڿ��� ���� 
		// compareTo ==> ���ڿ� ���� 
		String s1="AAA";
		String s2="DDD";
		int i=s1.compareTo(s2);
		System.out.println(i);
		// A-D => -3
		/*
		 *   s1-s2 ==> - (s2�� ū���� ������ �ִ�)
		 *   s1-s2 ==> + (s1�� ū���� ������ �ִ�)
		 *   s1-s2 ==> 0 (s1�� s2�� ���� ���� ������ �ִ�)
		 */
		// concat ==> ����) String concat(String s) => ���ڿ� ���� (+)
		s1="Hello ";
		s2="Java!!";
		System.out.println(s1+s2);
		String s3=s1.concat(s2);
		System.out.println(s3);
		
	}

}
