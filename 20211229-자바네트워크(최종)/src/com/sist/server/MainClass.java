package com.sist.server;
import java.io.*;
import java.util.*;

import com.sist.music.Music;
// ���� ==> ������ ���� ==> ����Ŭ�� ���� (���� , ���� , ��ȭ , ����)
// JOIN 
public class MainClass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // CheckException => java.io,java.net,java,sql 
		try
		{
			// ���� (���� �б� => �޸𸮿� ���� => ����)
			// ��� ����ڰ� ���� ���� ���� ������ �־�� �Ѵ�
			// ���� => ��� �����ڰ� ����ϴ� �����͸� ������ �� �ְ� �����
			ArrayList<Music> mList=new ArrayList<Music>();
			// ���� �б� ==> mList�� ���� 
			FileInputStream fis=
					new FileInputStream("c:\\java_data\\music_object.txt");
		    // ���� ������ ��ü�� ���� (������ȭ)
			// �޸� => ���� => ����Ŭ(***) : �����ϱ� ����
			// => CURD (�˻�,����,�߰�,����) => �������� �����͸� ȥ���ؼ� ������ �б� 
			//                              ===> JOIN / SUBQUERY 
			ObjectInputStream ois=
					new ObjectInputStream(fis); 
			// ���Ͽ� �ִ� �����͸� ��ü������ �ޱ� 
			mList=(ArrayList<Music>)ois.readObject();
			// Object readObject() => Object�� ��� Ŭ������ ���� (���� ū Ŭ����)
			// �޸𸮿� ����� �����͸� ��� 
			System.out.println("====== Music Top 200 ======");
			for(Music m:mList)
			{
				System.out.println(m.getNo()+"."+m.getTitle());
			}
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}

}










