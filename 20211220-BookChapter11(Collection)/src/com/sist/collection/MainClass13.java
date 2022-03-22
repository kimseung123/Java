package com.sist.collection;

import java.util.*;

// Map => Ű�� ������ ���� 
/*
 *    Ű�� �ߺ��� ������� �ʴ´� => ISBN => �����ȣ
 *    ���� �ߺ��� ����Ѵ�      => å���� => �����ּ�
 *    ������ ������ ���� �ʴ´� => Iterator 
 *    
 *    Map => �������̽� 
 *     => ������ Ŭ���� 
 *     => HashMap ==> Hashtable�� ������ Ŭ���� 
 *        => ������ , ���̹�Ƽ�� , ��
 *           =====  ========  ===
 *           Ŭ���� ��� (Ŭ���� ������ => �����ֱ� (����~�Ҹ�))
 *           SQL(����Ŭ ���๮��) => Ű,SQL
 *           �������� ������ ������ (Ű , ���������Ͱ�)
 *     => Hashtable(X)
 */
public class MainClass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap map=new HashMap(); // �� ä�� (���� => key,��(user����_)
        // map�� Ű�� �ߺ��� ���� �����Ͱ� �ʿ��ϴ� (���ڷ� �������� �ʴ´�) 
        // ���� �ߺ� �� �� �ִ� 
        // ���� ���� => put("Ű",��) => put(String key, Object value)
        // ���� �б� ==> get(Ű)
        // size() => ���� ���� 
        map.put("ȫ�浿", "90,80,78");
        map.put("�ڹ���", "89,78,60");
        map.put("��û��", "100,90,90");
        map.put("������", "78,89,50");
        map.put("�̼���", "77,88,99");
        
        map.forEach((k,v)->System.out.println("["+k+","+v+"]"));
        
        // ȫ�浿�� ����ǥ 
        /*String score=(String)map.get("ȫ�浿");
        String[] ss=score.split(",");
        System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);
        
        score=(String)map.get("�ڹ���");
        ss=score.split(",");
        System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);
        
        score=(String)map.get("��û��");
        ss=score.split(",");
        System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);
        
        score=(String)map.get("������");
        ss=score.split(",");
        System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);
        
        score=(String)map.get("�̼���");
        ss=score.split(",");
        System.out.println(ss[0]+" "+ss[1]+" "+ss[2]);*/
        System.out.println("�л� �ο���:"+map.size());
        Set set=map.keySet(); // Ű�� �ߺ��� ���� ������ 
        System.out.println(set.toString());
        Iterator it=set.iterator();
        // Map => key�� ���ͼ� ó�� 
        while(it.hasNext())
        {
        	String key=(String)it.next(); // Object next()
        	String value=(String)map.get(key);
        	String[] ss=value.split(",");
        	System.out.println(key+" "+ss[0]+" "+ss[1]+" "+ss[2]);
        }
	}

}







