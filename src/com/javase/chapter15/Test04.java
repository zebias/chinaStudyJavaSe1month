package com.javase.chapter15;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test04 {
	public static void main(String[] args) {
		
		//TreeMap����
		
		Map<String,Person> persons = new TreeMap<>();
	
		persons.put("a", new Person("��",1,2,"��"));
		persons.put("b", new Person("��2",11,22,"��1"));
		persons.put("c", new Person("��3",13,23,"��2"));
		
		//TreeMap��������
		Map<Integer,Person> person02 = new TreeMap<>();
	
		person02.put(new Integer(1), new Person("��",1,2,"��"));
		person02.put(new Integer(5), new Person("��2",11,22,"��1"));
		person02.put(new Integer(2), new Person("��3",13,23,"��2"));
		
		
		
		//TreeMap����
		Iterator<Entry<String,Person>> ite = persons.entrySet().iterator();
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}

		//TreeMap(��������)
		Iterator<Entry<Integer,Person>> ite2 = person02.entrySet().iterator();
		while(ite2.hasNext()){
			/*
			Entry<Integer, Person> entry = ite2.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());*/
			System.out.println(ite2.next().getKey());
		}
		

		//TreeMap(��������--��ǿfor)
		for(Map.Entry<Integer, Person> map : person02.entrySet()){
			
			System.out.print(map.getKey());
			System.out.println(map.getValue());
		}
		}
	
	}
