import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class ThrowsKeyword {
	public static void main(String[] args) {
		ReadFromFile readFile = new ReadFromFile();
		try {
			readFile.readData("c:\\test.txt");
		} catch (FileNotFoundException e) {
			System.err.println("ohh... I send a wrong file.. I  will try after some time...");
		}
	}
}

class ReadFromFile {
	public void readData(String filePath) throws FileNotFoundException {
		// read data from given file and print the data on the console
		FileReader read = new FileReader(filePath);
	}
}