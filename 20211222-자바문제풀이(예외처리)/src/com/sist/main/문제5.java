package com.sist.main;
/*
 * 5. ������ ���� �޼ҵ尡 ���� �� ���ܸ� �߸� ó���� ���� �����Դϱ�?
public void method1() throws 
  NumberFormauException,       ClassNotFoundException { ... }
  =====================UnCheck ======================= Check
�� try{ method1(); } catch (Exception e) { }
�� void method2() throws Exception { method1();  }
�� try{ method1(); }  catch (ClassNotFoundException e) { }
                     catch (Exception e) { }
   => ���� 
�� try{ method1(); } catch (ClassNotFoundException e) { } 
                    catch (NumberFormauException e) { }

 */
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
