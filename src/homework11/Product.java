package homework11;

/**
 * 
 * 3.实现简易购物车小程序，需要有一个商品类和一个购物车类， 
 * 能实现商品类的展示商品的功能和购物车类的添加商品，
 * 修改商品数量，删除商品，计算总价格，展示购物车商品的功能
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class Product {

	// 定义成员变量
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

	// 展示方法
	public void show() {
		System.out.println("商品名称:"+name);
		System.out.println("商品数量"+number);
		System.out.println("商品价格:"+price);
		System.out.println("商品总价是:"+number*price);
	}
	
	

}
