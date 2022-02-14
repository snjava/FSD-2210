import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter Msg : ");
		String msg = scn.nextLine();
		System.out.println(msg);
		scn.close();
	}
}
