<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Remove Item</title>
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
            <h1>Removing Item from Cart...</h1>
            <% 
                // Retrieve the cart from the session
                ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
                if (cart == null) {
                    cart = new ArrayList<String>();
                }

                // Get the product ID from the request
                String productId = request.getParameter("productId");

                // Logic to remove the item from the cart
                if (cart.contains(productId)) {
                    cart.remove(productId);
                }

                // Save the updated cart back to the session
                session.setAttribute("cart", cart);

                // Redirect back to the cart page
                response.sendRedirect("addToCart.jsp");
            %>
        </div>
    </div>
</body>
</html>
