package com.javase.chapter13;



public class DemoToString {
	
	
	private String name;
	private int number;
	private String type;
	private double price;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoToString product = new DemoToString();
		product.setName("С��");
		product.setNumber(20);
		product.setPrice(1999);
		product.setType("�ֻ�");
		System.out.println(product);
	}
	@Override
	public String toString() {
		return "DemoToString [name=" + name + ", number=" + number + ", type=" + type + ", price=" + price + "]";
	}

	//��д����toString�ķ���
/*	public String toString(){
		return "����:"+name+"����"+number+"�۸�:"+price+"����:"+type;

	}*/
	
	
}




