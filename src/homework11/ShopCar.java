package homework11;

public class ShopCar extends Product {

	// չʾ����(��������д)
	public void show() {
		System.out.println("��Ʒ����:" + getName());
		System.out.println("��Ʒ����" + getNumber());
		System.out.println("��Ʒ�۸�:" + getPrice());
		System.out.println("��Ʒ�ܼ���:" + getNumber() * getPrice());
	}

	// �Լ��ķ���
	public void add(Product p) {
		
		System.out.println("���������Ʒ�ķ���");
	}

	// �޸���Ʒ
	public void change() {

		System.out.println("�����޸���Ʒ�ķ���");
	}

	// del��Ʒ
	public void del() {

		System.out.println("����ɾ����Ʒ�ķ���");
	}

	// total
	public void total() {

		System.out.println("���Ǽ�����Ʒ�ܼ۵ķ���");
	}
	
	//���췽��
	
	public ShopCar(String name,int number,double price){
		super.setName(name);
		super.setNumber(number);
		super.setPrice(price);
	}
	
	public ShopCar(){}
}
