package com.human.ex;

public class Javaclass {

	public static void main(String[] args) {
		//boolean(����) ��� = true, false
		//�Ű������� ����̸� ����� ȭ�鿡 �״�� ����ϰ� ���� �ٲ۴�.
		System.out.println(true);
		System.out.println(false);

		//char(������)  �����ڵ� 1��
		//���ڻ���� ''�� ����Ͽ� ǥ��
		System.out.println('a');
		System.out.println("a");
		//�����ڵ�� ����ϰ� ������ \\u(���������Ѱ�)������ �ڵ带 ������ �ȴ�.
		System.out.println('\u0041');//A�� ��µ�
		System.out.println('\u0042');//B�� ��µ�
		
		//byte, short, int (������)�� int�� ���ó��
		//int�� ����� ��� �Ҽ��� ���� ���ڸ� ������ �°� ����ϸ� ��(-1123123 ~ 121200000)
		System.out.println(216548);
		System.out.println(-216548);
		System.out.println(032); //8����
		//System.out.println(082); 8������ 7���� ǥ��
		System.out.println(0x32); //16����
		//System.out.println(10000000000); ���� ����� ��Ʈ�� ����� �ƴ�
		
		//long(������)
		//�Ҽ����� ���� ���ڿ� long ���ڹ����� ����� �ʴ� ���ڳ��� �ҹ��� l �Ǵ� �빮��L�� ���̸� ��
		System.out.println(10000000000L);
		System.out.println(10000000000000000l);
		
		System.out.println(100);
		System.out.println(100L);
		
		//float(�Ǽ���) ���
		//�Ҽ����� �ִ� �� ���� F�� f�� �ٿ��� ǥ��
		System.out.println(3.14F);
		System.out.println(3.14f);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
	
		//double(�Ǽ���) ���
		//�Ҽ����� �ִ� ���� double���, ���� ���� D,d�� ������ double���
		System.out.println(3.14);
		System.out.println(.14);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14D);
		System.out.println(3.14E-4);
		
		//String(���ڿ�)�� ���
		//���ڿ� ����� ""�� ��� ǥ��
		System.out.println("hello world");
		
		//1, '1', "1" 3������ �޸𸮿� �ö� �ִ� ����� �ٸ���.
	
		//����� ���� + - * / %
		//���ڴ� ������ �ǰ�, ���ڴ� + ���길 ����
		//(����)+(����)���� ���ڿ��� ��
		System.out.println(5+3); //��+��=��
		System.out.println(5.1+3.2); //��+����=���ڿ�
		System.out.println(5+5+"�ȳ�"); //����+����=���ڿ� (10�ȳ�)
		System.out.println("�ȳ�"+5+5); //(�ȳ�55)
		System.out.println("�ȳ�"+(5+5)); //(�ȳ�10)
		
	
	}
	
}
