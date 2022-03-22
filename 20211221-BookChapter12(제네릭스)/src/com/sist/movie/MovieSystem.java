package com.sist.movie;
// Back-End
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MovieSystem {
   // 1. ��ȭ�� ��� ������ ������ �ִ� 
   // 2. ��� Ŭ���̾�Ʈ(�����) => ���� �����͸� ��� => ���� 
   // 3. ���� => static (static���� => �޸� ���� 1����) 
   // 4. static => ��� ������ ������ �� �ִ� => ����Ŭ 
   // 5. ��ȭ 1���� ���� ���� => Movie => ������ (����)
   // ======> �迭 / Collection
   // �迭 => ��ȭ ���� Ȯ�� (����) , Collection => ���� 
   private static ArrayList<Movie> list=new ArrayList<Movie>();
   // list=null => size=0 => �ʱ�ȭ 
   /*
    *    ����� �ʱ�ȭ => X (�Ϲ� �����͸� ó��)
    *    �ʱ�ȭ ��� => �ܺ� ������ �о ���� 
    *    ������     => �ܺο��� ������ �о ����
    */
   // �ʱ�ȭ ��� => Ŭ������ �ε�Ǿ����� �ڵ����� �����ϴ� ��� => �ʱ�ȭ ����� ����ȴ�  
   static 
   {
	   // ������ �б� 
	   // 1.����Ʈ�� ���� (��Ʈ��ũ => CheckException) => �ݵ�� ����ó�� 
	   // 1. IO (���� �����) , 2. ������ , 3 ��Ʈ��ũ , 4. SQL(�����ͺ��̽�)
	   try
	   {
		   // ����Ʈ ���� => �����͸� �о ���� (Document:���� ����)
		   Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
		   /*
		    *   private String title;
			    private double score;
			    private String reserve;
			    private String story;
			    private String regdate;
			    <strong class="tit_item"> 
<a href="/moviedb/main?movieId=146656" 
  class="link_txt" data-tiara-layer="moviename">
   �����̴���: �� ���� Ȩ</a></strong>
   
   <span class="txt_append"> <span class="info_txt">
   ����<span class="txt_grade">8.2</span></span> 
   
   <span class="info_txt">������<span class="txt_num">68.4%</span></span> <
/span> <span class="txt_info"> ����<span class="txt_num">21.12.15</span> 
 * <a href="/moviedb/main?movieId=146656" class="link_story" data-tiara-layer="poster"> ��ȭ <�����̴���: �� ���� Ȩ>�� ��ü�� ź�γ� �����̴��� '���� ��Ŀ'(�� Ȧ����)�������� �ذ��ϱ� ���� '���� ��Ʈ������'(���׵�Ʈ �Ĺ���ġ)�� ������ �޴� �� ������ �ʰ� ��Ƽ������ ������ �ǰ�,�̸� ���� '���� �����۽�'(�������� ������) �� ���� �ٸ� ������ �������� ��Ÿ���� ��� �־��� ���⸦ �°� �Ǵ� �̾߱⸦ �׸� ���� �׼� ��Ϲ�����. </a> 


		    */
		   Elements title=doc.select("strong.tit_item a.link_txt");
		   // Element => �±� �Ѱ��� ��� �ش� 
		   // Elements (Collection) => ���� �±� ������ 
		   Elements score=doc.select("span.txt_grade");//css selector =>UI
		   Elements reserve=doc.select("span.info_txt span.txt_num");
		   Elements story=doc.select("a.link_story");
		   Elements regdate=doc.select("span.txt_info span.txt_num");
		   for(int i=0;i<title.size();i++)
		   {
			   System.out.println(title.get(i).text());
			   System.out.println(score.get(i).text());
			   System.out.println(reserve.get(i).text());
			   System.out.println(regdate.get(i).text());
			   System.out.println(story.get(i).text());
			   System.out.println("===================================");
			   
			   Movie m=new Movie();
			   m.setNo(i+1);
			   m.setTitle(title.get(i).text());
			   m.setStory(story.get(i).text());
			   m.setReserve(reserve.get(i).text());
			   m.setRegdate(regdate.get(i).text());
			   m.setScore(Double.parseDouble(score.get(i).text()));
			   // �Ѱ� ��ȭ ���� => 20�� 
			   list.add(m);
			   // ����(������) => Ŭ���� ���´� ==> ������ ==>  Collection
		   }
		   
	   }catch(Exception ex)
	   {
		   System.out.println(ex.getMessage()); // ���� �޼��� ��� 
	   }
	   
   }
   //1.������ ��� 
   // ArrayList<Movie> => ��ȭ���� ��ü
   // Movie => ��ȭ �Ѱ� 
   public ArrayList<Movie> movieAllData()
   {
	   return list;
   }
   //2.�󼼺��� (��ȭ�Ѱ��� ���� ������ ����)
   public Movie movieDetailData(int no)
   {
	   Movie m=new Movie();
	   for(Movie mm:list)
	   {
		   if(mm.getNo()==no)
		   {
			   m=mm;
			   break;// ã�� ��쿡 �����ϰ� ������ ������ 
		   }
	   }
	   return m;
   }
   //3. ã�� => ��ȭ�� ������ �ִ� ��쵵 �ִ� 
   public ArrayList<Movie> movieFind(String title)
   {
	   ArrayList<Movie> mList=new ArrayList<Movie>();
	   // mList�� ã�� ��ȭ(Movie) ��Ƽ� �Ѱ��ش�
	   for(Movie m:list)
	   {
		   if(m.getTitle().contains(title))
		   {
			   mList.add(m);
		   }
	   }
	   return mList;
   }
}










