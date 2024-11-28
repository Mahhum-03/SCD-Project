<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>
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
    <div class="contact-container">
        <h1>Contact Us</h1>
        <p>If you have any questions, feel free to reach out to us. We'd love to hear from you!</p>
        
        <form action="contactFormHandler.jsp" method="POST" class="contact-form">
            <label for="name">Name</label>
            <input type="text" id="name" name="name" required placeholder="Your name">
            
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required placeholder="Your email address">
            
           
            
            <label for="message">Message</label>
            <textarea id="message" name="message" rows="6" required placeholder="Your message"></textarea>
            
            <button type="submit" class="btn submit">Send Message</button>
        </form>
    </div>
</body>
</html>
