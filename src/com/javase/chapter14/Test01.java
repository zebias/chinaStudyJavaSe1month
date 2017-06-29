package com.javase.chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	
	public static void main(String[] args) {
	
		//����ArrayLIst����
		List<Product>  products = new ArrayList<>(); 
		//����һ��������������TreeSet
		Set<Product> products2 = new TreeSet<>();
		//���
		products.add(new Product("����",1200));
		products.add(new Product("����2",12100));
		products.add(new Product("����3",12300));
		products.add(new Product("����4",12400));
		
		Collections.sort(products);
		
		//���
		Product product = new Product("�ֻ�1",213);
		products2.add(product);
		products2.add(new Product("�ֻ�3",2131));
		products2.add(new Product("�ֻ�2",2132));
		//ɾ��
		products.remove(0);
		
		//����
		//����1 ��ͨfor
		for(int i = 0;i<products.size();i++){
			System.out.println(products.get(i));
		}
		
		System.out.println("-------------------------");
		//����2 ��ǿfor
		for(Product p : products){
			System.out.println(p);
		}

		System.out.println("-------------------------");
		
		//����3:������
		Iterator<Product> ite = products.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("-------------------------");
		
		//ʹ����ǿfor���鿴
		/*for(Product p:products2){
			System.out.println(p);
			}*/
		//ʹ�õ�����
		Iterator<Product> ite2 = products2.iterator();
		while(ite2.hasNext()){
			System.out.println(ite2.next());
		}
		
		
	}
}
