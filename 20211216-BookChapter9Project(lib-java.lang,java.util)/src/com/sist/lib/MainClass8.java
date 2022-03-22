package com.sist.lib;
import java.text.SimpleDateFormat;
/*
 *    java.util 
 *    
 *    ��¥ ���� 
 *      Date (����Ŭ ȣȯ), Calendar (����) 
 *    ��ȯ ���� 
 *      ��¥ ��ȯ => SimpleDateFormat 
 *                 ChoiceFormat 
 *                 MessageFormat (SQL)
 *    ������ ���� : Collection(11��,12��)
 *    
 *    1�� ~ 8�� => �ڹ� ���� (�ʼ�) 
 *    
 */
import java.util.*;
public class MainClass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. ���� ��¥ 
		/*Date date=new Date();// �ý����� ��¥ ���� (�ð�)
		// 2. ��ȯ (���α׷��� �´� �������� ��ȯ)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		String today=sdf.format(date);
		//System.out.println(today);
		StringTokenizer st=new StringTokenizer(today,"-");
		String strYear=st.nextToken();
		String strMonth=st.nextToken();
		String strDay=st.nextToken();
		
		int year=Integer.parseInt(strYear);
		int month=Integer.parseInt(strMonth);
		int day=Integer.parseInt(strDay);
		
		System.out.println(strYear+"�⵵ "+strMonth+"��");
		*/
		/*
		 *   yyyy-MM-dd 
		 *   yyyy/MM/dd
		 *   yyyy => 4�⵵ 2012
		 *   M => ��  ==> 01,02...10,11 ==> MM 
		 *   d => ��  ==> dd
		 *   hh => �ð� 
		 *   mm => �� 
		 *   ss => ��
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		System.out.println(year+"�⵵ "+month+"��");
		
		System.out.println(); 
		// ���� ���
		String[] strWeek={"��","��","ȭ","��","��","��","��"};
		for(String week:strWeek)
		{
			System.out.print(week+"\t");
		}
		/*
		 *    List list=new ArrayList() => interface
		 *    Calendar c=�޼ҵ�() => �߻�Ŭ����  
		 */
		// Calendar����
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH,month-1); // 0~11 ==> 12 (11)
		cal.set(Calendar.DATE, 1);
		
		// ���� 
		int week=cal.get(Calendar.DAY_OF_WEEK);// 1~7
		//System.out.println(strWeek[week-1]);
		// ������ ��¥ 
		int lastday=cal.getActualMaximum(Calendar.DATE);
		//System.out.println(lastday);
		// ��ü ���� 
		// ���� 
		// ������ �� 
		// �޷� ��� 
		week=week-1;
		System.out.println("\n");
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println("\n");
			}
		}
	}

}









