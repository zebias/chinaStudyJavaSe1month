package homework13;

import java.util.Scanner;

/**
 * @author Administrator ��ҵ2�� ��Ŀ�� ģ��ʵ���û�������Ʒ�Ĺ��ܣ�ʹ������ģ����Ʒ�б�
 *         ���������Ʒ�����ڻ�����Ʒ���Ϊ0ʱ���׳��Զ����쳣�� �û�����ĳһ����Ʒʱ�����쳣���д������Կ����иı䡣
 *         ���㣺�Զ����쳣���쳣����throw/throws�ؼ��� �Ѷȣ���
 * 
 */
public class Homework02 {
	public static void main(String[] args) {

		// ������������
		Product[] products = new Product[3];
		// ��ֵ
		products[0] = new Product("��ïʤ", 0);
		products[1] = new Product("��ïʤ2", 120);
		products[2] = new Product("��ïʤ3", 130);

		// ����
		// ��ʾ�û�����
		Scanner scan = new Scanner(System.in);

		System.out.println("�����빺�����Ʒ����:");

		String name = scan.next();

		try {
			Product product = Product.buy(name, products);

			if (product != null) {
				System.out.println(product);
			} else {
				try {
					throw new ProductNotFoundException("��治��");
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
