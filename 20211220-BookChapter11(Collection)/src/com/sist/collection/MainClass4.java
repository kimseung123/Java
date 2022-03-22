package com.sist.collection;
// interface ������ Ŭ���� 
// List    => ArrayList 
// Set     => HashSet
// Map     => HashMap
import java.util.*;
// Stack / Queue ==> ��� �󵵴� ���� ���� 
/*
 *   Stack => LIFO (Last IN , First OUT)
 *            ���߿� �� �����Ͱ� ���� ��� (�޸�)
 *   Queue => FIFO (First IN , First OUT) 
 *            ��Ʈ��ũ ���� , �ü���� �����췯 
 *            
 *   public static void main(String[] args)
 *   {
 *       int a=10;
 *       if(a==10)
 *       {
 *          int b=20;
 *          if(b==20)
 *          {
 *             int c=30;
 *          }// c������ �޸𸮿��� ������� 
 *          
 *       }// b������ �޸𸮿��� �������
 *   }// a������ ������� 
 *   ==> �޸� ���� 
 *   ======================
 *     Method ���� / static 
 *   ======================
 *     Stack : ��������,�Ű����� ==> �޸𸮿��� ���� {}�� �����ϸ� 
 *                              �ڵ����� ������� ���� 
 *                              �޸𸮿� ���� ���� => �޼ҵ� ȣ�� 
 *   ======================
 *     heap : ������� (new����ؼ� ����� ���� �޸� ��û)
 *            ������ ���� ���� (new , delete) 
 *                                ======= ������� �ʴ� ����� ���� 
 *                                        ������ �÷��� (�ڵ� �޸� ȸ��)
 *     new ������ => ������ int(�ּ�)
 *     ====
 *       int malloc(int size) => �޸� ũ�⸦ �𸥴� 
 *       ��ǻ�Ϳ��� �� �� �ִ� �޸� ũ�� (�⺻ ��������)
 *       int a=10;
 *       ===
 *        4����Ʈ �޸𸮸� ����� 10�� ���� �ض� ==> ���� ������ �̸��� a��� ���� 
 *       class A
 *       {
 *          int a,b,c,d...
 *       }
 *       
 *       AŬ������ �޸� ũ�⸦ Ȯ�� => �޸𸮸� ����� �ش� (new)
 *       malloc(A) ==> �°� (������) 
 *       A a=new A();
 *           === ===  ����� ������ �ʱ�ȭ 
 *           ����� �޸� �ּҸ� �Ѱ��ش� (�޸� �ּҴ� int������ ����� �ʴ´�)
 *   ===========================================
 *            
 */
// 604page�� �׸� Ȯ�� 
/*
 *    Stack (�ڿ������� ����)
 *     = ���� : push()
 *     = ���� : pop()
 *     = ������ ����  : isEmpty()
 *    Queue (�տ������� ����)
 *     = ���� : opper()
 *     = ���� : poll()
 *     = ������ ���� : isEmpty()
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*String[] names=new String[5]; // �迭�� ���� (����) 
        //  �޸� ũ�Ⱑ �� �ʿ��ϸ� => String[] names2=new String[10];
        //  ���� (ũ�⸦ ������ �� �ִ�) => �÷��� 
        names[0]="ȫ�浿";
        names[1]="��û��";
        names[2]="�ڹ���";
        names[3]="�̼���";
        names[4]="������";
        
        // ��� Stack
        System.out.println("===== Stack ======");
        for(int i=names.length-1;i>=0;i--)
        {
        	System.out.println(names[i]);
        }
        
        // ��� Queue
        System.out.println("====== Queue =====");
        for(int i=0;i<names.length;i++)
        {
        	System.out.println(names[i]);
        }*/
		// Stack ��� 
		Stack st=new Stack();
		// ���� ������ �߰� => push()
		st.push("���");
		st.push("����");
		st.push("����");
		st.push("������");
		st.push("�޷�");
		// ���� ������ ���� => pop()
		if(!st.isEmpty())// ���þȿ� �����Ͱ� �ִٸ� 
		{
			while(!st.isEmpty())
			{
				System.out.println(st.pop());
			}
		}
		else
		{
			System.out.println("������ �������� �ʽ��ϴ�");
		}
		
        System.out.println("============Queue============");
        Queue queue=new LinkedList(); // Queue���� 
        // interface => �̿ϼ��� Ŭ���� (�ڽ��� new�� �̿��ؼ� �޸� �Ҵ��� �Ҽ� ����)
        // ������ �߰� offer(), ������ ���� poll() 
        queue.offer("ȫ�浿");
        queue.offer("��û��");
        queue.offer("������");
        queue.offer("�����");
        queue.offer("�ڹ���");
        
        System.out.println("=========���==========");
        while(!queue.isEmpty())
        {
        	System.out.println(queue.poll());
        }
	}

}









