package com.javase.chapter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//����һ������
				Product product = new Product();

				Product product2 = new Product("�ֻ�","���Ӳ�Ʒ",12,1.1);
				System.out.println("��Ʒ��:" + product2.getName() + "\t" + "��Ʒ�۸�:" + product2.getPrice() + "\t" + "��Ʒ����:"
						+ product2.getNumber());
				//�ֶ�����
				Scanner scan = new Scanner(System.in);
				
				product.setName("����");
				product.setNumber(20);
				product.setPrice(1299);
				product.setType("���Ӳ�Ʒ");
				System.out.println("��Ʒ��:" + product.getName() + "\t" + "��Ʒ�۸�:" + product.getPrice() + "\t" + "��Ʒ����:"
						+ product.getNumber());
				
				//c.set��get����
				System.out.print("��ѡ����Ҫ�������Ʒ����");
				int number = scan.nextInt();
				System.out.println("����ι����ѽ��Ϊ"+product.buy(number)+"Ԫ");
				
				System.out.print("��ѡ����Ҫ�������Ʒ����");
				int number2 = scan.nextInt();
				System.out.println("����ι����ѽ��Ϊ"+product2.buy(number2)+"Ԫ");
				scan.close();
				
		
	}

}
