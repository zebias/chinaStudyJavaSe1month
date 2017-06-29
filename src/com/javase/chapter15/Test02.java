package com.javase.chapter15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test02 {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//创建一个HashMap的集合
		Map<String,Person> person = new HashMap<>();
		
		//赋值
		person.put("大师兄", new Person("悟空",10000,95.1,"战斗型"));
		person.put("二师兄",new Person("悟能",5000,1,"憨吃型"));
		person.put("三师兄", new Person("悟净",3000,55.5,"老实型"));
		person.put("师傅", new Person("三藏",1,99,"坐吃等死型"));
		
		//遍历Map(增强for)
		for(Map.Entry<String,Person> persons:person.entrySet()){
			System.out.print(persons.getKey());
			System.out.println(persons.getValue());
		}
		
		//遍历Map(迭代器)
		Iterator<Entry<String, Person>> ite = person.entrySet().iterator();
		
		/**
		 * 遍历key
		 */
		while(ite.hasNext()){
			System.out.println(ite.next().getKey());
		}
		

		//遍历Map(迭代器)
		Iterator<Entry<String, Person>> ite2 = person.entrySet().iterator();
		
		/**
		 * 遍历value
		 */
		while(ite2.hasNext()){
			System.out.println(ite2.next().getValue());
		}
		
		
	}
}
