package com.sist.collection;
import java.util.*;
/*
 *   Vector : ArrayList�� �������� ���� ���� �÷��� 
 *            ������ �̿��ؼ� ������ ���� (����) 
 *            ��Ʈ��ũ ������ ����� ������ ����(ip,port)
 *   List �������̽��� ���� 
 *     �޼ҵ�� => ArrayList�� ���� 
 *     �߰�  => add(Object obj) ,  addElement(Object obj)
 *     ����  => remove(int index) , removeElementAt(int index)
 *     ����  => set(int index,Object obj)
 *     ������ ���� �б� => size()
 *     �б�  => get(int index) , elementAt(int index)
 *     ��ü ���� => clear()
 *     ������ ���� Ȯ�� => isEmpty()
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ���� (�ڷᱸ�� => �޸𸮿� �����͸� �����ϰ� ����)
		// Stack(LIFO) / Queue(FIFO)=> �ü�� �� ������ (����)
		// index = 0 , index = langth-1 
		// index =0 , index = 0
		Vector vec=new Vector();
		// Vector waitVc=new Vector() // ���� 
		// Vector roomVc= new Vector() // ������
		// Vector userVc=new Vector() // ��ȿ� �ִ� ��� ���� 
		// ������ �߰� 
		vec.add("ȫ�浿");//0
		vec.addElement("��û��");//1
		vec.add("�ڹ���");//2
		vec.addElement("�̼���");//3
		vec.add("������");//4
		// �߰��� ������ ���
		System.out.println("����� �ο���:"+vec.size());
		for(int i=0;i<vec.size();i++)
		{
			String name=(String)vec.elementAt(i);
			// Object elementAt(int index) , Object get(int index)
			/*
			 *     Object 
			 *     ======
			 *       |
			 *     String
			 */
			System.out.println(i+"."+name);
			
		}
		System.out.println("====== ������ =======");
		vec.removeElementAt(2); // vec.remove(1)
		System.out.println("����� �ο���:"+vec.size());
		
		for(int i=0;i<vec.size();i++)
		{
			String name=(String)vec.elementAt(i);
			// Object elementAt(int index) , Object get(int index)
			/*
			 *     Object 
			 *     ======
			 *       |
			 *     String
			 */
			System.out.println(i+"."+name);
			
		}
		
		System.out.println("===== ������ ========");
		vec.set(3, "��������");
		System.out.println("����� �ο���:"+vec.size());
		for(int i=0;i<vec.size();i++)
		{
			String name=(String)vec.elementAt(i);
			// Object elementAt(int index) , Object get(int index)
			/*
			 *     Object 
			 *     ======
			 *       |
			 *     String
			 */
			System.out.println(i+"."+name);
			
		}
		
		System.out.println("===== ��ü ���� ======");
		vec.clear();
		System.out.println("����� �ο���:"+vec.size());
		if(vec.isEmpty())
		{
			System.out.println("�ο��� �����ϴ�!!");
		}
		// ��Ʈ��ũ���� �ѹ� ��� 
		
	}

}






