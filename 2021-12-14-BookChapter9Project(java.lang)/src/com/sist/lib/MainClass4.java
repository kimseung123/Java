package com.sist.lib;
// charAt 
// ���ڿ��� �Է¹޾Ƽ� ���ڰ� �¿� ��Ī ���� Ȯ���ϴ� ���α׷�
// ABBA
// => ���� ���� 
// => �׸� 
import java.util.*;
// 1. length() => ���� ���� (���� ó��) ==> ���ڿ��� ¦������ �Ѵ� 
// 2. charAt()
public class MainClass4 {
    // aaa bbb ==> String ==> enter
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���ڿ� �Է��� �޴´� 
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ� �Է�:");
		String s=scan.next();
		// ���� ó�� => if , try~catch 
		if(s.length()%2==0)
		{
			//System.out.println("���� ������ �����մϴ�!!");
			//HEL LOO
			boolean bCheck=true;//�ݺ������� �� �Ҷ��� ����Ʈ���� ���� 
			for(int i=0;i<s.length()/2;i++)
			{
				char f=s.charAt(i);//�տ������� 
				char e=s.charAt(s.length()-1-i);//�ڿ������� 
				//System.out.println(f+"|"+e);
				if(f!=e) // ���� ���ڰ� �ƴϸ� ���� 
				{
					bCheck=false;
					break;
				}
			}
			
			if(bCheck==true)
			{
				System.out.println("�¿� ��Ī�Դϴ�");
			}
			else
			{
				System.out.println("�¿� ��Ī�� �ƴմϴ�");
			}
		}
		else
		{
			System.out.println("�Է��� ���ڰ����� ¦������ �մϴ�!!");
		}
	}

}







