package com.javase.chapter20;

public class Thread01 extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(30000);
			
		} catch (InterruptedException e) {
			System.out.println("˯����ȥ��!");
		}
	}
	
	//���췽��
	public Thread01(String threadName){
		super(threadName);
	}
	public Thread01(){}
}
