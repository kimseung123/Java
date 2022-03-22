package com.sist.exception;
// 423page ��Ƽ��� 
/*
 *   catch(����ó��Ŭ����|����ó��Ŭ���� a2) // ����Ǵ� ������ ������
 *   // ��� �󵵴� ���� ���� 
 */
import java.util.*; //Scanner 
// ������ ������ ��Ű�� => java.lang.* (Object,String,StringBuffer..)
// java.lang , java.util , java.io , java.net , javax....
// java.sql 
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         *   ���ڿ�(next())�� �����͸� �޾Ƽ� => ���� ��ȯ O
         *     NumberFormatException
         *   �迭�� ����   => �迭�� ���� ���� �ִ� 
         *     ArrayIndexOutOfBoundsException
         *   ����� �����͸� ������ => 0���� ���� �� �ִ� 
         *     ArithmeticException 
         *   ������� ����Ѵ� 
         *   
         *    ==> catch 3���̿� 
         *    ==> | �� ���� 
         *    ==> Exception/RuntimeException 
         */
		try
		{
			
			// ��������� ������ �ҽ� 
			Scanner scan=new Scanner(System.in);
			System.out.print("ù��° ���� �Է�:");
			String no1=scan.next(); // 1 => "1"
			System.out.print("�ι�° ���� �Է�:");
			String no2=scan.next();
			
			// �迭�� ���� 
			int[] arr=new int[2];
			arr[0]=Integer.parseInt(no1); // ���ڿ��� ���������� ���� 
			arr[1]=Integer.parseInt(no2);
			
			int result=arr[0]/arr[1];
			System.out.println(result);
			
		 // catch=> ����Ǵ� ���� ó�� ==> ���� 
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		/*catch(NumberFormatException | ArrayIndexOutOfBoundsException 
				| ArithmeticException e)
		{
			e.printStackTrace(); // ������� ��� => �߰��� ���� (���� �ټ�)
		}*/ /*
			 * catch(ArrayIndexOutOfBoundsException e) { System.out.println(e.getMessage());
			 * }catch(ArithmeticException e) { System.out.println(e.getMessage()); }
			 */
		
	}
	/*
	 *   catch => ���� 
	 *   ============= ���� ������ ���� �ö󰡼��� ���� ��� ������ ũ�� 
	 *               Throwable : ������ �ֻ��� Ŭ���� 
	 *                  |
	 *             -------------------------
	 *             |                       |
	 *            Error                 Exception
	 *            ===== ó���� �Ұ��� ����    ===== ó���� ������ ���� 
	 *            �޸� ����,�����⹮��         
	 *            
	 *            Exception 
	 *              |
	 *        =================================
	 *        ����ó���� �ݵ�� ó�� | ����ó���� ó�� ����
	 *          CheckException      UnCheckException
	 *          (javac => �����Ͻ� Ȯ��)  (java => ����� ����)
	 *              |                        |
	 *           IOException               RuntimeException
	 *           SQLException                |
	 *           ClassNotFoundEaception     NumberFormatException
	 *           InterruptedException       ArrayIndexOutOfBoundsException
	 *           ....                       ArithmeticException
	 *           
	 *        ==> ū Ŭ������ �ؿ� �ִ� (������ ���� �Ѵ�)
	 *        
	 *        catch(Exception e){}
	 *        catch(RuntimeException e){}
	 *        catch(IOException e){}
	 *        ============================== ���� 
	 *        
	 *        catch(RuntimeException e){}
	 *        catch(IOException e){}
	 *        catch(Exception e){}
	 *        ============================== ���� ���� 
	 *        
	 *        catch(RuntimeException e){}
	 *        catch(SQLException e){}
	 *        catch(NumberFormatException e){}
	 *        catch(Exception e){}
	 *        ============================== ����
	 *        
	 *        catch(NumberFormatException e){}
	 *        catch(RuntimeException e){}
	 *        catch(SQLException e){}
	 *        catch(Exception e){}
	 *        ============================== ���� ����
	 *        
	 */

}







