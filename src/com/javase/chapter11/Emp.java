package com.javase.chapter11;
	

public class Emp {

	private String name;
	private int age;
	private String position;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
//	public Emp(String name ,int age,String position){
//		this.name = name;
//		this.age = age;
//		this.position = position;
//	}
	
	public Emp(){}

	public void show(){
		System.out.println("我是父类");
		System.out.println("姓名"+this.getName()+"年龄"+this.getAge()+"职位"+this.getPosition());
		
	}
}
