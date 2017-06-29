package com.javase.chapter16;

/**
 * @author 金华
 *4.ATM小程序，需要有一个父类银行卡和他的子类：储蓄卡和信用卡
	银行卡可以查询余额和存取款
	储蓄卡可以计算利息 （利息为每次存款金额的百分之三）	
	信用卡可以透支额度（透支额度统一10000）
	每次操作都需要打印对应日志
	
 */
public class FatherCard {
	
	private String name; //卡主
	private double money; //余额
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

	@Override
	public String toString() {
		return "用户名：" + name + ", 账户余额:" + money + ".";
	}
	
	public FatherCard() {
		// TODO Auto-generated constructor stub
	}
	
	

	public FatherCard(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	//查询余额
	public  void lookMoney(String name){
		
		
	}
	
	//存款
	public void cunMoney(String name ,double money){}
	
	//取款
	public void quMoney(String name,double money){}

}
