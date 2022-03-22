package com.sist.food;
// ��û ó�� => ����� => ����� �����ִ� ���� => ������
// �����͸� ��� ���� 
import java.io.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// ī�װ� => ���� ���� ==> Ŭ���̾�Ʈ ���� (ArrayList => ����)
// �������� => ���� ���� ==> Ŭ���̾�Ʈ ���� (ArrayList => ����)
/*
 *    ��������� �ʱ�ȭ 
 *    ���۰� ���ÿ� �۾�
 *    
 *    ==> �ʱ�ȭ ��� , ������ => ȣ�� 
 *        ========= Ŭ������ �ε�� ��� �ڵ� ���� 
 *        
 *        �ʱ�ȭ ��� 
 *        
 *        {
 *           // �ν��Ͻ� �ʱ�ȭ ��� 
 *        }
 *        static 
 *        {
 *           // ���� ���
 *        }
 *        ***** Ŭ���� ��� => �������� ���ϰ� ���� �Ѵ� 
 *                                      ====
 *                                      ����� ���ÿ� ���� ���� 
 *        �ʱ�ȭ 
 *        1. ����� �ʱ�ȭ  : private int a;
 *                         a=10;
 *        =====================
 *        2. �ʱ�ȭ ��� 
 *        3. ������ 
 *        ===================== ���� (�����б�,��������..�ܺε����� �б�)
 */
public class FoodSystem {
   public static void main(String[] args) {
	   FoodSystem f=new FoodSystem();
	   
   }
   // 1. ���� => ����(����Ŭ)�� ���� 
   // 1-1 �ʱ�ȭ ��� ==> ���۰� ���ÿ� ������ ���� 
   // 1-2 ������ ==> ���۰� ���� ȣ��
	/*
	 *  <div class="top_list_slide">
        <ul class="list-toplist-slider" style="width: 531px;">
            <li>
              <img class="center-croping" alt="���ְ� ���ִ� ���� ����Ʈ 40�� ����"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/ypeawavxjl9-_zkc.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

              <a href="/top_lists/1482_anju"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;�ϰ� ���� ���� ����Ʈ&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;R3PGZKC&quot;});">
                <figure class="ls-item">
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                      <span class="title">���ְ� ���ִ� ���� ����Ʈ 40��</span>
                      <p class="desc">"���ִ� ���ֿ� �Բ��ߴ��� ������ �ܸ��� ��...!"</p>
	 */
   public FoodSystem()
   {
	   try
	   {
		   Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
	       Elements title=doc.select("div.top_list_slide span.title");
	       Elements subject=doc.select("div.top_list_slide p.desc");
	       StringBuffer sb=new StringBuffer();
	       for(int i=0;i<title.size();i++)
	       {
	    	   System.out.println(title.get(i).text());
	    	   System.out.println(subject.get(i).text());
	    	   System.out.println("\n");
	    	   String data=(i+1)+"|"+title.get(i).text()+"|"
	    			      +subject.get(i).text()+"\n";
	    	   sb.append(data);
	       }
	       
	       File file=new File("c:\\java_data\\category.txt");
	       if(!file.exists())
	       {
	    	   file.createNewFile();
	       }
	       
	       // ���Ͽ� ī�װ� �����ϱ� 
	       FileWriter fw=new FileWriter(file);
	       fw.write(sb.toString());
	       fw.close();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
   }
   // 2. ����ڰ� ��û => ����(����Ŭ) �о => ArrayList�� ������ ���� 
}







