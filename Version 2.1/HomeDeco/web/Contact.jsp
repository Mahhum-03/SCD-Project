<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Contact Us | Classic Hub</title>
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

  <!-- Contact Us Section -->
  <section class="contact">
    <div class="container">
      <h2>Contact Us</h2>
      <p>We would love to hear from you! Whether you have questions or need design assistance, feel free to reach out to us.</p>
      <form action="contactFormHandler.jsp" method="POST" class="contact-form">
        <label for="name">Name</label>
        <input type="text" id="name" name="name" required placeholder="Your name">
        
        <label for="email">Email</label>
        <input type="email" id="email" name="email" required placeholder="Your email address">
        
        <label for="message">Message</label>
        <textarea id="message" name="message" rows="6" required placeholder="Your message"></textarea>
        
        <button type="submit" class="btn-primary">Send Message</button>
      </form>
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
