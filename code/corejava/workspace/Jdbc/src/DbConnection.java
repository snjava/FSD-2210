import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {
		try {
			
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			
			System.out.println("Connection Success...");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
