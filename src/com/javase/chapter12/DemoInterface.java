package com.javase.chapter12;

public  class DemoInterface extends DemoStatic implements Lock,Key{
	public void open(){
		System.out.println("open");
	}
	public void close(){
		System.out.println("close");
	}
}
