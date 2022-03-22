package com.sist.ann;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME) // ����Ⱓ 
/*
 *   RUNTIME : �޸𸮿��� �����Ǵ� �Ⱓ => ���α׷� ����ñ��� ����
 *             (�������� ��Ÿ���� �⺻)
 *   ========= 
 *   CLASS
 *   SOURCE 
 *   ========= �޸𸮿��� �����Ǵ� �Ⱓ => �������ϰ� �ٷ� �޸� ���� 
 */
@Target(METHOD) //���� (����� ����)
/*
 *   ������̼� => �ε��� (������ ���� => ã��) => ���и� �ϴ� 
 *   ã�� ��� => �ٷ� ���� �ְų� ���� �����Ѵ� 
 *   
 *   TYPE
 *   METHOD
 *   FIELD 
 *   CONSTRUCTOR
 *   PARAMETER
 *   
 *   @  ===> TYPE
 *   public class A
 *   {
 *       @ ==> FIELD
 *       B b=new B();
 *       
 *       @ ==> CONSTRUCTOR
 *       public A(){}
 *       
 *       public A(@ ==> PARAMETER B b){}
 *       
 *       @ ==> METHOD
 *       public void display()
 *       {
 *       }
 *   }
 */
// �޼ҵ� ã�� 
/*
 *     ==> �޼ҵ� �̸��� ���� ȣ���� ���� 
 *     @RequestMapping("a")
 *     public void aaa(){}
 *     @RequestMapping("b")
 *     public void bbb(){}
 *     @RequestMapping("c")
 *     public void ccc(){}
 */
public @interface RequestMapping {
  // ���� 
	public String value();
}










