package com.javase.chapter16;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	// ����һ�����ﳵ��Ʒ�б�
	static List<Product> products = new ArrayList<>();

	public static int findProduct(String name) {
		// ѭ�����ﳵ�б�
		for (int i = 0; i < products.size(); i++) {

			// �жϹ��ﳵ�Ƿ��и���Ʒ
			if (products.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * �����Ʒ�����ﳵ
	 * 
	 * @param name:��Ʒ��
	 * @param list:��Ʒ�б�
	 */
	public void addProduct(String name, List<Product> list) {
		// ��ȡ�±�
		int index = Product.listProduct(name, list);
		// �ж�
		if (index != -1) {
			// �����Ʒ
			products.add(new Product(name, 1, list.get(index).getPrice(), list.get(index).getType()));

			// ��Ʒ�����ı�
			list.get(index).setNumber(list.get(index).getNumber() - 1);
			System.out.println("��Ʒ��ӳɹ�!");

		} else {
			System.out.println("û�и���Ʒ!");
		}

	}

	/**
	 * ɾ�����ﳵ�е���Ʒ
	 * 
	 * @param name:��Ʒ��
	 * @param list:��Ʒ�б�
	 */
	public void deleteProduct(String name, List<Product> list) {

		// ��ȡ�±�(����)
		// int index = Product.listProduct(name, list);

		// ��ȡ���ﳵ�±�
		int index = ShoppingCart.findProduct(name);

		// ɾ����Ʒ
		if (index != -1) {

			// ��Ʒ��������
			list.get(index).setNumber(list.get(index).getNumber() + products.get(index).getNumber());
			// ɾ��
			products.remove(index);
			System.out.println("ɾ����Ʒ�ɹ�!");
		} else {
			System.out.println("���ﳵ��û�и���Ʒ!!");
		}
	}
	
	/**
	 * �޸�����
	 * @param name:��Ʒ��
	 * @param list:��Ʒ�б�
	 * @param number:��Ʒ����
	 */
	public void changeNum(String name,List<Product> list,int number){
		
		//��ȡ���ﳵ�б��±�
		int i = ShoppingCart.findProduct(name);
		int index = Product.listProduct(name, list);
		if(i != -1){
			//����Ʒ�б��������ֵ
			list.get(index).setNumber(list.get(index).getNumber()+products.get(i).getNumber()-number);			
			//�����ﳵ������ֵ
			products.get(i).setNumber(number);
			System.out.println("��Ʒ�����޸ĳɹ�!!");
			
		}else{

			System.out.println("���ﳵ��û�и���Ʒ!!");
		}
	}
	
	/**
	 * �����ܼ�
	 * @return
	 */
	public  double totalPrice(){
		double totalPrice = 0;
		//�������ﳵ
		for(Product p1:products){
			totalPrice += p1.getPrice() * p1.getNumber();
		}
		return totalPrice;
	}
	/**
	 * չʾ���ﳵ
	 */
	public static void show(){
		for(Product p1:products){
			System.out.println(p1);
		}
	}
}
