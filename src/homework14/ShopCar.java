package homework14;

import java.util.ArrayList;

public class ShopCar {
	// 创建一个ArrayList集合
	// 购物车集合
	ArrayList<Product> productShopCar = new ArrayList<>();

	// 展示商品列表的方法
	public void showlist(ArrayList<Product> p) {
		for(Product p1 : p){
			System.out.println(p1);
		}
	}

	// 购买商品的方法
	public void buy(String name,ArrayList<Product> p) throws NumberException {
		// 遍历商品列表
		for (Product p1 : p) {
			if (p1.getName().equals(name)) {
				if (p1.getNumber() > 0) {
					p1.setNumber(1);
					productShopCar.add(p1);
					return;
				} else {
					try {
						throw new ProductNotFoundException("您购买的商品卖光了");
					} catch (ProductNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		}
		throw new NumberException("您购买的商品没有了");
	}

	// 修改商品数量的方法 
	
	//参数列表中的集合是商品列表中的
	public void change(String name, int number,ArrayList<Product> p) {
		//计算的数
		int count = 0;
		int count2= 0;
		
		//遍历购物车
		for (Product product : productShopCar) {
			if (product.getName().equals(name)) {
				product.setNumber(number);
				count+=number;
				return;
			}
		}
		//遍历商品列表
		for(int i = 0 ;i<p.size();i++){
			if(p.get(i).getName().equals(name)){
			count2 = p.get(i).getNumber()-count;
			p.get(i).setNumber(count2);
			return;
			}
			
		}
	}

	// 删除商品的方法
	public void delete(String name) {
		/*// 遍历购物车
		for (Product product : productShopCar) {
			// 判断购物车中是否有要删除的商品 id
			if (product.getName().equals(name)) {

				product = null;

			}
		}*/
		
		for(int i = 0;i<productShopCar.size();i++){
			if(productShopCar.get(i).getName().equals(name)){
				productShopCar.remove(i);
			}
		}
	}

	// 计算总价的方法
	public double total() {
		double totalNum=0;
		for (Product product : productShopCar) {
			totalNum = product.getNumber()*product.getPrice();
		}

		return totalNum;
	}

	// 展示购物车列表的方法
	public void show() {
		for (Product product : productShopCar) {
			System.out.println(product);
		}
	}
}
