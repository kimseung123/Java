package com.sist.collection;
import java.util.*;
// Iterator���� 
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector list=new Vector(); //ArrayList,LinkedList
        // ������ �߰� 
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        
        System.out.println("����� ������ ����:"+list.size());
        // ������ ��� 
        for(int i=0;i<list.size();i++)
        {
        	System.out.print(list.get(i)+" ");
        }
        System.out.println("\n===== Iterator �̿�======");
        Iterator it=list.iterator();
        /*System.out.println("������ ���(0):"+it.next());
        //it.remove();
        System.out.println("������ ���(1):"+it.next());
        System.out.println("������ ���(2):"+it.next());
        System.out.println("������ ���(3):"+it.next());
        System.out.println("������ ���(4):"+it.next());
        */
        System.out.println("====���� �̿�====");
        while(it.hasNext())// �����Ͱ� �ִ� ������ŭ�� ������ ���� 
        {
        	System.out.println(it.next());
        }
        
        
	}

}
