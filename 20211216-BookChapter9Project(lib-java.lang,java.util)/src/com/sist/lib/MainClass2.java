package com.sist.lib;
// => 494 page (����ڽ�/��ڽ�)
/*
 *    �����Ϸ��� ���� �ڵ� �߰� 
 *    1. class A extends Object
 *               ==============
 *    2. public void display()
 *       {
 *       
 *           return�� ���� ��쿡 �ڵ� �߰� 
 *       }
 *    3. class A
 *       {
 *          // public A(){} => ����Ʈ ������ 
 *       }
 *    4. import java.lang.*;
 *    5. Integer i=10;
 *       int j=i.intValue();
 *              ============
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����ڽ� 
		Integer i=10; //int ����ڽ� 
		int j=i; // ��ڽ�
		// int j=i.intValue() ==> 1.5 �ڵ� �߰� 
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		Double d1=10.5;
		double d2=d1;// Ŭ������ ������ �ִ� ������ ==> �Ϲݵ��������� ���� (��ڽ�)
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		
		Boolean b1=true;
		boolean b2=b1; // Ŭ������ �Ϲݵ��������� ��Ī�� ���� 
		
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		//�������� ����ȭ => ���׸��� 
		// List<int> ==> X , List<Integer> ==> �ٽ�
		// �Ϲݵ����Ͱ� �����ϰ� ����Ѵ� 
		// Object => ��� �������� / ��� Ŭ������ ���� �� �ִ� 
		// Object => Ŭ������ ������ �ִ� ��� �Ѱ��� ��� ����� ���� 
		// ���α׷� => ��� ��� ==> �Ѱ��� �̸����� ó�� 
		// ������ ������ �ִ� ��� => �迭(���� ������) , Ŭ����(�ٸ� ������)
		// ��ɹ� ������ => �޼ҵ� 
		// ������ ������ , �޼ҵ� ������ ==> Ŭ���� 
		// Ŭ������ ������ ==> �������̽� , Object 
		// ���� ���� => ������ , ���� ==> ������ 
		Object o1=10;
		Object o2=10.5;
		Object o3=true;
		Object o4='A';
		Object o5=10.9f;
		Object o6=100L;
		System.out.println("o1="+o1);
		System.out.println("o2="+o2);
		System.out.println("o3="+o3);
		System.out.println("o4="+o4);
		System.out.println("o5="+o5);
		System.out.println("o6="+o6);
		//return 
	}

}






