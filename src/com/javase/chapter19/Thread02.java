package com.javase.chapter19;

/**
 * @author Administrator
 * ʵ��Runnable�ӿ�(�ڶ���)
 */
public class Thread02 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		//���߳̽���˯��
				try {
					Thread.sleep(30000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("��Ҫ˯����!");
				}
	}
	
}
