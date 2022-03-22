package com.sist.method;
/*
 *    ��� 
 *    ===== ���� 
 *    ���ǹ� : ���� ���ǹ� (if) , ���� ���ǹ� (if~else) 
 *           ����) if(���ǹ�) => ���ǹ�(true/false) => ���������� 
 *                                             �������� , �񱳿�����
 *                {
 *                   ������ true�϶� ���� 
 *                }
 *                => �ʿ��� ���븸 ����� ���� 
 *                
 *                if(���ǹ�)
 *                {
 *                    ���� true�϶�
 *                }
 *                else
 *                {
 *                    ���� false�϶� 
 *                }
 *                ====================== �� (���׿�����)
 *                
 *    �ݺ��� : for , while(�����ͺ��̽�,��Ʈ��ũ)
 *           ==== for-each
 *           
 *           for 
 *           ==> �Ϲ� for
 *                    1   ��   2       4
 *               for(�ʱⰪ ; ���ǽ� ; ������)
 *               {            ��
 *                   ���๮��  3        ��
 *               }
 *               
 *               1 -> 2 -> 3 -> 4
 *               �ʱⰪ => ���� (true) => ���๮�� => ���� 
 *                    2 -> 3 -> 4
 *                    2 -> 3 -> 4
 *                    2 -> 3 -> 4
 *                    == false�� ����  
 *           ==> for-each => ��¸� �� ��� (������ ���)
 *               for(�������� ����:�迭(�÷���)) => ����ȯ 
 *               {   ========== ����� �����ͺ��� ũ�� ������� 
 *                   => �迭�̳� �÷��ǿ� ����� �����͸� ���� 
 *               }
 *               
 *           while  : ���ѷ��� => while(true) : �ݵ�� ���� ������ ó��
 *           ����)
 *                 �ʱ�ȭ ==========  1
 *                 while(���ǹ�) ===  2 ==> false�� ���� 
 *                 {
 *                    �ݺ� ���๮�� === 3
 *                    ������     === 4 ===> 2(���ǽ����� �̵�)
 *                 }
 *           
 *    �ݺ���� : break : �ݺ��� �ߴ� 
 */
import java.util.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] result={"����","����","��"};
        // ��� ���� ==> 0,1,2
        // ��ǻ�Ͱ� ����,����,�� => ���� 
        int com=(int)(Math.random()*3);//0,1,2
        // ����ڰ� ����,����,�� => ���� 
        Scanner scan=new Scanner(System.in);
        System.out.print("����(0),����(1),��(2) �Է�:");
        int user=scan.nextInt();
        
        System.out.println("============= ��� ==========");
        System.out.println("��ǻ��:"+result[com]);
        System.out.println("�����:"+result[user]);
        int r=com-user;
        if(r==-1 || r==2) 
        {
        	System.out.println("����� Win!!");
        }
        else if(r==-2 || r==1)
        {
        	System.out.println("��ǻ�� Win!!");
        }
        else
        {
        	System.out.println("����!!");
        }
        // �� 
        /*      com          user
         *     ��ǻ��        �����           com-user
         *       ����(0)      ����(0)  (S)      0
         *                   ����(1)  (U)     -1
         *                   ��(2)    (C)    -2
         *                   
         *       ����(1)      ����(0)   (C)     1
         *                   ����(1)   (S)     0
         *                   ��(2)     (U)     -1
         *                   
         *       ��(2)        ����(0)  (U)      2
         *                   ����(1)  (C)      1
         *                   ��(2)    (S)      0
         *                   
         *       ================================
         *         user => -1 , 2
         *         com  => -2 ,1 
         *     
         */
	}

}





