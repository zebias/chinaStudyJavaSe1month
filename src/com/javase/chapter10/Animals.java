package com.javase.chapter10;

/**
 * @author Administrator
 *������(����)
 */
public class Animals {
	
	//TODO:��������
	private String name;
	private String type;
	private int age;
	private char sex;
	private String thing;
	
	
	//setting��getting
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public char getSex(){
		return sex;
	}
	
	public void setThing(String thing){
		this.thing = thing;
	}
	
	public String getThing(){
		return thing;
	}
	/**
	 * �Է���
	 */
	public String eat(String thing){
		System.out.print(getName()+"�ڳ�");
		return thing;
	}
	
	/**
	 * ����:����
	 */
	public void hunt(){
		System.out.println("ïʤ�����????");
	}

	public Animals(String name) {
		this.name = name;
		System.out.println("���Ǹ�����޲ι��췽��");
	}
	
	
}
