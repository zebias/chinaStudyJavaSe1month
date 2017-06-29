package com.javase.chapter16;

import java.util.ArrayList;
import java.util.List;

public class XinYongCard extends FatherCard {
	
	//信用卡集合
	List<FatherCard> xinCard = new ArrayList<>();

	//透支余额
	public void touZi(){}

	@Override
	public  void lookMoney(String name) {
		// TODO Auto-generated method stub
		super.lookMoney(name);
	}

	@Override
	public void cunMoney(String name, double money) {
		// TODO Auto-generated method stub
		super.cunMoney(name, money);
	}

	@Override
	public void quMoney(String name, double money) {
		// TODO Auto-generated method stub
		super.quMoney(name, money);
	}
	
	//有参构造
	public XinYongCard(String name,double money){
		super(name,money);
	}
	
}
