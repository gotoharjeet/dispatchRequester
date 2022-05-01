package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		RequestDispatcher rd=null;
		PrintWriter out=response.getWriter();
		//out.print("Hello user :"+username + " your password :"+password);
		
		if(username.equals("tom") && password.equals("jerry"))
		{	
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else
		{
			rd=request.getRequestDispatcher("Login.html");
			out=response.getWriter();
			rd.include(request, response);
			out.println("<center><span style='color:red'>Invalid Credential!!</span></center>");
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
