<%-- 
    Document   : validateAdminReg
    Created on : 23 May, 2023, 4:49:32 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@page import="java.sql.*" %>
        <% 
       
        String userIdG= request.getParameter("userid");
       
        String pass2G= request.getParameter("pass2");
        String userIdDb="";
        String passDb="";
        
        
       
        
        
        try{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  String url = "jdbc:oracle:thin:@//localhost:1521/XE";
  String user = "system";
  Connection con = DriverManager.getConnection(url, user, "root");
    
  PreparedStatement pst=con.prepareStatement("select userid, pass2 from employeeEGS where userid=? and pass2=?");
 
  pst.setString(1, userIdG);
  pst.setString(2, pass2G);
 ResultSet rs= pst.executeQuery();
 
 while(rs.next()){
     userIdDb=rs.getString(1);
     passDb=rs.getString(2);
 }
 

 
 if((userIdDb.equals(userIdG)) && (passDb.equals(pass2G))){
     response.sendRedirect("employee_logged_panel.jsp");
 }else{
        
 response.sendRedirect("emp-login.jsp?message=failed");
 }


    }catch(Exception e){
     e.printStackTrace();
    }
        
        
        %>
    </body>
</html>
