package com.javase.chapter11;

public class Chainmen extends Emp{
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("��������");
		System.out.println("����"+this.getName()+"����"+this.getAge()+"ְλ"+this.getPosition());
		
	}
	
	public void total(){
		System.out.println("�ܼ���:"+ this.getAge() * 12);
	}
	
	public Chainmen(){}
	
//	public Chainmen(String name,int age,String position){
//		super.setName(name);
//		super.setAge(age);
//		super.setPosition(position);
//	}
	

}
