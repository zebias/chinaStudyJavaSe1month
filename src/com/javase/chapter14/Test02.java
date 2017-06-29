package com.javase.chapter14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	
	public static void main(String[] args) {
		
		//用TreeSet(集合)
		Set<Product> products = new TreeSet<Product>();
		
		//用ArrayList
		List<Product> productss = new ArrayList<Product>();
		//重写了toString的方法
		//添加add
		products.add(new Product("猪肉脯",100));
		products.add(new Product("红烧肉",200));
		products.add(new Product("蓝鲸烤鸭",300));
		products.add(new Product("阜宁大糕",400));
		

		productss.add(new Product("猪肉脯",100));
		productss.add(new Product("红烧肉",200));
		productss.add(new Product("蓝鲸烤鸭",300));
		productss.add(new Product("阜宁大糕",400));
		
		//迭代器遍历(不常用)
		
		/*Iterator<Product> ite = products.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}*/
		
		//增强for循环
		for(Product p:products){
			System.out.println(p);
		}
		System.out.println("--------------------------");
		//排序步骤1.实现接口Comparable2.当前类实现方法3.修改方法体
		//3.1使用字典排序
		
		//排序
		Collections.sort(productss);
		for(int i = 0 ;i<productss.size();i++){
			System.out.println(productss.get(i));
		}
	}

}
