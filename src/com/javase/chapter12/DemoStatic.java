package com.javase.chapter12;

/**
 * @author Administrator
 *static���ε��������������
 */
public class DemoStatic {
	public static void main(String[] args) {
		
		//1.��������
		Person person = new Person();
		Person.name ="����";
		Person.show();
		person.listen();
	}
	

}

class Person{
	
	//static��������
	public static String name ="����";
	
	int number=3;
	
	//static���η���
	public static void show(){
		System.out.println(name);
		//�ڷ����п���new����
		Person person2 = new Person();
		person2.name="����";
		
		System.out.println(name);
	}
	
	//��̬�������÷Ǿ�̬����(�޷�����)
/*	public static void look(){
		System.out.println(this.numer);
	}*/
	
	//�Ǿ�̬�������þ�̬����(���Ե���)
	public void listen(){
		System.out.println(name);
		
	}
}
