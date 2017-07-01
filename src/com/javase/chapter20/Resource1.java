package com.javase.chapter20;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/*
 * ��this����
 */
public class Resource1 {
	
	public void f(){
		/*
		 * û����
		 */
		System.out.println("this is "+Thread.currentThread().getName()+"\t: not synchronized\t"+new Date());
		/*
		 * ����
		 */
		synchronized (this){
			for (int i = 0; i < 5; i++) {
				try {
					TimeUnit.SECONDS.sleep(3);	//3��
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
	 * û����
	 */
	System.out.println("this is "+Thread.currentThread().getName()+"\t: not synchronized\t"+new Date());
	/*
	 * ����
	 */
	synchronized (this){
		for (int i = 0; i < 5; i++) {
			try {
				TimeUnit.SECONDS.sleep(3);	//3��
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
		 * û����
		 */
		System.out.println("this is "+Thread.currentThread().getName()+"\t: not synchronized\t"+new Date());
		/*
		 * ����
		 */
		synchronized (this){
			for (int i = 0; i < 5; i++) {
				try {
					TimeUnit.SECONDS.sleep(3);	//3��
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
		 * lambda���ʽ
		 */
		new Thread(()->rs.f()).start();
		new Thread(()->rs.g()).start();
		rs.h();
	}
}