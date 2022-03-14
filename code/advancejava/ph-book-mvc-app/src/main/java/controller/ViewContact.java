package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Contact;
import model.ContactModel;


@WebServlet("/get-all-contact")
public class ViewContact extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContactModel model = new ContactModel();
		List<Contact> list = model.getAll();
		
		request.setAttribute("contactList", list);
		RequestDispatcher dis = request.getRequestDispatcher("view-contact.jsp");
		dis.forward(request, response);
		
	}

}
