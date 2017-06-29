package com.javase.chapter19;

/**
 * @author Administrator
 * 实现Runnable接口(第二种)
 */
public class Thread02 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		//让线程进入睡眠
				try {
					Thread.sleep(30000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("我要睡觉了!");
				}
	}
	
}
