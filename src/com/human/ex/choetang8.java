package com.human.ex;

public class choetang8 {

	public static void main(String[] args) {
		//String.format() ���ο� ���ڿ��� ����� �Լ�
		String str1= String.format("�ȳ� ���̸��� %s", "ȫ�浿");
		
		System.out.println(str1);
		//������ ���ڿ� ó��
		
		str1=String.format("�ȳ� ���̸��� %s �̰� ��°��� %s�ٴϴ�"
				+"�б��� %s �Դϴ�.","ȫ�浿","�����̰� ","�޸�");
		System.out.println(str1);
		
		str1=String.format("���̴� %d", 20);
		System.out.println(str1);
		//%s�� ���ڿ�
		//%d�� ����
        //%f�� �Ǽ�
		str1=String.format("���̴�%d, Ű�� %f ", 20, 170.3);
		System.out.println(str1);
		
		int i1=30;
		double d1=3.141592;
		String str2="�ȳ��ϼ���";
		//String.format�� ����ؼ� 3���� ����غ���.
		
		str1=String.format("���̴� %d, �������� %f, %s ",i1,d1,str2);
		System.out.println(str1);
		
		str1=String.format(" :%d, %10d: %10d ",i1,i1,i1);
		System.out.println(str1);
		
		str1=String.format(" :%f :%.3f : %3.3f :",d1,d1,d1);
		System.out.println(str1);
		
		str1=String.format("%%\"");
		System.out.println(str1);
		
		
		
		
	}

}
