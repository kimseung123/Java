package com.sist.main;
// Object������ ���� 
// Object������ �б� 
/*
 *    �����ϴ� Ŭ���� 
 *      ObjectInputStream  ==> Object readObject() , close()
 *      ObjectOutputStream ==> void writeObject(Object obj) , close()
 *      
 *      ======
 *       ȫ�浿
 *      ======      ����ȭ  writeObject(Object obj)
 *       ����        ===>   =================
 *                  <===    ȫ�浿 | ���� | 25   
 *                  ������ȭ ================= Object readObject()
 *      ======
 *       25
 *      ======
 */
import java.util.*;
import java.io.*;
// implements Serializable : ����ȭ�� ���� ��û
class Sawon implements Serializable{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	// ������ => �������� �����ε�
	//1.default 
	public Sawon(){}
	//2.�Ű����� ==> ���� ä��� 
	public Sawon(int sabun, String name, String dept, String loc, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� ���� ArrayList => �����͸� ���� => ��°�� ���Ͽ� ���� 
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1, "ȫ�浿", "���ߺ�", "�λ�", 3000));
		list.add(new Sawon(2, "�ڹ���", "������", "����", 7000));
		list.add(new Sawon(3, "������", "�����", "����", 8000));
		list.add(new Sawon(4, "�̼���", "��ȹ��", "��õ", 3500));
		list.add(new Sawon(5, "�����", "�ѹ���", "���", 4000));
		
		try
		{
			// ���� ����� 
			File file=new File("c:\\java_data\\sawon.txt");
			// ���� ���� ���� Ȯ�� 
			if(!file.exists()) // ������ �������� �ʴ� ��� 
			{
				file.createNewFile();
			}
			FileOutputStream fos=
					new FileOutputStream(file);
			ObjectOutputStream oos=
					new ObjectOutputStream(fos);
			// ������ �о� �´� 
			// ���Ͽ� ArrayList�� ���� 
			oos.writeObject(list);
			fos.close();
			oos.close();
			System.out.println("��ü ���� ���� �Ϸ�!!");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}







