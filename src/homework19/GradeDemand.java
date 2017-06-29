package homework19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class GradeDemand {
	public void getName(Map<String, Select> student) throws IOException {

		// 读取姓名文件
		BufferedReader br = new BufferedReader(new FileReader(new File("name.txt")));

		// 学生集合

		String rl = br.readLine();

		while (rl != null) {

			student.put(rl, new Select());
			System.out.println(rl);
			rl = br.readLine();
		}
		br.close();
	}

	public static void main(String[] args) {
		Map<String, Select> student = new HashMap<>();
		// 遍历map集合(迭代器)
		Iterator<Entry<String, Select>> ite = student.entrySet().iterator();
		while (ite.hasNext()) {
			// 读取题目文件
			BufferedReader br2 = null;
			try {
				br2 = new BufferedReader(new FileReader(ite.next().getKey()));
				String rd2 = br2.readLine();
				while(rd2 != null){
					
					//列出文件的文件名
					String[] str3 = new File(ite.next().getKey()+"txt").list(new FilenameFilter() {
						
						@Override
						public boolean accept(File dir, String name) {
							String fname = name;
							fname.endsWith(".txt");
							return false;
						}
					});
					rd2 = br2.readLine();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					br2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
