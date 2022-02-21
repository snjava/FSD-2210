

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-home")
public class Home extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		
		String info = (String) request.getAttribute("dummy");
		out.print("<div align='center'>");
		out.print("<h2 style='color:green'>Welcome User, "+userName+"</h2>");
		out.print("<h3>"+info+"</h3>");
		out.print("</div>");
	}

}
