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
		
		System.out.println("Ա��ְλ:"+getName());
		System.out.println("��ס��ַ:"+getAddress());
		System.out.println("��������:"+getBasic());
		System.out.println("������:"+getManage());
		System.out.println("-------------------------");
		
	}

	//�޲ε���(�����޲������в�)
	public Manager(String name,String address,int basic,String manage){
			setName(name);
			setAddress(address);
			setBasic(basic);
			setManage(manage);
					
	}
		
}
