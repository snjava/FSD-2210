
public class ThreadIntro {
	public static void main(String[] args) {
		System.out.println("Started --- Main");
		
		MyCustomThread1 th = new MyCustomThread1();
		th.setName("first-thread");
		th.setPriority(10);
		th.start(); // to make thread ready to run
		
		Thread thread = Thread.currentThread();
		thread.setName("main-thread");
		thread.setPriority(10);
		System.out.println(Thread.currentThread());
		
		System.out.println("Ends --- Main");
	}
}

class MyCustomThread1 extends Thread {
	public void run() { // to assign task/execution to thread
		System.out.println("Started --- Custom");
		System.out.println("Hi This is my first custom thread....");
		System.out.println(Thread.currentThread());
		System.out.println("Ends --- Custom");
	}
}
