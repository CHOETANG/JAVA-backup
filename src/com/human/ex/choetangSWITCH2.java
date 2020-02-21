package com.human.ex;

import javax.swing.JOptionPane;

public class choetangSWITCH2 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수 한개 입력"));
		
		String msg = "0입니다.";
		if (num > 0 ) {
			msg = "양수입니다.";
		} else if (num<0) {
			msg = "음수입니다.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		

	}

}
