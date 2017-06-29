package com.javase.chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	
	public static void main(String[] args) {
	
		//创建ArrayLIst数组
		List<Product>  products = new ArrayList<>(); 
		//创建一个有序无索引的TreeSet
		Set<Product> products2 = new TreeSet<>();
		//添加
		products.add(new Product("电脑",1200));
		products.add(new Product("电脑2",12100));
		products.add(new Product("电脑3",12300));
		products.add(new Product("电脑4",12400));
		
		Collections.sort(products);
		
		//添加
		Product product = new Product("手机1",213);
		products2.add(product);
		products2.add(new Product("手机3",2131));
		products2.add(new Product("手机2",2132));
		//删除
		products.remove(0);
		
		//遍历
		//方法1 普通for
		for(int i = 0;i<products.size();i++){
			System.out.println(products.get(i));
		}
		
		System.out.println("-------------------------");
		//方法2 增强for
		for(Product p : products){
			System.out.println(p);
		}

		System.out.println("-------------------------");
		
		//方法3:迭代器
		Iterator<Product> ite = products.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("-------------------------");
		
		//使用增强for来查看
		/*for(Product p:products2){
			System.out.println(p);
			}*/
		//使用迭代器
		Iterator<Product> ite2 = products2.iterator();
		while(ite2.hasNext()){
			System.out.println(ite2.next());
		}
		
		
	}
}
