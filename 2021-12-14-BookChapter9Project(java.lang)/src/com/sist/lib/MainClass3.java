package com.sist.lib;
// 469page~471page (String) => AI,RPA,���, ���� => ���ڿ� 
// �� , ������ => ���ڿ��� ����� ���� 
// HTML => <input type="text"> 10 ==> "10"
/*
 *   String : ���ڿ��� �����ϴ� Ŭ���� / �������� 
 *            char[]
 *            
 *   = ��� (�޼ҵ�) 
 *     charAt() : ���ڿ����� ���ڸ� �ڸ��� ��쿡 ���
 *                ���ڿ� => ""
 *                ���� => '' 
 *     ���� )
 *           public char charAt(int index)
 *           
 *           Hello Java
 *           0123456789  ==> charAt(4) => 'o'
 *                       ==> charAt(6) => 'J'
 */
// charAt ==> ����(����) 
import java.util.*;
public class MainClass3 {
    //�ν��Ͻ� => MainClass3�� �޸𸮿� �����Ŀ� ��� 
	// throws => ����� ����Ŭ������ ó���Ŀ� ����� �ؾߵȴ� 
	public void calc() 
			throws ArithmeticException,NumberFormatException,Exception
	{
		Scanner scan=new Scanner(System.in);
		// ���� 2�� �Է� , ������ �Է� 
		// scan,bufferedReader ==> char(X) , String
		System.out.print("ù��° ���� �Է�:");
		int num1=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		int num2=scan.nextInt();
		
		System.out.print("������ �Է�(+,-,*,/):");
		String temp=scan.next();
		
		// switch => ���ڿ� case "+"
		char op=temp.charAt(0); 
		switch(op)
		{
		case '+':
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case '/':
			if(num2==0)
				System.out.println("0���� ���� �� �����ϴ�!!");
			else
			    System.out.printf("%d/%d=%.2f\n",num1,num2,
				     	         num1/(double)num2);
			// ���� ����ȯ 
			// int a='A';  �ڵ� ����ȯ 
			//       === 65  ==> a=65
			break;
	    default:
	    	System.out.println("�߸��� �������Դϴ�!!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass3 m=new MainClass3(); 
        // �ν��Ͻ� �޼ҵ�,�ν��Ͻ� ���� => ���� ==> calc()=>���� 
        try
        {
            m.calc(); // ����ó���� ��� ���� 
        }catch(Exception ex)
        {
        	// �������� ����ó���� ����� ��� ==> ���� ū ����ó���� �� �� �ִ�
        	// Exception , Throwable
        	System.out.println(ex.getMessage());
        }
	}

}






