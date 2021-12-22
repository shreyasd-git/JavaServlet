package com.servletform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class MyServletform extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
		{
		res.setContentType("text/html");
		PrintWriter p = res.getWriter();
		p.println("<h2>Welcome to Register Form Page</h2>");
		
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String timezone = req.getParameter("user_timezone");
		
		String termcond = req.getParameter("checkbox");
		
		if(termcond!=null)
		{
		if(termcond.equals("checked"))
				{
					p.println("<h1> Name: "+name+"</h1>");
					p.println("<h1> Password: "+password+"</h1>");
					p.println("<h1> Email: "+email+"</h1>");
					p.println("<h1> Gender: "+gender+"</h1>");
					p.println("<h1> Timezone: "+timezone+"</h1>");
					
					//Servlet RequestDispatcher - forward method
					RequestDispatcher rd =  req.getRequestDispatcher("success");
					
					rd.forward(req, res);
			
				}
		else
		{
			p.println("<h2>Please accept Terms & Conds.</h2>");
		}
		}
		else 
		{
			p.println("<h2>Please accept Terms & Conds.</h2>");
			
			//Servlet RequestDispatcher - include method - response of print+index page
			
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			
			rd.include(req, res);	
			
		}
		}
		

}
