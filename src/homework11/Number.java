package homework11;

import java.util.Scanner;

/**
 * 1.编写Java程序，模拟简单的计算器。
 * 定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。
 * 编写构造方法，赋予n1和n2初始值，
 * 再为该类定义加（addition）、减（subtration）、乘（multiplication）、
 * 除（division）等公有成员方法，分别对两个成员变量执行
 * 
 * 加、减、乘、除的运算。 在main方法中创建Number类的对象，
 * 调用各个方法，并显示计算结果。
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
	
	//有参构造方法

	public Number(double n1,double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	//加
	public void addition(){
		System.out.println(getN1()+getN2());
	}
	
	//减
	public void subtration(){

		System.out.println(getN1()-getN2());
	}
	
	//乘
	public void multiplication(){

		System.out.println(getN1()*getN2());
	}
	
	//除
	public void division(){

		System.out.println(getN1()/getN2());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入第一个数:");
		double n1 = scanner.nextDouble();
		System.out.print("请输入运算符号:");
		String fa = scanner.next();
		System.out.print("请输入第二个数:");
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
			System.out.println("请不要搞事情!");
		}
	}
}
