<%-- 
    Document   : about
    Created on : 22 May, 2023, 7:02:36 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
        <style>
            .container{
                display: block;
               margin: 0;
            }
            .title{
                display: block;
                width: 100%;
                height: 30px;
                color: orangered;
                background-color: bisque;
                text-align: center;
            }
            .title h2{
                margin:5px 0 5px 0;
            }
            
            .content{
                display: flex;
                width: 100%;
                height:500px;
                background-color: orange;
                flex-direction: row;
            }
            
            .imgSection{
                width: 50%;
                padding: 5px;
                background-color: yellow;
            }
            .details{
                width: 50%;
                padding: 5px;
                background-color: pink;
            }
            .aboutImg{
                width: 100%;
                height:490px;
            }
            
            
        </style>
        
    </head>
    <body>
        <jsp:include page="header.jsp" />  
        <div class="container">
            <div class="title">
                <h2>About us</h2>
            </div>
            <div class="content">
                <div class="imgSection">
                    <img class="aboutImg" src="slide-img3.jpg">
                    
                </div> 
                <div class="details">
                    <h1>
                        Employee Grievances Management System
                    </h1>
                    <p>
                        An employee grievance is a concern, problem, or complaint that an employee has about their work, the workplace, or someone they work with—this includes management.</p>
                    <p>Something has made them feel dissatisfied, and they believe it is unfair and/or unjust on them.
                    </p>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
