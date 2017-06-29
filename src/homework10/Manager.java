package homework10;

public class Manager extends Emp{
	
	private String manage;
	
	public void setManage(String manage){
		this.manage = manage;
	}
	
	public String getManage(){
		return manage;
	}
	@Override
	public void show(){
		
		System.out.println("员工职位:"+getName());
		System.out.println("居住地址:"+getAddress());
		System.out.println("基本工资:"+getBasic());
		System.out.println("管理部门:"+getManage());
		System.out.println("-------------------------");
		
	}

	//无参调用(父类无参子类有参)
	public Manager(String name,String address,int basic,String manage){
			setName(name);
			setAddress(address);
			setBasic(basic);
			setManage(manage);
					
	}
		
}
