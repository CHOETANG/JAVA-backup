package com.human.ex;

public class choetang {

	public static void main(String[] args) {
		
		//�ڵ� ����ȭ
		byte b1 = 10; //�ڷ����� �ٸ��� ������ ���� ���� �� ����.
		short s1=  10;//�ڵ� ����ȯ �Ǿ� ����.
		char c1 = 10;//������ �ڷ����� int �� ����� �ڵ����� ����ȯ �Ǿ� ����/
		int i1 = 10; //4byte
		long l1 = 10;//8byte
		// �ȵǴ� ���
		//int i2 = l1; //���� �����͸� ū�����Ϳ� ������ �ڵ� ����ȯ �ȴ�.
					   //�ݴ��� ���� �ڵ� ����ȯ ���� �ʴ´�.
		
		//b1=i1 ;
		//b1 = s1;
		i1= i1+1; 
		i1= i1+i1 ; 
		//b1= b1+b1 ; int ũ�⺸�� ���� �ڷ��� ������ 
		            // int�� �ڵ� ����ȯ�ȴ�  byte+byte = int
					//short + short = int		
	    //i1=l1+10;   //long + int = long
		l1=l1+i1;
		c1='A' +1 ;  //char + int = int -> char 
		c1='A' + 'b' ; 
		c1='��' + 'B' ; 
		System.out.println(c1);
		//�Ǽ�
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
        
        
        //���� ����ȯ " ĳ���� (casting)
        //������� (�ڷ���) �Ұ�ȣ�ȿ� �����ϰ��� �ϴ� �ڷ����� �־��ش�
        b1=(byte)(b1+b1); 
        i1=(int)l1; // ũ�Ⱑ �޶� �ս��� ����� �ִ�. 
        f1=3.14f;
        i1=(int)f1;
        System.out.println(i1);
        f1=i1; 
        System.out.println(f1);
        
        f1=(float)d1;
        System.out.println(f1);
        
        //���� �ڷ����� ���ڿ��� ��ȯ�ϴ¹��
        String str3 = f1+"" ;
        str3="10" ; 
        i1=Integer.parseInt(str3); //i1�� ���� 10�� �ȴ�.
        i1=Integer.valueOf(str3);//pareseInt �� �����ǹ�
        str3="1.14";
        d1=Double.parseDouble(str3); // d1�� �Ǽ� 1.14�� �ȴ�.
        System.out.println(str3);
        
        str3="1.14hi"; // �߸��� ���ڿ��� ����ϸ� ������ �߻���
        
        System.out.println(str3);
        
        
        
	}

}
