package com.sist.main;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *  <tr class="list" songid="95038278">
        <td class="check"><input type="checkbox" class="select-check" title="������ (Feat. MINO) (Prod. by GRAY)" /></td>
            <td class="number">3
              <span class="rank">
               <span class="rank"><span class="rank-none"><span
                           class="hide">����</span></span></span>
  </span>
  </td>
 <td><a href="#" class="cover" onclick="fnViewAlbumLayer('82398969');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/398/969/82398969_1637305467028_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="��̴��Ӵ� 10 Episode 3" /></a></td>
 <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('95038278');return false;">�� ���� ���� ������</a></td>
 <td class="info">
  <a href="#" class="title ellipsis" title="���" 
  onclick="fnPlaySong('95038278','1');return false;">
 ������ (Feat. MINO) (Prod. by GRAY)</a>
<a href="#" class="artist ellipsis" 
onclick="fnViewArtist('80828775');return false;">BE'O (���)</a>

<a href="#" class="albumtitle ellipsis" 
onclick="fnViewAlbumLayer('82398969');return false;">
��̴��Ӵ� 10 Episode 3</a>
                                </td>
 */
public class MusicSystem {
   private static ArrayList list=new ArrayList(); // ������ ��ü������ ������ �ִ� 
   // ������ ������ 1���� ����ϸ� �ȴ� => �������� ����ϴ� ������ 
   // 1. ������ �ʱ�ȭ (����) ==> ����Ŭ 
   // ������ ���̾ �ʱ�ȭ (����) => �ʱ�ȭ ���(ȣ����� �ڵ� ó��) , ������ 
   // �ʱ�ȭ ����� �̿��ؼ� �����͸� �޸𸮿� ���� 
   static 
   {
	   try
	   {
	     // 1. ����Ʈ ���� => �������� ������ ���� �����͸� ����
	     Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
	     // 2. �ش� ������ �б�
	     Elements title=doc.select("td.info a.title");
	     Elements singer=doc.select("td.info a.artist");
	     Elements album=doc.select("td.info a.albumtitle");
	     // 3. Music�� ���� 
	     for(int i=0;i<title.size();i++)
	     {
	    	 Music music=new Music();
	    	 // �ʱⰪ 
	    	 music.setTitle(title.get(i).text());
	    	 music.setSinger(singer.get(i).text());
	    	 music.setAlbum(album.get(i).text());
	    	 list.add(music);
	     }
	     // 4. list�� �߰� 
	   }catch(Exception ex){}
   }
   // ��� ���
   public ArrayList musicListData()
   {
	   return list;
   }
   // ã�� => ���� , ������ , �ٹ� ==> contains 
   public ArrayList musicFindData(String fd)
   {
	   ArrayList fList=new ArrayList(); // ã�� �����͸� ��Ƽ� ���� 
	   for(int i=0;i<list.size();i++)
	   {
		   Music m=(Music)list.get(i); // ������ �ִ� Music�� 1���� �о� �´� 
		   if(m.getTitle().contains(fd))
		   {
			   // �뷡 ����ȿ� ����� ������ �˻�� ���Կ��� Ȯ�� 
			   fList.add(m);
		   }
	   }
	   return fList;
   }
   
}
















