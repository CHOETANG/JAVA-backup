package com.human.ex;

public class Javaclass {

	public static void main(String[] args) {
		//boolean(논리형) 상수 = true, false
		//매개변수가 상수이면 상수를 화면에 그대로 출력하고 줄을 바꾼다.
		System.out.println(true);
		System.out.println(false);

		//char(문자형)  유니코드 1개
		//문자상수는 ''를 사용하여 표시
		System.out.println('a');
		System.out.println("a");
		//유니코드로 출력하고 싶으면 \\u(역슬래시한개)다음에 코드를 넣으면 된다.
		System.out.println('\u0041');//A가 출력됨
		System.out.println('\u0042');//B가 출력됨
		
		//byte, short, int (정수형)은 int형 상수처리
		//int형 상수의 경우 소수점 없는 숫자를 범위에 맞게 기술하면 됨(-1123123 ~ 121200000)
		System.out.println(216548);
		System.out.println(-216548);
		System.out.println(032); //8진수
		//System.out.println(082); 8진수는 7까지 표현
		System.out.println(0x32); //16진수
		//System.out.println(10000000000); 수가 벗어나서 인트형 상수가 아님
		
		//long(정수형)
		//소수점이 없는 숫자에 long 숫자범위를 벗어나지 않는 숫자끝에 소문자 l 또는 대문자L을 붙이면 됨
		System.out.println(10000000000L);
		System.out.println(10000000000000000l);
		
		System.out.println(100);
		System.out.println(100L);
		
		//float(실수형) 상수
		//소수점이 있는 수 끝에 F나 f를 붙여서 표시
		System.out.println(3.14F);
		System.out.println(3.14f);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
	
		//double(실수형) 상수
		//소수점이 있는 수는 double상수, 숫자 끝에 D,d를 넣으면 double상수
		System.out.println(3.14);
		System.out.println(.14);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14D);
		System.out.println(3.14E-4);
		
		//String(문자열)형 상수
		//문자열 상수는 ""로 묶어서 표현
		System.out.println("hello world");
		
		//1, '1', "1" 3가지가 메모리에 올라가 있는 모양은 다르다.
	
		//상수의 연산 + - * / %
		//숫자는 연산이 되고, 문자는 + 연산만 가능
		//(숫자)+(문자)열은 문자열이 됨
		System.out.println(5+3); //수+수=수
		System.out.println(5.1+3.2); //수+문자=문자열
		System.out.println(5+5+"안녕"); //문자+문자=문자열 (10안녕)
		System.out.println("안녕"+5+5); //(안녕55)
		System.out.println("안녕"+(5+5)); //(안녕10)
		
	
	}
	
}
