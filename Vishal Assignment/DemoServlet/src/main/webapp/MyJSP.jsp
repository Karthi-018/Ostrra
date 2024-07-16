<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!String uname="Vishal"; %>
	<h1> Welcome <%=request.getParameter("uName") %></h1>
	<h2><%=uname %></h2>
</body>
</html>