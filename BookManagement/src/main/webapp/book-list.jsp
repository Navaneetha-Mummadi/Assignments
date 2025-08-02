<%@ page import="java.util.*, myjavaservlet.Book" %>
<html>
<head><title>Book List</title></head>
<body>
    <h2><a href="new">Add New Book</a> | <a href="list">List All Books</a></h2>
    <h3>List of Books</h3>
    <table border="1">
        <tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th><th>Actions</th></tr>
        <%
            List<Book> listBook = (List<Book>) request.getAttribute("listBook");
            for (Book book : listBook) {
        %>
            <tr>
                <td><%= book.getId() %></td>
                <td><%= book.getTitle() %></td>
                <td><%= book.getAuthor() %></td>
                <td><%= book.getPrice() %></td>
                <td>
                    <a href="edit?id=<%= book.getId() %>">Edit</a> |
                    <a href="delete?id=<%= book.getId() %>">Delete</a>
                </td>
            </tr>
        <% } %>
    </table>
</body>
</html>
