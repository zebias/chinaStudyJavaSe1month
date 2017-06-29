package com.javase.chapter;

public class Product {
	/*
	 * 2.自定义一个商品类,要求封装全部属性,然后给商品所有属性赋值
	 * (a.采用构造方法b.采用块c.set和get)并打印输出,要求有一个(购买商品)
	 * 计算价格的方法,总价格=数量*单价(数量需要键盘输入)
	 * 
	 */
	
	//定义属性
	private String name;
	private String type;
	private int number;
	private double price;
	
	
	//a.采用构造方法
	public Product(String name,String type,int number,double price){
	}
	
	
	public Product(){}
	//b.采用块
	{
		System.out.println("这边调用了块");
		name = "小米2S";
		type = "手机数码";
		number = 100;
		price = 1999.9;
		System.out.println("商品名称:"+name);
		System.out.println("商品类别:"+type);
		System.out.println("商品数量:"+number);
		System.out.println("商品价格:"+price);
	}
	
	
	//c.采用set和get方法
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	
	//购买方法
	
	public double buy(int numeber){
		return getPrice()*number;
	}

}
