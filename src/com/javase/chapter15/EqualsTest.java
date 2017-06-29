package com.javase.chapter15;

public class EqualsTest {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("电脑",1,12.3,"好的");
		Person p2 = new Person("电脑",1,12.3,"好的");
		System.out.println(p1.equals(p2));


		//重写equals和hashCode方法
		
		
	}
	
}
