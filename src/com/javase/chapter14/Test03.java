package com.javase.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		//List集合
		List<Products> products = new ArrayList<Products>();
		
		
		//设置属性
		products.add(new Products("小米",1231,1991.9,"电子产品"));
		products.add(new Products("魅族",1232,1992.9,"电子产品"));
		products.add(new Products("蓝米",1233,1993.9,"电子产品"));
		products.add(new Products("酷狗",1234,1994.9,"电子产品"));
		
		//创建对象
		ShopCarShip shopCarShip = new ShopCarShip();
		
		//默认显示商品列表
		for (Products products2 : products) {
			System.out.println(products2);
		}
		System.out.println("------------------------");
		//用户输入
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入你要购买的商品名称");
		try {
			String name = scan.next();
			shopCarShip.show(products, name);
			shopCarShip.shows();
		} catch (NumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scan.close();
		}
		
	}
}
