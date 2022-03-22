package com.sist.main;
// 670page => 2�� �ڹ� => ����Ŭ ���� (java.sql) => �� (javax.http)
/*
 *   Generics 
 *   =========
 *   1. ���� 
 *       = ��ü Ÿ���� �������� ���̰� ����ȯ�� ������� �ʰ� ����� ���α׷� 
 *       = �������� ���� , �ڵ尡 ���������� 
 *   2. ���� 
 *      Ŭ����<Ŭ������>
 *           =======
 *            =============
 *            T : Type
 *            E : Element
 *            ============= Ŭ���� => ������ Ŭ������ Object�� ��� 
 *                          => ��� �޼ҵ��� �������� ������ �ȴ� 
 *            K : Key
 *            V : Value 
 *   3. ��)
 *      ArrayList<String> => Object get(int index)
 *                           =====================
 *                           String get(int index)
 *                           
 *                           void add(Object obj)
 *                           =====================
 *                           void add(String obj)
 *                           
 *    class Box<T>
 *    {
 *        T item;
 *        void setItem(T item)
 *        {
 *           this.item=item;
 *        }
 *        T getItem()
 *        {
 *           return item;
 *        }
 *    }
 *    
 *    Box<String> box=new Box<String>();
 *    
 *    class Box<T> ==> ������� ������ => Object
 *    {
 *        String item;
 *        void setItem(String item)
 *        {
 *           this.item=item;
 *        }
 *        String getItem()
 *        {
 *           return item;
 *        }
 *    }
 *    // ����� ���� => ����� ������ ������������ ������ �ȴ� 
 */
import java.util.*;
// ���׸��� => Collection 
class Box<T>
{
	T item; // ���� static�� ������ �߻�  => ���(�ν��Ͻ�)�θ� ����� ���� 
	public void setItem(T item)
	{
		this.item=item;
	}
	public T getItem()
	{
		return item;
	}
}
public class MainClass {
    // ���������� ���� => ����ȯ�� �ʿ䰡 �������� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box box=new Box();
        box.setItem("ȫ�浿");
        String name=(String)box.getItem();
        System.out.println(name);
        
        Box<String> box1=new Box<String>();
        box1.setItem("��û��");
        String name2=box1.getItem();
        System.out.println(name2);
	}

}


