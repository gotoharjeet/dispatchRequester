package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.User;

/**
 * Servlet implementation class Summary
 */
public class Summary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Summary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		PrintWriter out=null;
		if(session != null)
		{
			Date dt=new Date();
			
		
			User u=(User)session.getAttribute("user");
			u.setAddress(request.getParameter("address"));
			u.setCity(request.getParameter("city"));
			u.setState(request.getParameter("state"));
			out=response.getWriter();
			out.print("<!DOCTYPE html>"
					+ "<html>"
					+ "<body>"
					+ "<div>"
					+ "<form>"   
					+ "FirstName :"+u.getFname()
					+"<br/>"
					+ "LaststName :"+u.getLname()
					+"<br/>"
					+ "Age  :"+u.getAge()
					+"<br/>"
					+ "Email :"+u.getEmail()
					+"<br/>"
					+ "Address :"+u.getAddress()
					+"<br/>"
					+ "City :"+u.getCity()
					+"<br/>"
					+ "State :"+u.getState()
					+"<br/>"
					+"<br/>"+"<br/>"
					+"Session id : "+session.getId()
					+"Session Creation time : "+(new Date(session.getCreationTime()))
					+"<br/>"+"<br/>"
					+"Last Accessed : "+(new Date(session.getLastAccessedTime()))
					+ "</form>"   
					+"</div>"
					+ "</body>"
					+"</html>");
		}
	}

}
