package com.sist.en;
import java.util.*;
enum ��ȭ��ȣ{
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
 
	��ȭ��ȣ(String code) {
		this.code = code;
	}
	public String getCode()
	{
		return code;
	}
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		String s=scan.next();
		
        for(��ȭ��ȣ tel:��ȭ��ȣ.values())
        {
        	if(tel.name().contains(s))
        	{
        	   System.out.println(tel+":"+tel.getCode());
        	}
        }
	}

}
