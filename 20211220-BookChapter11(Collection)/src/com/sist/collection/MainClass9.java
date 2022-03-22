package com.sist.collection;
// Set => HashSet => ������ ��� Iterator�̿� , toString()
import java.util.*;
public class MainClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ������� , �ߺ��� ������(ArrayList), �ߺ� ���� ������(HashSet) 
	    HashSet set=new HashSet();// �ߺ��� ���� �����͸� ÷�� 
	    set.add("��");
	    set.add("���");
	    set.add("������");
	    set.add("����");
	    set.add("�ڸ�");
	    set.add("�ٳ���");
	    set.add("��");
	    // ==> 
	    System.out.println("������ ����:"+set.size());
	    System.out.println("===== ���� ��� =====");
	    System.out.println(set.toString());
	    
	    System.out.println("===== ���� ������ =====");
	    set.remove("��"); // remove(Object)
	    System.out.println("���� ����:"+set.size());
	    System.out.println(set.toString());
	    
	    System.out.println("===== ���ο� ���� �߰� ======");
	    set.add("�ٳ���");// �ߺ��� ��쿡�� �߰����� �ʴ´� 
	    System.out.println("���� ����:"+set.size());
	    System.out.println(set.toString());
	    
	    System.out.println("===== ��ü ���� ======");
	    set.clear();
	    System.out.println("���� ����:"+set.size());
	    // Ȯ�� 
	    if(set.isEmpty())
	    {
	    	System.out.println("�ٱ��ϰ� ������ϴ�!!");
	    }
	    /*
	     *   1. add
	     *   2. size
	     *   3. clear
	     *   4. isEmpty
	     *   5. Iterator���� =>
	     *       set.iterator()
	     *       hasNext()
	     *       next()
	     */
	}

}
