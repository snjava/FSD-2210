
public class ThreadIntro {
	public static void main(String[] args) {
		System.out.println("Hello");
		MyCustomThread1 th = new MyCustomThread1();
		th.start(); // to make thread ready to run
	}
}

class MyCustomThread1 extends Thread {
	public void run() { // to assign task/execution to thread
		System.out.println("Hi This is my first custom thread....");
	}
}
