

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user-validate")
public class Validate extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String userPasswrod = request.getParameter("pass");
		//use JDBC code to validate user name and password
		if("admin@gmail.com".equals(userName) && "admin123".equals(userPasswrod)) {
			// 1. Create Session
			HttpSession session = request.getSession();
			// 2. set User Name inside session
			session.setAttribute("user", userName);
			// 3. redirect to home page
			//response.sendRedirect("home.jsp");
		}
		else {
			// 1. Redirect to Login page with error
			response.sendRedirect("login.jsp?c=3");
		}
		
	}
}
