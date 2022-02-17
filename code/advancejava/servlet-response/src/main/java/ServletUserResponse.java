

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-response")
public class ServletUserResponse extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		//OutputStream out = response.getOutputStream();
		
		out.print("<h1>Hello This is my first Response....</h1>");
		out.print("<h2>Hello This is my second Response....</h2>");
		out.print("<h3>Hello This is my another Response....</h3>");
		
	}

}
