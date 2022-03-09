import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {"/reg-user"})
public class ValidationFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Pre Processing..........."); // pre process
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String age = request.getParameter("age");
		
		ArrayList<String> errorMsgs = new ArrayList<String>();
	
		if(age != null && !age.isBlank()){
			int a = Integer.parseInt(age);
			if(! (a>=21 && a<=25)) {
				errorMsgs.add("Invalid Age. Age must be between 21 to 25..");
			}
		} else {
			errorMsgs.add("Please provide age...");
		}
		

		if(contact != null && !contact.isBlank()){
			if(contact.length() != 10) {
				errorMsgs.add("Invalid Contact. Contact must be of 10 digit");
			}
		} else {
			errorMsgs.add("Please provide Contact Number...");
		}
		
		
		if(errorMsgs.isEmpty()) {
			chain.doFilter(req, resp); // to pass you request for actual processing
		} else {
			request.setAttribute("errors", errorMsgs);
			RequestDispatcher dis = request.getRequestDispatcher("exam-reg.jsp");
			dis.forward(request, response);
		}
		
		
		System.out.println("Post Processing..........."); // post process
	}
}
