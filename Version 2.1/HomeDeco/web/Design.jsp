<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Design Ideas | Classic Hub</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>

  <!-- Header Section -->
  <header>
    <div class="navbar">
      <div class="logo">
        <h2>Classic Hub</h2>
      </div>
      <nav>
        <ul>
          <li><a href="Home.jsp">Home</a></li>
          <li><a href="Design.jsp">Design</a></li>
          <li><a href="Contact.jsp">Contact</a></li>
          <li><a href="login.jsp">Account</a></li>
        </ul>
      </nav>
    </div>
  </header>

  <!-- Design Options Section -->
  <section class="designs">
    <div class="container">
      <h2>Our Design Ideas</h2>
      <p>Explore our curated collection of timeless and modern design ideas to help you create your dream space. Whether you're redecorating a room or designing from scratch, we have something for every taste!</p>
      <div class="design-gallery">
        <div class="design-card">
          <img src="images/living_room.jpg" alt="Living Room Design">
          <h3>Living Room</h3>
          <p>Classic and contemporary designs to make your living space welcoming.</p>
        </div>
        <div class="design-card">
          <img src="images/bedroom.jpg" alt="Bedroom Design">
          <h3>Bedroom</h3>
          <p>Elegant and cozy bedroom ideas to help you relax and unwind.</p>
        </div>
        <div class="design-card">
          <img src="images/kitchen.jpg" alt="Kitchen Design">
          <h3>Kitchen</h3>
          <p>Innovative and functional kitchen designs for all styles and budgets.</p>
        </div>
      </div>
    </div>
  </section>

  <!-- Home Decor Collection Section -->
  <section class="home-decor-collection">
    <div class="container">
      <h3>Home Decor Collection</h3>
      <div class="gallery">
        <% 
            String[][] decorItems = {
                {"a1.jpg", "Tree frames", "$50", "1"},
                {"a2.jpeg", "Vase set", "$75", "2"},
                {"a3.jpeg", "Wall decor plates", "$90", "3"},
                {"a4.jpg", "Paintings", "$60", "4"},
                {"a5.avif", "Large standing lamp", "$100", "5"},
                {"a6.webp", "Sculpture", "$150", "6"},
                {"a7.jpg", "Plant pots", "$50", "7"},
                {"a8.webp", "Large painting", "$75", "8"},
                {"a9.jpg", "Table set", "$90", "9"},
                {"a10.jpg", "Hanging Frames", "$60", "10"},
                {"a11.webp", "Mini lightning globes", "$120", "11"},
                {"a12.avif", "Laser cut showpieces", "$150", "12"}
            };

            for (int i = 0; i < decorItems.length; i++) {
        %>
            <div class="item">
              <a href="productDetail.jsp?productId=<%= decorItems[i][3] %>">
                <div class="image-container">
                  <img src="images/<%= decorItems[i][0] %>" alt="<%= decorItems[i][1] %>">
                </div>
                <div class="details">
                  <h2><%= decorItems[i][1] %></h2>
                  <p>Price: <%= decorItems[i][2] %></p>
                </div>
              </a>
            </div>
        <% } %>
      </div>
    </div>
  </section>

  <!-- Footer Section -->
  <footer>
    <div class="container">
      <p>&copy; 2024 Classic Hub | All rights reserved</p>
    </div>
  </footer>

</body>
</html>
