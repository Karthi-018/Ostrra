<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create Resource</title>
</head>
<body>
    <form action="secondPage.jsp" method="post">
        <label for="rstype">Select resource type:</label>
        <select id="rstype" name="rstype" onchange="this.form.submit()">
            <option value=""></option>
            <%
                String url = "jdbc:postgresql://localhost:5432/assignment";
                String user = "postgres";
                String password = "postgres";

                try (Connection conn = DriverManager.getConnection(url, user, password);
                     Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery("SELECT DISTINCT resource_type FROM resource_data")) {
                    while (rs.next()) {
                        String input1 = rs.getString("resource_type");
                        out.print("<option value=\"" + input1 + "\">" + input1 + "</option>");
                    }
                } catch (SQLException e) {
                    e.getMessage();
                }
            %>
        </select><br><br>

        <label for="rstypes">Select Resource:</label>
        <select id="rsvalues" name="rsvalues" required>
            <%
                String selectedInput1 = request.getParameter("rstypes");
                if (selectedInput1 != null && !selectedInput1.isEmpty()) {
                    try (Connection conn = DriverManager.getConnection(url, user, password);
                         PreparedStatement pstmt = conn.prepareStatement("SELECT resource_values FROM resource_data WHERE resource_type = ?")) {
                        pstmt.setString(1, selectedInput1);
                        ResultSet rs = pstmt.executeQuery();
                        if (rs.next()) {
                            String[] resources = rs.getString("resource_values").split(",");
                            for (String resource : resources) {
                                out.print("<option value=\"" + resource + "\">" + resource + "</option>");
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            %>
        </select><br><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <button type="submit">Submit</button>
    </form>

    <%
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            String selectedResourceType = request.getParameter("rstypes");
            String selectedResourceValue = request.getParameter("rsvalues");
            String name = request.getParameter("name");

            try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement("INSERT INTO submitted_data (resource_type, resource_value, name) VALUES (?, ?, ?)")) {
                pstmt.setString(1, selectedResourceType);
                pstmt.setString(2, selectedResourceValue);
                pstmt.setString(3, name);
                pstmt.executeUpdate();
                out.println("<p>Data successfully submitted!</p>");
            } catch (SQLException e) {
                e.getMessage();
                out.println("<p>Error occurred: " + e.getMessage() + "</p>");
            }
        }
    %>
</body>
</html>
