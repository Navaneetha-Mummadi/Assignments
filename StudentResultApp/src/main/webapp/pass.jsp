<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Pass Page</title>
</head>
<body>
    <h2>Congratulations <%= request.getAttribute("studentName") %>!</h2>
    <p>You have passed with <%= request.getAttribute("marks") %> marks.</p>

    <%@ include file="footer.jsp" %>
</body>
</html>
