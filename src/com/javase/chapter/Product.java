package com.javase.chapter;

public class Product {
	/*
	 * 2.�Զ���һ����Ʒ��,Ҫ���װȫ������,Ȼ�����Ʒ�������Ը�ֵ
	 * (a.���ù��췽��b.���ÿ�c.set��get)����ӡ���,Ҫ����һ��(������Ʒ)
	 * ����۸�ķ���,�ܼ۸�=����*����(������Ҫ��������)
	 * 
	 */
	
	//��������
	private String name;
	private String type;
	private int number;
	private double price;
	
	
	//a.���ù��췽��
	public Product(String name,String type,int number,double price){
	}
	
	
	public Product(){}
	//b.���ÿ�
	{
		System.out.println("��ߵ����˿�");
		name = "С��2S";
		type = "�ֻ�����";
		number = 100;
		price = 1999.9;
		System.out.println("��Ʒ����:"+name);
		System.out.println("��Ʒ���:"+type);
		System.out.println("��Ʒ����:"+number);
		System.out.println("��Ʒ�۸�:"+price);
	}
	
	
	//c.����set��get����
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
	
	
	//���򷽷�
	
	public double buy(int numeber){
		return getPrice()*number;
	}

}
