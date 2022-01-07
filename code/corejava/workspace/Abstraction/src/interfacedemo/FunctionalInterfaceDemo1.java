package interfacedemo;

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {

	}
}

interface Vehical {
	public void noOfWheels();
	public void type();
	public abstract void fuelType();
	public abstract void band();
}

abstract class Bike implements Vehical{
	public void noOfWheels() {
		System.out.println("2 wheels");
	}
	public void type() {
		System.out.println("2 wheeler");
	}
	public abstract void fuelType();
	public abstract void band();
}

abstract class Car implements Vehical{
	public void noOfWheels() {
		System.out.println("4 wheels and 1 spare wheel");
	}
	public void type() {
		System.out.println("4 wheeler");
	}
	public abstract void fuelType();
	public abstract void band();
}


class TVSJupiter extends Bike {
	@Override
	public void band() {
		System.out.println("Company name : TVS");
	}
	@Override
	public void fuelType() {
		System.out.println("Fuel : Petrol");
	}
}


class VehicalDekhoDotCom{
	public static void main(String[] args) {
		TVSJupiter tvs = new TVSJupiter();
		showVehicalDetails(tvs);
	}
	public static void showVehicalDetails(Vehical vehical) {
		vehical.noOfWheels();
		vehical.band();
		vehical.fuelType();
		vehical.type();
	}
	
	public static void showVehicalDetails(Car vehical) {
		vehical.noOfWheels();
		vehical.band();
		vehical.fuelType();
		vehical.type();
	}
	
	public static void showVehicalDetails(Bike vehical) {
		vehical.noOfWheels();
		vehical.band();
		vehical.fuelType();
		vehical.type();
	}
}








@FunctionalInterface
interface InterDemo {
	public void m1();
}

class Abc implements InterDemo {
	public void m1(int a) {
		
	}
	@Override
	public void m1() {
	
	}
}


interface InterDemo4 {
}
