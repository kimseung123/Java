package com.sist.collection;
// Set , Map 
/*
 *   Collection 
 *     List ==> ArrayList 
 *     ========================================================
 *     Set  ==> HashSet , TreeSet 
 *              ======= ArrayList�� �ִ� �������߿� �ߺ��� ���� �� ���� 
 *                      ��ȭ : �帣 , ���� : �������� 
 *     Map  ==> HashMap(Hashtabledml������ ����) , Hashtable
 *              Ŭ���� ���� (�����̳�) , ���� ��κ��� Ŭ���� Map
 *              ������ ���� Ű�� �� ==> Cookie�̿� , session�̿� 
 *     ============= ��½ÿ� Iterator�� �̿��ؼ� ����ϴ� ���α׷��� ����
 */
/*
 *    Set => �������̽� (���� ��������� �ʴ´�)
 *     �����ϰ� �ִ� Ŭ���� : HashSet , TreeSet 
 *     => ������ ���� ������ �ߺ��� ������� �ʴ´� (ID)
 *     => �ߺ� ���� ������ : ���� 
 *        ============= �Խ��� (�Խù� ��ȣ) , ȸ���(���) , �л�(�й�) 
 *        ============= id => ������ �ܿ��� �Ѵ�
 *     => 1) �߰� : add(Object)
 *                 remove(Object) 
 *                 clear()
 *                 size()
 *                 isEmpty()
 *           ��� : for-each,iterator�� �̿��ؼ� ó��  
 */
import java.util.*;
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� ������ ����� 
		HashSet set=new HashSet(); // ������ ����� �ߺ����� �����͸� ����
		set.add("�ڹ�");
		set.add("����Ŭ");
		set.add("HTML5");
		set.add("CSS");
		set.add("JavaScript");
		set.add("JSP");
		set.add("Spring");
		set.add("�ű��:Spring-Boot,VueJS,ReactJS,AI");
		set.add("AWS:����,������");
		set.add("CSS");
		
		System.out.println("===== for-each =====");
		for(Object obj:set)
		{
			System.out.println(obj);//obj.toString() => toString()�� �����Ѵ� 
		}
		System.out.println("===== ������ ======");
		set.remove("�ڹ�");
		for(Object obj:set)
		{
			System.out.println(obj);//obj.toString() => toString()�� �����Ѵ� 
		}
	}

}








