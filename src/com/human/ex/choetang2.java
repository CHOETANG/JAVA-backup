package com.human.ex;

import javax.swing.JOptionPane;

public class choetang2 {

	public static void main(String[] args) throws InterruptedException {
		
	/*	//사용자 입력을 받아보자
		//사용자가 키보드로 입력한 데이터를 프로그램에서 받아서 처리하는것
		//int a 
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String str ;
        
        System.out.println("문자열을 입력해주세요 ");
        str = scanner.nextLine();//사용자 입력을 받아 문자열로 리턴해주는 함수
        System.out.println(str+"을 입력하셨습니다.");
        System.out.println("프로그램 종료");
        
        
       
       //사용자입력은 모두 문자열이다 .
       //숫자를 사용자로 부터 받으려면 문자열을 숫자로 변경하는 함수를 사용하자.
        
        System.out.println("정수를 입력해>>");
        str=scanner.nextLine();
        int i1 =Integer.parseInt(str);
        System.out.println("입력한 정수는:"+ i1);
        */
		
		//사용자에게 2 수를 입력받아 더해서 출력해보자.
		
	   java.util.Scanner scanner = new java.util.Scanner(System.in);
	   
	   String A ; String B ;
	   
	   System.out.println("두 정수를 입력해주세요");
	 
	   
	   System.out.println("첫번째");
	   A=scanner.nextLine();
	   System.out.println("두번째");
	   B=scanner.nextLine();
	   
	   int i1 = Integer.parseInt(A) ;
	   int i2 = Integer.parseInt(B) ;
	   
	   System.out.println(i1+i2);
	   
	   scanner.close();
	   
	   
	   
        
       
        
    
     
       
        
      
        
        
        
               
        
        
	}

}
