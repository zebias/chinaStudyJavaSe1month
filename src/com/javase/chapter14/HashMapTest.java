package com.javase.chapter14;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		//创建一个map集合
	HashMap<String,Person> map = new HashMap<>(); 
	
	//赋值
	map.put("大师兄",new Person("弼马温","猴王",5000,20));
	map.put("二师兄", new Person("周俊任","猪王",3000,98));
	map.put("三师弟", new Person("三斤","鱼王",2000,97));
	
	//遍历
	for(Map.Entry<String,Person> entry:map.entrySet()){
		System.out.print(entry.getKey()+"\t");
		System.out.println(entry.getValue());
	}
	}
}
