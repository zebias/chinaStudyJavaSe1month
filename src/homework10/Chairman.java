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
	 * show����
	 */
	@Override
	public void show(){
		
		System.out.println("Ա��ְλ:"+getName());
		System.out.println("��ס��ַ:"+getAddress());
		System.out.println("��������:"+getBasic());
		System.out.println("��ͨ����:"+getSub());
		System.out.println("-------------------------");
		
	}
	
	//�вε���
	public Chairman(String name,String address,int basic,double sub){
		super(name,address,basic);
		this.sub = sub;
	}
}
