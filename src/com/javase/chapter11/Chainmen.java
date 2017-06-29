package com.javase.chapter11;

public class Chainmen extends Emp{
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("我是子类");
		System.out.println("姓名"+this.getName()+"年龄"+this.getAge()+"职位"+this.getPosition());
		
	}
	
	public void total(){
		System.out.println("总价是:"+ this.getAge() * 12);
	}
	
	public Chainmen(){}
	
//	public Chainmen(String name,int age,String position){
//		super.setName(name);
//		super.setAge(age);
//		super.setPosition(position);
//	}
	

}
