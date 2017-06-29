package com.javase.chapter;

public class Hero {
	/*
	 * 1.自定义一个英雄类 ,英雄的级别最低为0，最高为30级，经验值最低为0，最高为30级时的经验值
	 * 该类中要求有一个含有参数的构造函数，参数为英雄的经验值，
	 * 初始化时要保证经验值在要求范围之内，通过经验值计算英雄的级别，
	 * 英雄的级别计算公式如下： N=当前级别，EXP（经验值）=30（N^3+5N）-80 
	 * 构建一个无参的构造方法，将经验值设置为0
	 * 利用英雄类无参和带有参数的构造函数分别构建英雄对象，并输出英雄的等级和经验值。
	 * 
	 * 
	 */
	
	
	//定义属性
	private int level;	//等级
	private int exp;	//经验
	
	//有参构造方法
	public Hero(int level){
		//在最小值和最大值范围以内
		if(this.level>=0 && level<=30){
		//获取当前经验
			int temp = 30*(level*level*level+5*level)-80;
			
			if(temp>=0){
				this.exp = temp;
			}else{
				this.exp = 0;
			}
			
		}else if(level<0){
			this.level = 0;
			this.exp = 0;
		}else{
			this.level = 30;
			this.exp = 30*(30*30*30+5*30)-80;
		}
		System.out.println("英雄的等级是"+level+"\n英雄的经验值是"+exp);
	
	}
	
	
	//无参构造方法
	public Hero(){
		this.exp = 0;
	}
	
	//定义方法
	public void getExp(int level){
		//在最小值和最大值范围以内
				if(this.level>=0 && level<=30){
				//获取当前经验
					int temp = 30*(level*level*level+5*level)-80;
					
					if(temp>=0){
						this.exp = temp;
					}else{
						this.exp = 0;
					}
					
				}else if(level<0){
					this.level = 0;
					this.exp = 0;
				}else{
					this.level = 30;
					this.exp = 30*(30*30*30+5*30)-80;
				}
				System.out.println("英雄的等级是"+level+"\n英雄的经验值是"+exp);
	}
	
	
	
}
