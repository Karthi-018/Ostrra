<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
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
<form action="createPermPage4.jsp" method="post">
<h3>RES TYPE = <%=request.getParameter("resTypeName") %></h3>

<select name="resName">
	<%
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
	//PreparedStatement ps=conn.prepareStatement("select * from restype");
	//ResultSet rs=ps.executeQuery();
	PreparedStatement ps2=conn.prepareStatement("select * from res where resTypeName= ?");
	ps2.setString(1, request.getParameter("resTypeName"));
	ResultSet rs=ps2.executeQuery();
	while(rs.next()){
	%>
  <option value=<%= rs.getString(2) %>><%= rs.getString(2) %></option>
  <%} %>
</select>

<input type="hidden" name="resTypeName" value=<%=request.getParameter("resTypeName") %>>
<%
String perms="";
	try{
	//Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
	PreparedStatement ps3=conn.prepareStatement("select * from restype WHERE restypename= ?");
	ps3.setString(1, request.getParameter("resTypeName"));
	ResultSet rs2=ps3.executeQuery();
	while(rs2.next()){
		perms=rs2.getString(2);
	}
	}catch(Exception e){
		e.printStackTrace();
		}
	//System.out.println(perms);
	List<String> li=Arrays.asList(perms.split(","));
	
	for(String val:li)
	{
	%>
	<br>
	<input type="checkbox" value=<%=val %> name="perms">>
	<label><%=val %></label>
	<%} %>
<button>SELECT RES</button>


</form>
</body>
</html>