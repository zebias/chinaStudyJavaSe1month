package homework10;

/**
 * 
 * ���н�ͨ������ϵ������Ϊ��ͨ���ߣ�
 * ��ͨ���߷�Ϊ��������ֻ���ɻ���
 * �������ַ�Ϊ�γ��͹�������
 * ÿ�����ж���show������˵���Լ���ʲô��ͨ���ߣ���д����Щ�࣬��ʹ�ò��������
 *  
 * @author Administrator
 *
 */
public class Vehicle {
	
	//��������
	private String name;
	
	//setting��getting
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	//�вι��췽��
	public Vehicle(String name){
		this.name = name;
	}
	//�޲ι��췽��
	
	public Vehicle(){
		
	}
	//��ͨ�вη���
	public void show(String name){
		this.name = name;
		System.out.println("����"+name);
	}
}
