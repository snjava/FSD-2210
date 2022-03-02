

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-details")
public class SaveInfo extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String gender = request.getParameter("gender");
		
		String title = request.getParameter("title");
		String clg = request.getParameter("clgName");
		String percent = request.getParameter("percent");
		String year = request.getParameter("year");
		
		String city = request.getParameter("city");
		String pin = request.getParameter("pin");
		String mark = request.getParameter("mark");
		String state = request.getParameter("state");
		
		System.out.println("Name : " + name);
		System.out.println("College Name : " + clg);
		System.out.println("landMark : " + mark);
		System.out.println("Year : " + year);
		
		try {
			// DB connection code.
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
