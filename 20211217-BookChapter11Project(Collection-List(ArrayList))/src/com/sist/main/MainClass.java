package com.sist.main;
// ����ڰ� �� �� �ְ� ���� ���α׷� (������)
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // MusicSystem ��� 
		MusicSystem ms=new MusicSystem();
		ArrayList list=ms.musicListData(); // ������ ��� ��� 
		System.out.println("========= Music Top50 ===========");
		for(int i=0;i<list.size();i++)
		{
			Music m=(Music)list.get(i);
			System.out.println((i+1)+"."+m.getTitle()+"("
					 +m.getSinger()+")");
		}
		System.out.println("==================================");
		// ã�� 
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�:");
		String fd=scan.next();
		ArrayList fList=ms.musicFindData(fd);
		
		if(fList.size()==0)
		{
			System.out.println("�˻��� ������ �����ϴ�!!");
		}
		else
		{
			System.out.println("�˻� ���:"+fList.size()+"��");
		}
		//  �˻��� ������ ��� 
		for(int i=0;i<fList.size();i++)
		{
			Music m=(Music)fList.get(i); // ����� Ŭ���� �б� (Music)
			System.out.println(m.getTitle());
		}
		
	}

}











