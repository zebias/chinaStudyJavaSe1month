package homework11;

/**
 * 
 * 3.ʵ�ּ��׹��ﳵС������Ҫ��һ����Ʒ���һ�����ﳵ�࣬ 
 * ��ʵ����Ʒ���չʾ��Ʒ�Ĺ��ܺ͹��ﳵ��������Ʒ��
 * �޸���Ʒ������ɾ����Ʒ�������ܼ۸�չʾ���ﳵ��Ʒ�Ĺ���
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class Product {

	// �����Ա����
	private String name;
	private int number;
	private double price;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// չʾ����
	public void show() {
		System.out.println("��Ʒ����:"+name);
		System.out.println("��Ʒ����"+number);
		System.out.println("��Ʒ�۸�:"+price);
		System.out.println("��Ʒ�ܼ���:"+number*price);
	}
	
	

}
