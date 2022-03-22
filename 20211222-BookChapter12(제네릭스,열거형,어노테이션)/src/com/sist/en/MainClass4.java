package com.sist.en;
import java.util.*;
enum Company {
	SK("��������"), 
	LG("����"), 
	KT("����Ƽ"), 
	SAMSUNG("�Ｚ"), 
	APPLE("����"); 
	private final String value; 
	Company(String value)
	{ 
		this.value = value; 
	} 
	public String getValue()
	{ 
		return value; 
	} 
}


public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Company type : Company.values())
		{ 
			System.out.println(type.getValue()); 
			// ��������, ����, ����Ƽ, �Ｚ, ���� 
		}
		System.out.println(Company.APPLE.getValue()); // ����
		

	}

}
