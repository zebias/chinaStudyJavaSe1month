package com.javase.chapter20;

import java.util.Scanner;

public class IoThreadTest {
	public static void main(String[] args) {
		IoTest it = new IoTest();
		System.out.println("�߳�����");
		it.start();
		it.interrupt();
		it.scan.close();

	}

}
// io����

class IoTest extends Thread {

	boolean flag = true;

	// ��������
	Scanner scan = new Scanner(System.in);

	@Override
	public void run() {
		while (flag) {
			try {
				System.out.println("��������");
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("�жϲ���");
				flag = false;
			}
		}
	}
}
