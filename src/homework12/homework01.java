package homework12;

import java.util.Scanner;

public class homework01 {

	public static void main(String[] args) {

		// 用户键盘输入
		Scanner scan = new Scanner(System.in);
		while (true) {
			String qqNum = scan.next();
			// 判断是否为9位
			if (qqNum.length() == 9) {

				// 判断首字母是否为0
				if (qqNum.charAt(0) != '0') {
					char[] num = new char[9];
					for (int i = 0; i < qqNum.length(); i++) {
						num[i] = qqNum.charAt(i);
					}
					// 判断输入的是否是0-9的数字
					for (char a : num) {
						if (a < 48 || a > 57) {
							System.out.println("QQ号不符合");
							return;
						}
					}
					System.out.println("合法");

				} else {
					System.out.println("字母否为0");
				}
			}
			else{
				System.out.println("数字不够");
				scan.close();
			}
		}
	}
}
