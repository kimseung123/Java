package com.sist.collection;
import java.util.*;
// Set ��� 
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        // ��ȭ �帣 
        list.add("���"); //0
        list.add("�׼�");//1
        list.add("��Ÿ��");//2
        list.add("�ڹ�");//3
        list.add("���");//4
        list.add("�׼�");//5
        list.add("���");//6 => ã�� (�ε����� �̿��ϴ� ���α׷�)
        // �迭�� ���� ������ ���
        
        // List => ������ �ߺ��� ��� 
        System.out.println("===== list�� ���� ��� ======");
        //System.out.println(list.toString());
        Iterator it=list.iterator(); // list�� ������ �ִ� ������ ����
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        // �ߺ� ���� 
        HashSet set=new HashSet();
        
        for(Object genre:list)
        {
        	set.add(genre);// HashSet�� �����͸� ÷�� => �ߺ� ���� 
        }
        System.out.println("===== set�� ����� ������ ��� =====");
        //System.out.println(set.toString());
        it=set.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        // ArrayList => �����ϱ� ���� ������ 
        // ������ �����͸� �ѹ� �����ش� 
        list.clear();
        for(Object genre:set)
        {
        	list.add(genre);
        }
        
        System.out.println("===== �ߺ��� ������ ������ ��� =====");
        //System.out.println(list.toString());
        it=list.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        /*
         *   ��� => list.toString() => [������....]
         *          for(Object obj:list)
         *          while(it.hasNext())
         *          {
         *             System.out.println(it.next())
         *          }
         *          
         *          list�� �����͸� ��Ƽ� �������� ���� (�ڹ�->������)
         *          request.setAttribute("list",list) 
         */
	}

}
