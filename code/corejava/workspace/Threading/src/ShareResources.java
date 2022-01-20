
public class ShareResources {
	public static void main(String[] args) {
		Common common = new Common();
		T1 th1 = new T1(common);
		T2 th2 = new T2(common);
		th1.start();
		th2.start();
	}
}

class T1 extends Thread {
	Common c;
	T1(Common c) {
		this.c = c;
	}
	public void run() {
		c.print(getName(), 22);
	}
}

class T2 extends Thread {
	Common c;
	T2(Common c) {
		this.c = c;
	}
	public void run() {
		c.print(getName(), 55);
	}
}

class Common {
	public void print(String threadName, int val) {
		System.out.println("Thread : " + threadName + " | value " + val);
	}
}