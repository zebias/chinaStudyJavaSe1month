package homework11;

import java.util.Scanner;


public class TestProduct {
	
	//多态参数
	public void test(Product product){
		product.show();
	}
	
	public static void main(String[] args) {
		
		//1.new一个对象
		ShopCar shopCar = new ShopCar("手机", 100, 199.6);
		ShopCar shopCar1 = new ShopCar();
		
		//赋值


		TestProduct test1 = new TestProduct();

		test1.test(shopCar);
		shopCar.add(shopCar1);
		//键盘输入
		Scanner scanner = new Scanner(System.in);
		if(shopCar.getName()!=null){
		System.out.println("请输入您要修改的商品名称");
		String a = scanner.next();
		shopCar.setName(a);
		}
		System.out.println("请输入您要修改的商品数量");
		int b = scanner.nextInt();
		shopCar.setNumber(b);
		System.out.println("请输入您要修改商品价格");
		double c =scanner.nextDouble();
		shopCar.setPrice(c);
		
		test1.test(shopCar);

		
		scanner.close();
		//3.调用方法
	}
}
