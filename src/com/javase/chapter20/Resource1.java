package com.javase.chapter20;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/*
 * 给this加锁
 */
public class Resource1 {
	
	public void f(){
		/*
		 * 没有锁
		 */
		System.out.println("this is "+Thread.currentThread().getName()+"\t: not synchronized\t"+new Date());
		/*
		 * 加锁
		 */
		synchronized (this){
			for (int i = 0; i < 5; i++) {
				try {
					TimeUnit.SECONDS.sleep(3);	//3秒
					System.out.println("this is "+Thread.currentThread().getName()+"\t: is synchronized\t"+new Date());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void g(){
	/*
	 * 没有锁
	 */
	System.out.println("this is "+Thread.currentThread().getName()+"\t: not synchronized\t"+new Date());
	/*
	 * 加锁
	 */
	synchronized (this){
		for (int i = 0; i < 5; i++) {
			try {
				TimeUnit.SECONDS.sleep(3);	//3秒
				System.out.println("this is "+Thread.currentThread().getName()+"\t :is synchronized\t"+new Date());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

	public void h(){

		/*
		 * 没有锁
		 */
		System.out.println("this is "+Thread.currentThread().getName()+"\t: not synchronized\t"+new Date());
		/*
		 * 加锁
		 */
		synchronized (this){
			for (int i = 0; i < 5; i++) {
				try {
					TimeUnit.SECONDS.sleep(3);	//3秒
					System.out.println("this is "+Thread.currentThread().getName()+"\t : is synchronized\t"+new Date());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		final Resource1 rs = new Resource1();
		/*
		 * lambda表达式
		 */
		new Thread(()->rs.f()).start();
		new Thread(()->rs.g()).start();
		rs.h();
	}
}