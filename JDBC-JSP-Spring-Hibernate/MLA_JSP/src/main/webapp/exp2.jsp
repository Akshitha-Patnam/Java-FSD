<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exp2</title>
</head>
<body>
		
		<%
		
			out.println(10/0);
			
			application.setAttribute("info", "Rohit");
			
			//config.getInitParameter(arg0)
			
			//session.setAttribute("info", user);
			
		
		%>
		
</body>
</html>