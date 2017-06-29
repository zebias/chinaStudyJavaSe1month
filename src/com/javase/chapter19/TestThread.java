package com.javase.chapter19;

public class TestThread {
	public static void main(String[] args) {

		//通过继承创建的线程可以直接new线程
		Thread01 t1 = new Thread01();
		Thread01 t2 = new Thread01("线程2");
		t1.start();
		t2.start();
		//通过实现Runnable创建的不是线程
		Thread02 test3 = new Thread02();
		Thread02 test4 = new Thread02();
		//需要通过Thread来创建线程
		Thread thread = new Thread(test3);
		Thread thread2 = new Thread(test4,"线程4");
		thread.start();
		thread2.start();
		
		//中断线程
		t1.interrupt();
		t2.interrupt();
		thread.interrupt();
		thread2.interrupt();
	}
}
