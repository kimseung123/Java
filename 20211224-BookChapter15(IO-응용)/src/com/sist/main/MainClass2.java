package com.sist.main;
// ��ü������ �б� 
// ObjectInputStream 
import java.io.*;
import java.util.*;
/*
 *   try ~ catch 
 *   =====> CheckException 
 *   1. IO 
 *   2. Thread
 *   3. Network 
 *   4. ���÷��� => new���� �޸� �Ҵ� , �޼ҵ� ���� 
 *   5. URL 
 *   6. SQL (����Ŭ) ����Ŭ�� �ڹ� ���� 
 *   
 *   ==========================
 *   � ���� ���� 
 *     = ��Ʈ��ũ 
 *     = �����ͺ��̽� (*****) : �� => ������ �� ������  
 *     
 *     
 *   IO
 *    ���� ����  
 *    File 
 *     => createNewFile() , mkdir() , delete()
 *     => length() , getName() , getPath() , listFiles()
 *    ���� ����� 
 *    �̹���...
 *     FileInputStream / FileOutputStream
 *       read() ,close()  write() ,close()
 *    �ѱ����� ���� �б�/����
 *     FileReader / FileWriter
 *       read() ,close()  write() ,close()
 *    ��ü ���� ����� 
 *     ObjectInpuytStream / ObjectOutputStream 
 *       readObject() close() , writeObject() close()
 *    ��뷮 �����͸� �б�/���� 
 *     BufferedReader / BufferedWriter
 *     ===============
 *       readLine() .close()
 *    
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// ������ �о => ArrayList�� ���� 
        	FileInputStream fis=
        			new FileInputStream("c:\\java_data\\movie_object.txt");
        	// ��ü������ �о� �´� 
        	ObjectInputStream ois=
        			new ObjectInputStream(fis);
        	ArrayList<Movie> list=(ArrayList<Movie>)ois.readObject();
        	// �ݱ�
        	fis.close();
        	ois.close();
        	
        	// ArrayList�� �ִ� �����͸� ��� 
        	for(Movie m:list)
        	{
        		System.out.println("��ȭ��ȣ:"+m.getMno());
        		System.out.println("��ȭ����:"+m.getTitle());
        		System.out.println("����:"+m.getDirector());
        		System.out.println("�⿬:"+m.getActor());
        		System.out.println("�帣:"+m.getGenre());
        		System.out.println("���:"+m.getGrade());
        		System.out.println("������:"+m.getRegdate());
        		System.out.println("\n");
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	}

}



