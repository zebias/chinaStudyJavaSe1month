package homework13;

/**
 * @author Administrator 
 * ��ҵ2�� ��Ŀ��
 *         ģ��ʵ���û�������Ʒ�Ĺ��ܣ�ʹ������ģ����Ʒ�б�
 *         ���������Ʒ�����ڻ�����Ʒ���Ϊ0ʱ���׳��Զ����쳣��
 *         �û�����ĳһ����Ʒʱ�����쳣���д������Կ����иı䡣
 *         ���㣺�Զ����쳣���쳣����throw/throws�ؼ��� �Ѷȣ���
 * 
 */
public class Products {
	private String name;
	private int number;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public int getNumber(){
		return number;
	}
	
	public Products(String name,int number){
		setName(name);
		setNumber(number);
	}
	
	public Products(){}
}
