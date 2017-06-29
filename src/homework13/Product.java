package homework13;

public class Product {
	
	private String name;
	private int number;
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
	@Override
	public String toString() {
		return "Product [name=" + name + ", number=" + number + "]";
	}
	
	public Product(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public Product() {
		super();
	}
	
	//创建方法
	public static Product buy(String name,Product[] p) throws NumberException{
		for (Product product : p) {
			if(product.getName().equals(name)){
				
				if(product.getNumber()>0){
					return product;
				}else{
					throw new NumberException("库存为0");
				}
			}
		}
		return null;
	}
}
