package com.javase.chapter16;

import java.util.ArrayList;
import java.util.List;

public class XinYongCard extends FatherCard {
	
	//���ÿ�����
	List<FatherCard> xinCard = new ArrayList<>();

	//͸֧���
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
	
	//�вι���
	public XinYongCard(String name,double money){
		super(name,money);
	}
	
}
