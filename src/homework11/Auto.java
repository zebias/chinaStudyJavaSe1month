package homework11;

/**
 * 
 * 2.����һ������Auto�࣬������̥������������ɫ�������������ٶȵȳ�Ա������ ��ͨ����ͬ�Ĺ��췽������ʵ��������Ҫ�������ܹ����٣����٣�ͣ����
 * �ٶ���һ��С������Car���̳�Auto������ӿյ���CD�ȳ�Ա���������Ǽ��٣����ٵķ���
 * 
 * @author Administrator
 *
 */
public class Auto {
	private int number; // ��̥����
	private String color; // ������ɫ
	private double weight; // ��������
	private int speed; // �ٶ�

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

	// �޲�������
	public Auto(){}

	// �в�������
	
	public Auto(int number,String color,double weight,int speed){
		this.number = number;
		this.color= color;
		this.weight = weight;
		this.speed = speed;
	}

	// ���ٷ���
	public void add() {

	}

	// ���ٷ���
	public void cut() {

	}

	// ͣ��
	public void stop() {

	}
}
