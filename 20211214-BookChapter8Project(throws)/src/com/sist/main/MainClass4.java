package com.sist.main;
// finally => close() , ���� , ���� , �����ͺ��̽�
// try , catch ����� ���þ��� ������ �����ϴ� ���� 
import java.io.*;
public class MainClass4 {
    // throws FileNotFoundException,IOException => throws Exception
	// throws FileNotFoundException,IOException => throws Throwable
	/*public static void main(String[] args) 
			  throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
        // ���� �б� 
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i=0;// ���� ������ => char(ASC)
		while((i=fr.read())!=-1) // -1 (EOF)
		{
			System.out.print((char)i);
		}
		
		fr.close();
	}*/
	/*public static void main(String[] args) {
		FileReader fr=null;// main ��ü���� ��� 
		try
		{
			fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);// ���� ������ ��� 
			}
		}catch(FileNotFoundException e) {}
		 catch(IOException e) {}
		// ���ÿ��� ���󵵰� ���� (�����ͺ��̽� , ��Ʈ��ũ , ����)
		finally
		{
			try
			{
			  fr.close();
			}catch(IOException ex){}
		}
	}*/
	// 437page 
	public static void main(String[] args) {
		try (FileReader fr=new FileReader("c:\\javaDev\\movie.txt"))
		{
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		// try ���� ����� �ڵ����� close()�� ȣ�� 
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
		
	}

}






