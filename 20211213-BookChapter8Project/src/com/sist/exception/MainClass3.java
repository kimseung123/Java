package com.sist.exception;
/*
 *   ���� 
 *     ���� , �޼ҵ� (������ + ���) , Ŭ���� , ����ó�� 
 *     ==> Ȱ�� (��:JSP , Spring , Spring-boot,Mybatis) 
 *     ==> OpenAPI (īī�� => �� , ���� , data.go.kr)
 */
// try~catch ����ó�� 
import java.io.*;
// C:\Windows\System32\
import java.util.*; // Scanner
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����ó�� 
		//try
		//{
			Scanner scan=new Scanner(System.in);
			// System.in => ǥ�� �Է� => �Է��� �޴� ��쿡 ��� 
			// Ű����κ��� �Է°��� �޴� ��쿡 �о���� ��� 
			// System(Ŭ����)  ==> in (InputStream) => static 
			// Ŭ������.�޼ҵ� , ���� => static 
			// Math.random()
			System.out.print("����(1),�׸���(2),�޸���(3), ���ͳ�(4) �Է�:");
			// �Է��� ���� �޾Ƽ� �޸𸮿� ���� 
			int no=scan.nextInt();
			/*
			 *    CheckException => �ݵ�� ����ó���� �ؾ� ��� �� �� �ִ� 
			 *     = IOException  => File ���� (��θ�)
			 *     = InterrupedException => ������(�浹)
			 *     = ClassNotFoundException 
			 *     = SQLException => ����Ŭ
			 *     = MalformedURLException => ��Ʈ��ũ (WEB�ּ�)
			 */
			// ȭ���� �����ֱ� ���� 
			// �κи��� ���� => ��ü������ ���� 
			if(no==1)
			{
				try {
					Runtime.getRuntime()
					  .exec("c:\\windows\\system32\\calc.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //exe���� ���� 
			}
			else if(no==2)
			{
				try {
					Runtime.getRuntime()
					  .exec("c:\\windows\\system32\\mspaint.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			else if(no==3)
			{
				try {
					Runtime.getRuntime()
					  .exec("c:\\windows\\system32\\notepad.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			else if(no==4)
			{
				try
				{
					Runtime.getRuntime()
					 .exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://daum.net");
				}catch(Exception ex) {}
			}
			else
			{
				System.out.println("�޴� ������ �߸��Ǿ����ϴ�!!");
				// ����ó�� => ������ ������ ���� (if) ==> try~catch
				// ���� => �������� 
			}
		//}catch(Exception e)
		//{
			//System.out.println("�Էµ� ��ΰ� Ʋ���ϴ�!!");
		//}
	}

}
