package com.sist.main;

import java.util.Arrays;

// ��� ��� 
// �޼ҵ� 
// ��ü ����  ==> ����Ŭ���� 
// �������� ���α׷� (����ó��) 
// 1�� ~ 8�� 
/*
 *    ���� ���ǹ�
 *    ���� ���ǹ�
 *    
 *    1~100���� ==> 3��� , 5��� , 7����� �� 
 *       ���� ���ǹ� ��� 
 *       
 *    ��� => ���ǹ� 
 *      ����  : &&  ==> ����¡ 
 *      ������ : || (������ ����� ���) 
 *      
 *      
 *      45, 67, 90, 34, 12
 *      ==  ==
 *      67  45
 *      ==      ==
 *      90      67
 *      ==          ==
 *      90          34
 *      ==              ==
 *      90              12 
 *      ============================ 1 ���� (for 1)
 *      90  45  67  34  12
 *      ==
 *     ����
 *          45  67  34  12
 *          ==  ==
 *          67  45
 *          ==      ==
 *          67      34
 *          ==          ==
 *          67          12
 *     ============================= 2 ���� (for 2)
 *     90   67
 *             45   34  12
 *             ===  ==
 *             45   34
 *             ===      ==
 *             45       12
 *     ============================= 3 ���� (for 3)
 *     90   67 45
 *                 34   12
 *                 ==   ==
 *                 34   12
 *     ============================= 4 ���� (for 4)  
 *               arr.length-1
 *              ����(i) ���� (j) m,n a,b
 *               1  => 4   i+j=5  ==> j=5-i  
 *               2  => 3
 *               3  => 2
 *               4  => 1
 *    
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� : �������� , �������� ==> ORDER BY no DESC
		int[] arr={45, 67, 90, 34, 12,13,60,57};
		/*
		 * Arrays.sort(arr); // ASC(�ø�����) ,DESC(��������) for(int i:arr) {
		 * System.out.print(i+" "); } System.out.println("\nDESC"); for(int
		 * i=arr.length-1;i>=0;i--) { System.out.print(arr[i]+" "); }
		 */
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) //�ø�����
				{
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}










