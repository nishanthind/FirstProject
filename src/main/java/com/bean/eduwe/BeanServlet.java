package com.bean.eduwe;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BeanServlet
 */
@WebServlet("/beandata")
public class BeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    User user = new User();
	    user.setUsername(request.getParameter("username"));
	    user.setEmail(request.getParameter("email"));
	    
	    request.setAttribute("user", user);
	    request.getRequestDispatcher("bean-example.jsp").forward(request, response);
	}


}
