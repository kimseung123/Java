package com.sist.lib;
// ���� => ���� �޸𸮸� ���Ӱ� �߰� 
// �޸� ���� ������ �ȴ� 
// ���� => ���� �޸𸮸� ���� 
class Member
{
	String name;
}
class Student implements Cloneable
{
	String name;
	String sex;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // �޸𸮿� ���� 
		Member m1=new Member();
		m1.name="ȫ�浿";
		// ���
		System.out.println("�̸�:"+m1.name);
		
		// ��ü ���� 
		Member m2=m1;
		
		// �ּҰ� (����:��Ī) => ���� �޸𸮸� ���� 
		System.out.println("m1�ּҰ�"+m1);
		System.out.println("m2�ּҰ�"+m2);
		m2.name="��û��";
		
		// ��� 
		System.out.println("m2.name="+m2.name);// ��û��
		System.out.println("m1.name="+m1.name);// ��û��
		
		Student s1=new Student();
		s1.name="�̼���";
		s1.sex="����";
		
		Student s2=(Student)s1.clone(); // ���� (���ο� �޸� ����)
		// Ŭ���� ����ȯ ==> �Ϲ� ���������� ���� 
		// Student(int) Object(double)
		// ��� 
		System.out.println("s1.name="+s1.name);
		System.out.println("s1.sex="+s1.sex);
		System.out.println("s2.name="+s2.name);
		System.out.println("s2.sex="+s2.sex);
		
		// ������ ���� 
		s2.name="������";
		s2.sex="����";
		
		System.out.println("s1.name="+s1.name);
		System.out.println("s1.sex="+s1.sex);
		System.out.println("s2.name="+s2.name);
		System.out.println("s2.sex="+s2.sex);
		
		// => �ƹ�Ÿ ���� => ���� 
		// ���������� => �޸� ���� (prototype)
		// Object ==> ����ȯ 
		
		/*
		 *    class A
		 *    {
		 *        String name;
		 *        String sex;
		 *    }
		 *    class B extends A
		 *    {
		 *        ==========
		 *        String name;
		 *        String sex;
		 *        ==========
		 *        int age;
		 *    }
		 *    
		 *    A a=new A();  ====> name , sex
		 *    B b=new B();  ====> name , sex , age 
		 *    A c=new B();  ====> name,sex (AŬ������ ������ �ִ� ������)
		 *    ===
		 *     c.age = (X)
		 *    Ŭ���� => �����ϴ� ����
		 *    �޼ҵ�� ������ Ÿ�� 
		 */
		
	}

}
