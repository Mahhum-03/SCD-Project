<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Classic Hub | Home Decor</title>
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

  <!-- Hero Section with Background Image -->
  <section class="hero">
    <div class="hero-content">
      <h1>Transform Your Home with Classic & Modern Designs</h1>
      <p>Explore timeless and elegant home decor ideas to make your space unique.</p>
      <a href="Design.jsp" class="btn-primary">Explore Designs</a>
    </div>
  </section>

  <!-- About Us Section -->
  <section class="about">
    <div class="container">
      <h2>About Us</h2>
      <p>At Classic Hub, we are passionate about bringing timeless beauty into your home. Whether you are looking for classic, modern, or eclectic designs, we offer a range of ideas and products to suit every taste. Our mission is to inspire and empower you to create spaces that are not only functional but also a reflection of your personal style.</p>
      <a href="About.jsp" class="btn-secondary">Learn More</a>
    </div>
  </section>

  <!-- Featured Products Section (Optional) -->
  <section class="featured-products">
    <div class="container">
      <h2>Featured Products</h2>
      <div class="products">
        <div class="product-card">
          <img src="images/sofa.jpg" alt="Luxury Sofa">
          <h3>Luxury Sofa</h3>
          <p>Perfect for your living room. A blend of comfort and elegance.</p>
          <a href="Product.jsp" class="btn-secondary">View Details</a>
        </div>
        <div class="product-card">
          <img src="images/lamp.jpg" alt="Table Lamp">
          <h3>Modern Table Lamp</h3>
          <p>Illuminate your space with style and sophistication.</p>
          <a href="Product.jsp" class="btn-secondary">View Details</a>
        </div>
        <!-- Add more product cards as needed -->
      </div>
    </div>
  </section>

  <!-- Footer Section -->
  <footer>
    <div class="container">
      <p>&copy; 2024 Classic Hub | All rights reserved</p>
      <div class="social-links">
        <a href="#">Facebook</a>
        <a href="#">Instagram</a>
        <a href="#">Pinterest</a>
      </div>
    </div>
  </footer>

</body>
</html>
