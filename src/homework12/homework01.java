package homework12;

import java.util.Scanner;

public class homework01 {

	public static void main(String[] args) {

		// �û���������
		Scanner scan = new Scanner(System.in);
		while (true) {
			String qqNum = scan.next();
			// �ж��Ƿ�Ϊ9λ
			if (qqNum.length() == 9) {

				// �ж�����ĸ�Ƿ�Ϊ0
				if (qqNum.charAt(0) != '0') {
					char[] num = new char[9];
					for (int i = 0; i < qqNum.length(); i++) {
						num[i] = qqNum.charAt(i);
					}
					// �ж�������Ƿ���0-9������
					for (char a : num) {
						if (a < 48 || a > 57) {
							System.out.println("QQ�Ų�����");
							return;
						}
					}
					System.out.println("�Ϸ�");

				} else {
					System.out.println("��ĸ��Ϊ0");
				}
			}
			else{
				System.out.println("���ֲ���");
				scan.close();
			}
		}
	}
}
