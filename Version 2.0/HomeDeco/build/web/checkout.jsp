<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="main">
        <div class="navbar">
            <div class="icon">
                <li><a href="Home.jsp"> <h2 class="logo"> Home Decor'</h2></a></li>
            </div>
            <div class="menu">
                <ul>
                    <li><a href="Home.jsp">Home</a></li>
                    <li><a href="Design.jsp">Design</a></li>
                    <li><a href="Contact.jsp">Contact</a></li>
                    <li><a href="About.jsp">About</a></li>
                    <li><a href="login.jsp">Login</a></li>
                </ul>
            </div>
        </div>

        <div class="container">
            <h1>Checkout</h1>

            <% 
                // Retrieve the cart from the session
                ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
                if (cart == null || cart.isEmpty()) {
                    out.println("<p>Your cart is empty. Please add some items to the cart.</p>");
                } else {
            %>
            <h2>Shipping Information</h2>
            <form action="confirmOrder.jsp" method="POST">
                <label for="name">Full Name:</label>
                <input type="text" id="name" name="name" required><br><br>

                <label for="address">Shipping Address:</label>
                <textarea id="address" name="address" required></textarea><br><br>

                <label for="payment">Payment Method:</label>
                <select id="payment" name="payment" required>
                    <option value="creditCard">Credit Card</option>
                    <option value="paypal">PayPal</option>
                    <option value="bankTransfer">Bank Transfer</option>
                </select><br><br>

                <input type="submit" value="Confirm Order" class="btn">
            </form>
            <% } %>
        </div>
    </div>
</body>
</html>
