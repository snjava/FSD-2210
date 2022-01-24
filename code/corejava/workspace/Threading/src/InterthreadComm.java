
public class InterthreadComm {
	public static void main(String[] args) {
		Zerox zerox = new Zerox();
		Thread1 t1 = new Thread1(zerox);
		t1.start();
		Thread2 t2 = new Thread2(zerox);
		t2.start();
	}
}

class  Thread1 extends Thread {
	Zerox zerox;
	public Thread1(Zerox zerox) {
		this.zerox = zerox;
	}
	public void run() {
		synchronized (zerox) {
			for (int i = 1; i<=10 ; i++) {  
				zerox.copy( "5 * " + i + " = " + (5*i));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i==5) {
					try {
						zerox.wait(); // release the lock
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class  Thread2 extends Thread {
	Zerox zerox;
	public Thread2(Zerox zerox) {
		this.zerox = zerox;
	}
	public void run() {
		synchronized (zerox) {
			for (int i = 1; i<=10 ; i++) {  
				zerox.copy( "15 * " + i + " = " + (15*i));
			}

			zerox.notify(); // notify the waiting thread
			
		}
	}
}

class Zerox {
	public void copy(String val) {
		System.out.println(val);
	}
}
