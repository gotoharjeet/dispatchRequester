package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig sc=getServletConfig();
		String dname=sc.getInitParameter("sql");
		PrintWriter out=response.getWriter();
		out.print("<br/><h1>Accessing Servlet Config content from Servlet1</h1>");
		out.print("Database Name : "+dname);
		out.print("<br/>Message : "+sc.getInitParameter("message"));
;	
		ServletContext app=getServletContext();
		out.print("<br/><h1>Accessing Servlet Context content from Servlet1</h1>");
		out.print("<br/>Driver Name : "+app.getInitParameter("driver"));
		out.print("<br/> Url : "+app.getInitParameter("url"));
	}

}
