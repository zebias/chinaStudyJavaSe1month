package com.javase.chapter11;


public class Test {
	//����һ�����Է���
	public void test1(Emp emp){
		emp.show();
		if(emp instanceof Chainmen){
			Chainmen chainmen = (Chainmen)emp;
			chainmen.total();
		}else if(emp instanceof Worker ){
			Worker manage = (Worker)emp;
			manage.total();
		}
		
		//����ת��
		
	}
	
	public static void main(String[] args) {
		
		Chainmen chainmen = new Chainmen();
		chainmen.setName("����");
		chainmen.setAge(24);
		chainmen.setPosition("�ϰ�");
		
		Worker worker = new Worker();
		worker.setName("��˹");
		worker.setAge(22);
		worker.setPosition("����Ա");
		//
		Test test = new Test();
		test.test1(chainmen);
		test.test1(worker);
	}
}
