package com.human.ex;

public class choetang {

	public static void main(String[] args) {
		
		//자동 형변화
		byte b1 = 10; //자료형이 다르면 변수에 값을 넣을 수 없다.
		short s1=  10;//자동 형변환 되어 들어간다.
		char c1 = 10;//정수형 자료형은 int 형 상수가 자동으로 형변환 되어 들어간다/
		int i1 = 10; //4byte
		long l1 = 10;//8byte
		// 안되는 경우
		//int i2 = l1; //작은 데이터를 큰데이터에 넣으면 자동 형변환 된다.
					   //반대의 경우는 자동 형변환 되지 않는다.
		
		//b1=i1 ;
		//b1 = s1;
		i1= i1+1; 
		i1= i1+i1 ; 
		//b1= b1+b1 ; int 크기보다 작은 자료형 연산은 
		            // int로 자동 형변환된다  byte+byte = int
					//short + short = int		
	    //i1=l1+10;   //long + int = long
		l1=l1+i1;
		c1='A' +1 ;  //char + int = int -> char 
		c1='A' + 'b' ; 
		c1='가' + 'B' ; 
		System.out.println(c1);
		//실수
        float f1=10.F; //4byte
        double d1=10. ;//8byte
        
        d1=f1; // double = float;
        //f1=d1; //error
        f1=i1; d1=i1; f1=l1 ; d1=l1;
        
        //i1=f1; i1=d1; //error
        
        String str1 = "10";
        //error str1 = i1 ; //error 
        str1 = str1 + 10 + 10 ;//10 10 10 
        str1 = 10 + 10 +str1 ; //2010
		//int + string = string
        //string + int = string
        //float + string = string
        
        
        //강제 형변환 " 캐스팅 (casting)
        //사용방법은 (자료형) 소괄호안에 변경하고자 하는 자료형을 넣어준다
        b1=(byte)(b1+b1); 
        i1=(int)l1; // 크기가 달라서 손실이 생길수 있다. 
        f1=3.14f;
        i1=(int)f1;
        System.out.println(i1);
        f1=i1; 
        System.out.println(f1);
        
        f1=(float)d1;
        System.out.println(f1);
        
        //숫자 자료형을 문자열로 변환하는방법
        String str3 = f1+"" ;
        str3="10" ; 
        i1=Integer.parseInt(str3); //i1이 정수 10이 된다.
        i1=Integer.valueOf(str3);//pareseInt 와 같은의미
        str3="1.14";
        d1=Double.parseDouble(str3); // d1이 실수 1.14가 된다.
        System.out.println(str3);
        
        str3="1.14hi"; // 잘못된 문자열을 사용하면 문제가 발생함
        
        System.out.println(str3);
        
        
        
	}

}
