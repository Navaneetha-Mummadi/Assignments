<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Entry Form</title>
</head>
<body>
    <h2>Enter Product Details</h2>
    <form action="productDetails.jsp" method="post">
        Product ID: <input type="text" name="productId" required><br><br>
        Name: <input type="text" name="name" required><br><br>
        Price: <input type="number" name="price" step="0.01" required><br><br>
        Quantity: <input type="number" name="quantity" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
