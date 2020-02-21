package com.human.ex;

public class Javaclass3 {
	public static void main(String[] args) {
		//byte, short
		byte b1=10;
		b1=10; //할당되지 않은 변수는 사용될 수 없다.
		System.out.println(b1);
		
		short s1=11;
		System.out.println(s1);
		
		int i1=10;
		System.out.println(i1);
		
		i1=20;
		i1=3*20+10; //연산식이 실행된 다음에 i1에 저장됨
		i1=10+3*20; //우선순위가 고려되어 실행됨
		System.out.println(i1);
		
		//문제1. i1의 값을 10으로 변경
		i1=10;
		//문제2. 기존 i1값에 10을 추가하여 i1에 저장
		i1=10+i1;
		i1=i1+10; //i1+=10;
		//문제3. i1값을 출력
		System.out.println(i1);
		//문제4. i2 변수를 선언하여 10을 넣어라
		int i2=10;
		//문제5. i2와 i1을 더한 값을 새로 선언한 i3에 넣어라
		int i3=i1+i2;
		//문제6. i3을 출력해보자.
		System.out.println(i3);
		
		long l1=10l;
		System.out.println(l1);
		
		//float a=1.4; //error
		float a=1.4f;
		System.out.println(a);
		
		double b=3.14;
		System.out.println(b);
		
		String str="helloworld";
		System.out.println(str);
		
		System.out.println(Math.sqrt(9));
		
		
	}
}