package com.sist.lib;
// MessageFormat => ������� 
import java.util.*;
import java.text.*;
public class MainClass10 {
    /*
     * 
     *   �̸� : ȫ�浿
     *   ��ȭ��ȣ: 000-1111-1111
     *   �ּ� : ���� 
     *   ���� : ���� 
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// insert / update
        /*String msg="�̸�:{0}\n��ȭ��ȣ:{1}\n�ּ�:{2}\n����:{3}";
        Object[] obj={"ȫ�浿","010-1111-1111","����","����"};
        String res=MessageFormat.format(msg, obj);
        System.out.println(res);*/
		String pattern="INSERT INTO Member VALUES({0},''{1}'',''{2}'',"
				      +"''{3}'',''{4}'',{5})";
		Object[] obj= {1,"�̼���","����","����","010-1111-1111",25};
		String res=MessageFormat.format(pattern, obj);
		System.out.println(res);
        
	}

}
