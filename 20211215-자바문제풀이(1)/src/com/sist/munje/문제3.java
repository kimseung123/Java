package com.sist.munje;
/*
 * 3.	1���� 100���� 3�� ����� ���ϴ� while ���� ��ĭ�� ������ �ڵ带 �����϶�.
	 
	int sum=0, i=1;
	while (i<100) {
	    if(i%3 != 0) {
	        i++;
	        continue;
	    }
	    else sum += i;
	    i++;
	}
 */
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while (i<100) {
		    if(i%3 != 0) {
		        i++;
		        continue;// 3�ǹ���� �ƴϸ� �����Ѵ� 
		    }
		    else sum += i;//3��� ���� 
		    i++;
		}
		System.out.println("sum="+sum);
	}

}
