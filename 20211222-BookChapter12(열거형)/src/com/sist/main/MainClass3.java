package com.sist.main;
import java.util.*;
enum ����Ʈ{
	DAUM("www.daum.net"),
	NAVER("www.naver.com"),
	GOOGLE("www.google.co.kr"),
	SIST("www.sist.co.kr"),
	NATE("www.nate.com");
	
	private String site;
	����Ʈ(String site)
	{
		this.site=site;
	}
	
	public String getSite()
	{
		return site;
	}
}
// "C:\Program Files\Google\Chrome\Application\chrome.exe"
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����ڷκ��� ���� �޴´� 
		Scanner scan=new Scanner(System.in);
		System.out.print("�湮 �� ����Ʈ �Է�:");
		String s=scan.next();
		
		//����Ʈ ã��
		for(����Ʈ site:����Ʈ.values())
		{
			// equalsIgnoreCase(s) : ��ҹ��� ���о��� ã�´� 
			// daum ,DAUM ,Daum....
			if(site.name().equalsIgnoreCase(s))
			{
				String ss=site.getSite();
				try
				{
					// exe���� ����ÿ� ��� => CheckException(�ݵ�� ����ó��)
					Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+ss);
				}catch(Exception ex) {}
				
			}
		}
	}

}





