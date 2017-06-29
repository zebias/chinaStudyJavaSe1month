package com.javase.chapter15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
	//集合
	List<Product> product  = new ArrayList<>();
	
	//map
	HashMap<String,Product> products = new HashMap<>();
	
	//给集合赋值
	product.add(new Product("小米",2));
	product.add(new Product("小米2",23));
	
	//给map赋值
	products.put("本山", new Product("小米",3));
	products.put("本山1", new Product("小米31",333));
	
	//遍历
	for(int i = 0 ; i< product.size();i++){
		System.out.println(product.get(i));
	}
	
	//遍历map
	for(Map.Entry<String,Product> entry : products.entrySet()){
		System.out.print(entry.getKey()+"\t");
		System.out.println(entry.getValue());
	}
	}

}
