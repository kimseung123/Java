package com.sist.collection;
// TreeSet => ���ڿ����� (�ߺ� �����ʹ� ������ �ȵȴ�)
import java.util.*;
public class MainClass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet set=new TreeSet(); // ArrayList,HashSet,HashMap
        String[] names={"ȫ�浿","��û��","������","�ڹ���","�̼���",
        		       "�����","������","��������","������","����"};
        // �迭�� TreeSet���� ���� 
        for(Object name:names)
        {
        	set.add(name);
        }
        System.out.println("===== TreeSet�� �����Ͱ� �߰��� ���� ======");
        System.out.println(set.toString());
        System.out.println("ù��° ������:"+set.first());
        System.out.println("������ ������:"+set.last());
        System.out.println(set.headSet("�ڹ���"));
        System.out.println(set.tailSet("�ڹ���"));
	}

}
