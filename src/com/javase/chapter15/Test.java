package com.javase.chapter15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
	//����
	List<Product> product  = new ArrayList<>();
	
	//map
	HashMap<String,Product> products = new HashMap<>();
	
	//�����ϸ�ֵ
	product.add(new Product("С��",2));
	product.add(new Product("С��2",23));
	
	//��map��ֵ
	products.put("��ɽ", new Product("С��",3));
	products.put("��ɽ1", new Product("С��31",333));
	
	//����
	for(int i = 0 ; i< product.size();i++){
		System.out.println(product.get(i));
	}
	
	//����map
	for(Map.Entry<String,Product> entry : products.entrySet()){
		System.out.print(entry.getKey()+"\t");
		System.out.println(entry.getValue());
	}
	}

}
