<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, util.DatabaseConnection" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Classic Hub</title>
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

        <div class="content">
            <h1>Classic & <br><span>Mind blowing</span><br>Ideas</h1>
            <p class="par">Perfect choices in decoration, is that what makes your home look classic. Here we<br> have got some aesthetic ideas in our classic hub for your home<br> to make it more decorous.</p>

            <!-- Sign-In Form -->
            <form action="data.jsp?action=signin" method="POST" onsubmit="return validateSigninForm()">
                <div class="form" id="signinForm">
                    <h2>Login Here</h2>
                    <input type="email" id="signin-email" placeholder="Enter Email Here" name="signin-email" required>
                    <span id="signin-email-error" class="error-message" style="display: none;">Invalid email format</span>

                    <input type="password" id="signin-password" placeholder="Enter Password Here" name="signin-password" required>
                    <span id="signin-password-error" class="error-message" style="display: none;">Password cannot be empty</span>

                    <button class="btnn" type="submit">Login</button>
                    <p class="link">Don't have an account? <a href="javascript:void(0);" id="showSignupForm">Sign up</a></p>
                </div>
            </form>

            <!-- Sign Up Form -->
            <form action="data.jsp?action=signup" method="POST" onsubmit="return validateSignupForm()">
                <div class="form hidden" id="signupForm">
                    <h2>Sign Up Here</h2>
                    <input type="text" id="signup-name" placeholder="Enter Name Here" name="signup-name" required>
                    
                    <input type="email" id="signup-email" placeholder="Enter Email Here" name="signup-email" required>
                    <span id="email-error" class="error-message" style="display: none;">Invalid email format</span>

                    <input type="password" id="signup-password" placeholder="Enter Password Here" name="signup-password" required>
                    <span id="password-error" class="error-message" style="display: none;">Password must be at least 8 characters long, and contain at least one number and one letter.</span>

                    <input type="password" id="confirm-password" placeholder="Confirm Password Here" name="confirm-password" required>
                    <span id="confirm-password-error" class="error-message" style="display: none;">Passwords do not match</span>
                    <span id="email-exists-error" class="error-message" style="display: none;">Email is already in use. Please choose a different one.</span>

                    <button class="btnn" type="submit">Sign Up</button>
                    <p class="link">Already have an account? <a href="javascript:void(0);" id="showSigninFormLink">Sign in here</a></p>
                </div>
            </form>

            <script>
                // Sign-In form validation
                function validateSigninForm() {
                    let email = document.getElementById("signin-email").value;
                    let password = document.getElementById("signin-password").value;
                    let emailError = document.getElementById("signin-email-error");
                    let passwordError = document.getElementById("signin-password-error");

                    // Reset error messages
                    emailError.style.display = "none";
                    passwordError.style.display = "none";

                    // Email format validation
                    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
                    if (!emailPattern.test(email)) {
                        emailError.style.display = "block";
                        return false;
                    }

                    // Password cannot be empty
                    if (password === "") {
                        passwordError.style.display = "block";
                        return false;
                    }

                    return true;
                }

                // Sign-Up form validation
                function validateSignupForm() {
                    let email = document.getElementById("signup-email").value;
                    let password = document.getElementById("signup-password").value;
                    let confirmPassword = document.getElementById("confirm-password").value;
                    let emailError = document.getElementById("email-error");
                    let passwordError = document.getElementById("password-error");
                    let confirmPasswordError = document.getElementById("confirm-password-error");
                    let emailExistsError = document.getElementById("email-exists-error");

                    // Reset error messages
                    emailError.style.display = "none";
                    passwordError.style.display = "none";
                    confirmPasswordError.style.display = "none";
                    emailExistsError.style.display = "none";

                    // Email format validation
                    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
                    if (!emailPattern.test(email)) {
                         emailError.style.display = "block";
                        return false;
                    }

                    // Password constraints
                    if (password.length < 8 || !/[A-Za-z]/.test(password) || !/\d/.test(password)) {
                        passwordError.style.display = "block";
                        return false;
                    }

                    // Confirm password validation
                    if (password !== confirmPassword) {
                        confirmPasswordError.style.display = "block";
                        return false;
                    }

                    return true;
                }

                // Toggle between Sign In and Sign Up forms
                document.getElementById('showSignupForm').addEventListener('click', function() {
                    document.getElementById('signinForm').classList.add('hidden');
                    document.getElementById('signupForm').classList.remove('hidden');
                });

                document.getElementById('showSigninFormLink').addEventListener('click', function() {
                    document.getElementById('signupForm').classList.add('hidden');
                    document.getElementById('signinForm').classList.remove('hidden');
                });
            </script>
        </div>
    </div>
</body>
</html>
