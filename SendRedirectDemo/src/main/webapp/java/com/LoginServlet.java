package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
   /* public void init() throws ServletException
    {
    	System.out.println("-------------------------------------------------");
    	System.out.println("Init method is called in "+
    				this.getClass().getName());
    	System.out.println("-------------------------------------------------");
    }*/
	
    
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(userName.equals("tom")&& password.equals("jerry"))
		{
			PrintWriter out=response.getWriter();
			out.print("Login Successfull");
		}
		else
		{
			PrintWriter out=response.getWriter();
			out.print("<center><span>Invalid Credential</span>");
		}
	}

}
