package com.javase.chapter15;

public class GenericTest {

	// 泛型方法
	// 遍历数组
	public static <T> void printArray(T[] t) {
		
		// 循环遍历
		for (T t1 : t) {
			System.out.print(t1 + "\t");
		}
		System.out.println();
	}

	// main方法
	public static void main(String[] args) {

		
		Integer[] i1 = {1,2,3,4,5,6};
		String[] i2 = {"我","知道","你","在","家"};
		Double[] i3 = {1.2,3.3,4.5,6.7,8.9};
		
		printArray(i1);
		printArray(i2);
		printArray(i3);
		
	}
}
