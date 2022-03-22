package com.sist.server;
/*
 *   ��� Ŭ���� 
 *   =========
 *    1. ��������  =======> ServerSocket
 *    2. ������ ���� ���� ==> ArrayList
 *    3. ���� ���� ����  ==> ArrayList ===> ObjectInputStream 
 *    4. ���   
 *        �۽� : �����  ==> OutputStream
 *        ���� : ��û�� �޴´� ==> BufferedReader 
 *        
 *    ===============================================
 *      1. �������� 
 *         1) ������ ���� 
 *         2) ������ 
 *      2. ������ ���Ӵ�� 
 *         1) �������� ������ �޴´�
 *         2) �����ڸ��� ���� ����� �����ϰ� ����� (���α׷��� ������ ����)
 *                                           ================== ������ 
 *      =============�� ���� , ����Ŭ ���� ========================
 *      3. �����ڿ� ��� (������)
 *         ==========
 *         �����α׷� : ������ �̿��Ѵ� 
 *  
 */
import java.util.*;
import java.io.*;
import java.net.*;
///// �ڹ� ���̺귯�� 
import com.sist.music.*;
import com.sist.common.*;
///// ����� ���� ���̺귯�� 
/*
 *    Ŭ���� 
 *     = ����� ���� Ŭ���� (���α׷��Ӱ� ����)
 *     = �ڹٿ��� �����ϴ� Ŭ���� , Open API(�ܺο� ����)
 *       *** Open Api (Jsoup,Spring(open source),MyBatis(google))
 *     ==================== �����ؼ� �Ѱ� ���α׷� ===================
 *     ==> 70~80% �ڹ�,�ܺζ��̺귯�� ��� 
 *     ==> 30~20% ����ڰ� ���� ��� 
 *     ==> �ڹٴ� ������ ���α׷� , CBD 
 */
