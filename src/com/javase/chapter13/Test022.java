package com.javase.chapter13;

public class Test022 {

	public static void main(String[] args) {
		
		String s = finallyMethod();
		System.out.println(s);
	}
	
	
	public static String finallyMethod(){
		int i = 1;
		try{
			i++;
			int j = 1/0;
			return "try"+i;
		} catch( Exception e){
			return "catch"+i;
		} finally{
			i=i+100;
			
		}
	}
}
