package com.sist.en;
/*
 *  2�� => 
 *        10�� : Date , Calendar(O)
 *        11�� : ArrayList,HashSet,HashMap(O)
 *        12�� : <> => �������� ����(O) , enum , annotataion
 *        13�� : Thread
 *        14�� : ��Ÿ => ���� / ��Ʈ�� 
 *        15�� : IO (O)
 *        16�� : ��Ʈ��ũ 
 */
// enum : ������ (����� ��Ƽ� ����) => �迭 
// ����� �����ϰ� ���ϰ� ��� => C���� ���� => JDK 1.5 �ڹٿ� ÷�� 
// ����Ŭ ������ (C���) => printf(), ���� -> 
/*
 *    ������ ��� ��� 
 *    enum �������� {
 *      �����1,�����2....
 *    }
 */
// �뵵 => �޴� , ī�����(���) , ȭ�� ===> ����)
// ��Ʈ��ũ => ��� (����� ��û=> LOGIN, MAKEROOM , ROOMIN , ROOMOUT
// WAITCHAT , ROOMCHAT)
// ����� �����ϴ� ���α׷� : enum
enum Season{
	��,����,����,�ܿ� 
}
public class MainClass {
    private String name;
    private Season fs;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainClass m=new MainClass();
        m.name="ȫ�浿";
        m.fs=Season.��;
        System.out.println("�̸�:"+m.name);
        System.out.println("�����ϴ� ����:"+m.fs);
        
        // ��� ��ü ��� 
        // Season.values() => �����ü���� ������ �´� 
        for(Season s:Season.values())
        {
        	System.out.println(s);
        }
        
        Season ss=Season.��;
        System.out.println(ss.ordinal());// �ε��� �б� (�ε��� 0)
	}

}






