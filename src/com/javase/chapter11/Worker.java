package com.javase.chapter11;


public class Worker extends Emp{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("��������2");
		System.out.println("����"+this.getName()+"����"+this.getAge()+"ְλ"+this.getPosition());
		
	}
	
	public void total(){
		System.out.println("�ܼ���:"+ this.getAge() * 12);
	}
	
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("��������2");
		System.out.println("����"+this.getName()+"����"+this.getAge()+"ְλ"+this.getPosition());
		
	}
	

}
