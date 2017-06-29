package com.javase.chapter16;

import java.util.ArrayList;
import java.util.List;

public class ChuXuCard extends FatherCard {
	
	//创建集合
	List<FatherCard> chuCard = new ArrayList<>();
	
	//计算利息
	public void totalLi(){}

	@Override
	public  void lookMoney(String name) {
		// TODO Auto-generated method stub
		//便利储蓄卡用户
		for(FatherCard chu : chuCard){
			//判断是否有该用户
			if(chu.getName().equals(name)){
				//如果有該用戶那麼
				System.out.println("您账户余额是："+ chu.getMoney());
			}
			
		}
		
	}

	@Override
	public void cunMoney(String name, double money) {
		// TODO Auto-generated method stub
		//便利储蓄卡用户
				for(FatherCard chu : chuCard){
					//判断是否有该用户
					if(chu.getName().equals(name)){
						//如果有該用戶那麼进行存款操作
						System.out.println(chu.getMoney());
					}
					
				}
	}

	@Override
	public void quMoney(String name, double money) {
		// TODO Auto-generated method stub
		
		//便利储蓄卡用户
		for(FatherCard chu : chuCard){
			//判断是否有该用户
			if(chu.getName().equals(name)){
				//如果有該用戶那麼进行存款操作
				
			}
			
		}
	}
	
	//有参构造
	public ChuXuCard(String name,double money){
		super(name,money);
	}
}
