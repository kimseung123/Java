package com.sist.main;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 * <tr class="list" songid="95299676">
      <td class="check"><input type="checkbox" class="select-check" title="Counting Stars (Feat. Beenzino)" /></td>
      <td class="number">1
       <span class="rank">
       <span class="rank"><span class="rank-none"><span
       class="hide">����</span></span></span>
       </span>
      </td>
      <td><a href="#" class="cover" onclick="fnViewAlbumLayer('82433812');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/433/812/82433812_1639126931936_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="Counting Stars" /></a></td>
      <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('95299676');return false;">�� ���� ���� ������</a></td>
      <td class="info">
       <a href="#" class="title ellipsis" title="���" onclick="fnPlaySong('95299676','1');return false;">
       Counting Stars (Feat. Beenzino)</a>
       <a href="#" class="artist ellipsis" onclick="fnViewArtist('80828775');return false;">BE'O (���)</a>
       <div class="toggle-button-box" >
       <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('95299676');">��</button>
       <ul class="list" id="RelationArtist_95299676"></ul>
                                        </div>
       <i class="bar">|</i>
       <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('82433812');return false;">Counting Stars</a>
     </tr>
 */
public class MusicSystem {
   // Music��ü �����͸� ���� ==> static (����Ŭ => static)
   private static ArrayList<Music> list=new ArrayList<Music>();
   // ���α׷� ���۰� ���ÿ� �����͸� ��Ƶд� (�ʱ�ȭ)
   /*
    *                   Exception (�ҽ��󿡼� ������ ó��=> ������ ����)
    *                      |
    *    -------------------------------------
    *         |                        |
    *    CheckException(javac)   UnCheckException(java)
    *    ��Ʈ��ũ => URL�ּ� , �����ּ�      => Runtime���� (������ ����)
    *    ����Ŭ => (����) => �����ּ�(IP)   => ����� �Է�
    *    ������ => �浹 ���� 
    *    Ŭ�������� => Ŭ�������� �߸� �� ���
    *    ����� => ���� (��θ�)
    *    => ������ ������ �����ϴ� ���α׷� 
    *    => ���α׷��� ������ ���������� ���� 
    */
   static
   {
	  //�� ����(��Ʈ��ũ) => CheckException
	  try
	  {
		  // ���������� �о�� �����͸� ���� 
		  Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		  Elements title=doc.select("tr.list a.title");
		  Elements singer=doc.select("tr.list a.artist");
		  Elements album=doc.select("tr.list a.albumtitle");
		  for(int i=0;i<title.size();i++)
		  {
			  System.out.println("����:"+(i+1));
			  System.out.println(title.get(i).text());
			  System.out.println(singer.get(i).text());
			  System.out.println(album.get(i).text());
			  System.out.println("============================");
			  // ArrayList�� ������ ���� 
			  // 1.������ Ŭ������ ���� 
			  Music m=new Music();
			  m.setRank(i+1);
			  m.setTitle(title.get(i).text());
			  m.setSinger(singer.get(i).text());
			  m.setAlbum(album.get(i).text());
			  // 2. ����� Ŭ���� => ArrayList�� ���� 
			  list.add(m);
			  
		  }
	  }catch(Exception ex)
	  {
		  ex.printStackTrace();
	  } 
   }
   // ��� 
   // ��ü ���
   public ArrayList<Music> musicAllData()
   {
	   return list;
   }
   // ���α׷� => ������ ���� 
   // ������ ���� : �޸� / ���� / ����Ŭ / ������
   // ========= 1. ��Ƽ� ���� (Ŭ����,�迭,�÷���) => ���� (������,���)
   // ã�� 
   public ArrayList<Music> musicFindData(String ss)
   {
	   // ss => searchString
	   // ã�� �����͸� �ٽ� ��Ƽ� ���� 
	   ArrayList<Music> mList=new ArrayList<Music>();
	   for(Music m:list)
	   {
		   if(m.getTitle().contains(ss))
		   {
			   mList.add(m);
		   }
	   }
	   return mList;
   }
   // �ߺ����� ���� ��� => HashSet  
   // �޼ҵ� => �������� ���� �����ϰ� ó�� 
   public ArrayList<String> singerData()
   {
	   ArrayList<String> sList=new ArrayList<String>();
	   HashSet<String> set=new HashSet<String>();
	   for(Music m:list)
	   {
		   set.add(m.getSinger()); // �ߺ��� �������� ���� 
	   }
	   sList.addAll(set);//List=> Set , Set =>List
	   return sList;
   }
	
}







