package org.apache.jsp.WEB_002dINF;

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

    // Sign-Up Logic
    if (action != null && action.equals("signup")) {
        String username = request.getParameter("signup-name");
        String email = request.getParameter("signup-email");
        String password = request.getParameter("signup-password");
        String confirmPassword = request.getParameter("confirm-password");

        if (password.equals(confirmPassword)) {
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
                    // Insert new user with plain text password
                    String sql = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, username);
                    pstmt.setString(2, email);
                    pstmt.setString(3, password); // Directly using plain text password
                    pstmt.executeUpdate();

                    // Redirect to login page after successful sign-up
                    response.sendRedirect("login.jsp?success=true");
                }

                // Close connections
                rs.close();
                checkEmailStmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("signup.jsp?error=signup_failed");
            }
        } else {
            response.sendRedirect("signup.jsp?error=password_mismatch");
        }
    }

    // Sign-In Logic
    else if (action != null && action.equals("signin")) {
        String email = request.getParameter("signin-email");
        String password = request.getParameter("signin-password");

        try {
            // Establish database connection
            Connection conn = DatabaseConnection.getConnection();

            // Check if the user exists with the given email and password
            String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);  // Using the email parameter
            pstmt.setString(2, password);  // Using the password parameter
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // User authenticated
                session = request.getSession(true); // Create a new session if one doesn't exist
                session.setAttribute("user", email); // Store the email in the session
                
                System.out.println("User logged in: " + email); // Debugging log

                // Redirect to homepage after successful login
                response.sendRedirect("home.jsp");
            } else {
                // Invalid credentials
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
