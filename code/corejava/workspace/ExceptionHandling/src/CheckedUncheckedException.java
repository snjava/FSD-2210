import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedException {
	public static void main(String[] args) {
		
		System.out.println(10 / 0);
		
		try {
			FileReader read = new FileReader("c:\\test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
