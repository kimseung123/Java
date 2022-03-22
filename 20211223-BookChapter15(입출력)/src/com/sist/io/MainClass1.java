package com.sist.io;
/*
 *     1) �� => File���� 
 *        =============
 *        �ڹٿ� ����� 
 *        1. byte stream : 1byte(�б�/����) => �Ϲ� ���� 
 *                         ���ε� / �ٿ�ε�
 *                 => ~InputStream / ~OutputStream 
 *                 ��) FileInputStream / FileOutputStream 
 *                     ObjectInputStream / ObjectOutputStream  
 *        2. ���� stream : 2byte(�б�/����) 
 *            => ���Ͽ� �ִ� ������ (�ѱ��� ����) �ѱ�(2byte)
 *                => ~Reader / ~Writer
 *                ��) FileReader / FileWriter
 *        3. ���� ��Ʈ�� : Buffered => �����͸� �޸𸮿� �ѹ��� ��Ҵٰ� 
 *                                  ��� => �ӵ��� ������ 
 *        4. ��Ʈ�� (Stream) : ������ �̵��ϴ� ��� 
 *           => �ܹ��� ��� (�б�/����)
 *              ��Ʈ��ũ => ���α׷��� �ΰ��� ���ÿ� ���� 
 *                                ========= ������ 
 *           => ���� 
 *        ====================================================
 *        File => ���� / ���丮 
 *        ====
 *         FileInputStream(�б�) / FileOutputStream(����) => 1byte
 *         FileReader(�б�)   / FileWriter(����) => �ѱ� => 2byte
 *         BufferedReader => �ѱۿ� ��Ƽ� ó�� 
 *         ObjectInputStream / ObjectOutputStream => ��ü ���� 
 *          => �ø�������� => ����ȭ => ������ȭ 
 *          => InputStreamReader 
 *             =========== ======   1byte�� �о�� 2byte�� ��ȯ 
 *               ���ڵ�      ���ڵ� 
 *             %EC%9E%90%EB%B0%94 => ��Ʈ��ũ => ���� 
 *             �ݵ�� ���ڵ� (byte�� ��ȯ)
 *             
 *             %EC%9E%90%EB%B0%94 => �ڹ� (2byte)
 *             
 *         File : ���Ͽ� ���� / �������� 
 *         => �⺻���� ���(�޼ҵ�)
 *         1) ���� ���� �б� 
 *            =========== ������ 
 *            File file=new File("c:\\javaDev\\a.txt")
 *              => ���� ���� �б� (���ϸ���� ����)
 *            File dir=new File("c:\\javaDev")
 *              => ���丮 (���� ����) �б� 
 *         2) ���ϸ� �б� 
 *            ========
 *            getName() : ���� ���ϸ� �б� : a.txt
 *            getPath() : c:\\javaDev\\a.txt
 *            getParent() : c:\\javaDev
 *            
 *         3) ���� Ư�� 
 *            �б����� : canRead() => boolean
 *            �������� : canWrite() => boolean 
 *            �������� : isHidden() => boolean
 *         4) ���� 
 *            ���� : isFile()
 *            ���� : isDirectory()
 *         5) ���� 
 *            ���� ����� : createNewFile()
 *            ���� ����� : mkdir()
 *         6) ���� => ����/���� => delete()
 *            ���� ������ => ������ ������ ������ ��� => �������� ���Ѵ� 
 *                        1. �����ȿ� �ִ� ��� ������ ������ �� ���� ���� 
 *         7) ���� �ִ� ��� ���ϰ� ������ �б� => listFiles()
 *         8) exists() ���翩�� Ȯ�� 
 *         ======================================================
 *          ===> ���Ŀ� ������ (�ٿ�ε� / ���ε�)
 *         9) lastModified() => ���� ��¥  
 *       =====================================================
 *       1. �����ϴ� ���� 
 *          ������ �Ѱ��� �����ϴ� �޸� ���� : ����
 *             =====
 *               10 => a(�޸� �ּ� ��Ī)  => int a=10;
 *             =====
 *          ������ �������� ���������� ���� : �迭
 *             =======
 *              0x100  => arr  => int[] arr={10,20,30};
 *             =======
 *                           arr[0]    arr[1]  arr[2]
 *                         ===========================
 *                            10     |  20   |  30
 *                        |===========================
 *                       arr(0x100)
 *          �����͸� ���ķ� �����ϴ� ��� : Ŭ���� 
 *          
 *          class A
 *          {
 *             int age;
 *             String name;
 *             String addr;
 *          }
 *          
 *          ========
 *           0x100  ==> a  => A a=new A(); // �ٸ� ���������� ��Ƽ� ó��
 *          ========
 *          
 *                     =========
 *                     age => ��
 *                     =========
 *                     name => ��
 *                     =========
 *                     addr => ��
 *                     =========
 *          
 *          =========================== �޸𸮿� ���� (���α׷� �����Ŀ� �ڵ����� �������)  
 *         
 *          => �������� ���� ��ġ 
 *          �����͸� ��� ����
 *          1. ���� (���ȿ� ���)  ==> RDBMS (����Ŭ)
 *          2. ���õ� �����͸� ��Ƽ� �����ϱ� ��ƴ� => ������� �ִ�
 *          ============================================== 
 *           
 */
// => ����°� ���� => java.io ==> CheckException => ����ó�� 
import java.io.*;
import java.util.*;//Date
import java.text.*;//SimpleDateFormat
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// ���� �����ϴ� ���� 
        	// 1. File�� ���� ���� 
        	// 1-1 ���� ������ ���� 
        	File file=new File("c:\\javaDev\\movie.txt");
        	// ������ ������ �ִ� ���� ����
        	//***1. ���� �̸� �б� 
        	System.out.println("���ϸ�:"+file.getName());
        	//***2. ��θ� �����ؼ� �б� 
        	System.out.println("�������:"+file.getPath());
        	//3. ��θ� �б�
        	System.out.println("���:"+file.getParent());
        	//4. ������ ��¥
        	Date date=new Date(file.lastModified());
        	SimpleDateFormat sdf=
        			new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        	System.out.println("������:"+sdf.format(date));
        	//***5. ������ ũ�� 
        	String temp=file.length()>1024?(file.length()/1024)+"KB":
        		    (file.length())+"Bytes";
        	System.out.println("���� ũ��:"+temp);
        	//6. Ư�� => �������� , �б�����,��������
        	System.out.println("��������:"+file.isHidden());//false
        	System.out.println("�б�����:"+file.canRead());//true
        	System.out.println("��������:"+file.canWrite());//true
        	//***7. ����,���丮 ���� Ȯ�� 
        	System.out.println("���Ͽ���:"+file.isFile());
        	System.out.println("���丮����:"+file.isDirectory());
            //8.��Ÿ
        	System.out.println("������:"+file.getAbsolutePath());
        }catch(Exception e)
        {
        	e.printStackTrace(); // ���� ó�� (Ȯ��)
        }
	}

}





















