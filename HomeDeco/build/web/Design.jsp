<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Decor Gallery</title>
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
      <div class="search">
        <input class="srch" type="search" name="" placeholder="Type to search">
        <a href="#"><button class="btn">Search</button></a>
      </div>
    </div>
    <div class="container">
        <h3>Home Decor Collection</h3>
        <div class="gallery">
            <% 
                String[][] decorItems = {
                    {"a1.jpg", "Decor Item 1", "$50"},
                    {"a2.jpeg", "Decor Item 2", "$75"},
                    {"a3.jpeg", "Decor Item 3", "$90"},
                    {"a4.jpg", "Decor Item 4", "$60"},
                    {"a5.avif", "Decor Item 5", "$120"},
                     {"a6.webp", "Decor Item 5", "$120"},
                     {"a7.jpg", "Decor Item 5", "$120"},
                      {"a8.webp", "Decor Item 5", "$120"},
                    // Add more items up to 36
                };

                for(int i = 0; i < decorItems.length; i++) {
            %>
                <div class="item">
                    <div class="image-container">
                        <img src="images/<%= decorItems[i][0] %>" alt="<%= decorItems[i][1] %>">
                    </div>
                    <div class="details">
                        <h2><%= decorItems[i][1] %></h2>
                        <p>Price: <%= decorItems[i][2] %></p>
                        <button href="" class="btn View">View</button>
                        <button class="btn Add to Cart">Add to Cart</button>
                    </div>
                </div>
            <% } %>
        </div>
    </div>
</body>
</html>
