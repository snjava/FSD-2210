

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Message")
public class Message extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>User Message</title>");
			out.print("</head>");
			
			out.print("<body>");
				out.print("<form action='Display'>");
					out.print("<label for='msg'>Enter Message :</label>");
					out.print("<input type='text' id='msg' name='usermsg'><br>");
					out.print("<input type='Submit' value='Send'>");
				out.print("</form>");
			out.print("</body>");
		out.print("</html>");
	}

}
