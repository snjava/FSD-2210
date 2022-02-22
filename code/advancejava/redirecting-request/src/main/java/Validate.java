

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/validate-user")
public class Validate extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
		if("admin@gmail".equals(userName) && "admin234".equals(password)) {
			System.out.println("Valid User");
			request.setAttribute("dummy", "This is a test Attribute");
			RequestDispatcher dis = request.getRequestDispatcher("user-home");
			//dis.include(request, response);
			dis.forward(request, response);
		} else {
			System.err.println("Invalid User");
			response.sendRedirect("signin-fail");
			//response.sendRedirect("https://www.google.com");
		}
	}

}
