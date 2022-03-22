package com.sist.ann;
import java.lang.reflect.Method;
import java.util.*;
class UserRequest
{
	@RequestMapping("login")
	public void login()
	{
		System.out.println("Login ��û...");
	}
	@RequestMapping("join")
	public void join()
	{
		System.out.println("ȸ������ ��û...");
	}
	@RequestMapping("idcheck")
	public void idcheck()
	{
		System.out.println("ID �ߺ�üũ ��û");
	}
	@RequestMapping("postfind")
	public void postfind()
	{
		System.out.println("�����ȣ �˻� ��û...");
	}
	@RequestMapping("list")
	public void board_list()
	{
		System.out.println("�Խ��� ��� ��� ��û...");
	}
	@RequestMapping("detail")
	public void board_detail()
	{
		System.out.println("�Խ��� �󼼺��� ��û");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ///UserRequest u=new UserRequest();
		// ���ο� �޸� �Ҵ� 
		try
		{
		   Scanner scan=new Scanner(System.in);
		   System.out.print("��û:");
		   String cmd=scan.next();
		   Class clsName=Class.forName("com.sist.ann.UserRequest"); // Ŭ���� ������ ������ �´� 
		   // ��Ű������� => Ŭ��������� ==> Ŭ���������� �о ���� (���÷���)
		   // �޸� �Ҵ� 
		   Object obj=clsName.getDeclaredConstructor().newInstance();
		   
		   /*UserRequest u=(UserRequest)obj; // ����ȯ 
		   u.login();
		   u.board_detail();
		   u.join();
		   u.board_list();
		   u.postfind();
		   u.idcheck();*/
		   
		   //Object obj=clsName.newInstance();
		   Method[] methods=clsName.getDeclaredMethods();
		   // UserRequest�� ����� ��� �޼ҵ带 ������ �´� 
		   for(Method m:methods)
		   {
			   //System.out.println(m.getName());
			   RequestMapping rm=m.getAnnotation(RequestMapping.class);
			   if(rm.value().equals(cmd))
			   {
				   m.invoke(obj, null);// �޼ҵ� ȣ�� 
				   // u.join()
				   // obj=> UserRequest�� ��ü 
				   // null => �Ű������� ���� 
				   // �޼ҵ�� => ���� ȣ���� ���� 
			   }
			   
		   }
		   // �� => �ַ�� 
		   // ������̼��� �̹� �����ӿ�ũ => ������� �ִ� 
		   // ������̼� => ���ϴ� ���� ���� Ȯ�� (ã���Ҷ� �ַ� ����Ѵ�)
		}catch(Exception ex){}
	}

}








