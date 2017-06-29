package homework11;

/**
 * 
 * 2.建立一个汽车Auto类，包括轮胎个数，汽车颜色，车身重量、速度等成员变量。 并通过不同的构造方法创建实例。至少要求：汽车能够加速，减速，停车。
 * 再定义一个小汽车类Car，继承Auto，并添加空调、CD等成员变量，覆盖加速，减速的方法
 * 
 * @author Administrator
 *
 */
public class Auto {
	private int number; // 轮胎个数
	private String color; // 汽车颜色
	private double weight; // 汽车重量
	private int speed; // 速度

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// 无参数构造
	public Auto(){}

	// 有参数构造
	
	public Auto(int number,String color,double weight,int speed){
		this.number = number;
		this.color= color;
		this.weight = weight;
		this.speed = speed;
	}

	// 加速方法
	public void add() {

	}

	// 减速方法
	public void cut() {

	}

	// 停车
	public void stop() {

	}
}
