package com.sist.main;
import java.sql.*;
// ����Ŭ => ���� ���� 
/*
 *    1. ���� ���� 
 *    2. ���� �ο�  ==> session , resource , connect 
 *                ==> users 
 *    3. �ý��� => ����� �������� ���� 
 *    4. �����͸� ���� => ����� ��Ī(���̺�:����)
 *    
 *    
 *    => �˻� (Sql plus) => ������ �������� ���� 
		����� ��:system 
		��й�ȣ:happy 
		==> ���� �޼��� 
		1. ����� ���� ���� 
		alter session set "_ORACLE_SCRIPT"=true;
		2.  create user hr identified by happy;
		                   == user           ===== password
		3. ���� �ο�
		   grant create session to hr;
		   grant connect,resource to hr;
		   alter user hr default tablespace users quota unlimited on users;
		4. ���� 
		    conn hr/happy
		   @c:\oracleDev\emp.sql
		=============================
		5. Ȯ�� 
		   => ����(���̺�)
		       => EMP : ��� ���� 
		      => DEPT : �μ����� 
		      => SALGRADE : ���(ȣ��)
		   SELECT * FROM dept

 */
// ������ => SQLDeveloper
// �ڹٷ� ����Ŭ ���� ==> ojdbc8.jar
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//1. Driver ��� 
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	//2. ����Ŭ ����
        	String url="jdbc:oracle:thin:@211.63.89.99:1521:XE";
        	Connection conn=DriverManager
        			       .getConnection(url,"hr","happy");
        	//3. ����Ŭ ��ɾ� ���� 
        	PreparedStatement ps=conn.prepareStatement("SELECT * FROM dept");
        	//4. ���� ������� ������ �´�  
        	ResultSet rs=ps.executeQuery();
        	while(rs.next()) {
        		System.out.println(rs.getInt(1)+" "
        	              +rs.getString(2)+" "
        	              +rs.getString(3)); // => �������� ���� (�� ���α׷�)
        		// �ٽ� 
        		// ����Ŭ ==> MySQL , MariaDB => ���� (�������)
        		// ������� , DB2(��뷮 �����ͺ��̽�) 
        		// NoSQL => ������ , ī���� ==> ������ 
        		// ����Ŭ ���� : ���α׷� ���(Java) , Front -> NodeJS
        	}
        }catch(Exception ex){}
	}

}
