package com.javase.chapter10;

public class Test {
	
	public static void main(String[] args) {
		
		Lion lion = new Lion("茂");
		//lion.setName("狮子");
		lion.setSex('公');
		System.out.println("名称:"+lion.getName()+"\n性别:"+lion.getSex());
		
		
		
		Maosheng maosheng = new Maosheng("茂胜", "男");
		System.out.println("名称"+maosheng.getName()+"\n类型:"+maosheng.getType());
	}

}
