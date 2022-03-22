package com.sist.music;
// ����� ��û => ó���� ���� 
import java.util.*;
import java.io.*;
public class MusicSystem {
   // ���� ���� ==> ��ü�� ������ �ִ� (����) => static 
   // ���� 1 (Music) , ���� ��ü (ArrayList<Music>)
   static private ArrayList<Music> list=
		             new ArrayList<Music>();
   // �ʱ�ȭ => ArrayList�� ���� ä��� 
   static
   {
	   try
	   {
		   // ���Ͽ� �д´� => ��ü������ ��ȯ => ArrayList���� 
		   FileInputStream fis=
				   new FileInputStream("c:\\java_data\\music_object.txt");
		   ObjectInputStream ois=
				   new ObjectInputStream(fis);
		   list=(ArrayList<Music>)ois.readObject();
		   // ���� �ݱ�
		   fis.close();
		   ois.close();
	   }catch(Exception ex) 
	   {
		   ex.printStackTrace();
	   }
   }
   // ����� ��û ó�� 
   // ��� ��û 
   public ArrayList<Music> musicListData(int page)
   {
	   ArrayList<Music> mList=
			   new ArrayList<Music>();
	   int j=0;// 10���� �߶��ִ� ���� 
	   // ������ �ʿ��� ��� ==> ����¡ ��� => ����Ŭ(�ζ��κ�)
	   int pagecnt=(page*10)-10;
	   /*
	    *    1page ==> 0~9
	    *    2page ==> 10~19
	    *    3page ==> 20~29
	    *    ..
	    *    ..
	    *    ..
	    */
	   for(int i=0;i<list.size();i++)
	   {
		   Music m=list.get(i);
		   if(j<10 && i>=pagecnt)
		   {
			   mList.add(m);
			   j++;
		   }
	   }
	   return mList;
   }
   public int musicTotalPage()
   {
	   return (int)(Math.ceil(list.size()/10.0));
	   // ���������� ���Ҷ� => �ø��޼ҵ带 �̿��Ѵ�  => ceil()
   }
   // ���� ã�� ��û 
   public ArrayList<Music> titleFindData(String title)
   {
	   ArrayList<Music> mList=new ArrayList<Music>();
	   for(Music m:list)
	   {
		   if(m.getTitle().contains(title))
		   {
			   mList.add(m);
		   }
	   }
	   return mList;
   }
   // ������ ���� ���� ���� 
   public ArrayList<Music> musicMaxData()
   {
	   ArrayList<Music> mList=
			   new ArrayList<Music>();
	   // ���� Ȯ�� 
	   int max=0;
	   for(Music m:list)
	   {
		   if(max<m.getIdcrment())
			   max=m.getIdcrment();
	   }
	   
	   for(Music m:list)
	   {
		   if(m.getIdcrment()==max)
		   {
			   mList.add(m);
		   }
	   }
	   return mList;
   }
   // ���������� ã��
   public ArrayList<Music> singerFindData(String singer)
   {
	   ArrayList<Music> sList=new ArrayList<Music>();
	   for(Music m:list)
	   {
		   if(m.getSinger().contains(singer))
		   {
			   sList.add(m);
		   }
	   }
	   return sList;
   }
   // �� ���� 
   public Music musicDetailData(int no)//��ȣ => 1
   {
	   Music m=list.get(no-1); // index = 0
	   return m;
   }
}








