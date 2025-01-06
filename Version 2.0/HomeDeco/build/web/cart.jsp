<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Cart</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="main">
        <%
            // Get the session object
            List<Map<String, String>> cart = (List<Map<String, String>>) session.getAttribute("cart");

            if (cart == null || cart.isEmpty()) {
        %>
            <h2>Your cart is empty</h2>
            <a href="Home.jsp" class="btn">Start Shopping</a>
        <%
            } else {
        %>
            <h2>Your Cart</h2>
            <table>
                <thead>
                    <tr>
                        <th>Product Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        double total = 0;
                        for (Map<String, String> item : cart) {
                            String productName = item.get("productName");
                            String productPrice = item.get("productPrice");
                            String quantity = item.get("quantity");
                            double price = Double.parseDouble(productPrice.replace("$", ""));
                            double itemTotal = price * Integer.parseInt(quantity);
                            total += itemTotal;
                    %>
                    <tr>
                        <td><%= productName %></td>
                        <td><%= productPrice %></td>
                        <td><%= quantity %></td>
                        <td>$<%= itemTotal %></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
            <p>Total: $<%= total %></p>
            <a href="checkout.jsp" class="btn">Proceed to Checkout</a>
        <%
            }
        %>
    </div>
</body>
</html>
