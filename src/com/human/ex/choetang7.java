package com.human.ex;

import java.util.Scanner;

public class choetang7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 월수를 넣어주세요");
		int Month = sc.nextInt();
		
		String msg = "";
		
		switch(Month) {
			case 3: case 4: case 5:
				msg = "봄";
				break;
				
			case 6: case 7: case 8:
				msg = "여름";
				break;
			case 9: case 10: case 11:
				msg = "가을";
				break;
			case 12: case 1: case 2:
				msg = "겨울";
				break;
				
				
				default:
					System.out.println("1~12를 입력해 주세요");
					
			
			
		
		}//switch
		
		System.out.println(msg);
		
		
	}//main

}//class
