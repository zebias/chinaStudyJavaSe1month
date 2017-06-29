package homework13;

import java.util.Scanner;

/**
 * @author Administrator 作业2： 题目： 模拟实现用户购买商品的功能，使用数组模拟商品列表，
 *         当购买的商品不存在或者商品库存为0时，抛出自定义异常。 用户购买某一个商品时，对异常进行处理，并对库存进行改变。
 *         考点：自定义异常、异常处理、throw/throws关键字 难度：中
 * 
 */
public class Homework02 {
	public static void main(String[] args) {

		// 创建对象数组
		Product[] products = new Product[3];
		// 赋值
		products[0] = new Product("李茂胜", 0);
		products[1] = new Product("李茂胜2", 120);
		products[2] = new Product("李茂胜3", 130);

		// 调用
		// 提示用户输入
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入购买的商品名称:");

		String name = scan.next();

		try {
			Product product = Product.buy(name, products);

			if (product != null) {
				System.out.println(product);
			} else {
				try {
					throw new ProductNotFoundException("库存不足");
				} catch (ProductNotFoundException e) {
					e.printStackTrace();
				} finally {
					scan.close();
				}
			}
		} catch (NumberException e) {
			e.printStackTrace();
		}

	}
}
