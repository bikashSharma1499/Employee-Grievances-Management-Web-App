<%-- 
    Document   : addEmployeeDatabyHR
    Created on : 5 Jun, 2023, 10:54:11 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Employee Information</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
      <% 
      String empidG=request.getParameter("empid");
      String nameG=request.getParameter("name");
      String emailidG=request.getParameter("emailid");
      try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
          String url = "jdbc:oracle:thin:@//localhost:1521/XE";
       String user = "system";
     Connection conn = DriverManager.getConnection(url, user, "root");
                                                                   
        
        // Execute the SQL query
        String query = "insert into empValidateEGS values(?,?,?)";
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setString(1, empidG);
        pst.setString(2, nameG);
        pst.setString(3, emailidG);
       pst.executeUpdate();
       response.sendRedirect("hr_logged_panel_addEmployeeInfo.jsp?message=success");
      }catch(Exception e){
          response.sendRedirect("hr_logged_panel_addEmployeeInfo.jsp?message=error");
      
        out.println(e);
      }
      
      %>
    </body>
</html>
