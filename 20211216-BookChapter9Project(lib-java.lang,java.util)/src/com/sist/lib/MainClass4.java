package com.sist.lib;
// UPDOWN ���� ==> ���� �߱����� 
import java.util.*; //Scanner , Random => ������ ���� 
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
        // 1. ������ �� ���� => ���� => Random ==> 1~100
		Random r=new Random();
		int com=r.nextInt(100)+1; //0~99 => 1~100
		// 2. ����ڰ� �Է��ؼ� ���� 
		System.out.println("UPDOWN ������ �����մϴ�");
		
		Scanner scan=new Scanner(System.in);
		while(true) // �ݺ�Ƚ���� �𸣴� ��� => ���ѷ��� 
		{
			// ����� �Է� 
			System.out.print("1~100 ������ ���� �Է�:");
			int user=scan.nextInt();
			// 1~100�� �ƴ� ���
			if(user<1 || user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�!!");
				continue;
				/*
				 *   while ==> ���ǽ����� �̵� 
				 *   for ==> ���������� �̵� 
				 */
			}
			count++;
			// ��Ʈ 
			if(user<com)
			{
				System.out.println("�Է°����� ���� ���ڸ� �Է��ϼ���");
			}
			else if(user>com)
			{
				System.out.println("�Է°����� ���� ���ڸ� �Է��ϼ���");
			}
			else // ���� ��� 
			{
				System.out.println("�����Դϴ�!!");
				System.out.println("�Է� Ƚ��:"+count);
				break; // while�� ���� 
			}
			// ���� ���� => ���� 
		}
	}

}








