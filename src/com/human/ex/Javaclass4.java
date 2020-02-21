package com.human.ex;

public class Javaclass4 {
	public static void main(String[] args) {
		int a,b;
		//1.
		a=10; b=3;
		System.out.println(a/b);
		System.out.println(a%b);
		//2.
		a=3;
		System.out.println(a*a*a);
		//3.
		int x,y,z;
		x=1; y=2; z=3;
		System.out.println(x*y-z);
		//4.
		int p=375; 
		int p1,p2,p3;
		p1=p/100;
		p2=p/10%10;
		p3=p%10;
		System.out.println(p1+"¹é"+p2+"½Ê"+p3);
		//5.
		double d=10;
		System.out.println((d*d*d-20)/(d-7));
		//6.
		double a1=10;
		double b1=20;
		double a2=30;
		double b2=40;
		double d1=Math.sqrt(((a1-a2)*(a1-a2))+((b1-b2)*(b1-b2)));
		
		
	}
}