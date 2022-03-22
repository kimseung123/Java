package com.sist.io;
// FileWriter => 2byte�� ���� ==> ���� ��Ʈ�� 
// =>byte��ȯ���� => String�� �״�� ÷�ΰ� �����ϴ� 
// => default (w) => ����ø��� ���ο� ������ ����� �ش� 
// => a ==> new FileWriter("��θ�",true) => ������ �߰� 
//  ���� : �˻� ==> 
import java.io.*;
public class MainClass6 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
        try
        {
        	// ���� ������ �����ϰ� ����� 
        	File file=new File("c:\\java_data\\news.txt");
        	if(!file.exists())
        	{
        		// ������ ������ ������ ������ 
        		// ��ǻ�Ϳ� ��� 
        		file.createNewFile();
        		System.out.println("���� ���� �Ϸ�!!");
        	}
        	// ���Ͽ� ������ �Է� 
        	/*fw=new FileWriter(file,true); // ��� �Է� 
        	String news="������, ������ ���� ���� 'Ż��' �ֿ� ĳ���� [�ܵ�]\n";
        	fw.write(news);
        	System.out.println("������ �Է� �Ϸ�!!");*/
        	// ������ �б� => 2byte�� �о�� �ѱ��� ���������� ��� 
        	FileReader fr=new FileReader(file);
        	int i=0;
        	String msg="";
        	while((i=fr.read())!=-1)
        	{
        		msg+=String.valueOf((char)i);
        	}
        	System.out.println(msg);
        	fr.close();
        }catch(Exception ex) 
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		fw.close();
        	}catch(Exception ex) {}
        }
	}

}
