package com.sist.io;
import java.util.*;
import java.io.*;//915page
// ���� , ���� ���� (���ϸ����,���������, ����)
// ���� ����� 
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	File dir=new File("C:\\download");
        	// download ������ ���� 
        	//1. ������ ���� Ȯ�� => �ִ� ���� ��� / ���� ���� �����
        	if(!dir.exists()) // �������� �ʴ� ��� 
        	{
        		dir.mkdir(); // ������ ����� 
        	}
        	//System.out.println("���� ���� �Ϸ�!!");
        	File file=new File("c:\\download\\food.txt");
        	if(!file.exists())
        	{
        		// ������ ������ 
        		file.createNewFile();
        	}
        	//System.out.println("���� ���� �Ϸ�!!");
        	// ���� 
        	file.delete(); // ���� ���� ����
        	dir.delete();  // ���� ����
        	System.out.println("���� ���� �Ϸ�!!");
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	}

}
