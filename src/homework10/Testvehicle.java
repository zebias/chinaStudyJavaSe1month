package homework10;

public class Testvehicle {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("��ͨ����");
		vehicle.show(vehicle.getName());
		
		
		Car car = new Car();
		car.setName("����");
		car.show(car.getName());
		
		Ship ship = new Ship();
		ship.setName("��ֻ");
		ship.show(ship.getName());

		Airplane airplane = new Airplane();
		airplane.setName("�ɻ�");
		airplane.show(airplane.getName());
		
		Salooncar salooncar = new Salooncar();
		salooncar.setName("С�γ�");
		salooncar.show(salooncar.getName());
	
		Bus bus = new Bus();
		bus.setName("��������");
		bus.show(bus.getName());
	
	}
}
