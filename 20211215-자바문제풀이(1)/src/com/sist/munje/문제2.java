package com.sist.munje;
/*
 * 2.	���ڸ� �Է¹޾� 3~5�� ��, 6~8�� ����, 9~11�� ����, 12,1,2�� �ܿ�, �� ���� ���ڸ� �Է��� ��� �߸��Է��� ����ϴ� ���α׷��� �ۼ��϶�. if-else ���� switch �� �� �̿��� �� ��.
	
	���)
	���� �Է��ϼ���(1~12) >> 9
	����
 */
import java.util.*;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. �Է°� (����� ��û)
		 Scanner scan=new Scanner(System.in);
		 System.out.print("1~12 �����Է�:");
		 int no=scan.nextInt();
		//2. ��ûó�� => ����ó�� 
		 if(no>=9 && no<=11) // && ������ �ִ� ��� , || ������ ��� ���
		 {
			 System.out.println("����");
		 }
		 else if(no>=3 && no<=5)
		 {
			 System.out.println("��");
		 }
		 else if(no>=6 && no<=8)
		 {
			 System.out.println("����");
		 }
		 else
		 {
			 // 12,1,2
			 System.out.println("�ܿ�");
		 }
		
		//3. ����� ��� 
		
	}

}
