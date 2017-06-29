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
		
		//����һ��HashMap�ļ���
		Map<String,Person> person = new HashMap<>();
		
		//��ֵ
		person.put("��ʦ��", new Person("���",10000,95.1,"ս����"));
		person.put("��ʦ��",new Person("����",5000,1,"������"));
		person.put("��ʦ��", new Person("��",3000,55.5,"��ʵ��"));
		person.put("ʦ��", new Person("����",1,99,"���Ե�����"));
		
		//����Map(��ǿfor)
		for(Map.Entry<String,Person> persons:person.entrySet()){
			System.out.print(persons.getKey());
			System.out.println(persons.getValue());
		}
		
		//����Map(������)
		Iterator<Entry<String, Person>> ite = person.entrySet().iterator();
		
		/**
		 * ����key
		 */
		while(ite.hasNext()){
			System.out.println(ite.next().getKey());
		}
		

		//����Map(������)
		Iterator<Entry<String, Person>> ite2 = person.entrySet().iterator();
		
		/**
		 * ����value
		 */
		while(ite2.hasNext()){
			System.out.println(ite2.next().getValue());
		}
		
		
	}
}
