package com.javase.chapter14;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		//����һ��map����
	HashMap<String,Person> map = new HashMap<>(); 
	
	//��ֵ
	map.put("��ʦ��",new Person("������","����",5000,20));
	map.put("��ʦ��", new Person("�ܿ���","����",3000,98));
	map.put("��ʦ��", new Person("����","����",2000,97));
	
	//����
	for(Map.Entry<String,Person> entry:map.entrySet()){
		System.out.print(entry.getKey()+"\t");
		System.out.println(entry.getValue());
	}
	}
}
