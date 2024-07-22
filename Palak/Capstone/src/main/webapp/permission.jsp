<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resource Form</title>
</head>
<body>
<h1> Add Permissions</h1>
    <form action="Permission" method="GET">
        <label>Resource Type</label>
        <select id="rtname" name="rtname">
            <%
                Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Assignment","postgres","postgres");
                PreparedStatement ps = c.prepareStatement("SELECT * FROM public.\"ResourseType\"");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){                
            %>
            <option value="<%= rs.getString("rtname") %>"><%= rs.getString("rtname") %></option>
            <% } %>
        </select>
        <input type="submit" />
        
        
        
        <label for="permission">Permission</label>        
        <select id="permission" name="permission" required>
            <%
                String selectedInput1 = request.getParameter("rtname");
                System.out.println(selectedInput1);
                if (selectedInput1 != null && !selectedInput1.isEmpty()) {
                    try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Assignment","postgres","postgres");
                       
                        PreparedStatement pstmt = conn.prepareStatement("SELECT permission FROM ResourceType WHERE rtname = ?")) {
                        pstmt.setString(1, selectedInput1);
                        ResultSet rs1 = pstmt.executeQuery();
                        if (rs1.next()) {
                            String[] p1 = rs1.getString("permission").split(",");
                            for (String p : p1) {
                                out.print("<option value=\"" + p + "\">" + p + "</option>");
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            %>
        </select><br><br>
        

        
        <label>Resource Name</label>
        <select name="rname">
            <%
                ps = c.prepareStatement("SELECT DISTINCT rname FROM public.\"Resource\"");
                rs = ps.executeQuery();
                while(rs.next()){
            %>
            <option value="<%= rs.getString("rname") %>"><%= rs.getString("rname") %></option>
            <% } %>
        </select>
        
        <label>Attribute Name</label>
        <select name="attribute">
            <%
                ps = c.prepareStatement("SELECT DISTINCT attribute FROM public.\"Resource\"");
                rs = ps.executeQuery();
                while(rs.next()){
            %>
            <option value="<%= rs.getString("attribute") %>"><%= rs.getString("attribute") %></option>
            <% } %>
        </select>
        
        <label>Value</label>
        <select name="value">
            <%
                ps = c.prepareStatement("SELECT DISTINCT data FROM public.\"Resource\"");
                rs = ps.executeQuery();
                while(rs.next()){
            %>
            <option value="<%= rs.getString("data") %>"><%= rs.getString("data") %></option>
            <% } %>
        </select>
        
        <input type="submit" value="Submit"/>
    </form>
    
    <br/>
    
</body>
</html>
