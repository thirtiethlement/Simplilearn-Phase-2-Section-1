package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("matt") && password.equals("pass"))
		{
			HttpSession session = request.getSession();
			session.setAttribute("sessionName", "Matt");
			response.sendRedirect("dashboard.jsp");
		}
		else
		{
			response.sendRedirect("failed.jsp");
		}
	}

}
