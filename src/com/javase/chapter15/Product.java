package com.javase.chapter15;

public class Product {
	private String name;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", number=" + number + "]";
	}
	public Product(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public Product() {
		super();
	}
	
	

}
