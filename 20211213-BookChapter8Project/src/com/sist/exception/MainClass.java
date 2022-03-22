package com.sist.exception;
/*
 *    ���α׷� : �����߻� (33���) ����Ʈ���� 
 *    1,000 ==> 10,00 
 *    ===============================
 *      �����߻� 
 *        = ����(Error) => �ҽ��󿡼� �ذ��� �� ���� ����
 *           ��) �޸� ���� , ��Ŭ�����󿡼� ����  
 *        = ����(Exception) => �ҽ��󿡼� �ذḮ ������ ������ ���� 
 *          ==============
 *           ��)  1. ����� �Է°��� �߸��� ��� (��ȿ�� �˻�)
 *                   ������ => 10/0 => 0���� ���� �� ���� 
 *               2. ���α׷����� �Ǽ� 
 *                   �迭 ���� �ʰ� 
 *                   int[] arr=new int[2];
 *                   arr[2]=100;      == 0,1
 *                   => ��Ʈ��ũ , �����ͺ��̽� => ip (ip�� Ʋ���� ����(X))
 *                   => File�� ��θ� �߸�
 *                   => SQL���� (����Ŭ) 
 *       = �ڹ� => ���� (2��)
 *         A.java ========> A.class ==========> ����
 *         ======  ������(javac)       ���پ� �о ����(����������) 
 *                                        java
 *         ���üҽ� : ���α׷��Ӹ� �˰� �ִ� �ҽ� 
 *                          ========
 *                          ����Ʈ �ڵ�(��ǻ�Ͱ� �� �� �ִ� ���) 
 *                          
 *         => ������ ���� (��������) ==> CheckExeption 
 *                => �ݵ�� ����ó���� ����Ѵ� (�ʼ�)
 *         => ��Ÿ�� ���� (����� ����) ==> UnCheckException
 *                => �ʿ�ÿ� ���� ���� ó���� �Ѵ� (�ʼ��� �ƴϴ�)
 *                
 *         CheckException 
 *           => java.net(��Ʈ��ũ)
 *           => java.io (���� �����) 
 *           => java.sql (����Ŭ ����)
 *         UnCheckException
 *           => NumberFormatExeption => ���ڿ��� ������ ���� 
 *                   => �� , ������ (������ ���� => ���ڿ�) 
 *                   => Integer.parseInt("10");
 *                      Integer.parseInt("10 ");
 *                      list.jsp?page=1  => "1" , " 1"
 *           => class A
 *              {
 *                 public void display(){}
 *              }
 *                
 *              A a; => A a=new A();
 *              a.display();  => NullPointerException
 *              
 *           => int[] arr=new int[2];
 *              arr[2]=100;   ====== 0,1
 *              ArrayIndexOutOfBoundsException
 *              
 *           => 10/0 => ArithmeticException 
 *          ===========================> 414page
 *        ==> ����ó�� => ������ �ִ� 
 *            ����ó���� �������� ==> 415page 
 *                    Object
 *                      |
 *                   Throwable
 *                      |
 *               ===================
 *               |                 |
 *             Error          Exception
 *                                 |
 *                          ===================
 *                          |                 |
 *                        (CheckException) (UnCheckException)
 *                          |
 *                         IOException
 *                          => ����,�޸�,��Ʈ��ũ
 *                         URLMalformedException
 *                          => ����Ʈ �ּ� Ʋ�� ��� 
 *                         SQLException 
 *                          => ����Ŭ ���� 
 *                         ClassNotFoundException
 *                         
 *                         (UnCheckException)
 *                            |
 *                           RuntimeException 
 *                            |
 *                            NumberFormatException
 *                            NullPointerException
 *                            ArithmeticException
 *                            ArrayOutOfBoundsException
 *            ����ó�� ��� ==> 416page
 *            ==========
 *             ***= ���� ���� ( try~catch ) : ���� ���� ��� 
 *                => ���� ó��
 *             ***= ���� ȸ�� ( throws )
 *                => ���� ó��  
 *             = ���� ����� (throw)
 *                => ���� ������ ( ���� )
 *             = ����� ���� ���� (�ڹٿ��� �Ϻ��ϰ� ����ó���� �������� �ʴ´�)
 *               class MyException extends Exception 
 *               
 *               
 *       ����ó�� ��� 
 *       ==========
 *        ���� : ������ ���Ḧ �����ϰ� ���� ������ �����ϰ� ����� 
 *        ���� : ������ ����Ǵ� ������ �����ϱ� ���� ����� 
 *        
 *        �䱸���� �м�  ===> �����ͺ��̽� ���� =====> ������ ���� 
 *              (����Ʈ)   ===> ����Ŭ 
 *        ====> ȭ�� UI =========> ���� ======> �׽��� ====> ����(��ǥ)
 *           ==> HTML/CSS       �ڹ� / JS                   AWS
 *                              ========
 *                              �� ���α׷� 
 *        �䱸���� �м� ==> � ������ �߻��� �� (����)
 *        
 *       ����ó�� ���� 
 *       1) ����ó��(���ܺ���) => try~catch~finally(������ ����)
 *       
 *       try
 *       {
 *          ��������� ������ �ҽ� (���ݱ��� �ڵ��� ����)
 *          ==> ���� �߻� 
 *              ���α׷��� �Ǽ� , ����� �Ǽ� 
 *       }catch(����ó���� ����) ==> ������ ����� ���� (����Ǵ� ����)
 *       {
 *          ==> ���� ó�� ==> ���� 
 *       }
 *       finally
 *       {
 *          ==> ���� ���� , ������ ���� => ������ ���� 
 *              ��Ʈ��ũ ���� ���� , ����Ŭ ���� ���� 
 *       }
 *       
 *       ���� (���� ����)
 *          
 *        
 *        
 *        => 
 *        try
 *        {
 *           1. ������� �Է°� �ޱ� (���� 2��)
 *           2. �ΰ��� ������ �迭�� ���� (�迭 ���� �ʰ�) 
 *                ===> �����߻�  
 *                int[] arr=new int[2];
 *                arr[0]=10;
 *                arr[2]=0; ======> catch�� �̵� 
 *          ============================================
 *           3. �迭�� ��ϵ� ������ ������ (0���� ���� �� �ִ�)
 *           4. ������� ���  
 *          ============================================
 *           
 *        }catch(�迭 ���� �ʰ�)
 *        {
 *           ó�� ===>  ó�� (���� ����)
 *        }catch(0���� ���� ���)
 *        {
 *           ó��
 *        }
 *        finally
 *        {
 *           try,catch�� ������� ������ �����ϴ� ���� 
 *        }
 *        
 *        |
 *       �ۿ� �ִ� ���� ����
 *       
 *       public static void main(String[] arg)
 *       {
 *            1) ����  ==> ����
 *            2) ����  ==> ����
 *            try
 *            {
 *               3)���� ==> ���� 
 *               4)���� ==> ����ó�� ����1 �߻� catch�̵� 
 *               5)����
 *            }catch(���� ó�� ����1)
 *            {
 *               6)���� ==> ���� 
 *            }
 *            catch(���� ó�� ����2)
 *            {
 *               7)����
 *            }
 *            finally
 *            {
 *               8)���� ==> ���� (������ ����) => ������ ���� 
 *            }
 *            
 *            9)����  ==> ����
 *            10)���� ==> ���� 
 *            
 *            1-2-3-6-8-9-10 ==> ���� ���� 
 *       }
 *        
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  try
	  {
        int[] arr=new int[2];
        arr[0]=Integer.parseInt("10 ");
        arr[2]=0; // ���� ��� (�迭 ���� �ʰ�)
        int result=arr[0]/arr[1]; // error ==> catch 2
        System.out.println(result);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println(e.getMessage());// �����޼��� ��� 
	  }catch(ArithmeticException e)
	  {
		  System.out.println("0���� ���� �� �����ϴ�!!");
	  }
	  catch(Exception e) // ����ó���� ���� Ŭ���� => 
      // ��� ���ܸ� ó�� �� �� �ִ�
	  {
		  System.out.println(e.getMessage());
	  }
	  
      System.out.println("���α׷� ����!!");
	}
	/*
	 *      Throwable
	 *      =========
	 *      |       |
	 *    Error   Exception
	 *              |
	 *            RuntimeException(������ ����ó��)
	 *              |
	 *              (�Ѱ��� ó��)
	 *            ArrayIndexOutOfBoundsException
	 *            ArithmeticException
	 */

}







