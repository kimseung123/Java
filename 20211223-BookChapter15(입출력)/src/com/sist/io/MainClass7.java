package com.sist.io;
// => ���Ͽ� �ִ� ��ü �����͸� �޸𸮿� �ѹ��� ������ �д� ���α׷� 
// BufferedReader => ���پ� �о� �´� 
/*
 *    File 
 *    =====
 *      => ���� ���� / ���丮 ���� 
 *      => �ֿ� �޼ҵ� 
 *         directory 
 *         =========
 *           => listFiles() : �����ȿ� �ִ� ��� ������ �б� 
 *           => mkdir() : ���� ���� 
 *           => delete() : ���� ���� 
 *           => exsist() : ���翩�� Ȯ�� 
 *           
 *         file
 *         ====
 *           => getName() : ���ϸ� 
 *           => getPath() : ��θ� 
 *           => length() : ũ�� 
 *           => createNewFile()
 *    FileInputStream (1byte)
 *    FileReader(2byte)
 *       => read()
 *       => read(byte[],int,int)
 *    =================
 *    FileOutputStream(1byte)
 *    FileWriter(2byte)
 *       => write()
 *    =================
 *    BufferedReader(��ȯ => InputStreamReader)
 *      => readLine()
 *      
 *     // => ���� ���ε� (���Ϻ���) 
 *     // => �ܺε����� ���� => ���� 
 *     
 */
import java.io.*;
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileInputStream fis=null;
        try
        {
        	fis=new FileInputStream("c:\\java_data\\news.txt");
        	BufferedReader br=
        			new BufferedReader(new InputStreamReader(fis));
        	//=> 1byte => 2byte�� ���� (�ѱ��� ���������� ����)
        	while(true)
        	{
        		String data=br.readLine();
        		if(data==null) break; //���� ���� ��쿡 ����
        		System.out.println(data);
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();// ���� ó�� 
        }
        finally
        {
        	try
        	{
        		fis.close();// ���� �ݱ� (����,�������� ������� ���� �ݱ⸦ �Ѵ� 
        	}catch(Exception ex) {}
        }
	}

}
