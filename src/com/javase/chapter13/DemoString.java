package com.javase.chapter13;

public class DemoString {

	public static void main(String[] args) {

		System.out.println("kjadfwe ulihfhwekjf".charAt(0));
		System.out.println("238752389057wefuihwef".codePointAt(0));
		System.out.println("238752389057wefuihwef".codePointCount(0,1));
		String[] split = "238752389057wef/uihwef".split("/");
		for(String a: split){
			System.out.println(a);
		}
		System.out.println(split[split.length-1]);
		System.out.println();
		System.out.println("238752389057wefuihwef".substring(0, 3)); //从下标0 - 下标3 012  238
		System.out.println("238752389057wefuihwef".substring(2)); //从下标2开始读取
		System.out.println("238752389057wefuihwef".replace('2','m')); //把2替换成m
		System.out.println("238752389057wefuihwef".replaceAll("238", "weew")); //把238替换成weew
		System.out.println("238752389057wefuihwef");
		System.out.println("238752389057wefuihwef");
		System.out.println("238752389057wefuihwef");
		System.out.println("238752389057wefuihwef");
		System.out.println("238752389057wefuihwef");
		System.out.println("238752389057wefuihwef");
		System.out.println("238752389057wefuihwef");
		System.out.println("238752389057wefuihwef");
		
		//基本类型装String
		String sss = String.valueOf(12);
		
		//String转基本
		Integer.parseInt(sss);

	}

}
