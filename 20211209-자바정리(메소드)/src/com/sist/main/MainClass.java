package com.sist.main;
/*
 *    ����ڰ� �⵵/�� �Է� ==> 
 *    �޷� ��� => ���� 
 *    
 *    �θ��ô� (���� , ��ȣȭ)
 *    = 4�⸶�� 
 *    = 100�� ���� ����
 *    = 400�� ���� 
 *    
 *    1. 1�� 1�� 1�� => �۳⵵������ �ѳ���
 *    2. ����⵵�� 1�� ���� �Է��� �� �ѳ� �� 
 *    3. 1++
 *    ================================ +
 *       �ѳ� �� % 7 => ���� 
 *    ===> Calendar
 *    
 *    
 */
import java.util.*;
// ���� => java.lang.* 
/*
 *    public class MainClass extends Object
 *    {
 *       public MainClass()
 *       {
 *       }
 *       public void display()
 *       {
 *          return
 *       }
 *    }
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����� �Է� �Ϸ� 
		Scanner scan=new Scanner(System.in);
        System.out.print("�⵵ �Է�:");
        int year=scan.nextInt();
        
        System.out.print("�� �Է�:");
        int month=scan.nextInt();
        
        // ��û�� ������ ���� => 1������ ���� ���ϱ�
        // ���⵵������ �ѳ� �� 
        int total=(year-1)*365
        		 +(year-1)/4
        		 -(year-1)/100
        		 +(year-1)/400;
        // ���ޱ����� ��
        int[] lastday={31,28,31,30,31,30,
        		       31,31,30,31,30,31};
        
        if((year%4==0 && year%100!=0)||(year%400==0)) // ���� 
        {
        	lastday[1]=29;
        }
        else
        {
        	lastday[1]=28;
        }
        
        for(int i=0;i<month-1;i++)
        {
        	total+=lastday[i];
        }
        
        total++;
        
        // ���� ���ϱ� 
        int week=total%7; 
        
        // ��� 
        /*
         *     ���ڿ��� �Է¹޾Ƽ� ���ٷ� ��� 
         *     ========================
         *     �׸������� �о�ͼ� ���ٷ� ��� 
         *     byte[] buffer=fileReader()
         *     
         */
        String[] strWeek={"��","��","ȭ","��","��","��","��"};
        // ���� ��� 
        System.out.println(year+"�⵵ "+month+"��");
        for(int i=0;i<strWeek.length;i++)
        {
        	System.out.print(strWeek[i]+"\t");
        }
        System.out.println("\n");
        for(int i=1;i<=lastday[month-1];i++)
        {
        	//System.out.print(i+"\t");
        	if(i==1)// ù�� 
        	{
        		for(int j=0;j<week;j++)
        		{
        			System.out.printf("\t");
        		}
        	}
        	System.out.printf("%2d\t",i);
        	week++;
        	if(week>6)
        	{
        		week=0;
        		System.out.println();
        	}
        }
        
	}

}













