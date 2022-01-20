
public class ThreadSleepJoin {
	public static void main(String[] args) {
		System.out.println("Main .... strated ---  " + Thread.currentThread().getName());
		
		PrintNumber pn = new PrintNumber(); // New Stage
		pn.start(); // Runnable Stage
		
		try {
			pn.join(5000); // Pause stage
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		//pn.stop(); // terminating thread manually
		//pn.suspend();
 		
		System.out.println("Main .... Ends");
	}
}

class PrintNumber extends Thread {
	public void run() {
		System.out.println("Print Number .... strated ---  " + Thread.currentThread().getName());
		
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // Pause stage
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Print Number .... Ends");
	}
}
