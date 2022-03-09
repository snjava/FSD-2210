

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg-user")
public class SaveUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String age = request.getParameter("age");
		
		
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Contact : " + contact);
		System.out.println("Age : " + age);
		
		// DB Code and insert data into DB...
		
	}

}
