package com.human.ex;

public class choetang8 {

	public static void main(String[] args) {
		//String.format() 새로운 문자열을 만드는 함수
		String str1= String.format("안녕 내이름은 %s", "홍길동");
		
		System.out.println(str1);
		//여러개 문자열 처리
		
		str1=String.format("안녕 내이름은 %s 이고 사는곳은 %s다니는"
				+"학교는 %s 입니다.","홍길동","대전이고 ","휴먼");
		System.out.println(str1);
		
		str1=String.format("나이는 %d", 20);
		System.out.println(str1);
		//%s는 문자열
		//%d는 정수
        //%f는 실수
		str1=String.format("나이는%d, 키는 %f ", 20, 170.3);
		System.out.println(str1);
		
		int i1=30;
		double d1=3.141592;
		String str2="안녕하세요";
		//String.format를 사용해서 3개를 출력해보자.
		
		str1=String.format("나이는 %d, 원주율은 %f, %s ",i1,d1,str2);
		System.out.println(str1);
		
		str1=String.format(" :%d, %10d: %10d ",i1,i1,i1);
		System.out.println(str1);
		
		str1=String.format(" :%f :%.3f : %3.3f :",d1,d1,d1);
		System.out.println(str1);
		
		str1=String.format("%%\"");
		System.out.println(str1);
		
		
		
		
	}

}
