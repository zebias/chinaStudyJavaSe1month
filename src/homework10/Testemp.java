package homework10;

public class Testemp {
	
	public static void main(String[] args) {
		
		
		Emp emp = new Emp();
		emp.setName("��ͨԱ��");
		emp.setAddress("�ֶ�����");
		emp.setBasic(3200);
		emp.show();
		
		
		//�в�
		Chairman chairman = new Chairman("���³�", "������", 80000, 3200.98);
		chairman.show();
		
		
		Manager manager = new Manager("����", "��ɽ��", 10000, "�г���");
		manager.show();
		
	}

}
