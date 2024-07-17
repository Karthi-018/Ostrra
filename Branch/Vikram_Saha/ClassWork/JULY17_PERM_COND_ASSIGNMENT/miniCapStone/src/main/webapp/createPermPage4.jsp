<%@page import="java.io.IOException"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
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
<form action="savePermServlet" method="post">

	<%
	String attrVals="",attr="";
	try{
	Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
	PreparedStatement ps=conn.prepareStatement("select * from res where resname= ?");
	ps.setString(1, request.getParameter("resName"));
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
		attr=rs.getString(3);
	attrVals=rs.getString(4);
	}
	}catch(Exception e){
		e.printStackTrace();
		}
	
	List<String> li=Arrays.asList(attrVals.split(","));
	
	for(String val:li)
	{
	%>
	<input type="checkbox" value=<%=val %> name="attValsCBK">>
	<label><%=val %></label><br>
	<%} %>
	<h2>PERMISSIONS</h2>
	<%
	List<String> liPerms=Arrays.asList(request.getParameterValues("perms"));
	
	for(String s:liPerms){
		%>
		<input type="hidden" value=<%=s %> name="permsCBK"  />
		<label><%=s %></label><br>
	<%}
	
	%>
	<h2>RES TYPE = <%=request.getParameter("resTypeName") %></h2>
	<h2>RES NAME = <%=request.getParameter("resName") %></h2>
	<h2>ATTR NAME = <%=attr %></h2>
	<input type="hidden" name="resName" value=<%=request.getParameter("resName") %>>
  <input type="hidden" name="attrName" value=<%=attr %>>
  <input type="hidden" name="resTypeName" value=<%=request.getParameter("resTypeName") %>>
<button>CREATE PERM</button>


</form>
</body>
</html>