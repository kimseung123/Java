package com.sist.main;
// Collection => ���׸��� ���� (JDK 1.5���� ����)
// JDK => ���� ���� ����ϴ� ���� (ȣȯ��) => JDK 1.8
// 1.8�������� sun => 1.9 ����Ŭ 
// ����Ŭ => MS => ERP (������) 
// jaxb , ������̼� 
/*
 *   �ڹ� => ���¼ҽ� => ����Ŭ (����)
 *                   ============
 *                   ���̽� , ��Ʋ�� , ��Į�� , GO  
 *                   =====  =====
 */
import java.util.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<String>();
        // ArrayList�ȿ��� String�� ���� �Ѵ� (���������� �����Ѵ�)
        list.add("���");
        list.add("��");
        list.add("����");
        list.add("������");
        list.add("�޷�");
        
        // ��� => foreach 
        for(String s:list)
        {
        	System.out.println(s);
        }
        System.out.println(list.toString());
        
        System.out.println("====Set ���====");
        HashSet<Integer> set=new HashSet<Integer>();
        // ������ �����ؼ� ��� 
        // <Ŭ�������� ÷���� �� �ִ�>  <int> <double> => ���� 
        //  <Integer>  <Double> ==> WrapperŬ������ ���� 
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
        	set.add(r.nextInt(100)+1); //1~100
        }
        
        // for-each
        for(int i:set)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(set.toString());
        // => ����� ���� Ŭ���� , String 
        System.out.println("==== Map ====");
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("id", "hong");
        map.put("password", "1234");
        map.put("sex", "����");
        map.put("age", String.valueOf(27)); // "27"
        //  ==> ����ڰ� �����ְų� ,����Ŭ���� ������ �б� => int
        map.put("addr", "����");
        map.put("tel", "010-1111-1111");
        
        System.out.println("==== ȸ�� ���� ���====");
        System.out.println("ID:"+map.get("id"));
        System.out.println("Password:"+map.get("password"));
        System.out.println("Sex:"+map.get("sex"));
        System.out.println("Age:"+map.get("age"));
        System.out.println("Address:"+map.get("Addr".toLowerCase()));
        // ��ҹ��ڸ� ���� (Ű=>��ҹ��� ����)
        System.out.println("Tel:"+map.get("tel"));
        
	}

}







