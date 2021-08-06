package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Getdemo
 */
public class Getdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getdemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		  String name=request.getParameter("name1");
		  String address=request.getParameter("add1");
		  
		  out.println("<b> Name : </b>" + name + "<br>" +"<b> Address: </b>" + address);
		  
		  out.println("<form method=post action='index.html'");
		  out.println("<br>" + "<input type='submit' value='Home'> </form>");
		  
	}

	 
}
