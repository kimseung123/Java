package com.sist.io;
// ���� ����� => �������� ���� 
/*
 *    ===> �б�              ===> ���� 
 *    FileInputStream / FileOutputStream ==> ���� , ���� 
 *    FileReader  / FileWriter ==> �ѱ� ���� 
 *    
 *    ���� ���� => ��� (w , a)
 *    w : create (������ ���� ����) => ������ �ִ� �����͸� ����� ���ο� ���� ����
 *    a : append : ������ �ִ� �����͸� �״�� �� ���¿��� ������ �߰� 
 *    ========== �ѱ� ���� =====================================
 *    FileWriter fw=new FileWriter("��θ�") => w
 *    FileWriter fw=new FileWriter("��θ�",true) => a
 *    ========== ���� ���� , ���ε� ==============================
 *    FileOutputStream fis=new FileOutnputStream("��θ�") => w
 *    FileOutputStream fis=new FileOutnputStream("��θ�",true) => a
 *    
 */
// ���� �б� => InputStream,Reader 
import java.io.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fis=null;//1byte�� �о���� Ŭ���� 
		FileReader fis=null;
		// �׸����� , zip���� 
		// �ѱ� => 2����Ʈ ==> ���� ��Ʈ�� (FileReader)
        try
        {
        	// �ڹٿ����� �ݵ�� ��� ���� ==> \ => \\
        	fis=new FileReader("C:\\javaDev\\javaStudy\\20211223-BookChapter15(�����)\\src\\com\\sist\\io\\MainClass1.java");
            // 1byte�� �д´� => �ѱ��ھ� �о� �´� => int (������ ��ȣ)
        	// A => 65
        	int i=0; // �����Ѱ��� �޾Ƽ� ������ ���� 
        	// ==> ������ ������ �д´� (EOF=> End Of File) => -1
        	while((i=fis.read())!=-1)// ��� �����͸� �о�Ͷ� 
        		  // read() => �ѱ��ھ� �о� �´� 
        	{
        		System.out.print((char)i);
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	// �����ݱ� , ���� �ݱ� , ����Ŭ �ݱ� 
        	try
        	{
        	  fis.close(); // ����ó���� �ʿ�
        	}catch(Exception ex){}
        }
	}

}




