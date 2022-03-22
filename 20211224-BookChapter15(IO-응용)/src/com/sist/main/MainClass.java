package com.sist.main;
// ArrayList������ ������ ���� ==> ���� Ȱ�� 
import java.util.*;
import java.io.*;
/*
 *  1|
 *  ���ũ Ż��|
 *  ���|
 *  https://movie-phinf.pstatic.net/20160119_278/
 *  14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 *  �� �κ�(�ص� ��������), ��� ������(������ ���̵� ���� ����)|
 *  2016 .02.24 �簳��, 1995 .01.28 ����|
 *  15�� ������|
 *  ����ũ �ٶ�Ʈ

 */
// ��ȭ �Ѱ��� ���� �����͸� ��Ƽ� ��� (������� ��������) => ĸ��ȭ 
// implements Serializable => ���� ��ü����
class Movie implements Serializable
{
	private int mno;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String director;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ �о => ArrayList�� ���� 
		// ArrayList => ��°�� ���Ͽ� ���� ==> Ȱ���ϱⰡ ���ϴ� 
		// ����Ŭ (�����ͺ��̽�) => �߽� => MariaDB(����),MySQL 
		ArrayList<Movie> list=new ArrayList<Movie>();
		// ������ �б� => ����ó�� 
		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\movie.txt");
			BufferedReader br=
					new BufferedReader(new InputStreamReader(fis));
			// byte => char�� ��ȯ : InputStreamReader 
			while(true)
			{
				// ���پ� �о�´�
				String data=br.readLine();
				if(data==null) // ���� �����Ͱ� ���� ������ 
					break; // while�� �����Ѵ� 
				// | => �����͸� �߶�´� ==> Movie => ArrayList
				// spilt() , StringTokenizer
				StringTokenizer st=
						new StringTokenizer(data,"|");
				Movie m=new Movie();
				m.setMno(Integer.parseInt(st.nextToken()));
				m.setTitle(st.nextToken());
				m.setGenre(st.nextToken());
				m.setPoster(st.nextToken());
				m.setActor(st.nextToken());
				m.setRegdate(st.nextToken());
				m.setGrade(st.nextToken());
				m.setDirector(st.nextToken());
				
				list.add(m);
			}
			fis.close();
			br.close();
			
			// �����Ͱ� �߰��Ǿ����� Ȯ��
			/*for(Movie m:list)
			{
				System.out.println("��ȣ:"+m.getMno());
				System.out.println("����:"+m.getTitle());
			}*/
			// ArrayList������ ���� ���� => ��� Ȱ���� ���� 
			//1. ���� => ���� ���� 
			File file=new File("c:\\java_data\\movie_object.txt");
			// ���� ���� ���� Ȯ�� 
			if(!file.exists())
			{
				// ���� �������� ������ => ������ ������ 
				file.createNewFile();
			}
			FileOutputStream fos=
					new FileOutputStream(file);
			ObjectOutputStream oos=
					new ObjectOutputStream(fos);
			oos.writeObject(list);// ��ü������ ���� 
			// �ݱ� 
			fos.close();
			oos.close();
			System.out.println("��ü ���� ���� �Ϸ�!!");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}








