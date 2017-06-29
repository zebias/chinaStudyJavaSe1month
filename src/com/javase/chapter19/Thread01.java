package com.javase.chapter19;

/**
 * @author Administrator
 *继承Thread类 (第一种)
 */
public class Thread01 extends Thread{
	@Override
	public void run() {
		//获取线程的名字
		System.out.println(Thread.currentThread().getName());
		
		//让线程进入睡眠
		try {
			Thread.sleep(30000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("我要睡觉了!");
		}
	}
	public Thread01(String threadName) {
		super(threadName);
	}
	public Thread01() {
		// TODO Auto-generated constructor stub
	}
}
