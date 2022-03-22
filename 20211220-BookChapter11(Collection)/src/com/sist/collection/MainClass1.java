package com.sist.collection;
/*
 *    Collection : ������ �׷�(�����͸� ��Ƽ� ����)
 *    => CollectionFramework : ǥ��ȭ 
 *          Collection 
 *             |
 *      ------------------------
 *      | ���      |           |
 *    List        Set         Map ==> �������̽� 
 *      | ������ Ŭ����
 *     => ������ ������ �ִ� (�ε����� ������ ����)
 *     => �ߺ� �����͸� ��� 
 *     => ���̺귯������ �����ϴ� ��� (CURD)
 *        ***1. �߰� : add(Object) => � ���������̵� ������� �߰�
 *                 => �����Ͱ� ���������� ÷�� => �����ϱ� ��ƴ�(�ݺ��� ������ ��ƴ�)
 *                 => ���� �������� ó��
 *                 => String , Integer , ***����� ���� Ŭ����  
 *                 ArrayList list=new ArrayList();
 *                  => ������ ���� ���� ���� 
 *                  => 1) ������ �߰� 
 *                     list.add("ȫ�浿");
 *                     list.add(100);
 *                     list.add(100,5);
 *                     list.add('A');
 *                     list.add(true) ==> for�� �Ұ����ϴ� 
 *                      ==> �ݺ����� ����Ϸ��� 
 *                          => ���� (�� => ����)
 *        2. ���� : remove(int index)
 *        3. ���� : set(int index,Object o)
 *        ***4. �б� : get(int index) 
 *        ***5. ���� ���� : size() 
 *        6. ������ ���� : isEmpty() (boolean)
 *        7. ��ü ���� : clear()
 *        
 *     ***1) ArrayList (���� ���� ��� => �����ͺ��̽�(����Ŭ) ����
 *           =>  �񵿱� 
 *           =>  Vector�� ������ Ŭ����
 *     2) Vector : ��Ʈ��ũ ���α׷� 
 *        => ��� (����) ==> ������ (�����,��Ÿ���̼�)
 *           => ������ ���� (�ǽð�) 
 *           => ������ ���� 
 *        => �߰�  add(Object) , addElement(Object)
 *        => ����  remove(int index) , removeElementAt(int index)
 *        => ����  set(int index) 
 *        => ���� Ȯ�� size()
 *        => �б�  get(int index) , elementAt(int index)
 *        => ��ü ���� clear()
 *     3) LinkedList : C��� ȣȯ 
 *             => �߰� add , ���� set , ���� remove , ���� Ȯ�� size()
 *             => ���� �б� get
 *           |
 *          Queue
 *            => ���� : offer , �б� poll
 *          Stack 
 *            => ���� : push  , �б� pop
 *    
 *    ���� ��� 
 *    List => ���� ���� ���Ǵ� �÷��� (�������̽�)
 *      ������ Ŭ���� 
 *      ArrayList , Vector , LinkedList , Queue
 *    Set  => ������ ���� , �������ߺ��� ������� �ʴ´� 
 *            Iterator : �����͸� ��Ƽ� ���� 
 *         => HashSet , TreeSet (����)
 *    Map  => Ű�� ���� ���ÿ� ���� 
 *            Ű�� �ߺ����� ������ , ���� �ߺ��� ��� 
 *         => ������,���̹�Ƽ�� , JSP�� ���� ��ü 
 *         => ������ : Ŭ���� ��� , Ŭ���� ���� 
 *            ���̹�Ƽ�� : �����ͺ��̽� ���� => Ű,SQL
 */
// => 584 
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Collection 
		// 1. �޸� �Ҵ� (������ �� �ִ� ���� Ȯ��)
		//ArrayList list=new ArrayList();
		//Vector list=new Vector();
		LinkedList list=new LinkedList();
		// 2. ������ ���� 
		list.add("���");//0
		list.add("����");//1
		list.add("��");//2
		list.add("����");//3
		list.add("��");//4
		// 3. Ȯ�� 
		for(int i=0;i<list.size();i++)
		{
			String f=(String)list.get(i);
			System.out.print(f+" ");
		}
		// 4. ��� 
		// 5. ���� 
		list.set(4,"������");
		/*
		 *      list.add("���");//0
				list.add("����");//1
				list.add("��");//2
				list.add("����");//3
				list.add("������");//4
		 */
		// 6. ���
		System.out.println("\n===== ������ ��� =====");
		for(int i=0;i<list.size();i++)
		{
			String f=(String)list.get(i);
			System.out.print(f+" ");
		}
		// 7. ����
		list.remove(2);
		/*
		 *      list.add("���");//0
				list.add("����");//1
				list.add("����");//2
				list.add("������");//3
		 */
		// 8. ��� 
		System.out.println("\n===== ������ ��� =====");
		/*for(int i=0;i<list.size();i++)
		{
			String f=(String)list.get(i);
			System.out.print(f+" ");
		}*/
		for(Object obj:list) //list�� Object�� ÷�εǾ� �ִ� 
		{
			System.out.print(obj+" ");
		}
		// 9. ��ü ����
		list.clear();
		// 10.��� 
		if(list.isEmpty()) // list�� ����� �ִ��� Ȯ�� 
		{
			System.out.println("\n�ٱ��Ͽ� ������ �����ϴ�");
		}
	}

}








