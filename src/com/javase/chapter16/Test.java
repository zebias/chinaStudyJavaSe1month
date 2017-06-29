package com.javase.chapter16;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建一个银行卡集合（ArrayList）
		List<FatherCard> fCard  = new ArrayList<>();
		
		//集合里添加默认账户
		
		fCard.add(new FatherCard("admin",1000));
		
		

	}

}
