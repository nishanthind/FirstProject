<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.bean.eduwe.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<%
	User user = new User();
	user = (User) request.getAttribute("user");

%>
<body>
	<h1>User Info</h1>
	<h2>You are successfully registered with the following credentials.</h2>
	<p> Username:<%= user.getUsername()%></p>
	<p> Email:<%= user.getEmail() %></p>

</body>
</html>