package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Design_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Home Decor Gallery</title>\n");
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
      out.write("        <div class=\"container\">\n");
      out.write("            <h3>Home Decor Collection</h3>\n");
      out.write("            <div class=\"gallery\">\n");
      out.write("                ");
 
                    String[][] decorItems = {
                        {"a1.jpg", "Tree frames", "$50", "1"},
                        {"a2.jpeg", "vase set", "$75", "2"},
                        {"a3.jpeg", "Wall decor plates", "$90", "3"},
                        {"a4.jpg", "paintings", "$60", "4"},
                        {"a5.avif", "large standing lamp", "5"},
                        {"a6.webp", "Sculpture", "$150", "6"},
                        {"a7.jpg", "Plant pots", "$50", "7"},
                        {"a8.webp", "Large painting", "$75", "8"},
                        {"a9.jpg", "Table set", "$90", "9"},
                        {"a10.jpg", "Hanging Frames", "$60", "10"},
                        {"a11.webp", "mini lightning globes", "$120", "11"},
                        {"a12.avif", "Laser cut showpieces", "$150", "12"}
                    };

                    for(int i = 0; i < decorItems.length; i++) {
                
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <a href=\"productDetail.jsp?productId=");
      out.print( decorItems[i][3] );
      out.write("\">\n");
      out.write("                            <div class=\"image-container\">\n");
      out.write("                                <img src=\"images/");
      out.print( decorItems[i][0] );
      out.write("\" alt=\"");
      out.print( decorItems[i][1] );
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"details\">\n");
      out.write("                                <h2>");
      out.print( decorItems[i][1] );
      out.write("</h2>\n");
      out.write("                                <p>Price: ");
      out.print( decorItems[i][2] );
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </div>\n");
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
