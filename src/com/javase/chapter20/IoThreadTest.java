package com.javase.chapter20;

import java.util.Scanner;

public class IoThreadTest {
	public static void main(String[] args) {
		IoTest it = new IoTest();
		System.out.println("Ïß³ÌÆô¶¯");
		it.start();
		it.interrupt();
		it.scan.close();

	}

}
// io¶ÂÈû

class IoTest extends Thread {

	boolean flag = true;

	// ¼üÅÌÊäÈë
	Scanner scan = new Scanner(System.in);

	@Override
	public void run() {
		while (flag) {
			try {
				System.out.println("¹ş¹ş¹ş¹ş");
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("ÖĞ¶Ï²Ù×÷");
				flag = false;
			}
		}
	}
}
