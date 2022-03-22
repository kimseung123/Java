package com.sist.main;
/*
 * 6. ���� �ڵ尡 ����Ǿ��� �� ��� ����� �����Դϱ�?
public class TryCatchFinallyExample {
	public static void main(String[] args){
    	String[] strArray = { "10" , "2a" };
        int value = 0;
        for(int i = 0; i <= 2; i++ ){
        	try{
            	value = Integer.parseInt(strArray[i]);
            	// i=0 => value=10
            	// i=1 => ���� (NumberFormatException) value=10
            	// i=2 => ���� (�迭 ���� �ʰ�) value=10
            } catch(ArrayIndexOutOfBoundException e){
            	System.out.println("�ε����� �ʰ�����");
            } catch(NumberFormatException e) {
            	System.out.println("���ڷ� ��ȯ�� �� ����");
            } finally {
            	System.out.println(value);
            }
        }
    }
}

1. 10
2. ���ڷ� ��ȯ�� �� ����
3. 10
4. �ε����� �ʰ�����
5. 10


 */
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = { "10" , "2a" };
        int value = 0;
        for(int i = 0; i <= 2; i++ ){
        	try{
            	value = Integer.parseInt(strArray[i]);
            	// i=0 => value=10
            	// i=1 => ���� (NumberFormatException) value=10
            	// i=2 => ���� (�迭 ���� �ʰ�) value=10
            } catch(ArrayIndexOutOfBoundsException e){
            	System.out.println("�ε����� �ʰ�����");
            } catch(NumberFormatException e) {
            	System.out.println("���ڷ� ��ȯ�� �� ����");
            } finally {
            	System.out.println(value);
            }// ���������� �ö� ���� 
        }
	}

}
