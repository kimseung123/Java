package com.sist.main;
/*
 *    ���� ��Ʈ�� 
 *    =========
 *     BufferedReader(�б�) / BufferedWriter(����)
 *     BufferedInputStream / BufferedOutputStream
 *     ======== �����͸� �޸𸮿� �÷����� ��� ���� (�ӵ��� ��� => ��뷮)
 *     ======== ��뷮 : ������ (�ϵ�,����ũ) : ChatBot (Ʈ����:������ ����)
 *     => ����Ʈ ��Ʈ�� ==> ���� ��Ʈ������ ����( InputStreamReader )
 *     
 *    �б�
 *     ������ , ����, �̹��� => FileInputStream
 *     �ѱ��� ���Ե� ����(txt,dat) => FileReader
 *     ��뷮(��, Ʈ����) => BufferedReader
 */
import java.util.*;
import java.io.*;
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Member> list=new ArrayList<Member>();
        try
        {
        	// ������ �д´� 
        	FileInputStream fis=
        			new FileInputStream("c:\\java_data\\address.txt");
        	// �޸𸮿� ���� =>�� ���� ��ü�� �о� ���� ��� 
        	BufferedReader br=
        		new BufferedReader(new InputStreamReader(fis));
        	// ���پ� �о ��� 
        	while(true)
        	{
        		String data=br.readLine(); // \n�� ���� 
        		if(data==null) break; // ���� �����Ͱ� ���� ��� => null
        		System.out.println(data);
        		StringTokenizer st=new StringTokenizer(data,"|");
        		// split() , replaceAll() => ���Խ� 
        		Member m=new Member(Integer.parseInt(st.nextToken()),
        				st.nextToken(), st.nextToken(), 
        				st.nextToken(), st.nextToken());
        		list.add(m);
        	}
        	fis.close();
        	br.close();
        	// ArrayList�� ������ ��� 
        	for(Member m:list)
        	{
        		System.out.println(m.getNo()+" "
        				+m.getName()+" "
        				+m.getSex()+" "
        				+m.getAddr()+" "
        				+m.getTel());
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();// ���� ������ Ȯ�� 
        }
	}

}












