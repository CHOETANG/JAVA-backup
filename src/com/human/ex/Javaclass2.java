package com.human.ex;

public class Javaclass2 {
	public static void main(String[] args) {
		//����
		//�ڷ��� ������= �ڷ����� ���;
		
		//boolean���� ������ �����ؼ� true�� ����.
		boolean abc=true;
		//������ ����ϴ� ���
		System.out.println(abc);
		//������ bool�� false�� �־ ����.
		//boolean abc2=false (�������� �ĺ����̰� �ĺ��ڴ� �����ؾ���)
		
		//����1. abc2������ ���� ��� �� ���� abc2 ���� true�� ������ �� �ٽ� abc2 ������ ����.
		boolean abc2=false; //boolean ��ɾ�� �� ����
		System.out.println(abc2);
		abc2=true;
		System.out.println(abc2);
		abc2=false;
		System.out.println(abc2);
	
		//����2. abc2���� false�� �����ϰ� abc2���� abc1������ ���� �� abc2���� ����غ���.
		abc2=false;
		abc2=abc;
		System.out.println(abc2); //���� �ִ� abc=true�� �߱� ����Ǽ� abc2=true
		
	
	
	}
}	