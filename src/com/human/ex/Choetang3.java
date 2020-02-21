package com.human.ex;

public class Choetang3 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
															
		System.out.println("당신의 이름은 무엇입니까?");
		String d ;
		d=sc.nextLine();
		System.out.println("당신의 몸무게는"+ d +"입니다.");
		
		
		String a ;
		System.out.println("당신의 나이는 몇살입니까?");
		a=sc.nextLine();
		System.out.println("당신의 나이는"+ a +"입니다.");
		
	
		System.out.println("당신의 키는 얼마입니까?");
		String b ; 
		b=sc.nextLine();
		System.out.println("당신의 키는 "+b+"입니다.");
		
		
		System.out.println("당신의 몸무게는 얼마입니까?");
		String c ;
		c=sc.nextLine();
		System.out.println("당신의 몸무게는"+ c +"입니다.");
		
		System.out.println("당신의 이름은"+d+"이고"+", 나이는"+ a +"키는 "+ b + "몸무게는"+ c +"입니다.");
		
		
		
		sc.close();
		
		
		
		
                    
	}

}
