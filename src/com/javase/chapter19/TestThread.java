package com.javase.chapter19;

public class TestThread {
	public static void main(String[] args) {

		//ͨ���̳д������߳̿���ֱ��new�߳�
		Thread01 t1 = new Thread01();
		Thread01 t2 = new Thread01("�߳�2");
		t1.start();
		t2.start();
		//ͨ��ʵ��Runnable�����Ĳ����߳�
		Thread02 test3 = new Thread02();
		Thread02 test4 = new Thread02();
		//��Ҫͨ��Thread�������߳�
		Thread thread = new Thread(test3);
		Thread thread2 = new Thread(test4,"�߳�4");
		thread.start();
		thread2.start();
		
		//�ж��߳�
		t1.interrupt();
		t2.interrupt();
		thread.interrupt();
		thread2.interrupt();
	}
}
