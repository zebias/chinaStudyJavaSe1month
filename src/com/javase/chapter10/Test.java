package com.javase.chapter10;

public class Test {
	
	public static void main(String[] args) {
		
		Lion lion = new Lion("ï");
		//lion.setName("ʨ��");
		lion.setSex('��');
		System.out.println("����:"+lion.getName()+"\n�Ա�:"+lion.getSex());
		
		
		
		Maosheng maosheng = new Maosheng("ïʤ", "��");
		System.out.println("����"+maosheng.getName()+"\n����:"+maosheng.getType());
	}

}
