package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import util.DatabaseConnection;

public final class data_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    String action = request.getParameter("action");

    // Declare error variables
    String usernameError = "";
    String emailError = "";
    String passwordError = "";
    String confirmPasswordError = "";

    // Sign-up Logic
    if (action != null && action.equals("signup")) {
        String username = request.getParameter("usernameError");
        String email = request.getParameter("signup-email");
        String password = request.getParameter("signup-password");
        String confirmPassword = request.getParameter("confirm-password");
        
        if (usernameError != null) {
            out.println("<div class='error'>" + usernameError + "</div>");
        }
        // Username validation: Must contain at least one alphabet and one digit
        String usernamePatternAlpha = ".*[A-Za-z].*"; // checks if there's at least one letter
        String usernamePatternDigit = ".*\\d.*"; // checks if there's at least one digit
        if (!username.matches(usernamePatternAlpha)) {
            usernameError = "Username must contain at least one alphabet.";
        }
        if (!username.matches(usernamePatternDigit)) {
            usernameError += " Username must contain at least one digit.";
        }

        // If there's an error in username, redirect with error
        if (!usernameError.isEmpty()) {
            response.sendRedirect("signup.jsp?error=username_invalid&usernameError=" + usernameError);
            return;
        }

        // Validate email format
        String emailPattern = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!email.matches(emailPattern)) {
            response.sendRedirect("signup.jsp?error=email_invalid");
            return;
        }

        // Validate password constraints (minimum 8 characters, one letter, one number)
        if (password.length() < 8 || !password.matches(".*[A-Za-z].*") || !password.matches(".*\\d.*")) {
            response.sendRedirect("signup.jsp?error=password_invalid");
            return;
        }

        // Check if passwords match
        if (!password.equals(confirmPassword)) {
            response.sendRedirect("signup.jsp?error=password_mismatch");
            return;
        }

        try {
            Connection conn = DatabaseConnection.getConnection();

            // Check if email already exists
            String checkEmailQuery = "SELECT * FROM users WHERE email = ?";
            PreparedStatement checkEmailStmt = conn.prepareStatement(checkEmailQuery);
            checkEmailStmt.setString(1, email);
            ResultSet rs = checkEmailStmt.executeQuery();

            if (rs.next()) {
                response.sendRedirect("signup.jsp?error=email_exists");
            } else {
                // Insert new user
                String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, username);
                pstmt.setString(2, email);
                pstmt.setString(3, password); // Store password as plain text (hash it in production)
                pstmt.executeUpdate();

                // Redirect to login page after successful sign-up
                response.sendRedirect("login.jsp?signup_success=true");
            }

            rs.close();
            checkEmailStmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("signup.jsp?error=signup_failed");
        }
    }

    // Sign-In Logic
    if (action != null && action.equals("signin")) {
        String email = request.getParameter("signin-email");
        String password = request.getParameter("signin-password");

        // Validate email format
        String emailPattern = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        if (!email.matches(emailPattern)) {
            response.sendRedirect("login.jsp?error=email_invalid");
            return;
        }

        try {
            // Establish database connection
            Connection conn = DatabaseConnection.getConnection();

            // Check if the user exists with the given email
            String sql = "SELECT * FROM users WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Validate the password by comparing it with the stored password
                String storedPassword = rs.getString("password");

                // If the password matches
                if (password.equals(storedPassword)) {
                    // User authenticated, create session
                    session = request.getSession(true); // Create a new session if one doesn't exist
                    session.setAttribute("user", email); // Store the email in the session

                    // Redirect to Design.jsp after successful login
                    response.sendRedirect("Design.jsp");
                } else {
                    // Invalid password
                    response.sendRedirect("login.jsp?error=invalid_credentials");
                }
            } else {
                // User doesn't exist
                response.sendRedirect("login.jsp?error=invalid_credentials");
            }

            // Close connections
            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp?error=login_failed");
        }
    }

      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
