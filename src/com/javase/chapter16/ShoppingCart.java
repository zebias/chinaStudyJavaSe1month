package com.javase.chapter16;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	// 创建一个购物车商品列表
	static List<Product> products = new ArrayList<>();

	public static int findProduct(String name) {
		// 循环购物车列表
		for (int i = 0; i < products.size(); i++) {

			// 判断购物车是否有该商品
			if (products.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 添加商品到购物车
	 * 
	 * @param name:商品名
	 * @param list:商品列表
	 */
	public void addProduct(String name, List<Product> list) {
		// 获取下标
		int index = Product.listProduct(name, list);
		// 判断
		if (index != -1) {
			// 添加商品
			products.add(new Product(name, 1, list.get(index).getPrice(), list.get(index).getType()));

			// 商品数量改变
			list.get(index).setNumber(list.get(index).getNumber() - 1);
			System.out.println("商品添加成功!");

		} else {
			System.out.println("没有该商品!");
		}

	}

	/**
	 * 删除购物车中的商品
	 * 
	 * @param name:商品名
	 * @param list:商品列表
	 */
	public void deleteProduct(String name, List<Product> list) {

		// 获取下标(错误)
		// int index = Product.listProduct(name, list);

		// 获取购物车下标
		int index = ShoppingCart.findProduct(name);

		// 删除商品
		if (index != -1) {

			// 商品增加数量
			list.get(index).setNumber(list.get(index).getNumber() + products.get(index).getNumber());
			// 删除
			products.remove(index);
			System.out.println("删除商品成功!");
		} else {
			System.out.println("购物车中没有该商品!!");
		}
	}
	
	/**
	 * 修改数量
	 * @param name:商品名
	 * @param list:商品列表
	 * @param number:商品数量
	 */
	public void changeNum(String name,List<Product> list,int number){
		
		//获取购物车列表下标
		int i = ShoppingCart.findProduct(name);
		int index = Product.listProduct(name, list);
		if(i != -1){
			//给商品列表的数量赋值
			list.get(index).setNumber(list.get(index).getNumber()+products.get(i).getNumber()-number);			
			//给购物车数量赋值
			products.get(i).setNumber(number);
			System.out.println("商品数量修改成功!!");
			
		}else{

			System.out.println("购物车中没有该商品!!");
		}
	}
	
	/**
	 * 计算总价
	 * @return
	 */
	public  double totalPrice(){
		double totalPrice = 0;
		//遍历购物车
		for(Product p1:products){
			totalPrice += p1.getPrice() * p1.getNumber();
		}
		return totalPrice;
	}
	/**
	 * 展示购物车
	 */
	public static void show(){
		for(Product p1:products){
			System.out.println(p1);
		}
	}
}
