package com.sist.lib;
// trim() , valueOf() , split()
/*
 *   trim() => �¿��� ���� ���� => ����ڰ� ���������� �Է½ÿ� 
 *             "Hello" , " Hello".trim() 
 *             "     Hello Java!!    "
 *             ==            == 
 *   valueOf() => ��� ���������� ���ڿ��� ��ȯ 
 *   ��) valueOf(1) ==> "1"
 *      valueOf(true) ==> "true"
 *      valueOf(10.5) ==> "10.5"
 *      
 *   split() : ���ڸ� �и��ؼ� �迭�� ���� ==> java.util.StringTokenizer
 *             String s="admin|1234|ȫ�浿|����|30"
 *             String[] ss=s.split("|")
 *             ss[0]="admin"
 *             ss[1]="1234"
 *             ss[2]="ȫ�浿"
 *             
 *      
 */
public class MainClass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String data=" Hello Java!! ";
        System.out.println("���� ����:"+data.length());//14
        String s=data.trim(); //"Hello Java!!"
        System.out.println("���� ����:"+s.length());//12
        
        int a=100;
        int b=200;
        System.out.println(a+b);
        // static �޼ҵ� (Ŭ������.�޼ҵ�) ==> static 
        // Math.random()
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        System.out.println(a1+b1);
        
        String data2="ȫ�浿-����-25-����-����";
        String[] info=data2.split("-");
        for(String ss:info)
        {
        	System.out.println(ss);
        }
        
	}

}












