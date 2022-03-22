package com.sist.server;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+":"+getName());
			// getName() => ������� (JVM => �ڵ����� �ο����� �̸�)
			try
			{
				Thread.sleep(100);
			}catch(Exception ex) {}
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread m1=new MyThread();
        m1.setName("ȫ�浿-������");
        System.out.println("m1:"+m1.getName());
        m1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("m1:"+m1.getPriority());
        MyThread m2=new MyThread();
        m2.setName("�̼���-������");
        System.out.println("m2:"+m2.getName());
        System.out.println("m2:"+m2.getPriority());
        MyThread m3=new MyThread();
        m3.setName("�ڹ���-������");
        m3.setPriority(Thread.MIN_PRIORITY);
        System.out.println("m3:"+m3.getName());
        System.out.println("m3:"+m3.getPriority());
        
        // �۾��� ��Ų�� ==> 1~10���� ����ϴ� �۾� => ��ũ������ 
        // => ���������� ��� (��û �޾Ƽ� => ó�� => ������� �����ش�)
        // => Ŭ���̾�Ʈ���� 1���� ���� => 100<=>������ ����
        m1.start(); // => run����
        m2.start(); // => run����
        m3.start(); // => run���� 
	}

}











