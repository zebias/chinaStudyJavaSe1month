package homework11;

import java.util.Scanner;


public class TestProduct {
	
	//��̬����
	public void test(Product product){
		product.show();
	}
	
	public static void main(String[] args) {
		
		//1.newһ������
		ShopCar shopCar = new ShopCar("�ֻ�", 100, 199.6);
		ShopCar shopCar1 = new ShopCar();
		
		//��ֵ


		TestProduct test1 = new TestProduct();

		test1.test(shopCar);
		shopCar.add(shopCar1);
		//��������
		Scanner scanner = new Scanner(System.in);
		if(shopCar.getName()!=null){
		System.out.println("��������Ҫ�޸ĵ���Ʒ����");
		String a = scanner.next();
		shopCar.setName(a);
		}
		System.out.println("��������Ҫ�޸ĵ���Ʒ����");
		int b = scanner.nextInt();
		shopCar.setNumber(b);
		System.out.println("��������Ҫ�޸���Ʒ�۸�");
		double c =scanner.nextDouble();
		shopCar.setPrice(c);
		
		test1.test(shopCar);

		
		scanner.close();
		//3.���÷���
	}
}
