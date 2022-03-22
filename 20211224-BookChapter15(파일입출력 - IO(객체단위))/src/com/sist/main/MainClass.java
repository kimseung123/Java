package com.sist.main;
/*
 *   IO(InputStream / OutputStream) => java.io.* => (nio)
 *   => Frame => JFrame => JavaFX (��)
 *   => �ڹ� => 1995(Applet) => ���ͳ� (����������:������ Ȯ��) 
 *             ============= ���� ������ (���� => 5/23)
 *   => �׸�������Ʈ : ������(����) => ����(����) => �Ӻ���� => ����� 
 *      ========= �׽������� (������) => �� 
 *   
 *   => IO (�����)
 *      1. �޸� 
 *         = System.in , System.out(ǥ�� �����) 
 *         = Scanner
 *      2. ����
 *         = FileInputStream/FileOutputStream
 *         = FileReader / FileWriter
 *      3. ��Ʈ��ũ 
 *         = Socket (�����) ==> ��ȭ�� (����=IP,PORT(���ἱ)) 
 *           = Socket ��������� �̿��ؼ� => ��� (Stream)=> �ŷڼ�(TCP)
 *           
 *   => �ڹٿ��� �����ϴ� IO
 *      ����Ʈ ��� ��Ʈ��                 /       ���� ��� ��Ʈ�� 
 *      InputStream / OutputStream             Reader / Writer
 *        |              |                       |        |
 *     FileInputStream / FileOutputStream      FileReader / FileWriter
 *     ObjectInputStream / ObjectOutputStream           |
 *                                                 BufferdReader
 *                                                 
 *     ���Ͽ� ���� ���� : File
 *     ** ������Ʈ�� => InputStreamReader 
 *                   =========== ======
 *                    ����Ʈ => ���ڷ� ����
 *     
 *     FileInputStream(�����б�) / FileOutputStream(���� ����)
 *     int read()                void write(int b),void write(byte[])
 *     ==== ���� ��ȣ(char)         *** String => byte[] 
 *                                      getBytes()
 *     int read(byte[],int o,int s) void write(byte[],int s, int e)
 *     ==== ���� ����Ʈ �� 
 *     close()                   close()
 *     *** -1 (EOF=End Of File)
 *     ========================> �� (���ε� , �ٿ�ε�) => �ڷ��
 *       => �׸��� ����� ���  => �׸������� byte[]�� �޾Ƽ� length()-1
 *      
 *     FileReader(�ѱ��� ���Ե� �ؽ�Ʈ ���� �б�)/FileWriter(�ѱ��� ���Ե� �����͸� �ؽ�Ʈ ���Ͽ� ����)
 *       => int read()                     => void write(int c)
 *          === ���ڹ�ȣ (0~65535)           => void write(String s)
 *              => char(2byte�� �о� �´�)
 *       => int read(char[],int s,int e)
 *       => close()
 *     ==========================================================
 *     ���� ��Ʈ�� 
 *     BufferedReader : ���� =====> ��ü�޸𸮿� ������ �������α׷� 
 *                      �������α׷� ======> ��ü�� ��Ƽ� �ϵ��ũ
 *     ==> readLine() , close()
 *     ==========================================================
 *     ���Ͽ� ���� : File (����,���丮)
 *     1. ���� ���� 
 *        File file=new File("c:\\javaDev\\a.png")
 *     2. ���丮 ����  
 *        File dir=new File("c:\\javaDev")
 *     3. ���� (���� : createNewFile(),���丮:mkdir() , ����: delete())
 *     4. ���� ���� 
 *        getName() : ���ϸ� �о� �´� 
 *        getPath() : ��θ�~���ϸ� 
 *        getParant() : ��θ� 
 *        length() : ���� ũ�� (������ : long)
 *        listFiles() : �����ȿ� �ִ� ��� ����,���丮�� �о� �´� 
 *     ============================================================
 *     ObjectInputStream      /  ObjectOutputStream 
 *      => Object readObject()  void writeObject()
 *      => close()              => close()
 *     ========================================= ��ü ���� : ����ȭ / ������ȭ 
 *     
 *     //1 . FileInputStream / FileOutputStream 
 *       => ���ε� (������ �����ؼ� => ���ϴ� �����̵�)
 *          ===== local => server
 *          
 *       // C:\\Users\\user\\Desktop\\�ڷ�\\2021-12-13.zip
 *       // c:\\java_data
 */
// ���̺귯�� ÷�� 
import java.io.*;
public class MainClass {
    // FileInputStream/FileOutputStream => ���� ���� , ���ε� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// ���� ���� ���� 
        	FileInputStream fis=
        			new FileInputStream("C:\\Users\\user\\Desktop\\�ڷ�\\2021-12-13.zip");
        	// ���� ���� ���� 
        	FileOutputStream fos=
        			new FileOutputStream("c:\\java_data\\2021-12-13.zip");
        	int i=0; // ���� ����Ʈ �� 
        	byte[] buffer=new byte[1024];
        	// 1024 (TCP) , 512 (UDP) 
        	while((i=fis.read(buffer, 0, 1024))!=-1)
        	{
        		//System.out.println("���� ����Ʈ ��:"+i);
        		// ���� ����Ʈ�� ���ϴ� ���Ͽ� ��� 
        		fos.write(buffer, 0, i);
        		//                  ���� ����Ʈ �� ��ŭ ��� 
        	}
        	// ���� => �ݵ�� ���� �ݱ� 
        	fis.close();
        	fos.close();
        	System.out.println("���� ���� �Ϸ�!!");
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
	}

}






