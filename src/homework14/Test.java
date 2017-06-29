package homework14;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// ��������
		ArrayList<Product> product = new ArrayList<>();

		// ��ֵ
		product.add(new Product("С��", 1999.9, 100, "���Ӳ�Ʒ"));
		product.add(new Product("����", 2569.9, 200, "���Ӳ�Ʒ"));
		product.add(new Product("����", 9.9, 1000, "�������"));
		product.add(new Product("�ṷ", 1.9, 10, "�����豸"));
		product.add(new Product("����", 3999.9, 1000, "���Ӳ�Ʒ"));

		ShopCar shopCar = new ShopCar();

		// ��ʾ�û�����
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("���������Ĳ���:1.չʾ��Ʒ�б�2.������Ʒ3.�޸�����4.ɾ����Ʒ5.�鿴���ﳵ6.�����ܼ�7.�˳�ϵͳ");

			// �û�����
			int num = scan.nextInt();

			switch (num) {
			case 1:
				shopCar.showlist(product);
				break;
			case 2:
				System.out.println("��������Ҫ�������Ʒ����:");
				try {
					String name1 = scan.next();
					shopCar.buy(name1,product);
				System.out.println("��Ʒ�Ѿ���ӵ����ﳵ���Ƿ�ֱ�Ӳ鿴Y/N");
				String s = scan.next();
				if (s.equals("Y")) {
					shopCar.show();
				} else if (s.equals("N")) {
					break;
				} else {
					try {
						throw new InputErrorException("�����������");
					} catch (InputErrorException e) {
						e.printStackTrace();
					}
				}
				} catch (NumberException e1) {
					// TODO Auto-generated catch block
					System.out.println("���������Ʒû����");
					e1.printStackTrace();
				}
				break;
			case 3:
				System.out.println("������Ҫ�޸ĵ���Ʒ����:");
				String name2 = scan.next();
				System.out.println("������Ҫ�޸ĵ���Ʒ����:");
				int num3 = scan.nextInt();
				shopCar.change(name2, num3,product);
				break;
			case 4:
				System.out.println("������Ҫ�޸ĵ���Ʒ����:");
				String name3 = scan.next();
				shopCar.delete(name3);
				break;
			case 5:
				shopCar.show();
				break;
			case 6:
				System.out.println("��Ҫ�������Ʒ�ܼ���:");
				System.out.println(shopCar.total());
				
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
