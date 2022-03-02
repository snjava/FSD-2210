

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search-result")
public class Result extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String query = request.getParameter("q");
		out.print("<div align='center'>");
		out.print("<h1>Your Search For : "+query+"</h1>");
		out.print("</div>");
		
		Cookie ck = new Cookie("search", query); // to create cookie
		ck.setMaxAge(48*60*60); // set the alive time period of the cookie. in seconds.
		response.addCookie(ck); // to send cookie at client side.
	}

}
