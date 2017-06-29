package com.javase.chapter10;

public class Ms extends People{
	
	private boolean isChiRen;
	
	public boolean getIsChiRen() {
		if(isChiRen){
			System.out.println("√Ø”“≥‘»À¡À!!");
		}
		return isChiRen;
	}

	public void setChiRen(boolean isChiRen) {
		this.isChiRen = isChiRen;
	}

	public Ms(String name,String type,int life,char sex,int age,boolean isChiRen) {
		super(name,type,life,sex,age);
		this.isChiRen = isChiRen;
		// TODO Auto-generated constructor stub
	}

	public Ms(boolean isChiRen) {
		super();
		this.isChiRen = isChiRen;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String hunt() {
		// TODO Auto-generated method stub
		return super.hunt();
	}
	
	//
	
}
