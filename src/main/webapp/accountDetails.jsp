<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:useBean id="account" class="myjavaservlet.Account" scope="request"/>
<jsp:setProperty name="account" property="*" />

<%
    // Store Account Type in Session Scope
    String accountType = request.getParameter("accountType");
    session.setAttribute("accountType", accountType);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Account Details</title>
</head>
<body>
    <h2>Account Details:</h2>
    <p>Account No: ${account.accountNo}</p>
    <p>Name: ${account.name}</p>
    <p>Balance: ${account.balance}</p>
    <p>Account Type (Session Scope): ${sessionScope.accountType}</p>

    <h3>
        Balance Status:
        ${account.balance >= 5000 ? 'Sufficient Balance' : 'Insufficient Balance'}
    </h3>
</body>
</html>
