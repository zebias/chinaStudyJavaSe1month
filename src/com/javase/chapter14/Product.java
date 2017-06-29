package com.javase.chapter14;

public class Product implements Comparable<Product>{
	
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
	
	//´´½¨·½·¨
	public static Product buy(String name,Product[] p) throws NumberException{
		for (Product product : p) {
			if(product.getName().equals(name)){
				
				if(product.getNumber()>0){
					return product;
				}else{
					throw new NumberException("¿â´æÎª0");
				}
			}
		}
		return null;
	}
/*	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		if(p.getNumber()>this.getNumber()){
			return 1;
		}else if(p.getNumber()<this.getNumber()){
			return -1;
		}else{
			return 0;
		}
	}*/
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(o.getNumber()>this.getNumber()){
			return -1;
		}else if(o.getNumber() < this.getNumber()){
			return 1;
		}else{
		return 0;
		}
	}
	
	/*//×ÖµäÅÅĞò(µ¹Ğò)
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return o.getName().compareTo(this.getName());
	}
	//×ÖµäÅÅĞò(ÕıĞò)
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}*/
	
	// TODO É¶¶¼²»×ö
	
}
