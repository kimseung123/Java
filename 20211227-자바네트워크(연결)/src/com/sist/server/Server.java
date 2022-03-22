package com.sist.server;
import java.net.*;
import java.io.*;
// Runnable => ������ 
// ���� ���� => ServerSocket
// ������ => listen()
// Ŭ���̾�Ʈ ���� => accept() => Ŭ������ ���� Ȯ�� (ip,port)
// Ŭ���̾�Ʈ ��û�� �޴´� ==> ��ûó�� => ������� �����ش� 
public class Server implements Runnable{
	// Socket 
	private ServerSocket ss=null;
	private final int PORT=3355; // 0~65535 => (0~1023������� ��Ʈ)
	// 1521 , 8080 , 3000 , 1433 , 4000 
	// ����Ŭ , ���Ͻ� , react,vue , ms-sal , �ӵ弭�� 
	// �Ϲ� (���� �߽�: 10000�� ����) , ����(20000) , ȭ��(30000) 
	// �������� 
	public Server()
	{
		try
		{
			// ���������� �ι��� �� ���� (�ѹ��� ������ ����) 
			ss=new ServerSocket(PORT); // default ==> 50������� ����
			//  Socket(��ȭ) / ServerSocket(������)
			// 1. bind ===> ip,port���� ==> �ڵ��� ����(����)
			//      ip : ��ȭ��ȣ
			//      port : ��ȭ�� 
			// 2. listen ===> ��� 
			// Socket ==> ��ȭ
			System.out.println("�������� �Ϸ�!!");
		}catch(Exception ex){}
	}
    public void run()
    {
    	// ���� ���� => ���ӽ� ó�� 
    	while(true)// ���������� ��������� ���� 
    	{
    		try
    		{
    		   Socket s=ss.accept(); // ������ �� ���� => �߽��� ��ȭ��ȣ 
    		   // Ȯ�� => ��ǻ���� ip�� ��� 
    		   System.out.println(s.getInetAddress().getHostAddress());
    		   System.out.println(s.getPort()); // � ���μ��� ���ؼ� �����ߴ��� Ȯ�� 
    		}catch(Exception ex) {}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server s=new Server();
        new Thread(s).start(); //���� ����
	}

}





