<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="createPermPage2.jsp" method="post">
<select name="resTypeName">
	<%
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
	PreparedStatement ps=conn.prepareStatement("select * from restype");
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()){
	%>
  <option value=<%= rs.getString(1) %>><%= rs.getString(1) %></option>
  <%} %>
</select>

<button>Next</button>


</form>
</body>
</html>