package com.sist.main;
// ���� => ���� ���� ==> IO => �ڹٿ��� �����ϴ� ���̺귯���� ��κ� ����ó�� 
// ���� (�˸�) => throws , ����ó�� => try~catch
import java.io.*;
/*
 *   io (input/output)
 *    => �޸� ����� 
 *    => ���� ����� 
 *    => ��Ʈ��ũ ����� 
 */
// ==> 433page
public class MainClass3 {

	public static void main(String[] args) /*throws IOException*/{
		// TODO Auto-generated method stub
        File dir=new File("c:\\download");
        if(!dir.exists()) //������ �������� ������ 
        {
        	dir.mkdir();
        }
        
        File file=new File("c:\\download\\test.txt");
        if(!file.exists())
        {
        	try
        	{
        	   file.createNewFile();// ����ó���� �ʿ��� �޼ҵ� 
        	}catch(Exception e) {}
        }
        System.out.println("���� �Ϸ�!!");
        // ���� 
        file.delete();
        dir.delete(); 
        System.out.println("���� �Ϸ�!!");
	}

}
