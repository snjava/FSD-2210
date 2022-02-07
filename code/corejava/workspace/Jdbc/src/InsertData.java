import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			// 3. Create Statement
			PreparedStatement stmt = con.prepareStatement("insert into employee values(6,'Demo1', 45645.45, 1)");
			// 4. Execute Statement
			int count = stmt.executeUpdate();
			// 5. close connection
			stmt.close();
			con.close();
			System.out.println("Total Rows Affected : " + count);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
