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
	 * 工具方法
	 * 
	 * @param name:商品名
	 * @param list:商品列表
	 */
	public static int listProduct(String name, List<Product> list) {
		//遍历商品列表
		for (int i = 0; i < list.size(); i++) {
			//判断是否有该商品
			if (list.get(i).getName().equals(name)) {
				//返回下标
				return i;
			} 
		}
		return -1;
	}
	
		/**
		 * 展示商品列表
		 * @param list:商品列表
		 */
		public static void show(List<Product> list){
			for (Product product : list) {
				System.out.println(product);
			}
		}

}
