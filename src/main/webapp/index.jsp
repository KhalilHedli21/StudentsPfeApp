<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Group Registration</title>
</head>
<body>
<h2>Register Group Members</h2>
<form action="group" method="post">
    First Name: <input type="text" name="first_name" required><br>
    Last Name: <input type="text" name="last_name" required><br>
    Supervisor: <input type="text" name="supervisor" required><br>
    Level:
    <select name="level">
        <option value="Licence">Licence</option>
        <option value="Master">Master</option>
    </select><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>