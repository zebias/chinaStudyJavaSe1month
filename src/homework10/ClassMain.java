package homework10;

public class ClassMain {
	public static void main(String[] args) {
		
			GrandFather grandFather = new GrandFather("����", 60);
			grandFather.getGrandFather();
			
			Father father = new Father();
			father.setName("����");
			father.setAge(30);
			father.setOccupation("����Ա");
			father.getFather();
			
	}
}
