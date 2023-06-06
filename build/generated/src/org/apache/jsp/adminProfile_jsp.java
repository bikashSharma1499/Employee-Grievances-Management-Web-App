package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class adminProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Employee Id</th>\n");
      out.write("            <th>Full Name</th>\n");
      out.write("            <th>Email ID</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>Gender</th>\n");
      out.write("            <th>State</th>\n");
      out.write("            <th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");
 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@//localhost:1521/XE";
            String user = "system";
            Connection con = DriverManager.getConnection(url, user, "root");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM hrEGS");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String empidD = rs.getString(1);
                String fullnameD = rs.getString(2);
                String emailD = rs.getString(3);
                String contactD = rs.getString(4);
                String genderD = rs.getString(5);
                String stateD = rs.getString(6);
        
      out.write("\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( empidD );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( fullnameD );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( emailD );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( contactD );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( genderD );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( stateD );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"edit.jsp?id=");
      out.print( empidD );
      out.write("\">Edit</a>\n");
      out.write("                <a href=\"delete.jsp?id=");
      out.print( empidD );
      out.write("\">Delete</a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");
 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
      out.write("\n");
      out.write("    </table>\n");
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
