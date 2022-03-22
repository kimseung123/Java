package com.sist.main;
/*
 *   ���� (����) , ������ , ��� , �迭 (1��) => ���α׷��� ���� 
 *   ==> ���α׷��� �ʼ� ���� 
 *   ��ü ���� 
 *    => ĸ��ȭ (����� ���� ��������)
 *       => ���������� 
 *          private < default < protected < public 
 *          =======                         ======
 *          ����ȭ                            ��� 
 *          ��� => �޼ҵ� (Ŭ������ Ŭ������ ���(����) => �޼ҵ�)
 *    => ��� / ���� (���� ����) 
 *       ===
 *        ���� ���� : static , ������ , ����� ���� ������� ���Ѵ�(private)
 *    => �������̵� (������)
 *    =========================== ��ü ������ 3�� Ư�� 
 *    ***������ / �����ͺ��̽� 
 *    ===== �⺻ ���� : �ٸ� Ŭ������ ������ ���� ����� ���� 
 *                               ======== ��� , ���� => POJO 
 *    ���ռ� => ���� , ������(�޼ҵ�) => ���� 
 *    =========================================================
 *    �� 
 *     ===================================================
 *     HTML / CSS : ����� ���� => ȭ�� ������ 
 *     JavaScript : �޴� Ŭ���� , �̹��� ȸ�� ... (�̺�Ʈ)
 *                  ������������ ���� (����)
 *     =================================== front-end
 *     Java  : ������ ���� => AI,������ �м�, ê�� 
 *     ����Ŭ : �����͸� ������ ���(������ ����) 
 *     =================================== back-end
 *     ===================================================
 *      �ѹ��� ���� ==> �����ӿ�ũ (������)
 *      
 *     �ڹ� : Ŭ������ �����ؼ� Ŭ������ ������ 
 *           => �������� �޼ҵ�(X) , Ŭ���� ���ο� �۾� 
 *              ** ��ü���� ���α׷� (6�� ~ 7��)
 *              ** Ŭ������ �����ϱ� ���ؼ� 
 *                 �ܵ����� ��� , ��� ����� �� �ִ� (�������̽�)
 *           => ���� (�����͸� ���� => �����ؼ� ���) 
 *           => ����� ��û�� ���ؼ� ���� ==> �޼ҵ� 
 *           => ������ ������ ���� (��� ����)
 *              *** ��� ���� => Collection
 *           => ������ ���¼� �м� => ���̺귯�� (������,�ڸ��..)
 *           => ����� ��û ���� => ������̼� 
 *           => �ʿ��ϸ� �ܺο��� �����͸� ������ �ͼ� ���Ͽ� ���� 
 *               => IO
 *           => ����� ��û�� ���� ���Ͼ��ε�,���� �ٿ�ε� (IO)
 *           => �ٽ� : �����ͺ��̽�(����Ŭ => ����)
 *     ����Ʈ : �ܱ� / �ѱ� (�ð��� ȿ��)
 *            (���� ����) 
 *            2�� => 10�� : Date , Calendar , SimpleDateFormat 
 *                  11�� : ArrayList , HashSet , HashMap
 *                  12�� : ���״н� , ������̼� 
 *                  15�� : File 
 *                  
 *     => ��� (Front : VueJS , ReactJS) ==> ***
 *            (Back : AWS(***) , AI(***) , ��� (���̽�))
 *            ����ó����� . ���̹�Ƽ�� . Spring-Boot , SpringFramework
 *    
 *     => Collection���� 
 *          �뵵 => �̷� => ���� 
 *                   Collection 
 *                       |
 *              ---------------------
 *              |���     |          |          Map<K,V>
 *                                             K(Key),V(Value) 
 *            List      Set       Queue            |����
 *                                              HashMap
 *              |����     |����       |
 *          ---------  ---------  ------ LinkedList
 *          |       |          |
 *        ArrayList Vector  HashSet(�ߺ����� ������)
 *        =========
 *        Vector�� ���� (���� ���� ����ϴ� �÷���)
 *        ArrayList => �����ͺ��̽� ���� 
 *        
 *        ArrayList => �������� ���� �ӵ��� ������ , ���� ���� , ���� => �ӵ��� ���� 
 *           => �����ͺ��̽��� ����Ŭ => ���� ,���� 
 *        LinkedList => ���� ���� , ������ �ִ� ��쿡 �ַ� ���
 *                      ���� ���� , ���ø����̼� ���α׷� (����..) 
 *        Map => �� (������ ���۽� , ��Ű ���� , ���� ���� , Ŭ���� ����)
 *        === ������ (Ŭ���� ����) , ���̹�Ƽ��(SQL���� ����)
 *        === ������ ��Ʈ��ũ => �����ϴ� Ŭ���� HashMap(�� ����)
 *        
 *        === 668 page 
 *        ============================ �Է�,���, ������ �б� 
 *        List , Map , Set , Queue => interface 
 *        ArrayList , HashMap , HashSet , LinkedList ==> Ŭ����
 *        
 *                     extends
 *        *** interface ===> inteface
 *                     implements
 *            interface ===> class 
 *            
 *        ��)
 *            interface Collection 
 *            
 *            interface List extends Collection 
 *            class ArrayList implements List
 *            
 *            interface Queue extends Collection
 *            class LinkedList implements Queue
 *            
 *            
 *             
 *     => ���׸��� : ����ȯ���� ����� ���� (�������� ����) => 1.8
 *     
 *     ArrayList ,       HashSet , HashMap
 *     =========
 *       = ������ ������ �ִ� (index) => �ڵ� ���� => ��ȣ 0������ ���� 
 *                  ����Ŭ : 1������ ���� 
 *       = �ߺ��� �����͸� ��� 
 *       = �����ͺ��̽� �����Ҷ� ���� ���� �����ϴ� Ŭ���� (����Ŭ)
 *     ***= void add(Object obj) : �߰� 
 *     = remove(int index) : ���� 
 *     ***= Object get(int index) : ������ ������ ���� 
 *     ***= int size() : ���� ���� ==> 0
 *     ***= boolean isEmpty() : ������ ���� 
 *     = set(int index,Object obj)
 *       Object => ��� �����͸� ������ �� �ִ� 
 *       ====== ���� ū �������� (��� �⺻�� ������ , ����� ���� Ŭ����) 
 *       
 *     HashSet 
 *       = ������ �������� �ʴ´� 
 *       = ������ �ߺ��� ������� �ʴ´� 
 *       = �ߺ��� �����͸� ���� (*****)
 *       = add(Object obj): �߰�
 *       = remove(Object obj);���� 
 *       = size() : ���� ����
 *       = isEmpty() : ������ ���� 
 *     
 *     HashMap (�������� ���� => Ŭ���� ���� ,������ ����)
 *       = ������ �������� �ʴ´� 
 *       = �������ߺ��� ��� , Ű�� �ߺ��� ������ �ʵȴ� 
 *       = Ű,�� ������ ���� => Ű�� �̿��ϸ� => ���� ��� �´� 
 *       = ������ (���� ���� ==> ISBN(Ű) , å ����)
 *               �����ȣ ==> �ּ� 
 *               ID ==> id��
 *       = Ŭ���� ���� (id,Ŭ���� �ּ�)
 *       = put(String key, Object obj):���� 
 *       = get(String key) : ���� ������ �ö�
 *       = size() : ������ ����
 *       = isEmpty() : ������ ���� 
 *    ========================== ������ �� (�ذ�) => ���׸��� 
 */
