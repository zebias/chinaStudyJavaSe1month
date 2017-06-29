package homework13;

/**
 * @author Administrator 
 * 作业2： 题目：
 *         模拟实现用户购买商品的功能，使用数组模拟商品列表，
 *         当购买的商品不存在或者商品库存为0时，抛出自定义异常。
 *         用户购买某一个商品时，对异常进行处理，并对库存进行改变。
 *         考点：自定义异常、异常处理、throw/throws关键字 难度：中
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
