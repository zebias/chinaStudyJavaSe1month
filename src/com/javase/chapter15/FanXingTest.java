package com.javase.chapter15;

public class FanXingTest {
	
	public static void main(String[] args) {
		
		Persons<String> persons = new Persons<>();
		Persons<Integer> person2 = new Persons<>();
		persons.setT("��֪��");
		person2.setT(3);
		System.out.println(persons.getT());
		System.out.println(person2.getT());
		
	}
	

}
//������
class Persons<T>{
	
	private T t;
	
	public void setT(T t){
		this.t = t;
	}
	public T getT(){
		return t;
	}
}
