package com.javase.chapter20;

public class ThreadTest {
	public static void main(String[] args) {
		//newһ���߳�
		Thread01 thread01 = new Thread01();
		Thread01 thread02 = new Thread01("�߳�1");
		thread01.start(); //����״̬
		thread02.start(); //����״̬
		thread02.interrupt(); //�ж�
		
		Thread02 t3 = new Thread02();
		Thread02 t4 = new Thread02();
		
		Thread thread03 = new Thread(t3);
		Thread thread04 = new Thread(t4,"�߳���");
		thread03.start(); //����״̬
		thread04.start(); //����״̬
		
	}
}
