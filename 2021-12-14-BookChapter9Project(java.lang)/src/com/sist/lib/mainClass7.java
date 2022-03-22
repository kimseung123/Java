package com.sist.lib;
/*
 *   startsWith,endsWith 
 *   ==================== ã�� ���ڿ� (���� ���ڿ�,������ ���ڿ�)
 *   Java & Spring 
 *   �ڹٿ� JSP
 *   �ڹٿ� ����Ŭ 
 *   
 *   ����)
 *        public boolean startsWith(String s)
 *        public boolean endsWith(String s)
 *        
 *   �ڹ�
 *   ����Ŭ => �ڹ�+����Ŭ 
 *   HTML/CSS
 *   JavaScript(JQuery,AJAX)
 *   JSP (MVC)
 *   Spring
 *   =======================
 *   MyBatis 
 *   ReactJS
 *   VueJS
 *   ChatBot
 *   =======================
 *   AWS 
 *   
 *   =======================
 *   1�� ��ü������ ���� (8��)
 *   2�� �÷��� , ���׸��� (10�� , SimpleDateFormat)
 *       11�� , 12�� 
 *      IO (FileReader , FileWriter , BufferedReader) 
 *   
 *   
 */
import java.util.*;
public class mainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ ���� 
		String[] data= {
			"ȥ�� ���� �ڹ�",
			"�ڹٿ� ����Ŭ",
			"�ڹٱ���� AWS",
			"����Ŭ ���α׷���",
			"�ڹ� ���α׷���",
			"JSP AND MVC",
			"Spring Framework",
			"MyBatis ���α׷���",
			"�ڹٸ� �̿��� ê��",
			"AWS�� �̿��� ����",
		};
		/*
		 *   �˻� �뵵�� ��� 
		 *   ���� ���ڿ� (startsWith)
		 *   ������ ���ڿ� (endsWith)
		 *   ���Ե� ���ڿ� (contains)
		 */
		// 2. ����� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�:");
		String fd=scan.next();
		// 3. �ش� ���ڿ� ã�Ƽ� ��� 
		for(String s:data)
		{
			if(s.contains(fd))
			{
				try
				{
					Thread.sleep(1000);
				}catch(Exception ex){}
				System.out.println(s);
			}
		}
	}

}











