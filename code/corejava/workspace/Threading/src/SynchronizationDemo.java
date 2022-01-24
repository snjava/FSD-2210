
public class SynchronizationDemo {
	public static void main(String[] args) {
		Printer p = new Printer(); // share resource...
		Person1 p1 = new Person1(p);
		Person2 p2 = new Person2(p);
		p1.start();
		p2.start();
	}
}
class Person1 extends Thread {
	Printer print;
	public Person1(Printer print) {
		this.print = print;
	}
	@Override
	public void run() {
		print.printTable(5);
	}
}
class Person2 extends Thread {
	Printer print;
	public Person2(Printer print) {
		this.print = print;
	}
	@Override
	public void run() {
		print.printTable(10);
	}
}
class Printer {
	public synchronized void printTable(int num) {  // synchronized method
		for (int i = 1; i<=10 ; i++) {  
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	public  void print(int num) {
		// 1-19 lines
		synchronized (this) { // synchronized block
			// 1-19 lines
			//20-40 lines
		}
		// 41-100 lines
	}
}














