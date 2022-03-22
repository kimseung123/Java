package com.sist.movie;
// ����� ���α׷� (Front)
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MovieSystem ms=new MovieSystem();
        MainClass mc=new MainClass();
        while(true)
        {
        	int m=mc.menu();
        	switch(m)
        	{
        	 case 1:
        	 {
        		ArrayList<Movie> list=ms.movieAllData();
        		// ��ȭ ��ü ����� ������ �´� 
        		for(Movie mm:list)
        		{
        			System.out.println(mm.getNo()+"."+mm.getTitle()+
        					"("+mm.getScore()+")");
        		}
        	 }
        	 break;
        	case 2:
        	{
        		Scanner scan=new Scanner(System.in);
        		System.out.print("�󼼺� ��ȭ ����(1~20):");
        		int no=scan.nextInt();
        		Movie mm=ms.movieDetailData(no);
        		System.out.println("����:"+mm.getNo());
        		System.out.println("��ȭ��:"+mm.getTitle());
        		System.out.println("����:"+mm.getScore());
        		System.out.println("������:"+mm.getReserve());
        		System.out.println("������:"+mm.getRegdate());
        		System.out.println(mm.getStory());
        	}	
        	break;
        	case 3:
        		Scanner scan=new Scanner(System.in);
        		System.out.print("�˻��� �Է�:");
        		String title=scan.next();
        		ArrayList<Movie> list=ms.movieFind(title);
        		for(Movie mm:list)
        		{
        			System.out.println(mm.getTitle());
        		}
        		break;
        	case 4:
        		System.out.println("���α׷��� �����մϴ�!!");
        		System.exit(0);// ���� ���� 
        	}
        }
	}
	public int menu()
	{
		System.out.println("===== �޴� =====");
		System.out.println("1. ��ȭ ��� ���� ");
		System.out.println("2. ��ȭ �� ���� ");
		System.out.println("3. ��ȭ ã�� ");
		System.out.println("4. ����");
		System.out.println("===============");
		Scanner scan=new Scanner(System.in);
		System.out.print("�޴� ����(1~4):");
		return scan.nextInt();
	}

}
