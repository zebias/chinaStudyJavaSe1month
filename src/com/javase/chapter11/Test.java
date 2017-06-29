package com.javase.chapter11;


public class Test {
	//创建一个测试方法
	public void test1(Emp emp){
		emp.show();
		if(emp instanceof Chainmen){
			Chainmen chainmen = (Chainmen)emp;
			chainmen.total();
		}else if(emp instanceof Worker ){
			Worker manage = (Worker)emp;
			manage.total();
		}
		
		//向下转型
		
	}
	
	public static void main(String[] args) {
		
		Chainmen chainmen = new Chainmen();
		chainmen.setName("张三");
		chainmen.setAge(24);
		chainmen.setPosition("老板");
		
		Worker worker = new Worker();
		worker.setName("李斯");
		worker.setAge(22);
		worker.setPosition("程序员");
		//
		Test test = new Test();
		test.test1(chainmen);
		test.test1(worker);
	}
}
