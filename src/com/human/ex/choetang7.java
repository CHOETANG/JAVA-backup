package com.human.ex;

import java.util.Scanner;

public class choetang7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �־��ּ���");
		int Month = sc.nextInt();
		
		String msg = "";
		
		switch(Month) {
			case 3: case 4: case 5:
				msg = "��";
				break;
				
			case 6: case 7: case 8:
				msg = "����";
				break;
			case 9: case 10: case 11:
				msg = "����";
				break;
			case 12: case 1: case 2:
				msg = "�ܿ�";
				break;
				
				
				default:
					System.out.println("1~12�� �Է��� �ּ���");
					
			
			
		
		}//switch
		
		System.out.println(msg);
		
		
	}//main

}//class
