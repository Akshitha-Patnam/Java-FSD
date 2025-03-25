package com.test;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		String uname = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		User obj = new User();
		obj.setFullName(name);
		obj.setUserName(uname);
		obj.setPassword(pass);
		
		String url = "jdbc:mysql://localhost:3306/mphintern";
		String userName = "root";
		String password = "password";
		
		try {
			
			
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			
			String sql = "insert into user_mla (mla_fname, mla_user, mla_pass)values(?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, obj.getFullName());
			pst.setString(2, obj.getUserName());
			pst.setString(3, obj.getPassword());
			
			int x = pst.executeUpdate();
			
			if(x > 0)
			{
				//RequestDispatcher rd = request.getRequestDispatcher("home.html");
				
				//rd.forward(request, response);
				
				//response.sendRedirect("home.html");
				
				response.sendRedirect("https://gmst.in/");
			}
			else
			{
				out.println("<center> <h3><font color = 'red'> Registration failed.</font> </h3></center>");
				
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				
				rd.include(request, response);
			}
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