import java.util.*;
/*interface A
{
	public void display();
	public default void aaa()
	{
		
	}
}
// B < A
class B implements A
{
	public void display()
	{
		
	}
	public void aaa()
	{
		
	}
}
// C < A
class C implements A
{
	public void display()
	{
		
	}
}
// D < A
class D implements A
{
	public void display()
	{
		
	}
}*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ArrayList ��� ��� 
		// 1-1. ���� ���� ����
		ArrayList list=new ArrayList(); // ���׸��� �ʼ� 
		// *** ������ (17����) 
		// 1-2. ������ ÷�� 
		list.add("���"); // index => 0
		list.add("������"); // index => 1
		list.add("����"); // index => 2
		// 1-3. ��û => ���� 
		// 1-3-1. ��� (�����͸� ���� �޶�)
		/*
		 *    ��� ����ȯ 
		 *    => ��� / ���� ==> Ŭ���� ũ�� ���� 
		 *    
		 *    class A(int = 100��)
		 *    class B(int = 1��)
		 *    =========> ���������� Ʋ���� ������ A�� B�� ũ�⸦ ���� �� �� ���� 
		 *    class A
		 *    class B extends A
		 *       A  > B
		 *       
		 *    //��� => is-a
		 *    class Object
		 *    class String extends Object 
		 *      Object > String 
		 *    
		 *    // ���� => has-a
		 *    class A
		 *    {
		 *        B b=new B();
		 *    }
		 *    class B
		 *    {
		 *    }
		 *    
		 *    A > B 
		 *    
		 *    ***** interface�� ���� Ŭ����
		 *          interface => ���� ���  
		 *          ========== 1.8 ��� Ȯ�� 
		 *            => �߻�Ŭ���� ��� interface
		 *            => �߻� Ŭ������ ���� , interface�� ���� ���� �ִ�
		 *               =========        =========
		 *               �޼ҵ� => ���� , �̱���(����) �̱���(����),�����޼ҵ嵵 �ִ�
		 *            => ���α׷��Ӱ� ��û => ��� �߰��� �Ǹ� ���õ� Ŭ������ ���� �߻� 
		 *            => ����Ʈ���� => �������̽� ����  
		 *          class => ���� ��� 
		 */
		for(int i=0;i<list.size();i++)
		{
			String f=(String)list.get(i);
			System.out.println(f);
		}
		// 1-4. ������ ����� 
		System.out.println("==== ���� ��====");
		list.remove(1); // 2->1���� 
		for(Object obj:list) // obj => ���� ����� ���� ���������� ���� 
		{
			System.out.println(obj); // toString�� ���� 
			/*
			 *   valueOf() ==> int , double ==> ���ڿ� ���� 
			 *   toString() ==> Ŭ���� ��ü�� ���ڿ��� ���� 
			 */
		}
		System.out.println("==== ������ ��� =====");
		list.forEach(obj->System.out.println(obj));//{}���� 
		// JavaScript =>  ȭ��ǥ �Լ� (ES6)
		// ES5 => ES6 (�ܱ� => ES8)
		
		// ���ٽ� (�Լ� ������) => *
		System.out.println("==== ��ü ���� ====");
		list.clear();
		if(list.isEmpty())// �����Ͱ� ���ٸ� 
		{
			System.out.println("�����Ͱ� �����ϴ�");//ã�� 
		}
		
		// 2. HashSet ��� ��� 
		System.out.println("==== HashSet ====");
		// 2-1. ���� ���� ���� ==> �ߺ��� �����Ͱ� ���� =>�߰��� �ȵȴ�
		HashSet set=new HashSet();
		// 2-2. ������ �߰� 
		set.add(1);
		set.add(2);
		set.add(3);
		// 2-3. �����͸� ��� 
		// => for-each 
		for(Object obj:set)
		{
			System.out.println(obj);
		}
		System.out.println("==== Iterator ��� ====");
		// HashMap , HashSet 
		Iterator it=set.iterator(); // �����͸� ������ �����ϰ� it�� ���� 
		// => Iterator 
		while(it.hasNext()) // ���� ������ ������ �ִ� �ͱ����� �ݺ��� ���� 
		{
		   	// it.next() => ���� ���ٵ� ���� �о� �´� 
			int value=(int)it.next();
			// => �⺻������������ Ŭ�������� �޴´� : ��ڽ� 
			// Integer i=(Integer)it.next()
			System.out.println(value);
		}
		System.out.println("==== ���� ====");
		set.remove(2);
		set.forEach((obj)->System.out.println(obj));
		System.out.println(set.toString());
		// ���α׷� => ��ƴ� (����� ��)
		// ���� ���� ���α׷� => Spring / MyBatis
		// => ���� (����) => ����
		System.out.println("==== ��ü ���� =====");
		set.clear();
		if(set.isEmpty())
		{
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�");
		}
		System.out.println("===== HashSet �ַ� �ϴ� ���� =====");
		ArrayList list2=new ArrayList();
		list2.add("ȫ�浿");
		list2.add("��û��");
		list2.add("�ڹ���");
		list2.add("ȫ�浿");
		list2.add("�ڹ���");
		
		// ��� 
		for(Object obj:list2)
		{
			System.out.println(obj);
		}
		// �ߺ����� 
		System.out.println("==== List => Set ====");
		HashSet set2=new HashSet();
		set2.addAll(list2);// list2�� �ִ� ��� �����͸� => set2���� �̵� 
		for(Object obj:set2)
		{
			System.out.println(obj);
		}
		
		list2.clear();// List,Set����=> �ѹ��� ��ü ���� => �߰� 
		list2.addAll(set2);
		// => List => Set , Set => List�� ������ ���� addAll()
		for(Object obj:list2)
		{
			System.out.println(obj);
		}
		// Set ==> �ַ� ���ó (��ٱ���) , Cookie 
		// 3. HashMap ��� ��� ==> ���� (Ŭ���� ����:������)
		// 3-1. ���� 
		HashMap map=new HashMap();
		// 3-2. ������ �߰� 
		// => ���� �ΰ� , Ű , �� 
		map.put("aaaaa", "ȫ�浿");
		map.put("bbbb", "��û��");
		map.put("ccc", "������");
		map.put("dd", "�ڹ���");
		map.put("eee", "�̼���");
		// Ű�� �ߺ��ϸ� �ȵȴ� , �����ʹ� �ߺ��� ���� 
		
		//System.out.println(map.get("b"));
		System.out.println("==== ��ü������ ��� ====");
		/*for(char c='a';c<='e';c++)
		{
			String name=(String)map.get(String.valueOf(c));
			System.out.println(name);
		}*/
		Set s=map.keySet();// map�� ����Ǿ� �ִ� Ű ��ü�� �о� �´� 
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			String key=(String)i.next();
			String name=(String)map.get(key);
			System.out.println(name);
		}
		
		System.out.println("====  ���� ====");
		map.remove("dd"); // Ű���� 
		map.forEach((key,value)->System.out.println(value));
		
		System.out.println("==== ��ü ���� =====");
		map.clear();
		if(map.isEmpty())
		{
			System.out.println("�����Ͱ� �����ϴ�");
		}
	}

}










