package homework11;

public class Car extends Auto {

	private boolean ene;
	private boolean cd;

	public boolean isEne() {
		return ene;
	}

	public void setEne(boolean ene) {
		this.ene = ene;
	}

	public boolean isCd() {
		return cd;
	}

	public void setCd(boolean cd) {
		this.cd = cd;
	}

	// ���ٷ���
	public void add() {

	}

	// ���ٷ���
	public void cut() {

	}

	//�޲ι���
	public Car() {

		// TODO Auto-generated constructor stub
		
	}
	
	//�вι���
	public Car(int number, String color, double weight, int speed,boolean ene,boolean cd) {
		super(number, color, weight, speed);
		// TODO Auto-generated constructor stub
		this.ene = ene;
		this.cd = cd;
	}
	
	

}
