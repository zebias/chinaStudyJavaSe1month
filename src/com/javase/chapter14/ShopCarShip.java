package com.javase.chapter14;

import java.util.ArrayList;
import java.util.List;

public class ShopCarShip {

	// 购物车列表
	List<Products> product = new ArrayList<Products>();

	public void show(List<Products> p, String name) throws NumberException{

		for (Products p1 : p) {
			if (p1.getName().equals(name)) {
				if (p1.getNumber() > 0) {
						p1.setNumber(1);
						product.add(p1);
						return;
				}else{
					
					try {
						throw new NumberException("2");
					} catch (NumberException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw e;
					}
				}
			}
		}
		try{
		throw new ProductNotFoundException("没有该商品");
		} catch(ProductNotFoundException e){
			e.printStackTrace();
		}

	}
	
	public void shows(){
		for(Products p2 :product){
			System.out.println(p2);
		}
	}
}
