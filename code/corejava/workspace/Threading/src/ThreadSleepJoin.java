
public class ThreadSleepJoin {
	public static void main(String[] args) {
		System.out.println("Main .... strated");
		
		PrintNumber pn = new PrintNumber();
		pn.start();
		
		try {
			pn.join(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main .... Ends");
	}
}

class PrintNumber extends Thread {
	public void run() {
		System.out.println("Print Number .... strated");
		
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Print Number .... Ends");
	}
}
