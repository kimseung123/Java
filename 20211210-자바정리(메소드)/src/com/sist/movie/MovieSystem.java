package com.sist.movie;
// ��ȭ �ý��� ==> �޼ҵ� 
// 1. �����͸� ���� ==> �������� ��� (static) 
import java.util.*;
import java.io.*;
public class MovieSystem {
  // 1. ������ ������ ���� 
  private static MovieVO[] movie_data=new MovieVO[1938];
  // ����� ���� Ŭ���� => �Ϲ� ���������� �����ϰ� ��� �Ѵ� 
  // class => �����͸� ��Ƽ� ���� 
  // Ŭ���� �迭 , String[] => ��ü �迭 
  // movie_data => ���� ÷�� 
  static
  {
	  // �ʱ�ȭ ���
	  try 
	  {
		 FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		 // ���� �б� 
		 StringBuffer sb=new StringBuffer();
		 int i=0;
		 // 'A' => 65 , 'a' => 97
		 while((i=fr.read())!=-1) // -1 (EOF => end of file)
		 {
			 sb.append(String.valueOf((char)i));
		 }
		 
		 //System.out.println(sb.toString());
		 String movie=sb.toString();
		 String[] m=movie.split("\n");
		 System.out.println("ũ��:"+m.length);
		 for(int j=0;j<m.length;j++)
		 {
			
			 String[] rm=m[j].split("\\|");
			 // Split => ���Խ� ( ^ , $ , + , * , | , .)
			 // AI (���ºм�) 
			 MovieVO vo=new MovieVO();
			 vo.setNo(Integer.parseInt(rm[0]));// String => int
			 // Integer.parseInt ==> Wrapper (�� ������������ Ŭ������ ������� �ִ�)
			 vo.setTitle(rm[1]);
			 vo.setGenre(rm[2]);
			 vo.setPoster(rm[3]);
			 vo.setActor(rm[4]);
			 vo.setRegdate(rm[5]);
			 vo.setGrade(rm[6]);
			 vo.setDirector(rm[7]);
			 System.out.println(vo.getNo());
			 //System.out.println("����:"+vo.getTitle());
			 movie_data[j]=vo;
			
		 }
	  }catch(Exception ex){}
  }
  
  // �޼ҵ� (��ȭ ����)
  // 1. ã�� (���� , �⿬ , �帣) => ����� �޾Ƽ� ��� , �޼ҵ�ȿ� ��� 
  // �޼ҵ� �ȿ��� ������� ��� => void
  public void titleFind(String title)
  {
	  for(MovieVO vo:movie_data)
	  {
		  if(vo.getTitle().contains(title))
		  {
			  // contains(title) => ���� ==> ����Ŭ (LIKE)
			  System.out.println(vo.getTitle());
		  }
	  }
  }
  
  public void actorFind(String name)
  {
	  for(MovieVO vo:movie_data)
	  {
		  if(vo.getActor().contains(name))
		  {
			  // contains(title) => ���� ==> ����Ŭ (LIKE)
			  System.out.println(vo.getTitle()+"("+vo.getActor()+")");
		  }
	  }
  }
  
  public void genreFind(String genre)
  {
	  for(MovieVO vo:movie_data)
	  {
		  if(vo.getGenre().contains(genre))
		  {
			  // contains(title) => ���� ==> ����Ŭ (LIKE)
			  System.out.println(vo.getTitle()+"("+vo.getGenre()+")");
		  }
	  }
  }

  public static void main(String[] args) {
	MovieSystem ms=new MovieSystem();
	Scanner scan=new Scanner(System.in);
	System.out.print("��ȭ ���� �Է�:");
	String title=scan.next();
	ms.titleFind(title);
	System.out.print("���ΰ� �̸� �Է�:");
	String actor=scan.next();
	ms.actorFind(actor);
	System.out.print("�帣 �Է�:");
	String genre=scan.next();
    ms.genreFind(genre);
  }
}






