package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Registration</title>\n");
      out.write("       \n");
      out.write("               <script>\n");
      out.write("    // Function to retrieve query parameter from URL\n");
      out.write("    function getQueryParam(param) {\n");
      out.write("      var urlParams = new URLSearchParams(window.location.search);\n");
      out.write("      return urlParams.get(param);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Function to display alert message\n");
      out.write("    function showAlert() {\n");
      out.write("      var message = getQueryParam('message');\n");
      out.write("      if (message === 'success') {\n");
      out.write("        alert('Registration successful! , Click Ok to redirect login page' );\n");
      out.write("        window.location.href = 'admin-login.jsp';\n");
      out.write("       \n");
      out.write("      } else if (message === 'error') {\n");
      out.write("        alert('Registration failed!');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Call the showAlert function on page load\n");
      out.write("    window.onload = showAlert;\n");
      out.write("  </script>\n");
      out.write("        <style>\n");
      out.write("                \n");
      out.write("        * {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  font-family: Arial, sans-serif;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  max-width: 500px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  padding: 20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("form {\n");
      out.write("  background-color: #ffffff;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  padding: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("  text-align: center;\n");
      out.write("  margin-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group label {\n");
      out.write("  display: block;\n");
      out.write("  margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group input {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("}\n");
      out.write(".input-group input[type=\"radio\"] {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 0;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("button {\n");
      out.write("  display: block;\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  text-align: center;\n");
      out.write("  color: #ffffff;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".c1{\n");
      out.write("   width: 50%; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".c2{\n");
      out.write("    width: 50%;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("             \n");
      out.write("            <form action=\"validateAdminReg.jsp\" onsubmit=\"return validateForm()\">\n");
      out.write("      <h2>Admin Register</h2>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <label for=\"empid\">Employee Id</label>\n");
      out.write("        <input type=\"number\" id=\"empid\" placeholder=\"Enter your Emp ID\" name=\"empid\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <label for=\"fullname\">Full Name</label>\n");
      out.write("        <input type=\"text\" id=\"fullname\" placeholder=\"Enter your Full Name\" name=\"name\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <label for=\"email\">Email</label>\n");
      out.write("        <input type=\"email\" id=\"email\" placeholder=\"Enter your Email\" name=\"email\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <label for=\"contact\">Contact</label>\n");
      out.write("        <input type=\"number\" id=\"mob\" placeholder=\"Enter your Contact number\" name=\"contact\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        Male\n");
      out.write("        <input type=\"radio\" id=\"gender\" value=\"male\"  name=\"gender\" required>\n");
      out.write("      Female\n");
      out.write("        <input type=\"radio\" id=\"gender\" value=\"female\" name=\"gender\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <label for=\"state\">State</label>\n");
      out.write("        <input type=\"text\" id=\"state\" placeholder=\"State\"  name=\"state\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <label for=\"userid\">User Id</label>\n");
      out.write("        <input type=\"text\" id=\"state\" placeholder=\"Create a User Id\"  name=\"userid\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("       <div class=\"input-group\">\n");
      out.write("        <label for=\"pass\">Password</label>\n");
      out.write("        <input type=\"password\" id=\"password1\" placeholder=\"Create a Password\"  name=\"pass1\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("       <div class=\"input-group\">\n");
      out.write("        <label for=\"pass\">Confirm Password</label>\n");
      out.write("        <input type=\"password\" id=\"password2\" placeholder=\"Create a Password\"  name=\"pass2\" required>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <button type=\"submit\">Register</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("      function validateForm() {\n");
      out.write("  var pass1 = document.getElementById(\"password1\").value;\n");
      out.write("  var pass2 = document.getElementById(\"password2\").value;\n");
      out.write("   if (pass1 !== pass2) {\n");
      out.write("    alert(\"Passwords do not match\");\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  \n");
      out.write("  return true;\n");
      out.write("  }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
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
