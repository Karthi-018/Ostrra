<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>create resource type</title>
</head>
<body>
    <form action="index.jsp" method="post">
        <label for="rsname">Input 1:</label>
        <input type="text" id="rsname" name="rsname" required><br><br>
        
        <label for="rsvalues">Input 2:</label>
        <input type="text" id="rsvalues" name="rsvalues" required><br><br>
        
        <button type="submit">Submit</button>
    </form>

    <%
        String url = "jdbc:postgresql://localhost:5432/assignment";
        String user = "postgres";
        String password = "postres";

        String input1 = request.getParameter("rsname");
        String input2 = request.getParameter("rsvalues");

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO resource_data (resource_type, resource_values) VALUES (?, ?)")) {
            pstmt.setString(1, input1);
            pstmt.setString(2, input2);
            int count = pstmt.executeUpdate();
            response.sendRedirect("secondPage.jsp");
        } catch (SQLException e) {
            e.getMessage();
            out.println("<p>Error occurred: " + e.getMessage() + "</p>");
        }
        
    %>
</body>
</html>
