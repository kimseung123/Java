package com.sist.main;
import java.util.*;
import java.io.*;
// ObjectInputStream => readObject() , close()
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// ��ü ������ �б� 
        	FileInputStream fis=
        		new FileInputStream("c:\\java_data\\sawon.txt");
        	// ���� ������ �д´� 
        	ObjectInputStream ois=
        			new ObjectInputStream(fis);
        	// ���� ������ ��ü������ ���� 
        	ArrayList<Sawon> list=(ArrayList<Sawon>)ois.readObject();
        	fis.close();
        	ois.close();
        	// ArrayList���
        	for(Sawon s:list)
        	{
        		System.out.println(s.getSabun()+" "
        				+s.getName()+" "
        				+s.getDept()+" "
        				+s.getLoc()+" "
        				+s.getPay());
        	}
        }catch(Exception ex) {}
	}

}
