package com.sist.collection;
// LinkedList 
/*
 *                 �б�     �߰�/����      ���
 *    ==============================================
 *    ***ArrayList   ������      ������      �������� ��쿡�� 
 *                                     �߰�,���� �ӵ��� ������
 *    ==============================================
 *    LinkedList  ������      ������      �����Ͱ� �������� 
 *                                     ���ټ��� �������� 
 *        => ������ 
 *    ==============================================
 *    
 *    List �������̽��� ������ Ŭ���� 
 *    =====
 *    �߰� ==> add(Object)
 *    ���� ==> set(int index,Object)
 *    ���� ==> remove(int index)
 *    �б� ==> get(int index)
 *    ������ ���� ==> size()
 *    ������ ���� Ȯ�� ==> isEmpty()
 */
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ������ ���� ���� Ȯ��
		LinkedList list=new LinkedList();
		// Vector , ArrayList
		// 2. ������ �߰� 
		list.add(100);//0
		list.add(200);//1
		list.add(300);//2
		list.add(400);//3
		list.add(500);//4
		// �߰��ϴ� ������ �ε��� ��ȣ�� �ڵ����� ���� (���������� ����)
		
		System.out.println("�߰��� ������ ����:"+list.size());
		/*
		 *    Integer i=10; ���� �ڽ� 
		 *    int i=new Integer(10); ��ڽ� 
		 *    =========================== Wrapper 
		 *    Object o=10;
		 *    int i=(int)o;
		 *    ============= �Ϲ� ���������� ���� 
		 */
		// �߰��� ������ ��� 
		for(int i=0;i<list.size();i++)
		{
			Integer num=(Integer)list.get(i);
			// ����ϱ� ���� 
			// int num=(int)list.get(i)
			System.out.println(i+":=>"+num);
		}
		
		// ���� 
		System.out.println("===== ������ ������ =====");
		list.remove(3);
		System.out.println("������ ������ ����:"+list.size());
		// ������ ������ ��� 
		for(int i=0;i<list.size();i++)
		{
			Integer num=(Integer)list.get(i);
			// ����ϱ� ���� 
			// int num=(int)list.get(i)
			System.out.println(i+":=>"+num);
		}
		// �ݺ����� �κ� => �޼ҵ� ó�� 
		
		// ���� 
		System.out.println("===== ������ ������ =====");
		list.set(2, 3000);
		// �����Ŀ� ������ ��� 
		for(int i=0;i<list.size();i++)
		{
			Integer num=(Integer)list.get(i);
			// ����ϱ� ���� 
			// int num=(int)list.get(i)
			System.out.println(i+":=>"+num);
		}
		
		// ��ü ���� 
		list.clear();
		System.out.println("���� ������ ���� Ȯ��:"+list.size());
		
		if(list.isEmpty()) // �����Ͱ� ���� (false) , �����Ͱ� ������ (true)
		{
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�!!");
		}
		// isXxx() => ������ (boolean)
		
		// ArrayList = Vector = LinkedList 
		/*
		 *    add() ==> ������ �߰�
		 *    remove() ==> ������ ����
		 *    set()  ==> ������ ���� 
		 *    size() ==> ����� ����
		 *    get()  ==> ����� ������ �Ѱ� �б�
		 *    isEmpty() ==> ����������
		 *    clear() ==> ��������� ����� 
		 *    
		 *    584page ~ 603page 
		 */
		
	}

}






