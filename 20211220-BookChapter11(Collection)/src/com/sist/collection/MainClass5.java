package com.sist.collection;
// => 614 
// 1. Iterator , ListIterator
// => �÷��� Ŭ������ �����Ϳ� ������ ���� ������ִ� �������̽� 
// ArrayList , LinkedList , Vector => ����(�ε���)
// Set , Map => ������ ���� (������ ����ϸ� => Iterator�� �̿��ؼ� ������ ����)
// Iterator => hasNext() : �����Ͱ� �����Ҷ����� 
// ������ �б� => next() => ���������� ������ �бⰡ ���� (������)
// ListIterator 
// => �� => �Ʒ� hasNext() , next()
// => �Ʒ� => �� hasPrevious() , previous()
import java.util.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add("���"); // 0
        list.add("��"); // 1
        list.add("����"); // 2
        list.add("����"); // 3
        list.add("������");// 4
        
        // ��� 
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(i+":"+list.get(i));
        }
        // ���� 
        for(int i=list.size()-1;i>=0;i--)
        {
        	System.out.println(i+":"+list.get(i));
        }
        
        /*System.out.println("===== while ======");
        int i=0;
        while(!list.isEmpty())
        {
        	System.out.println(list.get(i));
        	i++;
        }*/
        Iterator it=list.iterator(); // Set , Map (�ε����� ���� �÷���)
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        System.out.println("======= ListIterator=======");
        ListIterator lt=list.listIterator();
        while(lt.hasNext())// ��=>�Ʒ�
        {
        	System.out.println(lt.next());
        }
        System.out.println("======= �������� ��� ========");
        while(lt.hasPrevious())// �Ʒ� => ��
        {
           System.out.println(lt.previous());	
        }
        // ������ ����
	}

}
