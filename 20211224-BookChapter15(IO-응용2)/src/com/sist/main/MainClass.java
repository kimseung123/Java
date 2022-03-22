package com.sist.main;
// Ŭ���̾�Ʈ (������) => ����� ���� �� (Front-End)
import java.util.*;
import com.sist.music.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ����� ��û => �ش������� ��û 
		Scanner scan=new Scanner(System.in);
		MusicSystem ms=new MusicSystem();
		int total=ms.musicTotalPage();
		System.out.print("������ �Է�(1~"+total+"page):");
		int page=scan.nextInt();
		// �ش� �������� ���� �޴´� 
		ArrayList<Music> list=ms.musicListData(page);
		// ���� ������ ��� 
		System.out.println("===== "+page+"page ���� ���=====");
		for(Music m:list)
		{
			System.out.println(m.getNo()+"."+m.getTitle());
		}
		
		System.out.println("===== ������ ���� ū ���� ��� =====");
		list.clear();
		list=ms.musicMaxData();
		for(Music m:list)
		{
			System.out.println(m.getNo()+"."+m.getTitle()
			           +"("+m.getIdcrment()+")");
		}
		
		System.out.println("===== �������� ã�� =====");
		System.out.print("���� �Է�:");
		String title=scan.next();
		list.clear();
		list=ms.titleFindData(title);
		for(Music m:list)
		{
			System.out.println(m.getNo()+"."+m.getTitle());
		}
		System.out.println("===== ���������� ã�� =====");
		System.out.print("���� �Է�:");
		String singer=scan.next();
		list.clear();
		list=ms.singerFindData(singer);
		for(Music m:list)
		{
			System.out.println(m.getNo()+"."+m.getTitle()+
					"("+m.getSinger()+")");
		}
		
	}

}
