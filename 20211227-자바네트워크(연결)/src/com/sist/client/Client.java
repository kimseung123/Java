package com.sist.client;
import java.net.*;
/*
 *   ��Ʈ��ũ 
 *     = IO (�����) => 
 *     = Thread => �������� �� Ŭ���̾�Ʈ���� ���� ������ ���� ���� 
 *     = ��Ʈ��ũ ���� ���̺귯�� 
 *     = ������ 
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Socket s=new Socket("211.63.89.99",3355);
        }catch(Exception ex) {}
	}

}
