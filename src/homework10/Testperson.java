package homework10;

public class Testperson {
	public static void main(String[] args) {
		
		
		Person partner = new Person("����", 25, false,"��");
		partner.setPartner(partner);
		Person p = new Person("С��", 23, false,"Ů");
			
		partner.marry(p);
	}
}
