package com.javase.chapter14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Test04 {
	public static void main(String[] args) {
		//HashSet����
		//List����
		
		//Set<Products> product01 = new HashSet<>();
		List<Products> product02 = new ArrayList<>();
		
		product02.add(new Products("С��",12,11.2,"����"));
		product02.add(new Products("С��2",13,113,"����"));
		product02.add(new Products("С��3",14,118,"����"));
		
		//new����
		CompatorTest compartorTest = new CompatorTest();
		
		//����(����ʵ��Comparable)
		Collections.sort(product02, compartorTest);
		
		for (Products products : product02) {
			System.out.println(products);
		}
		
	}
}
