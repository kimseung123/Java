package com.sist.lib;
// StringTokenizer (�ܾ ����) => split() => []
// => ��Ʈ��ũ ���� => java.util 
// => ���¼� �м� => ���̺귯�� (������ , �ڸ��) => ê�� (�ΰ�����) 
// Open Api => īī�� , ���̹�Ŭ�ι� , ���� 
import java.util.*;
public class MainClass6 {
    // <c:forTokens>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String names="ȫ�浿|��û��|������||������|��������";
        StringTokenizer st=new StringTokenizer(names,"|");
        /*System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());*/
        System.out.println("�̸� ����:"+st.countTokens());
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());
        }
        /*
         *  new StringTokenizer(names,"|");
         *                     ====== === ������ 
         *                      ��� 
         *  st.nextToken() : ���� �ڸ� ������ 1�� 
         *  st.countTokens() : ���� �ڸ� ����
         *  st.hasMoreTokens() : ������ �ִ� ���� (boolean)
         *  
         *  ==> ��¥ , �̹��� 
         *  ==> null���� �ִ� ��쿡 �����߻� 
         *  
         */
	}

}
