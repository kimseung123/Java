package com.sist.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainClass_Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
        list.add("���"); // 0
        list.add("��"); // 1
        list.add("����"); // 2
        list.add("����"); // 3
        list.add("������");// 4
        list.add("����"); // 5
        list.add("������");// 6
        System.out.println("===== �ߺ� ������ =====");
        System.out.println(list.toString());
        
        HashSet set=new HashSet();
        for(Object obj:list)
        {
        	set.add(obj);
        }
        System.out.println("===== Set ������ ��� =====");
        System.out.println(set.toString());
        // list2=new ArrayList();
        list.clear();
        Iterator it=set.iterator();
        while(it.hasNext())
        {
        	list.add(it.next());
        }
        
        System.out.println("===== �ߺ� ������ =====");
        System.out.println(list.toString());
        /*for(Object obj:list2)
        {
        	System.out.println(obj);
        }*/
	}

}
