package com.sist.main;
/*
 *    page 20 
 *    ���� => �Ѱ��� �����͸� �޸� ����
 *    ����/��� 
 *    === ===
 *    �����ؼ� ��� , ��� : ���� �� �� ���� ��
 *    int a=10; ����
 *    final int A=10; ��� => ��� (����� �빮��)
 *    
 *     ================================== 26apge 
 *     = Ŭ������ ù�� �빮�� 
 *     = �޼ҵ� ,������ �ҹ��� 
 *     = ��� ��� �빮�� 
 *     = �ΰ��� �ܾ� => �����ϴ� �ܾ �빮�� 
 *       filaName , FileName
 *       file_name
 *     ==================================
 *     ���� ���� 
 *     int a=10;  10�� a�� ���� 
 *     ������ ������ �϶� 
 *     int a;
 *     int b;
 *     int c;
 *     
 *     ==> int a,b,c;
 *     
 *     int a=10;
 *     int b=20;
 *     int c=30;
 *     
 *     ==> int a=10,b=20,c=30;
 *     
 *     25page �ĺ��� (����) 
 *     1. ���ĺ� ���� (��ҹ� ����) , �ѱ� (����X) => window / linux
 *        => AWS (�ü��) => linux 
 *     2. ���� ����� ���� (�տ� ��� ����) 
 *     3. Ư�� ���� ����� ���� ( _ , $) ==> _
 *     4. Ű����� ��� ���� (������ ������)
 *     
 *     27 page (�⺻ ��������,����������(Ŭ����,�迭)
 *     28 page (�⺻��) => ��ǥ => 29page ũ�� 
 *     32 page ���̾� 
 *             L(l) => long , F(f) => float
 *     57 page
 *        \t , \n , \"  , \\ (��θ�)
 *     82 page => ����ȯ (83 page)
 *        String 
 *        7+""+10.5+""+'A' == "710.5A"
 *        byte < char < int < long < float < double < String
 *   ============================ 3��
 *   87page �������� ���� 
 *   (type) => ����ȯ 
 *   ? :    => ���� ������
 *   instanceof => ��ü ũ�� �� 
 *   
 *   Object obj=new Object();
 *   String s=new String();
 *   StrinBuffer sb=new Stringbuffer()
 *   
 *   if(s instanceof Object) => is-a (true)
 *   if(obj instanceof String) => false
 *   if(sb instanceof Object) => true
 *   if(obj instanceof StringBuffer) => false
 *   if(s instanceof StringBuffer) => ���� 
 *   
 *   *** Object : ��� Ŭ������ ���� Ŭ���� (��� ���������� ���� �� �ִ�)
 *   Object a=10
 *   Object a=10.5
 *   Object a=10.5f
 *   Object a='A'
 *   Object a=new MainClass4()
 *   
 *   92page => ����ó���� ����ȯ 
 *          *** int����(char,byte,short) => �������� int
 *          
 *   93page => ���� 
 *             ��ġ : ���� �����Ŀ� �ٸ� ���� ���� (++a)
 *             ��ġ : �ٸ� ������ ���� ���߿� ���� (a++)
 *             
 *   97page => ��� ������ 
 *             /  => ����/����=���� , 0���� ������ ����
 *             %  => ����� ������ ��ȣ�� ���󰣴� 
 *   109page => �� ������ ( == , !=, < , > , <= , >=) => true/false
 *   114page => �������� (&&:����,||:����)
 *              => 118page (ȿ������ ����)
 *                 false &&
 *                 true &&
 *   130page => ���� ������ 
 *              (����) ? ��1:��2
 *              ������ true=��1
 *              ������ false=��2
 *   133page => = , += , -= (�������� ���ÿ� �����Ҷ�)
 *              i++ => 1����
 *              ++i => 1���� 
 *              i+=2 => 2����  => i=i+2
 *              i+=5 => 5     => i=i+5
 *   ========================================================
 *   4��
 *    ��� 
 *    ���ǹ� 136page�� ����  if
 *         140page�� ����   if~else
 *         141page        if~else if ~ else if ~else
 *    �ݺ��� 157page for 
 *          166page for-each
 *          167page while
 *    break
 *    ========================================================
 *    5�� �迭 ==> 182,183page => �ʱⰪ , ������ (1�� �迭)
 *    
 *     6�� ~ 7�� ~ 8�� 
 *     ==============
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * double d=123456.78; int i=(int)((d-123456)*100); System.out.println(i);
		 */
		int a=10;
		int b=9;
		if(a<b || ++b==a)
		{
			System.out.println("ó�� �Ϸ�");
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}








