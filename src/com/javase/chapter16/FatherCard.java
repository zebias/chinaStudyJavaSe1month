package com.javase.chapter16;

/**
 * @author ��
 *4.ATMС������Ҫ��һ���������п����������ࣺ��������ÿ�
	���п����Բ�ѯ���ʹ�ȡ��
	������Լ�����Ϣ ����ϢΪÿ�δ����İٷ�֮����	
	���ÿ�����͸֧��ȣ�͸֧���ͳһ10000��
	ÿ�β�������Ҫ��ӡ��Ӧ��־
	
 */
public class FatherCard {
	
	private String name; //����
	private double money; //���
	
	
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
		return "�û�����" + name + ", �˻����:" + money + ".";
	}
	
	public FatherCard() {
		// TODO Auto-generated constructor stub
	}
	
	

	public FatherCard(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}

	//��ѯ���
	public  void lookMoney(String name){
		
		
	}
	
	//���
	public void cunMoney(String name ,double money){}
	
	//ȡ��
	public void quMoney(String name,double money){}

}
