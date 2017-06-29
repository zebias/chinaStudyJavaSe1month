package com.javase.chapter10;

/**
 * @author Administrator
 *动物类(父类)
 */
public class Animals {
	
	//TODO:定义属性
	private String name;
	private String type;
	private int age;
	private char sex;
	private String thing;
	
	
	//setting和getting
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
	 * 吃方法
	 */
	public String eat(String thing){
		System.out.print(getName()+"在吃");
		return thing;
	}
	
	/**
	 * 方法:捕猎
	 */
	public void hunt(){
		System.out.println("茂胜想吃人????");
	}

	public Animals(String name) {
		this.name = name;
		System.out.println("我是父类的无参构造方法");
	}
	
	
}
