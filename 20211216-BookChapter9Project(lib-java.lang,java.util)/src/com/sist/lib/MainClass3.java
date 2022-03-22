package com.sist.lib;
// java.lang , java.util
/*
 *   java.util => ���α׷����� �����ϰ� ���Ǵ� Ŭ���� ���� 
 *   ==========
 *    1. ���� ===> Random ==> 500page 
 *    **2. ���ڿ� �и� ===> StringTokenizer === 513page
 *    **3. ��¥ ===> Date,Calendar 
 *    **4. ��ȯ ===> SimpleDateFormat , MessageFormat
 *    **5. ���� (������ ����)
 *              Collection 
 *                 |
 *        ------------------------
 *        |        |             |
 *       List     Set          Map 
 *        |        |            |
 *     ------    -----         ----
 *        |        |            |
 *    **ArrayList  TreeSet     Hashtable
 *    Vector     HashSet       HashMap(*****) => �ַ� ����
 *    LinkedList
 *    Stack 
 *    6. �Է°� ===> Scanner
 */
import java.util.Random; // ����
import java.util.Scanner; // ==> ���� ��� ==> *

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� => nextInt(30) ==> 0~29 
		Random r=new Random();
		//int i=r.nextInt(); // int �������� �߻� (-21�� 4õ~21�� 4õ~~)
		//System.out.println(i);
		int i=r.nextInt(100); // 0~99 (100����)
		// nextInt(n) ==> 0~n (n�� ����)
		System.out.println(i);
		// �Ǽ� => nextDouble() ==> 0.0~0.99 
		 
	}

}
















