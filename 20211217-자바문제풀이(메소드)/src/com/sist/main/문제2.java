package com.sist.main;
/*
 *  ������ �Է� �޾Ƽ� �������� ����ϴ� �޼ҵ� �ۼ�(3���� �޼ҵ�)
    ���� �Է� 
    ������ ó�� => �迭 
                 ===> �������� 
    ��� => �迭 

 */
import java.util.*;
public class ����2 {
    private int[] arr=new int[16];
    public int input()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("���� �Է�(0~32767):");
    	return scan.nextInt();
    }
    public void binary()
    {
    	// ������ �ޱ� 
    	int user=input();
    	int index=15; // �迭�� �ǵں��� ������ ä��� 
    	while(true)
    	{
    		arr[index]=user%2;
    		user=user/2;
    		if(user==0)
    			break;
    		index--;
    	}
    }
    public void print()
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i%4==0 && i!=0)
    			System.out.print(" ");
    		System.out.print(arr[i]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ����2 m=new ����2();
        m.binary();
        m.print();
	}

}
