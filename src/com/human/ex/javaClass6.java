package com.human.ex;

public class javaClass6 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요");
		
		String str; 
		str = sc.nextLine();
		int i1 = Integer.parseInt(str);
		
		System.out.println("두번째 정수를 입력해");
		str = sc.nextLine();
		int i2 = Integer.parseInt(str);
		
		System.out.println(i1+"  "+i2+"입력한 두수의 합은 "+ (i1 + i2)+"입니다." );
		
		
		
		
		
		

	}

}
