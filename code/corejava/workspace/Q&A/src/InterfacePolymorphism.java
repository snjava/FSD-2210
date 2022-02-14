
public class InterfacePolymorphism {
	public static void main(String[] args) {
		Bullet bullet = new Bullet();
		Innova innova = new Innova();
		vehicalDetails(bullet);
		System.out.println("=============");
		vehicalDetails(innova);
	}
	
	public static void vehicalDetails(Vehical vehical) {
		vehical.vehicalType();
		vehical.vehicalName();
	}
	
	public static void bikeDetails(Bike bike) {
		bike.vehicalType();
		bike.vehicalName();
	}
	
	public static void carDetails(Car car) {
		car.vehicalType();
		car.vehicalName();
	}
	
	
}

interface Vehical{
	public void vehicalType();
	public void vehicalName();
}

abstract class Bike implements Vehical{
	public void vehicalType() {
		System.out.println("This is A Bike");
	}
}

abstract class Car implements Vehical{
	public void vehicalType() {
		System.out.println("This is A Car");
	}
}

class Bullet extends Bike {
	public void vehicalName() {
		System.out.println("This is A Bullet Bike");
	}	
}

class Innova extends Car {
	public void vehicalName() {
		System.out.println("This is A Innova Car");
	}	
}