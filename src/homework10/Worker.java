package homework10;

public class Worker extends People{

	public void work(){
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println("���ڹ���");
	}

	public Worker(String name,int age) {
		super();
		// TODO Auto-generated constructor stub
		super.setName(name);
		super.setAge(age);
	}
	
	
}
