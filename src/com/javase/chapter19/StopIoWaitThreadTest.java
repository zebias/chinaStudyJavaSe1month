package com.javase.chapter19;

import java.util.Scanner;

public class StopIoWaitThreadTest {
	
	public static void main(String[] args) {
		IoWaitThread ioWaitThread = new IoWaitThread();
		System.out.println("线程启动");
		ioWaitThread.start();          //1
		
		ioWaitThread.interrupt();      //2
		 //人为形成异常
		ioWaitThread.scan.close();     //3
	}
	

}

class IoWaitThread extends Thread{
	//方法
	boolean flag = true;
	//键盘输入
	Scanner scan = new Scanner(System.in);
	
	//IO堵塞方法run方法
	@Override
	public void run() {
	//死循环输出
		while(flag){
			try{
			System.out.println("哈哈哈哈");
			scan.nextLine();               				 //4 等待输入
			} catch(Exception e){
				//堵塞
				System.out.println("中断操作!");         //5 中断程序
				flag = false;
			}
		}
	}
}