package com.sist.vo;
// ==> ��Ƽ� ó�� 
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �ʱⰪ 
		Food food=new Food(); // ���� 1���� ����� 
		// � �����͸� �������� �ʱⰪ => ���� 
		food.setTitle("��⸮������");
		food.setScore(4.5);
		food.setAddress("��⵵ ���ν� ������ �������� 157 "
				  +"���� ��⵵ ���ν� ������ ��⵿ 593-4");
		food.setTel("031-263-1107");
	    food.setType("���� / �� �丮");
	    food.setPrice("���� �̸�");
	    food.setParking("�������� ����");
	    food.setTime("11:00 - 21:00");
	    food.setMenu("��⸧������ "
	    		+ "8,000�� "
	    		+ "�������� "
	    		+ "8,000�� "
	    		+ "��������� "
	    		+ "8,000�� "
	    		+ "�縮 "
	    		+ "4,000�� "
	    		+ "���� (��) "
	    		+ "13,000��");
	    food.setGood(153);
	    food.setSoso(15);
	    food.setBad(10);
		
	    // ���� �Ѱ� ���� ��� 
	    System.out.println(food.getTitle()+" "+food.getScore());
	    System.out.println("======================");
	    System.out.println("�ּ� "+food.getAddress());
	    System.out.println("��ȭ��ȣ "+food.getTel());
	    System.out.println("���� ���� "+food.getType());
	    System.out.println("���ݴ� "+food.getPrice());
	    System.out.println("���� "+food.getParking());
	    System.out.println("�����ð� "+food.getTime());
	    System.out.println("�޴� ");
	    StringTokenizer st=new StringTokenizer(food.getMenu(),"��");
	    while(st.hasMoreTokens())
	    {
	    	System.out.println("    "+st.nextToken()+"��");
	    }
	    System.out.println("======================");
	    System.out.println("���ƿ�("+food.getGood()+") "
	    		  +"������("+food.getSoso()+") "
	    		  +"����("+food.getBad()+")");
	}

}







