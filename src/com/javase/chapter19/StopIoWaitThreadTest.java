package com.javase.chapter19;

import java.util.Scanner;

public class StopIoWaitThreadTest {
	
	public static void main(String[] args) {
		IoWaitThread ioWaitThread = new IoWaitThread();
		System.out.println("�߳�����");
		ioWaitThread.start();          //1
		
		ioWaitThread.interrupt();      //2
		 //��Ϊ�γ��쳣
		ioWaitThread.scan.close();     //3
	}
	

}

class IoWaitThread extends Thread{
	//����
	boolean flag = true;
	//��������
	Scanner scan = new Scanner(System.in);
	
	//IO��������run����
	@Override
	public void run() {
	//��ѭ�����
		while(flag){
			try{
			System.out.println("��������");
			scan.nextLine();               				 //4 �ȴ�����
			} catch(Exception e){
				//����
				System.out.println("�жϲ���!");         //5 �жϳ���
				flag = false;
			}
		}
	}
}