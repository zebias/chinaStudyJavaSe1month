package com.javase.chapter20;

public class ThreadTest {
	public static void main(String[] args) {
		//new一个线程
		Thread01 thread01 = new Thread01();
		Thread01 thread02 = new Thread01("线程1");
		thread01.start(); //就绪状态
		thread02.start(); //就绪状态
		thread02.interrupt(); //中断
		
		Thread02 t3 = new Thread02();
		Thread02 t4 = new Thread02();
		
		Thread thread03 = new Thread(t3);
		Thread thread04 = new Thread(t4,"线程四");
		thread03.start(); //就绪状态
		thread04.start(); //就绪状态
		
	}
}
