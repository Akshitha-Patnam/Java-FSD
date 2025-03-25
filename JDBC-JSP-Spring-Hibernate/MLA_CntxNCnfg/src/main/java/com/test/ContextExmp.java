package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ContextExmp")
public class ContextExmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		ServletContext ctx = getServletContext();
		
		String ct = ctx.getInitParameter("city");
		String st = ctx.getInitParameter("state");
		
		String details = ct+" "+st;
		
		ctx.setAttribute("info", details);
		
		out.println("City : "+ct+" State : "+st);
		
		ServletConfig cfg = getServletConfig();
		
		String name = cfg.getInitParameter("user");
		String pass = cfg.getInitParameter("pwd");
		
		out.println("<br> Name : "+name+" Password : "+pass);
		
		out.println("<br><br><a href = 'Servlet2'> go to next page </a> ");
	}

}
