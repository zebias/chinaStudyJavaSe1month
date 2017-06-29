package homework10;

/**
 * 
 * 现有交通工具体系，总类为交通工具，
 * 交通工具分为汽车，船只，飞机，
 * 而汽车又分为轿车和公交车，
 * 每个类中都有show方法，说明自己是什么交通工具，请写出这些类，并使用测试类测试
 *  
 * @author Administrator
 *
 */
public class Vehicle {
	
	//定于属性
	private String name;
	
	//setting和getting
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	//有参构造方法
	public Vehicle(String name){
		this.name = name;
	}
	//无参构造方法
	
	public Vehicle(){
		
	}
	//普通有参方法
	public void show(String name){
		this.name = name;
		System.out.println("我是"+name);
	}
}
