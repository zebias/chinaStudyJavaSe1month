package homework14;

import java.util.ArrayList;

public class ShopCar {
	// ����һ��ArrayList����
	// ���ﳵ����
	ArrayList<Product> productShopCar = new ArrayList<>();

	// չʾ��Ʒ�б�ķ���
	public void showlist(ArrayList<Product> p) {
		for(Product p1 : p){
			System.out.println(p1);
		}
	}

	// ������Ʒ�ķ���
	public void buy(String name,ArrayList<Product> p) throws NumberException {
		// ������Ʒ�б�
		for (Product p1 : p) {
			if (p1.getName().equals(name)) {
				if (p1.getNumber() > 0) {
					p1.setNumber(1);
					productShopCar.add(p1);
					return;
				} else {
					try {
						throw new ProductNotFoundException("���������Ʒ������");
					} catch (ProductNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		}
		throw new NumberException("���������Ʒû����");
	}

	// �޸���Ʒ�����ķ��� 
	
	//�����б��еļ�������Ʒ�б��е�
	public void change(String name, int number,ArrayList<Product> p) {
		//�������
		int count = 0;
		int count2= 0;
		
		//�������ﳵ
		for (Product product : productShopCar) {
			if (product.getName().equals(name)) {
				product.setNumber(number);
				count+=number;
				return;
			}
		}
		//������Ʒ�б�
		for(int i = 0 ;i<p.size();i++){
			if(p.get(i).getName().equals(name)){
			count2 = p.get(i).getNumber()-count;
			p.get(i).setNumber(count2);
			return;
			}
			
		}
	}

	// ɾ����Ʒ�ķ���
	public void delete(String name) {
		/*// �������ﳵ
		for (Product product : productShopCar) {
			// �жϹ��ﳵ���Ƿ���Ҫɾ������Ʒ id
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

	// �����ܼ۵ķ���
	public double total() {
		double totalNum=0;
		for (Product product : productShopCar) {
			totalNum = product.getNumber()*product.getPrice();
		}

		return totalNum;
	}

	// չʾ���ﳵ�б�ķ���
	public void show() {
		for (Product product : productShopCar) {
			System.out.println(product);
		}
	}
}
