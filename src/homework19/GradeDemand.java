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

		// ��ȡ�����ļ�
		BufferedReader br = new BufferedReader(new FileReader(new File("name.txt")));

		// ѧ������

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
		// ����map����(������)
		Iterator<Entry<String, Select>> ite = student.entrySet().iterator();
		while (ite.hasNext()) {
			// ��ȡ��Ŀ�ļ�
			BufferedReader br2 = null;
			try {
				br2 = new BufferedReader(new FileReader(ite.next().getKey()));
				String rd2 = br2.readLine();
				while(rd2 != null){
					
					//�г��ļ����ļ���
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
