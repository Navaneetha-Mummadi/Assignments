<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="myjavaservlet.Book" %>
<%
    Book book = (Book) request.getAttribute("book");
    boolean isEdit = (book != null);
%>
<html>
<head><title>Book Form</title></head>
<body>
    <h2><a href="new">Add New Book</a> | <a href="list">List All Books</a></h2>
    <h3><%= isEdit ? "Edit Book" : "Add New Book" %></h3>
    <form action="<%= isEdit ? "update" : "insert" %>" method="post">
        <% if (isEdit) { %>
            <input type="hidden" name="id" value="<%= book.getId() %>"/>
        <% } %>
        Title: <input type="text" name="title" value="<%= isEdit ? book.getTitle() : "" %>"/><br/>
        Author: <input type="text" name="author" value="<%= isEdit ? book.getAuthor() : "" %>"/><br/>
        Price: <input type="text" name="price" value="<%= isEdit ? book.getPrice() : "" %>"/><br/>
        <input type="submit" value="Save"/>
    </form>
</body>
</html>
