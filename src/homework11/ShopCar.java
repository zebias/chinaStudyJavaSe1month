package homework11;

public class ShopCar extends Product {

	// 展示方法(方法的重写)
	public void show() {
		System.out.println("商品名称:" + getName());
		System.out.println("商品数量" + getNumber());
		System.out.println("商品价格:" + getPrice());
		System.out.println("商品总价是:" + getNumber() * getPrice());
	}

	// 自己的方法
	public void add(Product p) {
		
		System.out.println("我是添加商品的方法");
	}

	// 修改商品
	public void change() {

		System.out.println("我是修改商品的方法");
	}

	// del商品
	public void del() {

		System.out.println("我是删除商品的方法");
	}

	// total
	public void total() {

		System.out.println("我是计算商品总价的方法");
	}
	
	//构造方法
	
	public ShopCar(String name,int number,double price){
		super.setName(name);
		super.setNumber(number);
		super.setPrice(price);
	}
	
	public ShopCar(){}
}
