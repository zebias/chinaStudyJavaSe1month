package homework18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import homework14.InputErrorException;
import homework14.NumberException;

public class Test {

	public static void main(String[] args) throws IOException, NumberException {

		// ��������
		ArrayList<Product> product = new ArrayList<>();

		// ��ֵ
		// ʹ��IO���������
		BufferedReader out = new BufferedReader(new FileReader(new File("C:/shop.txt")));

		String str = out.readLine();
		while (str != null) {
			String[] s = str.split("\\*");
			product.add(new Product(s[0], Integer.parseInt(s[1]), Double.parseDouble(s[2]), s[3]));
			str = out.readLine();
		}
		out.close();

		// product.add(new Product("С��", 10, 100, "���Ӳ�Ʒ"));
		// product.add(new Product("����", 10, 200, "���Ӳ�Ʒ"));
		// product.add(new Product("����", 10, 1000, "�������"));
		// product.add(new Product("�ṷ", 10, 10, "�����豸"));
		// product.add(new Product("����", 10, 1000, "���Ӳ�Ʒ"));

		ShoppingCart shopCar = new ShoppingCart();

		// ��ʾ�û�����
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("���������Ĳ���:1.չʾ��Ʒ�б�2.������Ʒ3.�޸�����4.ɾ����Ʒ5.�鿴���ﳵ6.�����ܼ�7.�˳�ϵͳ");
			// �û�����
			int num = scan.nextInt();

			switch (num) {
			case 1:
				Product.show(product);
				break;
			case 2:
				System.out.println("��������Ҫ�������Ʒ����:");
				String name1 = scan.next();
				shopCar.addProduct(name1, product);
				System.out.println("��Ʒ�Ѿ���ӵ����ﳵ���Ƿ�ֱ�Ӳ鿴Y/N");
				String s = scan.next();
				if (s.equals("Y")) {
					ShoppingCart.show();
				} else if (s.equals("N")) {
					break;
				} else {
					try {
						throw new InputErrorException("�����������");
					} catch (InputErrorException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				System.out.println("������Ҫ�޸ĵ���Ʒ����:");
				String name2 = scan.next();
				System.out.println("������Ҫ�޸ĵ���Ʒ����:");
				int num3 = scan.nextInt();
				shopCar.changeNum(name2, product, num3);
				break;
			case 4:
				System.out.println("������Ҫɾ������Ʒ����:");
				String name3 = scan.next();
				shopCar.deleteProduct(name3, product);
				;
				break;
			case 5:
				ShoppingCart.show();
				break;
			case 6:
				System.out.println("��Ҫ�������Ʒ�ܼ���:");
				System.out.println(shopCar.totalPrice());

			case 7:
				scan.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

}