public class Server implements Runnable{
    private static ArrayList<Music> mList=new ArrayList<Music>();
    // ���� �����͸� ������ ����
    private ArrayList<Client> cList=new ArrayList<Client>();
    // �������� ������ �����Ѵ� (ID,NAME,IP,PORT)
    private ServerSocket ss;
    // ������ => ������ �޾Ƽ� ����
    // 1. ������ �ʱ�ȭ 
    /*
     *    �⺻ ������ (����Ʈ ����) => ��������� �⺻ �����Ͱ��� ������ �ִ�
     *      int : 0
     *      long : 0L
     *      double : 0.0
     *      float :0.0F
     *      boolean :false
     *      ��ü : null (�ּҰ� ������ �ȵ� ����)
     *             *** �޼ҵ�ȿ� ����� ������ ���������� �ʱ�ȭ(X) 
     *                 =>�ݵ�� �ʱ�ȭ�� �Ѵ� 
     *     ������� �ʱ�ȭ : ����� ���ÿ� ���� �ο� 
     *     int a=10; ArrayList list=new ArrayList()
     *     �ʱ�ȭ ��� : ��������� �ʱ�ȭ�� ���� ���ϴ� ��� 
     *                *** Ŭ���������� ������ ������ ���� ���� (����(X))
     *                *** ���� => ��� , �ܺ� ���� �б� , �����ͺ��̽� ���� 
     *     {} =========> �ν��Ͻ� ��� (�ν��Ͻ� ������ ���� �ʱ�ȭ) 
     *     static{} ===> ���� ��� (static ������ �ʱ�ȭ �� ��쿡 ���)
     *     
     *     ������ ==> �ʱ�ȭ ���� 
     *     
     */
    static 
    {
    	// �ڵ����� �о ó�� 
    	// ������ �о ArrayList�� ������ ��� 
    	FileInputStream fis=null;
    	ObjectInputStream ois=null;
    	try
    	{
    		fis=new FileInputStream("c:\\java_data\\music_object.txt");
    		// ���� ������ => ��ü ������ ���� 
    		ois=new ObjectInputStream(fis);
    		// ArrayList�� ���� 
    		mList=(ArrayList<Music>)ois.readObject();
    	}catch(Exception ex)
    	{
    		// ���� ó�� => ���� Ȯ�� 
    		ex.printStackTrace();
    	}
    	finally
    	{
    		// ���� �ݱ� 
    		try
    		{
    		  fis.close();
    		  ois.close();
    		}catch(Exception ex){}
    	}
    }
    public Server()
    {
    	// ȣ��ÿ� ���� 
    	// ���� ���� 
    	try
    	{
    		ss=new ServerSocket(3355); // port=> �ݵ�� ����
    		// port => ���α׷��Ӱ� ���� ��� , 0~65535(0~1023:�����) 
    		// Ŭ���̾�Ʈ�� �ý��ۿ� ���� �ڵ� ���� 
    		// �����ϰ� �ִ� (�˸�)
    		// bind():ip,port(����):�ڵ��� ���� ==> listen():������
    		System.out.println("Music Server Start...");
    	}catch(Exception ex){}
    }
    // ���ӽ� ó�� 
    public void run()
    {
    	try
    	{
    		Socket s=ss.accept(); // ������ �Ǹ� => ������� ���� (Socket)
    	    // Socket => ip/port => ����� ���� 
    		// ==> Socket => ������� �����ؼ� �����ڸ��� ����� �����ϰ� ������ش� 
    	    Client client=new Client(s);
    	    client.start(); // ������ �Ѱ��ְ� �ش� �����ڿ� ����� �����Ѵ� 
    	}catch(Exception ex){}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� 
		Server server=new Server(); // ������ ȣ�� (����)
		new Thread(server).start(); // run()ȣ�� => ������ ����ó�� 
	}
	// ��� ��� Ŭ���� => �ݵ�� (�����ڸ��� ���� ����) => ���α׷��� ������ ���� (������)
	// ���α׷�(���μ���)�ȿ��� �������� �ٸ� ���α׷��� ���� => ������ 
	// ������� �ݵ�� ������ �Ҷ� run() ==> run()�� ȣ��ÿ��� �ݵ�� start()
	// �����带 �̿��ؼ� ����� �����Ѵ� (������ ����) 
	/*
	 *   => Server/Client ==> ���� Ŭ���� �̿� 
	 *   ����Ŭ���� : ������(javax.swing),������,������
	 *   ==>��� Ŭ����
	 *   class Server
	 *   {
	 *      ArrayList cList=new ArrayList() ==> Server���� ��� ����
	 *      class Client
	 *      {
	 *         cList�� �������� ����� ���� 
	 *      }
	 *   }
	 *   ==> �͸��� Ŭ���� : ��Ӿ��� ������(�������̵�) 
	 *   ==> ������,�����쿡�� ���� 
	 */
	class Client extends Thread // ������ ���� �����Ǵ� Ŭ���� (������ ����)
	{
		Socket s;
		// ����� => ��� ���� ��� 
		OutputStream out; // �۽� (��ûó�� ����� �����ٶ� ���)
		BufferedReader in; // ���� (������� ��û�� �޴� ��쿡 ���)
		//Ȯ��(������ ����) 
		String id,name; // �α����� �� ������ �޴´� 
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				// ��� ���α׷� ��� (C/C++,C#,Python,Kotlin)
				// => ��������(�޼ҵ�ȿ� ����� ����,�Ű�����) �켱����
				// �������� => ������� 
				// ���������� ����������� ���� ���� ���� => this(Client  ��ü) 
			    // �����(���)�� �� �� �ְ� ���� 
				// �Է�
				in=new BufferedReader(
						new InputStreamReader(s.getInputStream()));
				// ��� 
				out=s.getOutputStream();//�߻�Ŭ���� 
				/*
				 *   �߻�Ŭ���� 
				 *   �������̽� (�߻�Ŭ������ ����)
				 *   ======================== �̿ϼ��� Ŭ����
				 *                            -----(�޼ҵ尡 ����)
				 *   ==> ������ �ݵ�� ������ Ŭ������ �̿��ؼ� �޸� �Ҵ��� �Ѵ� 
				 *   List (�������̽�)
				 *    | ���� 
				 *  ArrayList
				 *  
				 *   List list=new ArrayList()
				 *   
				 *   ==> ���� �ٸ� Ŭ���� ��� ���� 
				 *   ==> ���õ� Ŭ���� ==> �� 
				 *   ==> �������� �ִ� ��� ==> �ݵ�� ��� (�Ѱ��� �̸����� ��ü�� ����) 
				 *       =====
				 *        ���� ====> �迭 , Ŭ����
				 *        Ŭ���� ===> �������̽� , �߻�Ŭ���� 
				 */
			}catch(Exception ex){}
		}
		// ����� �Ѵ� => run()
		public void run()
		{
			while(true)
			{
				try
				{
					//1. ����� ��û 
					String msg=in.readLine();
					// readLine() ==> �� �������� => \n�� �ݵ�� ���� 
					//2. ��ɺ� ó�� 
					StringTokenizer st=
							new StringTokenizer(msg,"|");
					//3. � ��û�̳�? => ��� 
					int protocol=Integer.parseInt(st.nextToken());
					// ���۽ÿ� => 100|�α��� ������\n
					switch(protocol)
					{
					  case Function.LOGIN:
					  {
						  // loginó�� => ȭ�� ���� => ���� ������ ���� 
						  // ������ �ޱ� 
						  id=st.nextToken();
						  name=st.nextToken();
						  // ���� (������ ����)
						  cList.add(this); // id,name,s,in,out
						  // 2. �α��� => ���� ȭ�� ���� 
						  messageTo(Function.MYLOG+"|"+name);
						  // 3. ���� �����͸� �����Ѵ� 
						  StringBuffer sb=new StringBuffer();
						  for(Music m:mList)
						  {
							  String music=m.getNo()+"%"
									     +m.getTitle()+"%"
									     +m.getSinger()+"%"
									     +m.getAlbum()+"^";
							  sb.append(music);
						  }
						  
						  messageTo(Function.LIST+"|"+sb.toString());
					  }
					  break;
					  case Function.LIST:
					  {
						  StringBuffer sb=new StringBuffer();
						  for(Music m:mList)
						  {
							  String music=m.getNo()+"%"
									     +m.getTitle()+"%"
									     +m.getSinger()+"%"
									     +m.getAlbum()+"^";
							  sb.append(music);
						  }
						  
						  messageTo(Function.LIST+"|"+sb.toString());
					  }
					  break;
					  // �ޱ� (��û) => �����͸� ���� => ������� �����ش� 
					  case Function.FIND:
					  {
						  // ���� �˻�� �޾Ƽ� => ã�� ������ ���� 
						  StringBuffer sb=new StringBuffer();
						  // �˻�� �޴´� 
						  String ss=st.nextToken();
						  // ã�� 
						  for(Music m:mList)
						  {
							  if(m.getTitle().contains(ss))
							  {
								  String music=m.getNo()+"%"
										     +m.getTitle()+"%"
										     +m.getSinger()+"%"
										     +m.getAlbum()+"^";
								  sb.append(music);
							  }
						  }
						  
						  // ã�� ������ ����ڿ��� ������ 
						  messageTo(Function.FIND+"|"+sb.toString());
						  /*
						   *   ���� ��� 
						   *   1. ������ �ޱ� : BufferedReader
						   *                  => readLine()
						   *   2. ������ ���� : OutputStream
						   *                  => write()
						   *   3. ������ �˻� : contains() ,equals()
						   *   4. ������ �߰� : Login,�游��� 
						   *   5. ������ ���� : NickName,�溯��
						   *   6. ������ ���� : ������ ...
						   *   
						   *   ===> ����Ŭ , ������
						   */
					  }
					  break;
					}
				}catch(Exception ex){}
			}
		}
		// �����͸� ���� 
		public void messageTo(String msg)
		{
			try
			{
				// out => �����ڿ��� �����͸� ���� 
				out.write((msg+"\n").getBytes());//1byte���� => 2byte�޴´� 
				//      InputStream Reader => InputStreamReader
			}catch(Exception ex){}
		}
		// �ݺ��� ���� ��쿡�� => �޼ҵ� ó���Ѵ�
		// �޼ҵ� : �Ѱ��� ����� ���� �����Ҷ� 
		//         �ڵ��󿡼� �ݺ��� ���� ��� 
		//         �������� ���� ����� (������ �߻��ÿ� ���� ó���� ����)
	}

}







