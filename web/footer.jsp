<%-- 
    Document   : footer
    Created on : 23 May, 2023, 8:42:29 AM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
            body{
                margin-top:5px;
            }
            .footer{
                margin-top: 5px;
        display: flex;
        flex-direction: row;
        justify-content: space-around;
 
  padding: 3px;
  background-color: navy;
  color: white;
 
}

.author, .links{
    justify-content: center;
    text-align: center;
    
    
}
.author p{
    padding: 10px;
    margin-top: 10px;
    text-decoration: none;
}

.author a{
    padding: 10px;
    margin-top: 10px;
    text-decoration: none;
    color: white;
    display: block;
}

.links a{
    display: block;
    padding: 10px;
    margin-top: 10px;
    text-decoration: none;
    color: white
}
           
        </style>
    </head>
    <body>
       <footer class="footer">
        <div class="author">
            <p>Author: Bikash Sharma</p>
            <a href="callto:7008091501">Mob : +91 7008091501</a>
  <a href="mailto:bsharma7008@gmail.com">Mail Me</a>
        </div>
        
        <div class="links">
            <a href="#">Ministry of External Affairs</a>
              <a href="#">Ministry of Home affairs</a>
                <a href="#">Law and Regulations</a>
        </div>
        <div>
            <div style="width: 100%"><iframe width="100%" height="200px" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.com/maps?width=100%25&amp;height=600&amp;hl=en&amp;q=cuttack+(My%20Business%20Name)&amp;t=&amp;z=14&amp;ie=UTF8&amp;iwloc=B&amp;output=embed"><a href="https://www.maps.ie/distance-area-calculator.html">distance maps</a></iframe></div>
        </div>
  
</footer>
    </body>
</html>
