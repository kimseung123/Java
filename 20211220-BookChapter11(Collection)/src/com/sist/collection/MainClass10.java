package com.sist.collection;
// Set => TreeSet 
import java.util.*;
/*
 *   ArrayList , HashSet , HashMap ==> ��
 */
public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet set=new TreeSet();
        // ������ �߰� 
        /*
         *  min=100
	        min=80  set.add(80);
			min=80  set.add(100);
			min=70  set.add(70);
			        set.add(85);
			        set.add(98);
			        set.add(83);
         */
        set.add(80);
        set.add(100);
        set.add(70);
        set.add(85);
        set.add(87);
        set.add(98);
        set.add(92);
        set.add(83);
        
        System.out.println("���� ���� ����:");
        int min=100;// ���� ���� �� => ���ؼ� ���� 
        for(Object score:set)
        {
        	int a=(int)score;
        	if(min>a)
        		min=a;
        }
        System.out.println(min);
        System.out.println("���峷�� ��:"+set.first());// �ּҰ�
        System.out.println("���� ���� ����:");
        int max=70;// ���� ���� �� => ���ؼ� ���� 
        for(Object score:set)
        {
        	int a=(int)score;
        	if(max<a)
        		max=a;
        }
        System.out.println(max);
        System.out.println("���� ���� ��:"+set.last());// �ִ밪 
        System.out.println(set.lower(90));//90����  => ���� �ٻ�ġ 
        System.out.println(set.higher(90));//90�̻� => ���� �ٻ�ġ 
        System.out.println(set.floor(98));// 98�̰ų� �ٷ� �Ʒ� 
        System.out.println(set.ceiling(97));// 98�̰ų� �ٷ� ��
        // ���� ���� : DESC
        NavigableSet d=set.descendingSet();
        System.out.println(d.toString());
        // �ø� ���� : ASC
        NavigableSet a=d.descendingSet();
        System.out.println(a.toString());
        
        // ~ ORDER BY no DESC|ASC
	}

}
