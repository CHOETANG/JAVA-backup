package com.human.ex;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class choetang6 {

	public static void main(String[] args) {
		
		 
		String menu = "****코리아 샌드위치****\n";
		menu = menu + "1. 치즈 샌드위치 \n";
		menu = menu + "2.베이컨 샌드위치 \n";
		menu = menu + "3.토마토 샌드위치 \n";
		menu = menu + "4.종료\n";
		
	   //4.종료를 위한 변수"exit = -1 이 되면 종료
		int exit = 0;
		
		while(true) {//exit = 1 ;되기 전까지 무한 반복
			int choice = Integer.parseInt(JOptionPane.showInputDialog(menu + " 번호를 선택")) ;
	
			switch(choice) {
				case 1:
					System.out.println("치즈 샌드위치")	;
					break;
				
				case 2:
					
					System.out.println("베이컨 샌드위치")	;
					break;
				
				case 3:
					System.out.println("토마토 샌드위치")	;
					break;
				case 4:
					exit=-1;
					System.out.println("프로그램 종료")	;
					break;
					
				default:
					System.out.println("1~3번을 입력해주세요");
					//break 생략가능!
					//어차피 마지막으로 switch 문을 탈출하기 때문이다.
			}// switch
			 // while 구문을 탈출하기 위한 break;
			
			  if(exit == -1) {
				  break;
				  
			}
		}// while
		
		
		
	}//main()

}//class
