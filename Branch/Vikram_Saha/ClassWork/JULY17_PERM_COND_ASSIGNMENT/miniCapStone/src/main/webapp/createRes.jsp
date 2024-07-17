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
<form action="resServlet" method="post">
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

<input placeholder="ENTER RESOURCE NAME" name="resName">
<input placeholder="ENTER Attr NAME" name="resAttrName">
<input placeholder="ENTER Attr VALS" name="resAttrVals">
<button>CREATE RES</button>


</form>
</body>
</html>