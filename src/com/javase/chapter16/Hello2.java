package com.javase.chapter16;

public class Hello2 {
	
	static int  a1;  //ȫ�ֱ���
	
	public static void main(String[] args) {

		int a;		//�ֲ�����
		System.out.println("a");
		a = 3;
		System.out.println(a);
		System.out.println(a1);
		Hello2 hello2 = new Hello2();
		hello2.show();
	}
	public void show(){
		int a3 = 4; //�ֲ�����
		System.out.println(a3);
	}
}
