package homework13;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		Products[] p = new Products[5];
		p[0]=new Products("手机",1230);
		p[0]=new Products("电脑",7730);
		p[0]=new Products("平板",7770);
		p[0]=new Products("平板",2222);
		p[0]=new Products("平板",77370);
		
		Buy buy = new Buy();
		Products product = new Products();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要购买的商品");
		String name1 = scanner.next();
		buy.shop(name1,p);
		
	}
}
