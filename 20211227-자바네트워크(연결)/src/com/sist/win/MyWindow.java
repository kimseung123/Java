package com.sist.win;
import javax.swing.*;
/*
 *     Container : ���� ���� (Spring) ==> awt=>swing=>javaFx
 *       =>  ������ â 
 *           => �⺻â : JFrame 
 *           => Dialog 
 *           => JWindow
 *           => JPanel
 *     Component
 *       => ����� ������ �ִ� 
 *           => JButton , JMenu , JRadioButton , JCheckBox 
 *           => JTextArea , JTextField , JEditPane , JTextPane
 *              =========                =========   =========
 *               �޸���                     ������         ī��
 *       => ��� ��� 
 *          =======
 *          1. JTable : ������ ��� 
 *          2. JTree  : Ž���� 
 *          3. �׸� , ���� : JLabel 
 *    =========================================================
 *           
 */
public class MyWindow {
	JFrame f=new JFrame(); //has-a
    public MyWindow()
    {
    	f.setSize(640, 480);
    	f.setVisible(true);// �����츦 ���� �޶� 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ ȣ�� 
		new MyWindow();
	}

}






