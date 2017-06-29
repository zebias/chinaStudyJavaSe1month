package com.javase.chapter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//创建一个对象
				Product product = new Product();

				Product product2 = new Product("手机","电子产品",12,1.1);
				System.out.println("商品名:" + product2.getName() + "\t" + "商品价格:" + product2.getPrice() + "\t" + "商品数量:"
						+ product2.getNumber());
				//手动输入
				Scanner scan = new Scanner(System.in);
				
				product.setName("电脑");
				product.setNumber(20);
				product.setPrice(1299);
				product.setType("电子产品");
				System.out.println("商品名:" + product.getName() + "\t" + "商品价格:" + product.getPrice() + "\t" + "商品数量:"
						+ product.getNumber());
				
				//c.set和get方法
				System.out.print("请选择您要购买的商品数量");
				int number = scan.nextInt();
				System.out.println("您这次共消费金额为"+product.buy(number)+"元");
				
				System.out.print("请选择您要购买的商品数量");
				int number2 = scan.nextInt();
				System.out.println("您这次共消费金额为"+product2.buy(number2)+"元");
				scan.close();
				
		
	}

}
