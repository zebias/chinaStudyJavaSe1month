package com.javase.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		//List����
		List<Products> products = new ArrayList<Products>();
		
		
		//��������
		products.add(new Products("С��",1231,1991.9,"���Ӳ�Ʒ"));
		products.add(new Products("����",1232,1992.9,"���Ӳ�Ʒ"));
		products.add(new Products("����",1233,1993.9,"���Ӳ�Ʒ"));
		products.add(new Products("�ṷ",1234,1994.9,"���Ӳ�Ʒ"));
		
		//��������
		ShopCarShip shopCarShip = new ShopCarShip();
		
		//Ĭ����ʾ��Ʒ�б�
		for (Products products2 : products) {
			System.out.println(products2);
		}
		System.out.println("------------------------");
		//�û�����
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ�������Ʒ����");
		try {
			String name = scan.next();
			shopCarShip.show(products, name);
			shopCarShip.shows();
		} catch (NumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scan.close();
		}
		
	}
}
