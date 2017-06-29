package homework10;

public class ClassMain {
	public static void main(String[] args) {
		
			GrandFather grandFather = new GrandFather("张三", 60);
			grandFather.getGrandFather();
			
			Father father = new Father();
			father.setName("张四");
			father.setAge(30);
			father.setOccupation("程序员");
			father.getFather();
			
	}
}
