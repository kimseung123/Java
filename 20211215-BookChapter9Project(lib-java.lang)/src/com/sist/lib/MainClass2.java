package com.sist.lib;
// String Ŭ���� 
/*
 *   String => �������� , Ŭ������ (���)
 *   ====== ����� ������ ���ϴ� Ŭ���� 
 *   ����)
 *        public final class String{
 *        }
 *        ==> java.lang => final 
 *        ==> ������ ������ ����Ѵ� 
 *        ==> ��� ������ �����ϰ� ��� 
 *   1. ������������ ���
 *      String s="";  
 *   2. Ŭ���������� ���
 *      String s=new String("");
 *   3. ���(����) => �޼ҵ� 
 *      = charAt(int index) ==> �ڹٴ� �ε�����ȣ => 0������ , ����Ŭ=>1��
 *        ��) 
 *            Hello Java
 *            0123456789   ==> charAt(7) ==> 'a'
 *            => ~At(int index)
 *      ================= �˻� 
 *      = contains : ���� ���� ���� 
 *        startsWith : �����ϴ� ���ڿ� ������ Ȯ��
 *        endsWith : ������ ���ڿ� ������ Ȯ�� 
 *      =================
 *      
 *      = �� (���ڿ�) == (�ּҰ�) 
 *        ==> ���� ����Ǿ� �ִ� ���ڿ� ��ü 
 *        equals()  =========> ��ҹ� ���� (��й�ȣ,ID) 
 *        equalsIgnoreCase() ==>  �̸� , �˻�
 *        *** ���ڿ� => "" 
 *            ""�� ��ü�� �ּ� 
 *      = ã�� 
 *        ���ϴ� ������ ��ġ ã��  ==> ���ϴ� �κ� ���� 
 *        ���� ���� Ȯ�� ( -1 )�̸� �������� �ʴ´� 
 *        �տ��� ã�� ==> indexOf
 *        �ڿ��� ã�� ==> lastIndexOf (Ȯ����)
 *        c:\\javaDev\\a.java => a.b
 *        012 3456789101112131415
 *          ===      ===
 *        469page ~ 471page 
 *        ����) public int indexOf(char c)
 *             public int indexOf(String s)
 *             
 *             public int lastIndexOf(char c)
 *             public int lastIndexOf(String s)
 *      
 */
// ����� �Է� ==> �α��� 
/*
 *   4�ñ��� ���� 
 *   => 4~5�� ����Ǯ�� 
 *   => 5��~6�� ���� Ǯ�� ==> ���� (������,���)
 *      => ������ ,��� 
 *      => �迭 
 *      => �޼ҵ� 
 *      => ��ü���⹮�� ==> 1/2 ������ , �ְ��� (�������) 
 *      => ����ó��
 *      => ���̺귯�� 
 *      => �������� 
 *   => ���� (EMS) => 60�� ������ ������  
 */
import java.util.*; // Scanner
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. �Է��� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.print("���̵�� ��й�ȣ �Է�:");
		String id=scan.next();
		String pwd=scan.next();
		System.out.println("ID:"+id);
		System.out.println("Password:"+pwd);
		// 2. ID,PWD�� ���Ѵ� 
		// ����Ŭ�� ����� ������ 
		final String myId="admin";
		final String myPwd="1234";
		// 3. ����� ��� 
		// ��ø if
		// equals ==> ��ҹ��ڸ� �����ؼ� �� 
		// equalsIgnoreCase ==> ��ҹ��� ���о��� �� 
		if(myId.equalsIgnoreCase(id)) // �˻��� 
		{
			if(myPwd.equals(pwd)) // ��й�ȣ �˻� 
			{
				System.out.println(id+"�� �α��εǾ����ϴ�");
			}
			else
			{
				System.out.println("��й�ȣ�� Ʋ���ϴ�!!");
			}
		}
		else
		{
			System.out.println("���̵� �������� �ʽ��ϴ�!!");
		}
		
	}

}












