package homework13;

public class Buy {
	// 数组模拟购买列表
	private Products[] pro = new Products[5];

	// 购买方法
	public void shop(String name, Products[] p) {
		// 遍历商品列表
		for (Products product01 : p) {
			// 判断商品列表中是否有该产品
			if (product01.getName().equals(name)) {
				// 遍历
				for (int i = 0; i < pro.length; i++) {

					// 判断是否为空
					if (product01 == null) {
						pro[i] = product01;
						pro[i].setNumber(1);
						return;
					}
				}
				try {
					throw new ProductNotFoundException("购物车已满");
				} catch (ProductNotFoundException e) {
					e.printStackTrace();

				}
			}
		}
		try {
			throw new ProductNotFoundException("没有该商品");
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
		}
	}
}
