package com.sist.lib;
// Math ==> ���а��� 
/*
 *   ==> ������ ��� => ����Ŭ 
 *   1. ���� => random()
 *      ����) public static double random();
 *                                ========= ������ ���� ���� 
 *                                0.0~0.99 
 *                                ========
 *                               (int)((0.0~0.99)*100)+1
 *                                     ========== ====
 *                                         1        2
 *                                =====
 *                                   3                 ==
 *                                                      4
 *                                1,2=> 0.0~99.0
 *                                3=> 0~99
 *                                4=> 1~100
 *   2. �ø� => ceil()  ==> ceil(17/5.0) ==> 3.4 ==> 4 => �������� 
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=103;// ������ �Ѱ��� 
        int total=103/15;
        if(total%15>0)
        {
        	total++;
        }
        System.out.println("��������:"+total);
        
        System.out.println("=====lib�̿�=====");
        int total2=(int)Math.ceil(count/15.0);
        System.out.println(total2);
        // �ڹ� => CBD (�̹� ������� ���̺귯�� => ������) => ���� 
        // ��� => �˻� (���۸�) => �м� 
	}

}











