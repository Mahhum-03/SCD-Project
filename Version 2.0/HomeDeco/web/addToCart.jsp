<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shopping Cart</title>
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
            <h1>Your Shopping Cart</h1>
            
            <% 
                ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
                if (cart == null) {
                    cart = new ArrayList<String>();
                }
                
                // Sample product details (in a real application, you'd fetch this from a database)
                String[][] productDetails = {
                    {"1", "Modern Table Lamp", "A sleek and stylish table lamp with an adjustable arm.", "$49.99", "https://via.placeholder.com/100x100.png?text=Lamp"},
                    {"2", "Wall Art Canvas", "A beautiful abstract painting to add character to any room.", "$79.99", "https://via.placeholder.com/100x100.png?text=Canvas"},
                    {"3", "Decorative Vase", "A minimalistic vase perfect for flowers or as a standalone piece.", "$34.99", "https://via.placeholder.com/100x100.png?text=Vase"},
                    {"4", "Coffee Table", "A contemporary coffee table with a wooden finish and glass top.", "$129.99", "https://via.placeholder.com/100x100.png?text=Table"}
                };

                double totalPrice = 0;

                if (cart.isEmpty()) {
                    out.println("<p>Your cart is empty. Add some products to it!</p>");
                } else {
                    out.println("<table style='width: 100%;'>");
                    out.println("<thead><<th>Product</th><th>Image</th><th>Price</th><th>       </th><th>Total</th><th>Remove</th></tr></thead>");
                    out.println("<tbody>");

                    for (String productId : cart) {
                        for (int i = 0; i < productDetails.length; i++) {
                            if (productDetails[i][0].equals(productId)) {
                                String productName = productDetails[i][1];
                                String productDescription = productDetails[i][2];
                                String productPrice = productDetails[i][3];
                                String productImage = productDetails[i][4];

                                // Add your own logic to handle quantity and total calculation
                                double price = Double.parseDouble(productPrice.replace("$", ""));
                                double totalProductPrice = price;

                                totalPrice += totalProductPrice;

                                out.println("<tr>");
                                out.println("<td>" + productName + "</td>");
                                out.println("<td><img src='" + productImage + "' alt='" + productName + "' width='100px'></td>");
                                out.println("<td>" + productPrice + "</td>");
                                out.println("<td>");
                                out.println("<input type='hidden' name='productId' value='" + productId + "'>");
                                out.println("</form>");
                                out.println("</td>");
                                out.println("<td>$" + totalProductPrice + "</td>");
                                out.println("<td>");
                                out.println("<form action='removeFromCart.jsp' method='POST'>");
                                out.println("<input type='hidden' name='productId' value='" + productId + "'>");
                                out.println("<input type='submit' value='Remove'>");
                                out.println("</form>");
                                out.println("</td>");
                                out.println("</tr>");
                            }
                        }
                    }
                    out.println("</tbody>");
                    out.println("</table>");
                }
            %>

            <h3>Total: $<%= totalPrice %></h3>

            <form action="checkout.jsp" method="POST">
                <input type="submit" value="Proceed to Checkout" class="btn">
            </form>
        </div>
    </div>
</body>
</html>
