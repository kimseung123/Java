package com.sist.main;
import java.util.*;
enum ���ϸ�{
	����("mango"), 
	����("watermelon"), 
	���("apple"),
	��("pear"),
	������("peach"),
	����("graph"),
	����("strawberry"),
	Ű��("kiwi"),
	���("melon"),
	������("orange"),
	����("lemon"),
	�ٳ���("banana"),
	�ڵ�("plum");
	private String en;
    ���ϸ�(String en) // Ŭ���������� ��� (������)
    {
    	this.en=en;
    }
    public String getEn()
    {
    	return en;
    }
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���ϸ� �Է� 
		Scanner scan=new Scanner(System.in);
		System.out.print("���ϸ� �Է�:");
		String f=scan.next();
		
		// ������ ã�Ƽ� ��� 
		for(���ϸ� n:���ϸ�.values())
		{
			System.out.println(n);
			// n.name => �ѱ� 
			// n.getEn()
			if(n.name().equals(f))
			{
				System.out.println(f+"�� ������� "+n.getEn());
				break; // ���� 
			}
		}
	}

}






