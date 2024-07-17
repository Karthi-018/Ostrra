<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AddResource" method="Get">
	<select name="rtName">
		<%
    
	Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
        ps = conn.prepareStatement("select * from public.\"ResourceTypes\"");
        rs = ps.executeQuery();
     %>
        
        <% while (rs.next()) { %>
           <option value= <%= rs.getString(1) %> ><%= rs.getString(1) %></option>
        <% } %>
        
<%
    } catch (SQLException e) {
        e.printStackTrace();
    } 
%>
	</select>
	
    <label for="textfield">Resource Name</label><br>
    <input type="text" id="resName" name="resName" required><br><br>
    <label for="textfield">Attribute Name</label><br>
    <input type="text" id="attName" name="attName" required><br><br>
    <label for="textfield">Values</label><br>
    <input type="text" id="values" name="values" required>
    <input type="submit" value="Submit">
    
</body>
</html>