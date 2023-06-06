package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emp_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Employee Login</title>      \n");
      out.write("        \n");
      out.write("                  <script>\n");
      out.write("    // Function to retrieve query parameter from URL\n");
      out.write("    function getQueryParam(param) {\n");
      out.write("      var urlParams = new URLSearchParams(window.location.search);\n");
      out.write("      return urlParams.get(param);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Function to display alert message\n");
      out.write("    function showAlert() {\n");
      out.write("      var message = getQueryParam('message');\n");
      out.write("      if (message === 'failed') {\n");
      out.write("        alert('Login Failed');\n");
      out.write("      } \n");
      out.write("  }\n");
      out.write("\n");
      out.write("    // Call the showAlert function on page load\n");
      out.write("    window.onload = showAlert;\n");
      out.write("  </script>\n");
      out.write("        \n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      font-family: Arial, sans-serif;\n");
      out.write("      background-color: #f2f2f2;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container {\n");
      out.write("      max-width: 400px;\n");
      out.write("      margin: 50px auto;\n");
      out.write("      background-color: #fff;\n");
      out.write("      padding: 20px;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container h2 {\n");
      out.write("      text-align: center;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group {\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group label {\n");
      out.write("      display: block;\n");
      out.write("      font-weight: bold;\n");
      out.write("      margin-bottom: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group input[type=\"text\"],\n");
      out.write("    .form-group input[type=\"password\"] {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      border-radius: 3px;\n");
      out.write("      border: 1px solid #ccc;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group input[type=\"submit\"] {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      border-radius: 3px;\n");
      out.write("      border: none;\n");
      out.write("      background-color: #4CAF50;\n");
      out.write("      color: #fff;\n");
      out.write("      cursor: pointer;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group input[type=\"submit\"]:hover {\n");
      out.write("      background-color: #45a049;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group input[type=\"submit\"]:focus {\n");
      out.write("      outline: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group .forgot-password {\n");
      out.write("      text-align: right;\n");
      out.write("      font-size: 13px;\n");
      out.write("      color: #999;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .form-group .forgot-password a {\n");
      out.write("      color: #999;\n");
      out.write("      text-decoration: none;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("      \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2>Employee Login</h2>\n");
      out.write("    <form method=\"post\" action=\"validateEMPLogin.jsp\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"username\">Username:</label>\n");
      out.write("        <input type=\"text\" id=\"username\" name=\"userid\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"password\">Password:</label>\n");
      out.write("        <input type=\"password\" id=\"password\" name=\"pass2\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <input type=\"submit\" value=\"Login\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("       <div style=\"display: inline;\">\n");
      out.write("  <p style=\"display: inline;\">Not Registered?</p>\n");
      out.write("  <a href=\"emp-reg.jsp\" style=\"display: inline; width: 20px; background-color: navy;color: white;text-decoration: none;padding: 5px;\">Register here</a>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
