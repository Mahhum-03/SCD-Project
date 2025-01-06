package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import util.DatabaseConnection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Classic Hub</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <div class=\"icon\">\n");
      out.write("                <li><a href=\"Home.jsp\"> <h2 class=\"logo\"> Home Decor'</h2></a></li>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"Design.jsp\">Design</a></li>\n");
      out.write("                    <li><a href=\"Contact.jsp\">Contact</a></li>\n");
      out.write("                    <li><a href=\"About.jsp\">About</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"search\">\n");
      out.write("                <input class=\"srch\" type=\"search\" name=\"\" placeholder=\"Type to search\">\n");
      out.write("                <a href=\"#\"><button class=\"btn\">Search</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <h1>Classic & <br><span>Mind blowing</span><br>Ideas</h1>\n");
      out.write("            <p class=\"par\">Perfect choices in decoration, is that what makes your home look classic. Here we<br> have got some aesthetic ideas in our classic hub for your home<br> to make it more decorous.</p>\n");
      out.write("\n");
      out.write("            <!-- Sign-In Form -->\n");
      out.write("            <form action=\"data.jsp?action=signin\" method=\"POST\" onsubmit=\"return validateSigninForm()\">\n");
      out.write("                <div class=\"form\" id=\"signinForm\">\n");
      out.write("                    <h2>Login Here</h2>\n");
      out.write("                    <input type=\"email\" id=\"signin-email\" placeholder=\"Enter Email Here\" name=\"signin-email\" required>\n");
      out.write("                    <span id=\"signin-email-error\" class=\"error-message\" style=\"display: none;\">Invalid email format</span>\n");
      out.write("\n");
      out.write("                    <input type=\"password\" id=\"signin-password\" placeholder=\"Enter Password Here\" name=\"signin-password\" required>\n");
      out.write("                    <span id=\"signin-password-error\" class=\"error-message\" style=\"display: none;\">Password cannot be empty</span>\n");
      out.write("\n");
      out.write("                    <button class=\"btnn\" type=\"submit\">Login</button>\n");
      out.write("                    <p class=\"link\">Don't have an account? <a href=\"javascript:void(0);\" id=\"showSignupForm\">Sign up</a></p>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <!-- Sign Up Form -->\n");
      out.write("            <form action=\"data.jsp?action=signup\" method=\"POST\" onsubmit=\"return validateSignupForm()\">\n");
      out.write("                <div class=\"form hidden\" id=\"signupForm\">\n");
      out.write("                    <h2>Sign Up Here</h2>\n");
      out.write("                    <input type=\"text\" id=\"signup-name\" placeholder=\"Enter Name Here\" name=\"signup-name\" required>\n");
      out.write("                    \n");
      out.write("                    <input type=\"email\" id=\"signup-email\" placeholder=\"Enter Email Here\" name=\"signup-email\" required>\n");
      out.write("                    <span id=\"email-error\" class=\"error-message\" style=\"display: none;\">Invalid email format</span>\n");
      out.write("\n");
      out.write("                    <input type=\"password\" id=\"signup-password\" placeholder=\"Enter Password Here\" name=\"signup-password\" required>\n");
      out.write("                    <span id=\"password-error\" class=\"error-message\" style=\"display: none;\">Password must be at least 8 characters long, and contain at least one number and one letter.</span>\n");
      out.write("\n");
      out.write("                    <input type=\"password\" id=\"confirm-password\" placeholder=\"Confirm Password Here\" name=\"confirm-password\" required>\n");
      out.write("                    <span id=\"confirm-password-error\" class=\"error-message\" style=\"display: none;\">Passwords do not match</span>\n");
      out.write("                    <span id=\"email-exists-error\" class=\"error-message\" style=\"display: none;\">Email is already in use. Please choose a different one.</span>\n");
      out.write("\n");
      out.write("                    <button class=\"btnn\" type=\"submit\">Sign Up</button>\n");
      out.write("                    <p class=\"link\">Already have an account? <a href=\"javascript:void(0);\" id=\"showSigninFormLink\">Sign in here</a></p>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                // Sign-In form validation\n");
      out.write("                function validateSigninForm() {\n");
      out.write("                    let email = document.getElementById(\"signin-email\").value;\n");
      out.write("                    let password = document.getElementById(\"signin-password\").value;\n");
      out.write("                    let emailError = document.getElementById(\"signin-email-error\");\n");
      out.write("                    let passwordError = document.getElementById(\"signin-password-error\");\n");
      out.write("\n");
      out.write("                    // Reset error messages\n");
      out.write("                    emailError.style.display = \"none\";\n");
      out.write("                    passwordError.style.display = \"none\";\n");
      out.write("\n");
      out.write("                    // Email format validation\n");
      out.write("                    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$/;\n");
      out.write("                    if (!emailPattern.test(email)) {\n");
      out.write("                        emailError.style.display = \"block\";\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Password cannot be empty\n");
      out.write("                    if (password === \"\") {\n");
      out.write("                        passwordError.style.display = \"block\";\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Sign-Up form validation\n");
      out.write("                function validateSignupForm() {\n");
      out.write("                    let email = document.getElementById(\"signup-email\").value;\n");
      out.write("                    let password = document.getElementById(\"signup-password\").value;\n");
      out.write("                    let confirmPassword = document.getElementById(\"confirm-password\").value;\n");
      out.write("                    let emailError = document.getElementById(\"email-error\");\n");
      out.write("                    let passwordError = document.getElementById(\"password-error\");\n");
      out.write("                    let confirmPasswordError = document.getElementById(\"confirm-password-error\");\n");
      out.write("                    let emailExistsError = document.getElementById(\"email-exists-error\");\n");
      out.write("\n");
      out.write("                    // Reset error messages\n");
      out.write("                    emailError.style.display = \"none\";\n");
      out.write("                    passwordError.style.display = \"none\";\n");
      out.write("                    confirmPasswordError.style.display = \"none\";\n");
      out.write("                    emailExistsError.style.display = \"none\";\n");
      out.write("\n");
      out.write("                    // Email format validation\n");
      out.write("                    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$/;\n");
      out.write("                    if (!emailPattern.test(email)) {\n");
      out.write("                         emailError.style.display = \"block\";\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Password constraints\n");
      out.write("                    if (password.length < 8 || !/[A-Za-z]/.test(password) || !/\\d/.test(password)) {\n");
      out.write("                        passwordError.style.display = \"block\";\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    // Confirm password validation\n");
      out.write("                    if (password !== confirmPassword) {\n");
      out.write("                        confirmPasswordError.style.display = \"block\";\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // Toggle between Sign In and Sign Up forms\n");
      out.write("                document.getElementById('showSignupForm').addEventListener('click', function() {\n");
      out.write("                    document.getElementById('signinForm').classList.add('hidden');\n");
      out.write("                    document.getElementById('signupForm').classList.remove('hidden');\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                document.getElementById('showSigninFormLink').addEventListener('click', function() {\n");
      out.write("                    document.getElementById('signupForm').classList.add('hidden');\n");
      out.write("                    document.getElementById('signinForm').classList.remove('hidden');\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
