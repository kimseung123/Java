package com.sist.main;
/*
 *   ����ó�� : ������ �����߻��� ���� ���� ���α׷� 
 *            => ������ ���Ḧ ���� �ʰ� ��������� �����ϰ� ����� �ش� 
 *            => ������ ���� => �����Ŀ� ������ ����� 
 *               catch()
 *   ����ó�� : �ڵ���� ������ �ִ� ��쿡 ������ ������ ������ ó��
 *            (������ ����)
 *            
 *            ���� 
 *            ===
 *             1. �������� ���� 
 *                ; , {} , ������ ��θ� , ���� IP  ==> �ݵ�� ����ó�� 
 *                         => CheckException 
 *             2. ����� ���� 
 *                => ����� �Է°� ���� 
 *                => ���α׷��� �Ǽ� 
 *                => UnCheckException
 *   ����ó�� ��� 
 *     1. ���� ���� ==> catch (���� => ���� ������ ��� => ��� ����(����))
 *                           output 
 *        =>
 *            try
 *            {
 *                 ������� ���� 
 *                 => ���� �߻� 
 *            }catch(���� ����)
 *            {
 *                 => 1. ���� ���� ��� (��� ������ �߻� Ȯ��)
 *                    = getMessage() => �������� ��� 
 *                      => �и� (�޼ҵ带 ����ȭ) => �ܶ� 
 *                    = printStackTrace() => ��������� ��� (���ߴ� ���� => �ڵ���ġ)
 *                 => 2. ���� ���� (�ٽ� �Է�â���� ����)
 *                    = ������ ���� (Jsoup(����),�����Ͽ�(����))
 *                    = ���� (�������� Ŭ����) = ~VO
 *                 => ���� Ȯ�� (�ڵ� ����)
 *            }
 *            *** catch���� ������ ����� ���� (����Ǵ� ����ó��)
 *            *** ���� => Exception,Throwable
 *            finally 
 *              = ���� �ݱ� , ����Ŭ �ݱ� 
 *              = ���� �ݱ� 
 *     2. ���� ȸ�� (throws=> ���� �����ϱ�)  => 427page 
 *        => ���� ó���ϴ� �κ��� �ƴϰ� �̷� ������ �߻��Ұ� ���� JVM�� �˷��ִ� ���� 
 *        => ���� 
 *           �޼ҵ�() throws ��������1,��������2... => �������� ����� ���� 
 *                  =========================
 *           ó�����
 *             => 1. ���� (���� ȸ��) 
 *                2. try~catch�� �̿��ؼ� ó���� �����ϴ� 
 *                3. �⺻�� �����ϴ� 
 *                   ��)
 *                      public void display() 
 *                        throws NumberFormatException,ClassCastException
 *                      => display�� ����Ϸ��� ����ó���ϰ� ��� �Ѵ�
 *                      
 *                      NumberFormatException,ClassCastException
 *                      ========================================
 *                         ���� => RuntimeException => Exception => Throwable
 *                      public void main()
 *                      {
 *                         display(); // ������ ���� 
 *                      }
 *                      public void main() throws NumberFormatException,ClassCastException
 *                      {
 *                          display()
 *                      }
 *                      
 *                      public void main()
 *                      {
 *                         try
 *                         {
 *                             display()
 *                         }catch(NumberFormatException e){}
 *                          catch(ClassCastException e){}
 *                      }
 *                      
 *                      public void main() throws RuntimeException
 *                      {
 *                          display()
 *                      }
 *                      *****
 *                      public void main() throws Exception
 *                      {
 *                         display()
 *                      }
 *                      
 *                  Throwable 
 *                  =========
 *                     |
 *               -------------------
 *               |                 |
 *             Error          Exception
 *                               |
 *                         �ݵ�� ����ó��
 *                         CheckException             UnCheck(����)
 *                       --------------------||||||||-----------
 *                       |                             |
 *                     IOException               RuntimeException
 *                     SQLException                    |
 *                     ClassNotFoundException        NumberFormatException
 *                                                   ClassCastException
 *             => ��Ŭ�������� �˷��ش� 
 *     3.  ����� ���� ����ó�� 
 *         => extends Exception 
 *         => catch���� ���ÿ� �ڵ����� ã���� ���Ѵ� 
 *         => throw => ����ó�� ȣ�� 
 */
public class MainClass {
    // ���ܰ� �ִ� �޼ҵ� ���� (���̺귯�� �޼ҵ�) => �ڹٿ��� ����, �ܺ� ����
	public static void add(int a,int b) throws Exception
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);// b==0
	}
	// sleep(long m) throws InterruptedException
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        try {
			add(10,20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}






