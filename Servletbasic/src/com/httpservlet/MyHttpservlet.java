package com.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpservlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("This is Http Servlet");
		
		res.setContentType("text/html");
		
		PrintWriter p = res.getWriter();
		p.println("<h1>This is <i>Get Method</i> of Http Servlet</h1>");
		p.println("<h1>"+new Date().toString()+"</h1>");
		
	}

}
