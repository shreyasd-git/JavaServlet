package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("This is Second Servlet method type");
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.println("<h1>This is <i>Second</i> Servlet method type</h1>");
		p.println("<h1>Todays date & time is"+new Date().toString() +"</h1>");
		
		
	}

	
}
