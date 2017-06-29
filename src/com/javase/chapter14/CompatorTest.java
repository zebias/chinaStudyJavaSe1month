package com.javase.chapter14;

import java.util.Comparator;

public class CompatorTest implements Comparator<Products> {

	@Override
	public int compare(Products o1, Products o2) {
		// TODO Auto-generated method stub
		if(o1.getNumber()>o2.getNumber()){
			return 1;
		}else if(o1.getNumber()<o2.getNumber()){
			return -1;
		}else{
		return 0;
		}
	}

}
