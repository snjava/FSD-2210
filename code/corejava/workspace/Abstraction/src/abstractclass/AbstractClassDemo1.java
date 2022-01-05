package abstractclass;

public class AbstractClassDemo1 {
	public static void main(String[] args) {
		Car a = new AudiA8EV();
		Car innova = new Innova();
		showCarDetails(innova);
	}
	
	public static void showCarDetails(Car car) {
		car.brand();
		car.fuel();
		car.noOfWheels();
	}
}

abstract class Car {
	public static double price = 569999.34;
	public Car() {
		System.out.println("This is an Car class constructor");
	}
	abstract void brand();
	public abstract void fuel();
	protected static final void noOfWheels() {
		System.out.println("4 Wheels and 1 Spare...");
	}
}

class AudiA8EV extends Car {
	public void brand() {
		System.out.println("Compnay Name : Audi");
	}
	public void fuel() {
		System.out.println("This is an Electic Version of Audi A8");	
	}
}

class Innova extends Car {
	public void brand() {
		System.out.println("Compnay Name : Toyota");
	}
	public void fuel() {
		System.out.println("This is an Diesel Version of Innova");	
	}
}








