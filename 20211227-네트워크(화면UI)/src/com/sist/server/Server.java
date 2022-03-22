package com.sist.server;
/*
 *     ����ó�� : Ŭ���̾�Ʈ ���ӽ� ó�� ==> Ŭ���̾�Ʈ IP�� ���� 
 *     =========================
 *     ����� ����ϴ� Ŭ���� : IP�� ã�Ƽ� �����Ŀ� �����͸� ���� 
 *     
 *     ==> innerClass : ���� �ٸ� Ŭ�������� => �������� ���Ǵ� ������ �޼ҵ尡 
 *                      �ִ� ��� �ַ� ��� 
 *     ==> ��� Ŭ���� 
 *         ========
 *         class A
 *         {
 *            ============
 *             �����ϴ� ������ 
 *            ============
 *            class B
 *            {
 *               A�� ������ �ִ� ������ ����� ���� 
 *               => ��ũ��ũ 
 *               => ������ 
 *            }
 *         }
 *      ==> �͸��� Ŭ���� (extends�� �������� �ʴ´�) => �������̵��� ���� 
 *          class A
 *          {
 *             B b=new B(){
 *                B�� ������ �ִ� �޼ҵ带 �����ǰ� ����,�߰�  
 *             }
 *          }
 *          
 *      ==> Spring�� ������ �������� Ŭ������ ��ȣ (���(X) , ����(O))
 *          => POJO 
 *         
 *      
 */
import java.io.*;
import java.util.*;
import java.net.*;
/*
 *    Thread : 
 *       ���α׷��� ���μ��� (���μ����ȿ��� ������ ���α׷��� ���ÿ� ���� 
 *                       ������) 
 *                       �Ѱ��� �������Ͽ��� 1���̻��� �����尡 �����Ѵ� 
 *       => �ڹ� Ư¡�� ��Ƽ�����带 �����Ѵ� 
 *       => ����� ���ǽÿ� 
 *          ============
 *           �����尡 2�� ���� 
 *           1)  main() => ������
 *           2)  gc() => ������ 
 *       => ����� ��� 
 *          =========
 *          �������̽�
 *            => class A implements Runable
 *               {
 *                   public void run()
 *                   {
 *                   }
 *               } 
 *          ��� class A extends Thread
 *              {
 *              }
 *              
 *       => Thread�� ���� �ֱ� 
 *        Thread t=new Thread() t.start() t.run              sleep()   
 *        Thread ���� ==> Thread ��� ==> Thread ����(����) <===> �Ͻ� ����
 *             (Thread ���ۿ� �ʿ��� ������ ����)  |
 *                                           | interrupt()
 *                                         Dead(������ ����)
 *        �ð��� �����ؼ� �۾� ���� 
 *         
 */
public class Server implements Runnable{
    //1. ������ Ŭ���̾�Ʈ(����:IP,PORT) ���� 
	private Vector<Client> waitVc=new Vector<Client>();
	//2. ���� ���� 
	private ServerSocket ss;
	//3. PORT(���ἱ) 
	private final int PORT=3355;//0~65535���̿��� ���� 
	// �������� 
	// ���ӽÿ� ó�� => waitVc���忡 ���� 
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			System.out.println("Server Start!!");
		}catch(Exception ex) {}
	}
	public void run()
	{
		while(true)
		{
			try
			{
				// ���ӽ� => IP,PORT�� ���� 
				Socket s=ss.accept(); // ��ȭ ���� => �߽��� ��ȣ
				// ���������� ������ �ϰ� => ����� �����ض�
				Client c=new Client(s);
				waitVc.add(c);
				c.start();
			}catch(Exception ex){}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server s=new Server();
        new Thread(s).start();
	}
    // ������ Ŭ���̾�Ʈ�� ��� (��û => ����) ==> JSP
	class Client extends Thread
	{
		//��� => ����� 
		//Ŭ���̾�Ʈ�κ��� ��û�� �޴´�
		BufferedReader in;
		//Ŭ���̾�Ʈ�� ���� ����
		OutputStream out;
		//��ȭ �ޱ�
		Socket s;
		public Client(Socket s)
		{
			try
			{
				this.s=s;
				in=new BufferedReader(
						new InputStreamReader(
								s.getInputStream()));
				out=s.getOutputStream();
			}catch(Exception ex) {}
		}
		
		// ���� ���
		public void run() // ������ ������ �ڵ� 
		{
			while(true)
			{
				try
				{
					// Ŭ���̾�Ʈ�� ������ ��û�� �д´� 
					String msg=in.readLine();
					// ������ ��� ������� ���� 
					for(Client c:waitVc)
					{
						c.out.write((msg+"\n").getBytes());
						// ��Ʈ��ũ => 1byte => ������ 2byte�� ��ȯ 
					}
				}catch(Exception ex) {}
			}
				
		}
	}
}






