package com.javase.chapter20;

public class CreateThreadByInnerImplements {
	
	public static void main(String[] args) {
		
		//内部类实现Runnable
		Runnable runnable =new Runnable(){

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}};
			Thread thread = new Thread(runnable,"线程1");
			thread.start();
	}
}
