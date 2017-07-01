package com.javase.chapter20;

public class Test {
	public static void main(String[] args) {
		int sum = 0;
		outline: for(int i = 1;i<10;i++){
			inline:for(int j = 1;j<3;j++){
				sum+=j;
				if(i+j>6){
					break inline;
				}
			}
		}

		System.out.println(sum);
	}
}
