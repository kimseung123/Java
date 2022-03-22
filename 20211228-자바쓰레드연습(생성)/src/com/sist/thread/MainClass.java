package com.sist.thread;
// Thread => java.lang.* => import�� �ʿ䰡 ���� 
/*
 *   Thread 
 *   ��� ���α׷��� ���μ��� (���μ����ȿ��� �ٸ� ���� �����ϰ� ����� ����=> ������)
 *                       ====== ���� ���α׷� 
 *   => ���ó (����� ���� ������) 
 *      1. ������ ���� 
 *      2. ��Ʈ��ũ ���� (�������� ���ÿ� ���� => ���)
 *      3. ���� (��Ÿ ==> ����� ...)
 *      4. �� (������ ������ �Ǿ� �ִ�) => ���� ����ڵ��� ����� ���ؼ� 
 *                                   ������ 
 *   => ����� ���� ������ 
 *      = ��� 1
 *          => Thread��� 
 *          class MyThread extends Thread
 *          {
 *               �ڿ� ���� 
 *               �ݵ�� ó�� 
 *               public void run()
 *               {
 *                  ������ �۾� (��ũ ������) => �Ѱ��� �ϸ� ���� 
 *               }
 *          }
 *      = ��� 2
 *         => �������̽� ���� 
 *          class MyThread implements Runnable 
 *          {
 *               Runnable => ����� �޼ҵ� 
 *               public void run()
 *               {
 *                   ���� => ���� 
 *               }
 *          }
 *          
 *      = ��� 3
 *        �͸��� �Լ� ()=> run => ���ٽ� (�Լ����� ��� �ڵ��� ����)
 *        --> ���� : ���� (��ü������ ����� �ִ�)
 *        Runable r=()->{
 *            ���� 
 *        }
 *    => �������� �����ֱ�(����~�Ҹ�)
 *       new Thread()         start()                 run()  sleep()
 *       ������ ����  =======> ��� (�ڿ� Ȯ��) =======> ������ ���� ======> �Ͻ�����
 *             �ڿ�(������ ���۽� �ʿ��� ������)               | interrupt()
 *                                                    ������ �Ҹ�
 *    => ������
 *       1) �񵿱�ȭ : �� (�������� ���� ���ÿ� ����)
 *       2) ����ȭ : ���� (�ѹ��� ����) 
 *       
 *    => �ֿ�޼ҵ� 
 *       ***= start() => ������ => run()�� ȣ�� 
 *       ***= run() => ������ ����(����)
 *       ***= sleep() => �Ͻ� ���� 
 *       ***= interrupt() => ������ ���� 
 *       = currentThread() => ���� �������� �������� �̸��� ������ �´� 
 *       = getName() / setName() => ������ �̸� ���� 
 *                     ========= �˾ƺ��� ���� (����)
 *       = getPriority() / setPriority() => �켱 ���� ���� 
 *         �켱������ 1~10 => (10���� ���� ���� �۾�) 
 *         MAX_PRIORITY  : main() ==> 10
 *         MIN_PRIORITY  : gc()    ==> 1
 *         NORM_PRIORITY : ����� ���� ������ ==> 5 
 *                                                     
 *      
 */
// ����� �޾Ƽ� ó�� 
class MyThread extends Thread
{
	// Ȯ���� ���� => ���� ���� 
	// ����
    public void run()
    {
    	for(int i=1;i<=10;i++)
    	{
    		System.out.println(i+" ");
    	}
    }
}
// �������̽� ���� 
class MyThread1 implements Runnable
{
	// ����
	public void run()
	{
		for(char c='A';c<='Z';c++)
		{
			System.out.println(c+" ");
		}
	}
}
public class MainClass {
    // Thread[main,5,main] => ������ 
	// GC ==> Thread (������ �÷���) ==> ��Ƽ�����带 �����Ѵ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(Thread.currentThread());
		// ����� ���� ������ 
		MyThread m=new MyThread();
		m.start(); // => run() ���� => while() => ���ѷ��� 
		MyThread1 m1=new MyThread1();
		new Thread(m1).start(); // m1�� ������ �ִ� run() ȣ�� 
		/*
		 *   Thread t=new Thread(m1);
		 *   t.start(); 
		 *   
		 *   t == new Thread(m1)
		 */
		
	}

}





