package homework18;

import java.util.List;

public class Product {
	private String name;
	private int number;
	private double price;
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", number=" + number + ", price=" + price + ", type=" + type + "]";
	}

	public Product(String name, int number, double price, String type) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
		this.type = type;
	}

	public Product() {
		super();
	}

	/**
	 * ���߷���
	 * 
	 * @param name:��Ʒ��
	 * @param list:��Ʒ�б�
	 */
	public static int listProduct(String name, List<Product> list) {
		//������Ʒ�б�
		for (int i = 0; i < list.size(); i++) {
			//�ж��Ƿ��и���Ʒ
			if (list.get(i).getName().equals(name)) {
				//�����±�
				return i;
			} 
		}
		return -1;
	}
	
		/**
		 * չʾ��Ʒ�б�
		 * @param list:��Ʒ�б�
		 */
		public static void show(List<Product> list){
			for (Product product : list) {
				System.out.println(product);
			}
		}

}
