package homework13;

public class Buy {
	// ����ģ�⹺���б�
	private Products[] pro = new Products[5];

	// ���򷽷�
	public void shop(String name, Products[] p) {
		// ������Ʒ�б�
		for (Products product01 : p) {
			// �ж���Ʒ�б����Ƿ��иò�Ʒ
			if (product01.getName().equals(name)) {
				// ����
				for (int i = 0; i < pro.length; i++) {

					// �ж��Ƿ�Ϊ��
					if (product01 == null) {
						pro[i] = product01;
						pro[i].setNumber(1);
						return;
					}
				}
				try {
					throw new ProductNotFoundException("���ﳵ����");
				} catch (ProductNotFoundException e) {
					e.printStackTrace();

				}
			}
		}
		try {
			throw new ProductNotFoundException("û�и���Ʒ");
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
		}
	}
}
