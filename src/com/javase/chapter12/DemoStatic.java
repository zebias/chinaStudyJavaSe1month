package com.javase.chapter12;

/**
 * @author Administrator
 *static修饰的属性是属于类的
 */
public class DemoStatic {
	public static void main(String[] args) {
		
		//1.创建对象
		Person person = new Person();
		Person.name ="总是";
		Person.show();
		person.listen();
	}
	

}

class Person{
	
	//static修饰属性
	public static String name ="张三";
	
	int number=3;
	
	//static修饰方法
	public static void show(){
		System.out.println(name);
		//在方法中可以new对象
		Person person2 = new Person();
		person2.name="不是";
		
		System.out.println(name);
	}
	
	//静态方法调用非静态属性(无法调用)
/*	public static void look(){
		System.out.println(this.numer);
	}*/
	
	//非静态方法调用静态属性(可以调用)
	public void listen(){
		System.out.println(name);
		
	}
}
