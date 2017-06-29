package homework14;

public class Product {
	private String name; //商品名称
	private double price; //价格
	private int number; //数量
	private String type; //类型
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product(String name, double price, int number, String type) {
		super();
		this.name = name;
		this.price = price;
		this.number = number;
		this.type = type;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [商品名称=" + name + ", 商品价格=" + price + ", 商品数量=" + number + ", 商品类型=" + type + "]";
	}
	
	
	
}
