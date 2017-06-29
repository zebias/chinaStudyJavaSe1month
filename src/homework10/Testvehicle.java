package homework10;

public class Testvehicle {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.setName("交通工具");
		vehicle.show(vehicle.getName());
		
		
		Car car = new Car();
		car.setName("汽车");
		car.show(car.getName());
		
		Ship ship = new Ship();
		ship.setName("船只");
		ship.show(ship.getName());

		Airplane airplane = new Airplane();
		airplane.setName("飞机");
		airplane.show(airplane.getName());
		
		Salooncar salooncar = new Salooncar();
		salooncar.setName("小轿车");
		salooncar.show(salooncar.getName());
	
		Bus bus = new Bus();
		bus.setName("公共汽车");
		bus.show(bus.getName());
	
	}
}
