package com.sist.lib;
// substring => ���ڿ� �ڸ��� 
/*
 *   substring(int start) 
 *   substring(int start,int end) : �߰��� ���ڿ��� �ڸ��� ��� 
 *   
 *   ��⵵ �����ֽ� �ι���27���� 38-16 1F ���� ��⵵ �����ֽ� ������ 947-4 1F
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String address="��⵵ �����ֽ� �ι���27���� 38-16 1F ���� ��⵵ �����ֽ� ������ 947-4 1F";
        //1. ���ּҸ�
        String addr=address.substring(0,address.indexOf("��"));
        // ������ substring(int s,    int e)
        // ==>            ======���� ======= �� => e-1
        // substring(0,5) ==> 5���� , 4������ 
        // endIndex - 1
        /*
         *    000-111
         *    === ===
         *    0,3 4,7
         *    === ===
         *    012 456
         */
        System.out.println(addr);
        //2. ����
        addr=address.substring(address.lastIndexOf("����")+3);
        System.out.println(addr);
        //3. �����ֽ� 
        
        String s=address.substring(address.indexOf(" ")+1);
        System.out.println(s);
        String s2=s.substring(0,s.indexOf(" "));
        System.out.println(s2);
        // ������ �״�� ����
        //System.out.println(address);
	}

}






