package homework11;

import java.util.Scanner;

/**
 * 1.��дJava����ģ��򵥵ļ�������
 * ������ΪNumber���࣬�����������������ݳ�Աn1��n2��Ӧ����Ϊ˽�С�
 * ��д���췽��������n1��n2��ʼֵ��
 * ��Ϊ���ඨ��ӣ�addition��������subtration�����ˣ�multiplication����
 * ����division���ȹ��г�Ա�������ֱ��������Ա����ִ��
 * 
 * �ӡ������ˡ��������㡣 ��main�����д���Number��Ķ���
 * ���ø�������������ʾ��������
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class Number {
	private double n1;
	private double n2;
	
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	//�вι��췽��

	public Number(double n1,double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	//��
	public void addition(){
		System.out.println(getN1()+getN2());
	}
	
	//��
	public void subtration(){

		System.out.println(getN1()-getN2());
	}
	
	//��
	public void multiplication(){

		System.out.println(getN1()*getN2());
	}
	
	//��
	public void division(){

		System.out.println(getN1()/getN2());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������һ����:");
		double n1 = scanner.nextDouble();
		System.out.print("�������������:");
		String fa = scanner.next();
		System.out.print("������ڶ�����:");
		double n2 = scanner.nextDouble();
		
		scanner.close();
		Number number = new Number(n1, n2);
		if(fa.equals("+")){
		number.addition();
		}else if(fa.equals("/")){
		number.division();
		}else if(fa.equals("-")){
		number.subtration();
		}else if(fa.equals("*")){
		number.multiplication();
		}else{
			System.out.println("�벻Ҫ������!");
		}
	}
}
