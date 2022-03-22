package com.sist.io;

// ���Ͽ� ���� 
// FileOutputStream (1byte) => ����Ʈ ��Ʈ�� (�ѱ�)
// FileWriter => (2byte) ���ڽ�Ʈ�� => String
/*
 *    File 
 *    FileInputStream / FileOutputStream 
 *    FileReader / FileWriter
 *    ObjectInputStream / ObjectOutputStream 
 *    BufferedReader : ��Ʈ��ũ������ ��� 
 *    ======================================
 *    
 *    enum / ������̼� / ���Խ�
 *    ============== ������ 
 *    
 *    1.�Ϲ��ڹ� (1~8��) => Ŭ���� ����� ��� / �޼ҵ� ȣ�� (����)
 *                    => �������� (����ó��)
 *                    => ���̺귯�� 
 *    ================================= 2�� �ڹ� 
 *    2.����Ŭ ==> jdbc (�ڹٷ� ����Ŭ ����)
 *    3.JSP  ==> servlet(�������� ����)
 *    4.������ ==> XML���� , ������̼� 
 *    5.���̹�Ƽ�� ==> XML���� , ������̼�
 *    6.ê�� => JSON(JavaScript����) => RestFul ==> ���̺귯�� 
 */
import java.io.*;
import java.util.*;
public class MainClass5 {
    // ��������� �ڵ� �ʱ�ȭ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� Ŭ������ �ʱⰪ�� null(�ּҰ��� ������ ���� �ʴ� ����)
		FileOutputStream fos=null; // �޼ҵ�(�������� => �ݵ�� �ʱ�ȭ)
		FileInputStream fis=null;
        try
        {
        	//1. ���� ����� 
        	File dir=new File("c:\\java_data");
        	if(!dir.exists())
        	{
        		dir.mkdir();
        		System.out.println("���� ���� �Ϸ�");
        	}
        	//2. ������ ����� 
        	File file=new File("c:\\java_data\\student.txt");
        	if(!file.exists())
        	{
        		file.createNewFile();
        		System.out.println("���� ���� �Ϸ�");
        	}
        	//3. ���� ���� 
        	fos=new FileOutputStream(file,true);
        	Scanner scan=new Scanner(System.in);
        	System.out.print("�̸� �Է�:");
        	String name=scan.next();
        	System.out.print("���� �Է�:");
        	int kor=scan.nextInt();
        	System.out.print("���� �Է�:");
        	int eng=scan.nextInt();
        	System.out.print("���� �Է�:");
        	int math=scan.nextInt();
        	//String hong="��û��|80|90|70\n";
        	String data=name+"|"+kor+"|"+eng+"|"+math+"\n";
        	fos.write(data.getBytes());
        	//fos.write(hong.getBytes());//byte�� ��ȯ
        	System.out.println("��� �Ϸ�!!");
        	//4. ���� �б�
        	FileReader fr=new FileReader(file);
        	int i=0;
        	String msg="";
        	// ������ ��ü �б� 
        	while((i=fr.read())!=-1)
        	{
        		msg+=String.valueOf((char)i);
        	}
        	
        	System.out.println(msg);
        	// ������ ���� 
        	String[] student=msg.split("\n"); // ���ԽĿ� �����
        	for(String s:student)
        	{
        		String[] info=s.split("\\|");
        		// StringTokenizer 
        		// ���ڿ� => ���� �б� (���ڿ�) 
        		// ������ �ʿ��� ��쿡�� �ݵ�� ��ȯ Integer.parseInt(info[1])
        		System.out.println(info[0]+" "
        			+info[1]+" "
        			+info[2]+" "
        			+info[3]+" "
        			+(Integer.parseInt(info[1])
        			  +Integer.parseInt(info[2])
        			  +Integer.parseInt(info[3]))
        			+" "
        			+(Integer.parseInt(info[1])
              		  +Integer.parseInt(info[2])
            		  +Integer.parseInt(info[3]))/3);
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		fis.close();
        		fos.close();
        	}catch(Exception ex) {}
        }
	}

}











