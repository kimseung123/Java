package com.sist.exception;

public class MainClass2 {
	//static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("1");
        System.out.println("2");
        try
        {
        	
        	//s.replace("a", "b");
        	System.out.println("3");
        	System.out.println(10/0);
        	System.out.println("5");
        }catch(ArrayIndexOutOfBoundsException e)
        // �迭 ���� �ʰ� 
        {
        	System.out.println("6");
        }
        // 0���� ���� ��츸 ó�� 
        catch(ArithmeticException e)
        {
        	System.out.println("7");
        }
        // �ּҰ��� ���� ��� 
        /*
         *    A a;
         *    a.name=""
         */
        catch(NullPointerException e)
        {
        	System.out.println("8");
        }
        // ����ȯ�� Ʋ�� ��� 
        /*
         *    class A => ��ǻ��
         *    class B => �����
         *    
         *    A a=new A()
         *    B b=new B();
         *    
         *    B c=a;
         */
        catch(ClassCastException e)
        {
        	System.out.println("9");
        }
		/*
		 * finally // ������ ���� { System.out.println("10"); }
		 */
        System.out.println("11");
	}

}
