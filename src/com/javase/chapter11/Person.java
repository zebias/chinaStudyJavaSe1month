package com.javase.chapter11;

/**
 * 请写Person类，有属性姓名和年龄；
请写出其构造方法，及Setter，Getter方法，需要使用this关键字
	要求如下：
	String  name;
	int  age; 
	boolean  gender 
	Person  partner。
  为Person类写一个marry(Person  p)方法，代表当前对象和p结婚，如若可以结婚，则输出恭贺信息，
  否则输出不能结婚原因。要求在另外一个类中写一个主方法，来测试以上程序。
 （下列情况不能结婚：1，同性；2，未达到结婚年龄，男<24，女<22；3，某一方已婚）
 * 
 * 
 * @author Administrator
 *
 */
public class Person {
	
	private String name;		//姓名
	private int age;			//年龄
	private boolean gender;	//男女 false男 true女
	private Person partner;		//是否有配偶
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Person getPartner() {
		return partner;
	}
	public void setPartner(Person partner) {
		this.partner = partner;
	}
	
	public Person(String name,int age,boolean gender,Person partner){
		this.name = name ;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}
	
	public Person(){}
	
	//1.sex方法
	public void sex(Person p1){
		//判断是否为同性
		if(isGender()==p1.isGender()){
			System.out.println("对不起,你们之间的小故事我们不懂");
		}
	}
	//2.upAge方法
	public void upAge(Person p1){
		//判断年龄
		if(getAge()<24 || p1.getAge()<22){
			System.out.println("对不起,你们还未到国家法定的结婚年龄");
		}
	}
	
	//marry方法
	public void marry(Person p1){
		//判断是否已婚
			if(partner==null && p1.partner ==null){
				System.out.println("祝您们新婚快乐!");
			}else{
				System.out.println("对不起,我们不赞成当小三");
			}
	}
		
}

