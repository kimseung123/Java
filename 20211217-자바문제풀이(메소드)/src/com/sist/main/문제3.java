package com.sist.main;
/*
 *   2. ������ ������ �迭�� �����ؼ� �Է��ϰ� �����ϴ� ���α׷� �ۼ� 
     ������ ���� �Է� (�迭 ������)
     ���� ó��
     ��� 
     
 */
import java.util.*;
public class ����3 {
    public void input(int[] arr)//Call By Reference
    {
    	Random r=new Random();
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=r.nextInt(100)+1;//1~100
    	}
    	System.out.println(Arrays.toString(arr));
    }
    public void sort(int[] arr)
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]<arr[j])
    			{
    				int temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    }
    public void print(int[] arr)
    {
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ����3 m=new ����3();
        int[] arr=new int[5];
        m.input(arr);
        m.sort(arr);
        m.print(arr);
        System.out.println("============");
        ����4 mm=new ����4();// ���� 
        mm.print(2021);
	}

}
