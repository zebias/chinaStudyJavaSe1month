package com.javase.chapter11;


public class Worker extends Emp{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("我是子类2");
		System.out.println("姓名"+this.getName()+"年龄"+this.getAge()+"职位"+this.getPosition());
		
	}
	
	public void total(){
		System.out.println("总价是:"+ this.getAge() * 12);
	}
	
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("我是子类2");
		System.out.println("姓名"+this.getName()+"年龄"+this.getAge()+"职位"+this.getPosition());
		
	}
	

}
