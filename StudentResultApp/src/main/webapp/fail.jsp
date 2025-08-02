<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Fail Page</title>
</head>
<body>
    <h2>Sorry <%= request.getAttribute("studentName") %>!</h2>
    <p>You have failed with <%= request.getAttribute("marks") %> marks.</p>

    <%@ include file="footer.jsp" %>
</body>
</html>
