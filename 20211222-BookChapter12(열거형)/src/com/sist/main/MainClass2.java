package com.sist.main;
import java.util.*;
// ������ => ����� ���� 
enum ��ȭ����{
	// Map�� ���� 
	����Ư����("02"),  
	��⵵("031"), 
	��õ������("032"), 
	������("033"), 
	��û����("041"),
	����������("042"),
	��û�ϵ�("043"), 
	����Ư����ġ��("044"), 
	�λ걤����("051"), 
	��걤����("052"),
	�뱸������("053"), 
	���ϵ�("054"), 
	��󳲵�("055"), 
	���󳲵�("061"), 
	���ֱ�����("062"),
	����ϵ�("063"), 
	����Ư����ġ��("064");
	
	private String code;
	��ȭ����(String code)
	{
		this.code=code;
	}
	// ()�ȿ� �ִ� ������ �б�
	public String getCode()
	{
		return code;
	}

}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("�õ� �Է�:");
        String sido=scan.next();
        
        for(��ȭ���� n:��ȭ����.values())
        {
        	if(n.name().contains(sido))
        	{
        		System.out.println(sido+"�� ������ "+n.getCode());
        	}
        }
	}

}
