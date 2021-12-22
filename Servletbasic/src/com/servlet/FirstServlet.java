package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;


public class FirstServlet implements Servlet {

	ServletConfig conf;
	
	//non life cycle methods
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This Servlet is created by Shreyas";
	}

	//lifecycle methods
	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		this.conf=conf;
		System.out.println("Creating Object....");
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Servicing.....");
		
		//res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.println("<h1>This is Servlet's <i>Service</i> method Output</h1>");
		p.println("<h1>Todays Date and Time is: "+ new Date().toString() +" </h1>");
		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("Destroying object.....");
		
	}
	

}
