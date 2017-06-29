package homework10;

public class Testperson {
	public static void main(String[] args) {
		
		
		Person partner = new Person("张三", 25, false,"男");
		partner.setPartner(partner);
		Person p = new Person("小凤", 23, false,"女");
			
		partner.marry(p);
	}
}
