

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user-validate")
public class Validate extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String userPassword = request.getParameter("pass");
		String remeber = request.getParameter("remember");
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from employee where name=? and password=?");
			stmt.setString(1, userName);
			stmt.setString(2, userPassword);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				if(remeber != null) {
					Cookie ck = new Cookie("userName", userName);
					ck.setMaxAge(48*60*60);
					response.addCookie(ck);
				}
				HttpSession session = request.getSession();
				session.setAttribute("user", userName);
				response.sendRedirect("home.jsp");
			}
			else {
				response.sendRedirect("login.jsp?c=3");
			}
		}catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("login.jsp?c=2");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
