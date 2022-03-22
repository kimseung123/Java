package com.sist.main;
// FileReader / FileWriter => �ѱ��� �ִ� ������ �аų� , ���Ͽ� ���� 
// �ѱ� => 2byte => �ѱ���(2byte) => ���� ��� ��Ʈ�� 
import java.io.*;
import java.util.*;
// �Ѹ�(��)�� ���� ���� => new�� �̿��ؼ� �޸𸮸� ������ ���� 
// MemberVO , MemberDTO (�Ѹ� ���� ������ ��Ƽ� ���� ����)
// JSP => MemberBean
/*
 *    Ŭ���� : ���α׷� 
 *    1. �����͸� ��� �д� (VO,DTO) => ����
 *    2. ��û�� ���� ó�� => �޼ҵ� 
 *    3. ȭ�� ��� 
 */
class Member{
	private int no;
	private String name;
	private String sex;
	private String addr;
	private String tel;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Member(int no, String name, String sex, String addr, String tel) {
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.addr = addr;
		this.tel = tel;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// => ����Ŭ / �� / Open Api
        ArrayList<Member> list=
        		new ArrayList<Member>();
        list.add(new Member(1, "ȫ�浿", "����", "����", "010-1111-1111"));
        list.add(new Member(2, "�̼���", "����", "�λ�", "010-2222-2222"));
        list.add(new Member(3, "������", "����", "����", "010-3333-3333"));
        list.add(new Member(4, "�Ҽ���", "����", "����", "010-4444-4444"));
        list.add(new Member(5, "������", "����", "��õ", "010-5555-5555"));
        // �ʿ��� ��ġ�� try~catch�� ����Ѵ� (����Ǵ� �κп���)
        try
        {
        	StringBuffer sb=new StringBuffer();
        	File file=new File("c:\\java_data\\address.txt");
        	// ���� ���� => ���� ���� (���� ��� : ���� ����,�ִ� ���: ���)
        	if(!file.exists()) // ������ �ִ��� Ȯ�� 
        	{
        		file.createNewFile(); // ���� ���� 
        	}
        	FileWriter fw=new FileWriter(file);//���Ͽ� ���� 
        	for(Member m:list)
        	{
        		String data=m.getNo()+"|"
        				   +m.getName()+"|"
        				   +m.getSex()+"|"
        				   +m.getAddr()+"|"
        				   +m.getTel()+"\n"; // \n:�Ѹ� ���� , | �ѻ���� ����
        		sb.append(data);
        	}
        	// ���Ͽ� ���� 
        	fw.write(sb.toString());// sb�� ����� ��� �����Ϳ� ��� 
        	fw.close(); // ���� �ݱ� 
        	System.out.println("ȸ�� ��� ���� �Ϸ�!!");
        }catch(Exception ex) 
        {
        	ex.printStackTrace();
        }
	}

}








