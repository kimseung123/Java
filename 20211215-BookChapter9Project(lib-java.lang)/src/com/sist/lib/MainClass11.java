package com.sist.lib;
// StringBuffer / StringBuilder
// ����ȭ  / �񵿱�ȭ 
// ������ ���� => ������ String
import java.io.*; // ���� �б� 
public class MainClass11 {
    public void stringUse()
    {
    	String movie="";
        long start=System.currentTimeMillis();//log���� 
        // ���� �б�
        // IOException ==> CheckException
        try
        {
        	// ���� �б� 
        	FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
            int i=0;//char => read() => int  A=65
            while((i=fr.read())!=-1) //-1 EOF
            {
            	movie+=String.valueOf((char)i);
            }
            fr.close();
            System.out.println(movie);
            
        }catch(Exception ex){}
        long end=System.currentTimeMillis();
        System.out.println("����ð�:"+(end-start));
    }
    //33156 VS 506 ==> ���ڿ� ������ ����ȭ (StringBuffer)
    // 504
    public void stringBufferUse()
    {
    	StringBuffer sb=new StringBuffer();
    	long start=System.currentTimeMillis();//log���� 
        // ���� �б�
        // IOException ==> CheckException
        try
        {
        	// ���� �б� 
        	FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
            int i=0;//char => read() => int  A=65
            while((i=fr.read())!=-1) //-1 EOF
            {
            	sb.append(String.valueOf((char)i));
            }
            fr.close();
            System.out.println(sb.toString());
            
        }catch(Exception ex){}
        long end=System.currentTimeMillis();
        System.out.println("����ð�:"+(end-start));
    }
    public void stringBuilderUse()
    {
    	StringBuilder sb=new StringBuilder();
    	long start=System.currentTimeMillis();//log���� 
        // ���� �б�
        // IOException ==> CheckException
        try
        {
        	// ���� �б� 
        	FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
            int i=0;//char => read() => int  A=65
            while((i=fr.read())!=-1) //-1 EOF
            {
            	sb.append(String.valueOf((char)i));
            }
            fr.close();
            System.out.println(sb.toString());
            
        }catch(Exception ex){}
        long end=System.currentTimeMillis();
        System.out.println("����ð�:"+(end-start));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass11 m=new MainClass11();
        //m.stringUse();
        //m.stringBufferUse();
        m.stringBuilderUse();
	}

}
