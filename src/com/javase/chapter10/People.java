package com.javase.chapter10;

/**
 * ����(����)
 * @author Administrator
 *
 */
public class People {
	
	//����
	/**
	 * @param:name:����
	 * @param:type:����
	 * @param:life:����
	 * @param:sex:�Ա�
	 * @param:age:����
	 */
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String type;
	private int life;
	private char sex;
	private int age;
	public People(String name,String type,int life,char sex,int age) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public People(){}
	
	public String hunt(){
		return "��Ҫ������!";
	}
	

}
