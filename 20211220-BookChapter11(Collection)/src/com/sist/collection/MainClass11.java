package com.sist.collection;
// TreeSet => headSet: ���� �� ��ü , tailSet : ū �� ��ü 
import java.util.*;
/*
 *     TreeSet 
 *       =>  ��� 
 *           1.add() �߰� 
 *           2.remove() ����
 *           3.clear() ��ü ����
 *           4.isEmpty() ������ ����
 *           5.first() ���� ���� �� 
 *           6.last() ���� ���� ��
 *           7.headSet() : ~���� ���� ��
 *           8.tailSet() : ~���� ���� ��  
 */
public class MainClass11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet set=new TreeSet();
        int[] score=new int[10]; // new => �ڵ� 0���� ���� 
        // �迭 �ʱ�ȭ 
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
        	score[i]=r.nextInt(101); //0~100
        }
        System.out.println(Arrays.toString(score));
        // ���� 
        // 60�̻��� �����͸� ���
        System.out.println("===== 60�̻� ������ ��� ======");
        for(int jumsu:score)
        {
        	if(jumsu>=60)
        	{
        		System.out.println(jumsu);
        	}
        }
        
        System.out.println("===== 60�̸� ������ ��� ======");
        for(int jumsu:score)
        {
        	if(jumsu<60)
        	{
        		System.out.println(jumsu);
        	}
        }
        
        // TreeSet�� ������ ÷�� 
        System.out.println("===== TreeSet�� ������ ÷�� =====");
        for(int jumsu:score)
        {
        	set.add(jumsu);
        }
        System.out.println(set.toString());
        
        System.out.println("===== TreeSet�� 50���� ū �� =======");
        System.out.println(set.tailSet(50));
        System.out.println("===== TreeSet�� 50���� ���� �� =======");
        System.out.println(set.headSet(50));
        
	}

}
