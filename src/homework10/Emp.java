package homework10;

/**
 * 
 *2.����Ա���࣬����������ַ�������������ԣ�
 *������;�������������ԣ��������н�ͨ�����������������ܲ��ţ�
 *�������ж�����ʾ�������Ϣ�ķ���show������ʵ�ַ�ʽ��ͬ��
 *��д�����๹�췽���������Ե�get��set������
 *��Ҫ�õ�this��super�ؼ��֡�
 
 * @author Administrator
 *
 */
public class Emp {
	
	private String name;
	private String address;
	private int basic;
	
	//setting��getting
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
	 * show����
	 */
	public void show(){
		
		
		System.out.println("Ա��ְλ:"+name);
		System.out.println("��ס��ַ:"+address);
		System.out.println("��������:"+basic);
		System.out.println("-------------------------");
		
	}
	
	//�޲ι��췽��
	public Emp(){
		
	}
	//�в������췽��
	public Emp(String name,String address,int basic){
		this.name = name;
		this.address = address;
		this.basic = basic;
	}
}
