package com.sist.main;
/*
 *   1. �������� (�ʿ��� �����͸� ��Ƽ� �ѹ��� ����)
 *      News => ������ ����, �ٸ� Ŭ�������� ������ ���� ����� (ĸ��ȭ)
 *   2. ���� ����ڰ� ��û�� ������ ó���ϴ� ���(�׼� Ŭ����) => ��� ó�� (�޼ҵ�)
 *   3. ����ڰ� ����� �����ϰ� ����� (main()) 
 *      ================================ JSP , main.kt
 */
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NewsSystem ns=new NewsSystem();
        // �˻��� �Է� ��û 
        Scanner scan=new Scanner(System.in);
        System.out.print("�˻��� �Է�:");
        String fd=scan.next();
        ns.newsGetData(fd);// ���Ͽ� ���� 
        ArrayList<News> list=ns.newsAllData();
        System.out.println("***** �˻� ��� *****");
        for(News n:list)
        {
        	System.out.println(n.getTitle());
        	System.out.println(n.getDescription());
        	System.out.println(n.getAuthor());
        	System.out.println("\n");
        }
	}

}
