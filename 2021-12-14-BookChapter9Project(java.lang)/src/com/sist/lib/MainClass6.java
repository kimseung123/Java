package com.sist.lib;
// *** contains() => ���ڿ��� �߿� ���ԵǾ����� ���� => LIKE
// ����) public boolean contains(String word) = �ڹ� ��ũ��Ʈ (SearchBar)
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// ==> ��ȭ��õ ==> ��α� , ī�信�� �Է±��� �д´� => �ǽð� (Ʈ����)
/*
 *   <div class="wrap_song_info">
	<a href="javascript:melon.play.
	playSong('1000002721',34061322);"
	 title="����� �� ������ ���">����� �� ������</a>
	</span></div><br>
 */
public class MainClass6 {

	public static void main(String[] args) {
		// 1. ����� �Է� 
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�:");
		String fd=scan.next();
		
		// 2. ã��  => contains 
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			// ����Ʈ�� �����ؼ� ��� �����͸� �о� �Ͷ� 
			Elements elem=doc.select("div.wrap div.wrap_song_info a");
			for(int i=0;i<elem.size();i++)
			{
				String ss=elem.get(i).attr("title");// �뷡 ���� 
				if(ss.contains(fd)) // �뷡 ���� �Էµ� �ܾ� ���Ե� ���
				{
					System.out.println(ss);
				}
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();// ���� Ȯ�� 
		}
		// 3. ã�� ����� �����ش� 
	}

}











