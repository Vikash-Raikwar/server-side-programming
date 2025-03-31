<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script src="../webapp/js/ajax.js"></script>
</head>
<body>
    <h2>Login</h2>
    <form id="loginForm">
        <label>Username:</label><br>
        <input type="text" name="username" required><br><br>
        <label>Password:</label><br>
        <input type="password" name="password" required><br><br>
        <button type="button" onclick="submitForm()">Login</button>
    </form>

    <p style="color: red;"><%= request.getParameter("error") != null ? "Invalid credentials!" : "" %></p>
</body>
</html>