package com.javase.chapter13;

public class Demo01 {
	//�����쳣
	public static void main(String[] args) {
		
		try{
			System.out.println("oo1ooooo");
		int  i = 1/ 0 ;
		System.out.println("oo1oooo1");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("ooooooo");
		
		//���е�����
		
		int x  = 100;
		int y = 0 ;
		try{
		System.out.println("x/y"+x/y);
		System.out.println("�����"+x/y);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ0");
		}
		System.out.println("main������������");
	}
}
