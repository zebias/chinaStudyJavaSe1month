package com.javase.chapter10;

public class Maosheng extends Animals{

	/**
	 * ���췽��
	 * super(); Ĭ�ϴ���
	 * @param name:����(���������)
	 * @param type:����(���������)
	 */
	public Maosheng(String name,String type) {
		super(name);
		// TODO Auto-generated constructor stub
		//���������,���Ե��ø�������
		super.setName(name);
		super.setType(type);
		
		
		
	}
	
	
}
