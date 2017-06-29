package com.javase.chapter11;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("ะกรร", 22, false,null);
		Person person2 = new Person();
		person2.setName("ะกอ๕");
		person2.setAge(24);
		person2.setGender(false);
		person2.setPartner(null);
		person1.sex(person2);
		person1.upAge(person2);
		person1.marry(person2);

	}

}
