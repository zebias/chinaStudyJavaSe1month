package com.javase.chapter14;

public class Products{
	//����һ����Ʒ�б�
	private String name;
	private int number;
	private double price;
	private String type;
	

	//TODO getting and setting
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//��дtoString
	@Override
	public String toString() {
		return "Products [name=" + name + ", number=" + number + ", price=" + price + ", type=" + type + "]";
	}
	

	
	//�вι���
	public Products(String name, int number, double price, String type) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
		this.type = type;
	}

	//�޲ι���
	public Products() {
		super();
	}
	
	
	
	
}
