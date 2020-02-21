package com.human.ex;

import javax.swing.JOptionPane;

public class choetangSWITCH1 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("정수 1 입력"));
		
		
		String op = JOptionPane.showInputDialog("+ - / * 중에 선택하세요");
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("정수 2 입력"));
		
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
						JOptionPane.showMessageDialog(null,"잘못입력하셨네요");
				
					
				
		}//switch
		
		
	}//main

}//class
