package com.sist.lib;
import java.util.*;
import java.text.*;
/*
 *   1. Random() => nextInt(n) => n�� ���� 
 *   2. StringTokenizer 
 *      �� �б� => nextToken
 *      �ݺ� ==> hasMoreTokens 
 *      ���� ==> countTokens
 *   3. Date,Calendar => �޷� 
 *   4. Format 
 *   =====================================
 *   
 */
public class MainClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� ��¥ => �޷� 
		 Date date=new Date();
		 System.out.println(date);
		 SimpleDateFormat sdf=
				 new SimpleDateFormat("yyyy-M-d");
		 System.out.println(sdf.format(date));
		 StringTokenizer st=new StringTokenizer(sdf.format(date),"-");
		 System.out.println("�⵵:"+st.nextToken());
		 System.out.println("��:"+st.nextToken());
		 System.out.println("��:"+st.nextToken());
		 // MM dd ==> 01 , 01  => 09  10 => 10
		 // 08 09 ==> ǥ���� (0=>8���� , 0x=>16����) 0b00001110011 
		 // System.out.println(011);
		 System.out.println(1111);
	}

}
