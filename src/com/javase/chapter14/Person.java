package com.javase.chapter14;

public class Person {
	private String name;
	private String type;
	private int attack;
	private int colorValue;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getColorValue() {
		return colorValue;
	}
	public void setColorValue(int colorValue) {
		this.colorValue = colorValue;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", type=" + type + ", attack=" + attack + ", colorValue=" + colorValue + "]";
	}
	public Person(String name, String type, int attack, int colorValue) {
		super();
		this.name = name;
		this.type = type;
		this.attack = attack;
		this.colorValue = colorValue;
	}
	public Person() {
		super();
	}
	
	
}
