<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Groups</title>
</head>
<body>
<h2>Registered Groups</h2>

<table border="1">
<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Supervisor</th><th>Level</th></tr>

<%
try (Connection conn = model.DatabaseConnection.getConnection()) {
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM groups");
    
    while (rs.next()) {
%>
<tr>
<td><%= rs.getInt("id") %></td>
<td><%= rs.getString("first_name") %></td>
<td><%= rs.getString("last_name") %></td>
<td><%= rs.getString("supervisor") %></td>
<td><%= rs.getString("level") %></td>
</tr>

<%
    }
} catch (SQLException e) {
    e.printStackTrace();
}
%>

</table>

<a href="index.jsp">Register another group</a>

</body>
</html>