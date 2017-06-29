package homework10;

public class Testemp {
	
	public static void main(String[] args) {
		
		
		Emp emp = new Emp();
		emp.setName("普通员工");
		emp.setAddress("浦东新区");
		emp.setBasic(3200);
		emp.show();
		
		
		//有参
		Chairman chairman = new Chairman("董事长", "闵行区", 80000, 3200.98);
		chairman.show();
		
		
		Manager manager = new Manager("经理", "宝山区", 10000, "市场部");
		manager.show();
		
	}

}
