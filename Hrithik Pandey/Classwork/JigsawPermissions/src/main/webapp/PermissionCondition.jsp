<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
		
		function retriverResourceTypes(){
	               document.getElementById("resourceForm").action = "AddPermission?action=retrieveResourceType";
	               document.getElementById("resourceForm").submit();
		}
        function retrieveResources() {
            document.getElementById("resourceForm").action = "AddPermission?action=retrieveResources";
            document.getElementById("resourceForm").submit();
        }
        function retrievePermissions() {
            document.getElementById("resourceForm").action = "AddPermission?action=retrievePermissions";
            document.getElementById("resourceForm").submit();
        }

        function retrieveAttributes() {
            document.getElementById("resourceForm").action = "AddPermission?action=retrieveAttributes";
            document.getElementById("resourceForm").submit();
        }
        function retrieveVals(){
        	document.getElementById("resourceForm").action = "AddPermission?action=retrieveVals";
            document.getElementById("resourceForm").submit();
        }
    </script>
</head>
<body>
<h1>Permission Condition</h1>
	
    <form id="resourceForm" method="post">
        <label for="resourceType">Resource Type:</label>
         <select name="resourceType" id="resourceType">
        <%
 			if(application.getAttribute("selectedrt")!=null)
 			{%> <option value="<%=application.getAttribute("selectedrt")  %>"selected="<%=application.getAttribute("selectedrt")  %>"><%= application.getAttribute("selectedrt") %></option>
 				
 			<% }
 			
        List<String> rt = (List<String>) application.getAttribute("rt");
        if (rt != null) {
            for (String i : rt) {
               
        %>
                <option value="<%= i %>"><%= i %></option>
        <%
            }
        }
        %>
    </select>
        <button type="button" onclick="retrieveResources()">Retrieve Resources</button>
        <br><br>

        <label for="resource">Resource:</label>
        <select name="resource" id="resource">
            <%
 			if(application.getAttribute("selectedres")!=null)
 			{%> <option value="<%=application.getAttribute("selectedres")  %>"selected="<%=application.getAttribute("selectedres")  %>"><%= application.getAttribute("selectedres") %></option>
 				
 			<% }
 			
            List<String> res = (List<String>) application.getAttribute("res");
        	if (res != null) {
            for (String i : res) {
        %>
                <option value="<%= i %>"><%= i %></option>
        <%
            }
        }
        %>
        </select>
        <br><br>
        <label for="permission">Permission:</label>
        <select name="permission" id="permission">
            <%
 			if(application.getAttribute("selectedper")!=null)
 			{%> <option value="<%=application.getAttribute("selectedper")  %>"selected="<%=application.getAttribute("selectedper")  %>"><%= application.getAttribute("selectedper") %></option>
 				
 			<% }
 			
        List<String> per = (List<String>) application.getAttribute("per");
        if (per != null) {
            for (String i : per) {
        %>
                <option value="<%= i %>"><%= i %></option>
        <%
            }
        }
        %>
        </select>
        <button type="button" onclick="retrieveAttributes()">Retrieve Attributes</button>
        <br><br>

        <label for="attribute">Attributes:</label>
        <select name="attribute" id="attribute">
            <%
 			if(application.getAttribute("selectedatt")!=null)
 			{%> <option value="<%=application.getAttribute("selectedatt")  %>"selected="<%=application.getAttribute("selectedatt")  %>"><%= application.getAttribute("selectedatt") %></option>
 				
 			<% }
 			else {
            String att = (String)application.getAttribute("att");
            if (att != null) {
            %>
                    <option value="<%= att %>"><%= att %></option>
            <% 
                }}
            %>
        </select>
        <button type="button" onclick="retrieveVals()">Retrieve Values</button>
			<br>
			<%
			List<String> cb = (List<String>) application.getAttribute("vals");
			if (cb != null && !cb.isEmpty()) {
			    for (String item : cb) {
			%>
			<input type="checkbox" name="selectedItems" value="<%= item %>" id="<%= item %>">
			<label for="<%= item %>"><%= item %></label><br>
			<% }
			} else { %>
			<p>No items available</p>
			<% } %>
    </form>
</body>
</body>
</html>