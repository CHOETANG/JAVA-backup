package com.human.ex;

import javax.swing.JOptionPane;

public class choetangSWITCH1 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("���� 1 �Է�"));
		
		
		String op = JOptionPane.showInputDialog("+ - / * �߿� �����ϼ���");
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("���� 2 �Է�"));
		
		switch(op){
			case "+":
				JOptionPane.showMessageDialog(null,(String.format("%d + %d = % d ",num1, num2, num1+num2)));
					break;						
					case "-":
				JOptionPane.showMessageDialog(null,(String.format("%d - %d = % d ",num1, num2, num1-num2)));
					break;
			case "/":
				JOptionPane.showMessageDialog(null,(String.format("%d / %d = % d ",num1, num2, num1/num2)));
					break;
			case "*":
				JOptionPane.showMessageDialog(null,(String.format("%d * %d = % d ",num1, num2, num1*num2)));
					break;
				
					default:
						JOptionPane.showMessageDialog(null,"�߸��Է��ϼ̳׿�");
				
					
				
		}//switch
		
		
	}//main

}//class
