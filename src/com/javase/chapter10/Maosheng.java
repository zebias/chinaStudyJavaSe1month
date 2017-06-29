package com.javase.chapter10;

public class Maosheng extends Animals{

	/**
	 * 构造方法
	 * super(); 默认存在
	 * @param name:名称(父类的属性)
	 * @param type:类型(父类的属性)
	 */
	public Maosheng(String name,String type) {
		super(name);
		// TODO Auto-generated constructor stub
		//代表父类对象,可以调用父类属性
		super.setName(name);
		super.setType(type);
		
		
		
	}
	
	
}
