package homework10;

/**
 * 
 *2.现有员工类，有姓名，地址，基本工资属性，
 *董事类和经理类除以上属性，董事类有交通补助，经理类有所管部门，
 *三个类中都有显示其基本信息的方法show，但其实现方式不同，
 *请写出各类构造方法，及属性的get，set方法。
 *并要用到this和super关键字。
 
 * @author Administrator
 *
 */
public class Emp {
	
	private String name;
	private String address;
	private int basic;
	
	//setting和getting
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	
	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}
	
	public void setBasic(int basic){
		this.basic = basic;
	}
	
	public int getBasic(){
		return basic;
	}
	
	
	/**
	 * show方法
	 */
	public void show(){
		
		
		System.out.println("员工职位:"+name);
		System.out.println("居住地址:"+address);
		System.out.println("基本工资:"+basic);
		System.out.println("-------------------------");
		
	}
	
	//无参构造方法
	public Emp(){
		
	}
	//有参数构造方法
	public Emp(String name,String address,int basic){
		this.name = name;
		this.address = address;
		this.basic = basic;
	}
}
