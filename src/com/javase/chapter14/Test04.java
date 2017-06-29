package com.javase.chapter14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Test04 {
	public static void main(String[] args) {
		//HashSet集合
		//List集合
		
		//Set<Products> product01 = new HashSet<>();
		List<Products> product02 = new ArrayList<>();
		
		product02.add(new Products("小米",12,11.2,"电子"));
		product02.add(new Products("小米2",13,113,"电子"));
		product02.add(new Products("小米3",14,118,"电子"));
		
		//new对象
		CompatorTest compartorTest = new CompatorTest();
		
		//排序(不用实现Comparable)
		Collections.sort(product02, compartorTest);
		
		for (Products products : product02) {
			System.out.println(products);
		}
		
	}
}
