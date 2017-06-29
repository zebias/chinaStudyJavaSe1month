package com.javase.chapter13;

public class Demo01 {
	//处理异常
	public static void main(String[] args) {
		
		try{
			System.out.println("oo1ooooo");
		int  i = 1/ 0 ;
		System.out.println("oo1oooo1");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("ooooooo");
		
		//书中的列子
		
		int x  = 100;
		int y = 0 ;
		try{
		System.out.println("x/y"+x/y);
		System.out.println("结果是"+x/y);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}
		System.out.println("main方法结束运行");
	}
}
