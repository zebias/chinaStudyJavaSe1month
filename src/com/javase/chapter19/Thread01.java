package com.javase.chapter19;

/**
 * @author Administrator
 *�̳�Thread�� (��һ��)
 */
public class Thread01 extends Thread{
	@Override
	public void run() {
		//��ȡ�̵߳�����
		System.out.println(Thread.currentThread().getName());
		
		//���߳̽���˯��
		try {
			Thread.sleep(30000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("��Ҫ˯����!");
		}
	}
	public Thread01(String threadName) {
		super(threadName);
	}
	public Thread01() {
		// TODO Auto-generated constructor stub
	}
}
