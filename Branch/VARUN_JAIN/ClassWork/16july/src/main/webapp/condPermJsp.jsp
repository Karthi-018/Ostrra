<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
String resourcetypename = (String) session.getAttribute("resourcetypename");
String resourcename = request.getParameter("resourcename");
String attr = request.getParameter("attr");

List<String> rtls = new ArrayList<>();
List<String> rnls = new ArrayList<>();
rtls.add(resourcetypename);
rnls.add(resourcename);%>

<form action="" method="post">
    <label for="elementSelect">Select resource type:</label>
    <select id="elementSelect" name="elementSelect">
        <% for (String s : rtls) { %>
            <option value="<%= s %>"><%= s %></option>
        <% } %>
    </select>
    <br><br>
    <label for="elementSelecttwo">Select resource name:</label>
    <select id="elementSelecttwo" name="elementSelecttwo">
        <% for (String s : rnls) { %>
            <option value="<%= s %>"><%= s %></option>
        <% } %>
    </select>
    <br>
    <label> Select Attributes:</label>
    <input type="checkbox" name="id" value="first"> <%= attr %><BR>
    
</form>




</body>
</html>