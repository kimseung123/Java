package com.sist.lib;

import java.util.StringJoiner;

/*
 *   String 
 *   =======
 *   �� => ���� ����ϴ� �޼ҵ� 
 *   ***1. length() => ���ڰ��� 
 *   ***2. equals() => �� (�α��� , ���̵��ߺ� üũ)
 *   ***3. substring() => ���ϴ� �κ��� ���� �ڸ��� 
 *   4. indexOf() , lastIndexOf() => ��ġ ã�� 
 *   5. valueOf() => �� (���ڿ�) => �ٸ� �������� ���ڿ� ��ȯ 
 *   ***6. trim() => ����� �Է°��� ��������(��������)
 *   7. replace() => ���ں���
 *   8. contains() => ���� ���ڿ��� ã�� ��� 
 *   =================================================
 */
// ��Ÿ 
/*
 *   StringJoiner , Format (MessageFormat,SimpleDateFormat...)
 *   => join (���ڿ� ����)
 *   
 *   �� Ȧ����, �����̾� �ݸ�, ���׵�Ʈ �Ĺ���ġ
 *   
 *   Ŭ���� ��ü��=new Ŭ������();
 *   =====          ========
 *     = �������̽� , �߻�Ŭ���� 
 *   List list=new ArrayList() => �������̽� (List)
 *   Connection conn=DriverManager.getConnection()
 *   
 *   => ��ü��.�޼ҵ� ====> �ν��Ͻ� �޼ҵ�
 *      Ŭ������.�޼ҵ� ===> static �޼ҵ� 
 *      
 *      10<<2  ==> 40 
 *        10*2^2
 *      10>>2  ==> 2
 *        10/2^2 ==> 2
 *        
 *      =================
 *           &(*)   |(+)
 *      =================
        0 0   0     0
        0 1   0     1
        1 0   0     1
        1 1   0     1
 */
public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��¥ => ���� ��¥ [~]
        String name="ȫ�浿,�ڹ���,��û��,�̼���,������";
        String[] names=name.split(",");
        // names={"ȫ�浿","�ڹ���","��û��","�̼���","������"}
        // ��� 
        for(String n:names)
        {
        	System.out.println(n);
        }
        System.out.println("===== JOIN ======");
        String ss=String.join("-",names);//static �޼ҵ�
        System.out.println(ss);
        
        StringJoiner sj=new StringJoiner(",","[","]");
        for(String n:names)
        {
        	sj.add(n);
        }
        System.out.println(sj.toString());
	}

}









