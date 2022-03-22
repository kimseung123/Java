package com.sist.lib;
/*
 *   1. �� ������ (�ڹ�)
 *      = ���� , ������ , ��� , �޼ҵ� , Ŭ���� , �������̽� 
 *              =====  ===== if , for , while , break
 *              ����,����,���,��,��,���� 
 *      = ����ó�� (���ܺ���(try~catch) , ���� ȸ��(throws))
 *      = ���̺귯�� 
 *        ========
 *         java.lang
 *         String , StringBuffer , Wrapper(��������=>Ŭ����),Math
 *         java.util
 *         StringTokenizer , Calendar , Date , List , Map
 *                                             =========== Collection
 *         java.io 
 *         FileInputStream , FileOutputStream ,BufferReader,File 
 *         (FileReader)      (FileWriter)
 *         
 *         java.text : SimpleDateFormat 
 *         
 *         java.net 
 *         URL, URLEncoding , Socket , ServerSocket
 *         
 *         =====================================================
 *           java.sql (����Ŭ)
 *           Connection , Statement , ResultSet 
 *         =====================================================
 *         
 *         ==> ������ ���� 
 *         ==> �˰��� (����)
 *         https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59l2j0i433i512l2j0i20i263i512j0i512l4.779j0j15&sourceid=chrome&ie=UTF-8
 *         
 *         ==> 490page 
 *         ����Ŭ����(Wrapper)
 *         => �Ϲ� ���������� Ŭ����ȭ ���Ѽ� ���� ������ �� �ְ� ����� �ش� 
 *         ��������                              Ŭ���� (����Ŭ����)
 *         ������ (1byte => 8bit)
 *           byte(1byte) => -128~127     ====> Byte
 *            => ��Ʈ��ũ ,���� ����� 
 *           short(2byte) =>-32768~32767 ====> Short
 *            => c��� ȣȯ 
 *           int (4byte)                 ====> Integer(******)
 *           long (8byte)                ====> Long(***)
 *         ������ 
 *           Unicode VS ASC
 *           char (2byte)                ====> Character
 *         �Ǽ���
 *           float(4byte)=> f (6)        ====> Float
 *           double(8byte)=> d(����)(15)  ====> Double(******)
 *         ���� 
 *           boolean(1byte) => true/false ===> Boolean(******)
 *           
 *         ===================================================
 *         ����ڽ� VS ��ڽ� 
 *         Integer i=10 => ����ڽ� 
 *         Integer i=new Integer(10);
 *         int j=i; ��ڽ� 
 *         ==========================
 *         Object o=10
 *         Object o=10.0
 *         Object s=""
 *         Object s='A'
 *         Object s=true => ��� ���������� ǥ���� �� �ִ�
 *         Object s=new A() 
 *         
 *         *** �� (���ڿ�) ==> ���ϴ� ������������ ���� 
 *         "10" , "10.5" , "true"
 *         int i=Integer.parseInt("10"); // ���ڿ��� ������ ��ȯ 
 *         double d=Double.parseDouble("10.5") 
 *         boolean b=Boolean.parseBoolean("true") 
 *         
 *         i=10  =====> String.valueOf(i) ==> "10"
 *         d=10.5 ====> String.valueOf(d) ==> "10.5"
 *         b=true ====> String.valueOf(b) ==> "true"
 *         
 *         => String , Object
 *         
 *         => ���ڿ�  ===> String.valueOf() (��� ���������� ���ڿ� ��ȯ)
 *         => �Ϲ� ��������==> parse��������() => ���ڿ��� ���ϴ� �������� ��ȯ
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� => ���ڿ� (��)
		// => �߻��� �� �ִ� ���� => NumberFormatException 
		// ���������� ���� ==> list.jsp?page= 1 ==> String page=" 1"
	    Scanner scan=new Scanner(System.in);
	    System.out.print("ù��° ���ڿ� �Է�:");
	    String num1=scan.next();
	    System.out.print("�ι�° ���ڿ� �Է�:");
	    String num2=scan.next();
	    
	    System.out.println("===== ���� ����� =====");
	    //int i=Integer.parseInt(num1);// ���ڿ� => ���������� ��ȯ 
	    //int j=Integer.parseInt(num2);// ���ڿ� => ���������� ��ȯ 
	    //double d1=Double.parseDouble(num1); // ���ڿ� => �Ǽ��� ��ȯ
	    //double d2=Double.parseDouble(num2);
	    //System.out.println(d1+d2);
	    boolean b1=Boolean.parseBoolean(num1);
	    boolean b2=Boolean.parseBoolean(num2);		
	    System.out.println(b1);
	    System.out.println(b2);
	}

}








