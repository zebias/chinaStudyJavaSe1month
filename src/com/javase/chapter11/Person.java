package com.javase.chapter11;

/**
 * ��дPerson�࣬���������������䣻
��д���乹�췽������Setter��Getter��������Ҫʹ��this�ؼ���
	Ҫ�����£�
	String  name;
	int  age; 
	boolean  gender 
	Person  partner��
  ΪPerson��дһ��marry(Person  p)����������ǰ�����p��飬�������Խ�飬�����������Ϣ��
  ����������ܽ��ԭ��Ҫ��������һ������дһ�������������������ϳ���
 ������������ܽ�飺1��ͬ�ԣ�2��δ�ﵽ������䣬��<24��Ů<22��3��ĳһ���ѻ飩
 * 
 * 
 * @author Administrator
 *
 */
public class Person {
	
	private String name;		//����
	private int age;			//����
	private boolean gender;	//��Ů false�� trueŮ
	private Person partner;		//�Ƿ�����ż
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
	
	//1.sex����
	public void sex(Person p1){
		//�ж��Ƿ�Ϊͬ��
		if(isGender()==p1.isGender()){
			System.out.println("�Բ���,����֮���С�������ǲ���");
		}
	}
	//2.upAge����
	public void upAge(Person p1){
		//�ж�����
		if(getAge()<24 || p1.getAge()<22){
			System.out.println("�Բ���,���ǻ�δ�����ҷ����Ľ������");
		}
	}
	
	//marry����
	public void marry(Person p1){
		//�ж��Ƿ��ѻ�
			if(partner==null && p1.partner ==null){
				System.out.println("ף�����»����!");
			}else{
				System.out.println("�Բ���,���ǲ��޳ɵ�С��");
			}
	}
		
}

