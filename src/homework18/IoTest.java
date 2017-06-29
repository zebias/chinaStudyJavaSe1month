package homework18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IoTest {
	public List<Product> getProduct() {
		// 创建一个集合
		List<Product> list = new ArrayList<>();

		BufferedReader br = null;
		// 读取文件
		try {
			
			br = new BufferedReader(new FileReader("C:/shop.txt"));
			String str = br.readLine();
			while (str != null) {
				Product product = new Product();
				String[] s = str.split(",");
				product.setName(s[0]);
				product.setNumber(Integer.parseInt(s[1]));
				product.setPrice(Double.parseDouble(s[2]));
				product.setType(s[3]);
				list.add(product);

				// 循环读
				str = br.readLine();
			}
			return list;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 修改数量
	 * 
	 */
	public void alterProduct(List<Product> list) {
		// 创建写入(输出流)
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(new File("c:/shop.txt")));
			for (Product product : list) {
				System.out.println(product.toString());
				bw.write(product.getName() + "," + product.getNumber() + "," + product.getPrice() + ","
						+ product.getType());
				bw.newLine();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		IoTest ioTest = new IoTest();
		ioTest.alterProduct(ioTest.getProduct());
	}
}
