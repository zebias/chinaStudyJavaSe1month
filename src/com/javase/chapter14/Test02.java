package com.javase.chapter14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	
	public static void main(String[] args) {
		
		//��TreeSet(����)
		Set<Product> products = new TreeSet<Product>();
		
		//��ArrayList
		List<Product> productss = new ArrayList<Product>();
		//��д��toString�ķ���
		//���add
		products.add(new Product("���⸬",100));
		products.add(new Product("������",200));
		products.add(new Product("������Ѽ",300));
		products.add(new Product("�������",400));
		

		productss.add(new Product("���⸬",100));
		productss.add(new Product("������",200));
		productss.add(new Product("������Ѽ",300));
		productss.add(new Product("�������",400));
		
		//����������(������)
		
		/*Iterator<Product> ite = products.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}*/
		
		//��ǿforѭ��
		for(Product p:products){
			System.out.println(p);
		}
		System.out.println("--------------------------");
		//������1.ʵ�ֽӿ�Comparable2.��ǰ��ʵ�ַ���3.�޸ķ�����
		//3.1ʹ���ֵ�����
		
		//����
		Collections.sort(productss);
		for(int i = 0 ;i<productss.size();i++){
			System.out.println(productss.get(i));
		}
	}

}
