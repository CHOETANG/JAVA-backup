package com.human.ex;

import javax.swing.JOptionPane;

public class choetangSWITCH2 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("���� �Ѱ� �Է�"));
		
		String msg = "0�Դϴ�.";
		if (num > 0 ) {
			msg = "����Դϴ�.";
		} else if (num<0) {
			msg = "�����Դϴ�.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		

	}

}
