<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%-- <%@ taglib prefix="c" uri="jakarta.tags.core" %> --%>
<%-- <%@ taglib prefix="x" uri="jakarta.tags.xml" %> --%>
<%-- <%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %> --%>
<%-- <%@ taglib prefix="fn" uri="jakarta.tags.functions" %> --%>
<%-- <%@ taglib prefix="sql" uri="jakarta.tags.sql" %> --%>

<%@ page isELIgnored="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>user data submitted with validations</h1>

	FirstName : ${user.firstName}
	<br>
	<br> LastName : ${user.lastName}
	<br>
	<br> Gender : ${user.gender}
	<br>
	<br> Food: Meals:
	<ul>
		<c:forEach var="meal" items="${user.food}">
			<li>${meal}</li>
		</c:forEach>
	</ul>
	<br>

	<br> Leaving from : ${user.cityFrom}
	<br>
	<br> Going To : ${user.cityTo}
	<br>
	<br> Journey Date : ${user.jDate}
	<br>
	<br> Seat No:

	<ul>
		<c:forEach var="seats" items="${suser.seat}">
			<li>${seats}</li>
			<c:if test="seatVal">
			</c:if>
		</c:forEach>
	</ul>
	<br>
	<br>
	<br>


	<a href="userform">click here to register</a>

</body>
</html>