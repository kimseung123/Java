package com.sist.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *  <a href="#" class="title ellipsis" title="���" onclick="fnPlaySong('95299676','1');return false;">
                          
     Counting Stars (Feat. Beenzino)</a>
 */
public class MainClass {

	/*public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        // ��Ʈ��ũ (����ó��)
		try
		{
			// ���������� ����Ǵ� ���� 
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200")
					     .get();
		    //System.out.println(doc.toString());
		    Elements title=doc.select("a.title");
		    for(int i=0;i<title.size();i++)
		    {
		    	System.out.println((i+1)+"."+title.get(i).text());
		    }
		}catch(Exception ex)
		{
			ex.printStackTrace();//���� Ȯ�� 
		}
	}*/
	/*
	 *    catch => ������ ���� 
	 *    throws => ������ �� �� ���� ���� Ȯ�θ� ���� 
	 *    =====================================
	 *     ������ �߻��� �ص� ���������� ���Ḧ �� �� �ִ�  
	 */
	public static void main(String[] args) throws Exception{
		// ���������� ����Ǵ� ���� 
	    Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200")
							     .get();
	    // Document org.jsoup.Connection.get() throws IOException
	    // CheckException => ������ ����ó��
	    /*
	     *   1. try~catch
	     *   2. throws
	     */
	    //System.out.println(doc.toString());
		Elements title=doc.select("a.title");
		for(int i=0;i<title.size();i++)
		{
		   System.out.println((i+1)+"."+title.get(i).text());
		}
	}

}
