package homework13;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		Products[] p = new Products[5];
		p[0]=new Products("�ֻ�",1230);
		p[0]=new Products("����",7730);
		p[0]=new Products("ƽ��",7770);
		p[0]=new Products("ƽ��",2222);
		p[0]=new Products("ƽ��",77370);
		
		Buy buy = new Buy();
		Products product = new Products();
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�������Ʒ");
		String name1 = scanner.next();
		buy.shop(name1,p);
		
	}
}
