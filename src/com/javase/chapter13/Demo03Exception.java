package com.javase.chapter13;

public class Demo03Exception {
	
	public void test(){
		int i = 3;
		int j = 0 ;
		if(j>=0){
			try{
			throw new NumberException("j不能小于0");
			} catch(NumberException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Demo03Exception demo03Exception = new Demo03Exception();
		
		demo03Exception.test();
	}
	
	

}
