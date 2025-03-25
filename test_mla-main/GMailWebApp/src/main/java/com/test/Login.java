package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mphintern";
		String userName = "root";
		String password = "password";
		
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,userName,password);
			
			String sql = "select mla_user, mla_pass from user_mla where mla_user = ? and mla_pass = ?";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, name);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
			
			if(rs.getString(1).equals(name))
			{
				RequestDispatcher rd = request.getRequestDispatcher("home.html");
				
				rd.forward(request, response);
			}
			 break;
			}
			if(true)
			{
				out.println("<center> <h3><font color = 'red'> Login failed.</font> </h3></center>");
				
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				
				rd.include(request, response);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
