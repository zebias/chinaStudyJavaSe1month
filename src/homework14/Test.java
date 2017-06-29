package homework14;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// 创建集合
		ArrayList<Product> product = new ArrayList<>();

		// 赋值
		product.add(new Product("小米", 1999.9, 100, "电子产品"));
		product.add(new Product("魅族", 2569.9, 200, "电子产品"));
		product.add(new Product("蓝牙", 9.9, 1000, "电子配件"));
		product.add(new Product("酷狗", 1.9, 10, "虚拟设备"));
		product.add(new Product("锤子", 3999.9, 1000, "电子产品"));

		ShopCar shopCar = new ShopCar();

		// 提示用户输入
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("请输入您的操作:1.展示商品列表2.购买商品3.修改数量4.删除商品5.查看购物车6.计算总价7.退出系统");

			// 用户输入
			int num = scan.nextInt();

			switch (num) {
			case 1:
				shopCar.showlist(product);
				break;
			case 2:
				System.out.println("请输入你要购买的商品名称:");
				try {
					String name1 = scan.next();
					shopCar.buy(name1,product);
				System.out.println("商品已经添加到购物车中是否直接查看Y/N");
				String s = scan.next();
				if (s.equals("Y")) {
					shopCar.show();
				} else if (s.equals("N")) {
					break;
				} else {
					try {
						throw new InputErrorException("你输入的有误");
					} catch (InputErrorException e) {
						e.printStackTrace();
					}
				}
				} catch (NumberException e1) {
					// TODO Auto-generated catch block
					System.out.println("您购买的商品没有了");
					e1.printStackTrace();
				}
				break;
			case 3:
				System.out.println("请输入要修改的商品名称:");
				String name2 = scan.next();
				System.out.println("请输入要修改的商品数量:");
				int num3 = scan.nextInt();
				shopCar.change(name2, num3,product);
				break;
			case 4:
				System.out.println("请输入要修改的商品名称:");
				String name3 = scan.next();
				shopCar.delete(name3);
				break;
			case 5:
				shopCar.show();
				break;
			case 6:
				System.out.println("你要购买的商品总价是:");
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
