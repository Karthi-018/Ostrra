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

String resourcetypename = request.getParameter("resourcetypename");
String perm = request.getParameter("availperm") ;
List<String> rtls = new ArrayList<>();
rtls.add(resourcetypename);%>

<form action="condPermJsp.jsp" method="post">
    <label for="elementSelect">Select resource type:</label>
    <select id="elementSelect" name="elementSelect">
        <% for (String s : rtls) { %>
            <option value="<%= s %>"><%= s %></option>
        <% } %>
    </select>
    <br><br>
    
    <label>Enter Resource Name : </label>
    <input type="text" name="resourcename" placeholder="enter resource name"/>
    <p>
    <label> Give attributes to create permissions : </label>
    <input type="text" name="attr" placeholder="enter attributes name"/>
    
    <input type="submit" value="Submit">
</form>
 
    <%    session.setAttribute("resourcetypename", resourcetypename);
    String nextjsp = "processForm.jsp";
 %>
    


</body>
</html>
