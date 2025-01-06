package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Classic Hub | Home Decor</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Header Section -->\n");
      out.write("  <header>\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h2>Classic Hub</h2>\n");
      out.write("      </div>\n");
      out.write("      <nav>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"Design.jsp\">Design</a></li>\n");
      out.write("          <li><a href=\"Contact.jsp\">Contact</a></li>\n");
      out.write("          <li><a href=\"login.jsp\">Account</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <!-- Hero Section with Background Image -->\n");
      out.write("  <section class=\"hero\">\n");
      out.write("    <div class=\"hero-content\">\n");
      out.write("      <h1>Transform Your Home with Classic & Modern Designs</h1>\n");
      out.write("      <p>Explore timeless and elegant home decor ideas to make your space unique.</p>\n");
      out.write("      <a href=\"Design.jsp\" class=\"btn-primary\">Explore Designs</a>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- About Us Section -->\n");
      out.write("  <section class=\"about\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h2>About Us</h2>\n");
      out.write("      <p>At Classic Hub, we are passionate about bringing timeless beauty into your home. Whether you are looking for classic, modern, or eclectic designs, we offer a range of ideas and products to suit every taste. Our mission is to inspire and empower you to create spaces that are not only functional but also a reflection of your personal style.</p>\n");
      out.write("      <a href=\"About.jsp\" class=\"btn-secondary\">Learn More</a>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Featured Products Section (Optional) -->\n");
      out.write("  <section class=\"featured-products\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h2>Featured Products</h2>\n");
      out.write("      <div class=\"products\">\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <img src=\"images/sofa.jpg\" alt=\"Luxury Sofa\">\n");
      out.write("          <h3>Luxury Sofa</h3>\n");
      out.write("          <p>Perfect for your living room. A blend of comfort and elegance.</p>\n");
      out.write("          <a href=\"Product.jsp\" class=\"btn-secondary\">View Details</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"product-card\">\n");
      out.write("          <img src=\"images/lamp.jpg\" alt=\"Table Lamp\">\n");
      out.write("          <h3>Modern Table Lamp</h3>\n");
      out.write("          <p>Illuminate your space with style and sophistication.</p>\n");
      out.write("          <a href=\"Product.jsp\" class=\"btn-secondary\">View Details</a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Add more product cards as needed -->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Footer Section -->\n");
      out.write("  <footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p>&copy; 2024 Classic Hub | All rights reserved</p>\n");
      out.write("      <div class=\"social-links\">\n");
      out.write("        <a href=\"#\">Facebook</a>\n");
      out.write("        <a href=\"#\">Instagram</a>\n");
      out.write("        <a href=\"#\">Pinterest</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
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
