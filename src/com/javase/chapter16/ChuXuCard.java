package com.javase.chapter16;

import java.util.ArrayList;
import java.util.List;

public class ChuXuCard extends FatherCard {
	
	//��������
	List<FatherCard> chuCard = new ArrayList<>();
	
	//������Ϣ
	public void totalLi(){}

	@Override
	public  void lookMoney(String name) {
		// TODO Auto-generated method stub
		//��������û�
		for(FatherCard chu : chuCard){
			//�ж��Ƿ��и��û�
			if(chu.getName().equals(name)){
				//�����ԓ�Ñ����N
				System.out.println("���˻�����ǣ�"+ chu.getMoney());
			}
			
		}
		
	}

	@Override
	public void cunMoney(String name, double money) {
		// TODO Auto-generated method stub
		//��������û�
				for(FatherCard chu : chuCard){
					//�ж��Ƿ��и��û�
					if(chu.getName().equals(name)){
						//�����ԓ�Ñ����N���д�����
						System.out.println(chu.getMoney());
					}
					
				}
	}

	@Override
	public void quMoney(String name, double money) {
		// TODO Auto-generated method stub
		
		//��������û�
		for(FatherCard chu : chuCard){
			//�ж��Ƿ��и��û�
			if(chu.getName().equals(name)){
				//�����ԓ�Ñ����N���д�����
				
			}
			
		}
	}
	
	//�вι���
	public ChuXuCard(String name,double money){
		super(name,money);
	}
}
