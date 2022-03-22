package com.sist.main;
// FileReader : ���� ��� ��Ʈ�� (�ѱ��� => 2byte)
/*
 *    int read() 
 *    close()
 *    int read(char[],int s, int e)
 */
import java.io.*;
import java.util.*;
// => ArrayList���� ==> ������ ArrayList => ��ü ���� ��Ʈ�� 
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �о�ͼ� => ArrayList�� ÷��
		ArrayList<Member> list=new ArrayList<Member>();
		// 1. ���� => ���ڿ��� ���� => String �޼ҵ带 �̿��ؼ� ���ڿ� ���� 
		try
		{
			FileReader fr=new FileReader("c:\\java_data\\address.txt"); 
		    String data="";
		    int i=0; // �ѱ��ھ� �о� �´� (���ڹ�ȣ�� �д´�) => char
		    while((i=fr.read())!=-1) // -1 ������ ��
		    {
		    	// '1' => 49 , '0' => 48.....
		    	System.out.println(i+"|"+((char)i));
		    	data+=String.valueOf((char)i);//���ڿ� ��ȯ 
		    	// toString() ��� �� �� ���� 
		    	// toString() ��ü
		    	// ���ڿ� ���� 
		    }
		    fr.close();
		    
		    // �и� 
		    String[] member=data.split("\n");
		    for(String line:member)
		    {
		    	String[] info=line.split("\\|");
		    	/*
		    	 *   ���Խ� (����Ŭ)
		    	 *   ^ => ����   ^A
		    	 *   $ => ��    A$
		    	 *   . => ������ ���� 
		    	 *   + => 1���̻� �ٸ� ���ڰ� ����
		    	 *   * => 0���̻� �ٸ� ���ڰ� ����
		    	 *   | => ���߿� 1�� ���� 
		    	 *   ? => ���ڰ� �ֵ� ����...
		    	 */
		    	Member m=new Member(Integer.parseInt(info[0]),
		    			info[1], info[2], info[3], info[4]);
		    	list.add(m); // list��ü�� ������ , �ڵ��� 
		    }
		    
		    // ��Ƶ� ������ ��� 
		    for(Member m:list)
		    {
		    	System.out.println("ȸ����ȣ:"+m.getNo());
		    	System.out.println("�̸�:"+m.getName());
		    	System.out.println("����:"+m.getSex());
		    	System.out.println("�ּ�:"+m.getAddr());
		    	System.out.println("��ȭ:"+m.getTel());
		    	System.out.println("===================");
		    }
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		// ArrayList�� �ִ� ������ ��� 
	}

}



















