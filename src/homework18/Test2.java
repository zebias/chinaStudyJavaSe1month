package homework18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import homework14.InputErrorException;
import homework14.NumberException;

public class Test2 {

	public static void main(String[] args) throws IOException, NumberException {

		// 创建集合
		ArrayList<Product> product = new ArrayList<>();
		//创建输入流
		BufferedReader br = new BufferedReader(new FileReader("c:/shop.txt"));
		//读行
		String rd = br.readLine();
		while(rd != null){
		//字符串拆分
			String[] split = rd.split("\\,");
			product.add(new Product(split[0],Integer.parseInt(split[1]),Double.parseDouble(split[2]),split[3]));
			rd = br.readLine();
		
		}
		br.close();
		
		// product.add(new Product("小米", 10, 100, "电子产品"));
		// product.add(new Product("魅族", 10, 200, "电子产品"));
		// product.add(new Product("蓝牙", 10, 1000, "电子配件"));
		// product.add(new Product("酷狗", 10, 10, "虚拟设备"));
		// product.add(new Product("锤子", 10, 1000, "电子产品"));

		ShoppingCart shopCar = new ShoppingCart();

		// 提示用户输入
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("请输入您的操作:1.展示商品列表2.购买商品3.修改数量4.删除商品5.查看购物车6.计算总价7.退出系统");
			// 用户输入
			int num = scan.nextInt();

			switch (num) {
			case 1:
				Product.show(product);
				break;
			case 2:
				System.out.println("请输入你要购买的商品名称:");
				String name1 = scan.next();
				shopCar.addProduct(name1, product);
				System.out.println("商品已经添加到购物车中是否直接查看Y/N");
				String s = scan.next();
				if (s.equals("Y")) {
					ShoppingCart.show();
				} else if (s.equals("N")) {
					break;
				} else {
					try {
						throw new InputErrorException("你输入的有误");
					} catch (InputErrorException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				System.out.println("请输入要修改的商品名称:");
				String name2 = scan.next();
				System.out.println("请输入要修改的商品数量:");
				int num3 = scan.nextInt();
				shopCar.changeNum(name2, product, num3);
				break;
			case 4:
				System.out.println("请输入要删除的商品名称:");
				String name3 = scan.next();
				shopCar.deleteProduct(name3, product);
				;
				break;
			case 5:
				ShoppingCart.show();
				break;
			case 6:
				System.out.println("你要购买的商品总价是:");
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
