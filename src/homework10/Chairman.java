package homework10;

public class Chairman extends Emp{
	private double sub;
	
	
	public void setSub(double sub){
		this.sub = sub;
	}
	
	public double getSub(){
		return sub;
	}
	
	/**
	 * show方法
	 */
	@Override
	public void show(){
		
		System.out.println("员工职位:"+getName());
		System.out.println("居住地址:"+getAddress());
		System.out.println("基本工资:"+getBasic());
		System.out.println("交通补助:"+getSub());
		System.out.println("-------------------------");
		
	}
	
	//有参调用
	public Chairman(String name,String address,int basic,double sub){
		super(name,address,basic);
		this.sub = sub;
	}
}
