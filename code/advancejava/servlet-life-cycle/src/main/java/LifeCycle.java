

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/life-cycle")
public class LifeCycle extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("This is a init method");
	}
	
	public void destroy() {
		System.out.println("This is a destroy method");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is a service method");
	}

}
