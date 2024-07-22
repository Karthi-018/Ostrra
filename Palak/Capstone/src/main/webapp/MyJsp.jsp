
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="Resource">
<label>Resource Type</label>
<select name="rtname">
<%
  Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Assignment","postgres","postgres");
  PreparedStatement ps = c.prepareStatement("SELECT * FROM public.\"ResourseType\"");
  ResultSet rs = ps.executeQuery();
  while(rs.next()){
%>

<option value=<%= rs.getString(1) %>><%= rs.getString(1) %></option>
<% } %>
</select>
<label>Resource Name</label>
<input type="text" name="rname"/>
<label>Attribute Name</label>
<input type="text" name="attribute"/>

<input type="text" placeholder="values" name="value"/>	
<input type="submit"/>

</form>
</body>
</html>