import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("update employee set salary=555555.55 where id=5");
			int count = stmt.executeUpdate();
			stmt.close();
			con.close();
			System.out.println("Total Rows Updated : " + count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
