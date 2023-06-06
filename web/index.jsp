<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  
   font-family: "Lucida Console", "Courier New", monospace;
   background-color: whitesmoke;
}

* {
  box-sizing: border-box;
}

.bg-img {
  /* The image used */
  background-image: url("slide1.jpg");

  min-height: 380px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  
}

/* Add styles to the form container */
.container-1 {
  position: absolute;
  right: 150px;
  margin: 20px;
  max-width: 200px;
  padding: 30px;
  background-color: blue;
  margin-top:80px;
  opacity: 100%;
  border-radius: 10px;
  height: 70px;
  
}

.container-2 {
  position: absolute;
  right: 350px;
  margin: 20px;
  max-width: 200px;
  padding: 30px;
  background-color: blue;
  margin-top:80px;
  opacity: 100%;
  border-radius: 10px;
  height: 70px;
}

 .dropdown-button-1 {
       background-color: blue;
      color: white;
      padding: 0;
      border: none;
      cursor: pointer;
      width:100px;
      font-size: 20px;
      border-radius: 10px;
    }

    
 .dropdown-button-2 {
      background-color: blue;
      color: white;
      padding: 0;
      border: none;
      cursor: pointer;
      width:100px;
      font-size: 20px;
      border-radius: 10px;
    }
    
    /* Styling for the dropdown content */
    .dropdown-content-1 {
      display: none;
      position: absolute;
      background-color: #f9f9f9;
      min-width: 160px;
      box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
      z-index: 1;
    }
    
     .dropdown-content-2 {
      display: none;
      position: absolute;
      background-color: #f9f9f9;
      min-width: 160px;
      box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
      z-index: 2;
    }

    /* Styling for the dropdown content items */
    .dropdown-content-1 a {
      color: black;
      padding: 12px 16px;
      text-decoration: none;
      display: block;
    }
    
     .dropdown-content-2 a {
      color: black;
      padding: 12px 16px;
      text-decoration: none;
      display: block;
    }

    /* Styling for the dropdown content items on hover */
    .dropdown-content-1 a:hover {
      background-color: #f1f1f1;
    }
      .dropdown-content-2 a:hover {
      background-color: #f1f1f1;
    }


    /* Show the dropdown content when the button is hovered */
    .container-1:hover .dropdown-content-1 {
      display: block;
    }
    
    .container-2:hover .dropdown-content-2 {
      display: block;
    }
    
    .main-content{
        display: flex;
        flex-direction: row;
        justify-content: space-between;
    }
    .notice{
        width: 70%;
       font-size: 15px;
        font-family: Arial, Helvetica, sans-serif;
        text-align: justify;
        margin-right: 10px;
       
    }
    .notice h4{
        color: orangered;
    }
    .new-event{
        width: 30%;
      margin-top: 30px;
       border: solid 2px;
        border-radius: 5px;
        text-align: center;
    }
    
    .title-news{
        background-color: navy;
        margin: 2px;
        padding: 2px;
        color: white;
    }
    .updates{
        display: block;
        background-color: navy;
        margin-top: 2px;
        margin-bottom: 0;
        text-align: center;
        
       
        
    }
    .updates h4{
        color: white;
        padding: 0;
        margin: 0;
      
    }
    .new-event-list{
        display: block;
        width: 100%;
        
    }
    
    .news-1{
        width: 100%;
        margin: 5px;
        transition: 0.2s ease;
    }
    
    .news-1:hover{
       transform: scale(0.9);
       width: 100%;
    }
     .news-2{
        width: 100%;
        margin: 5px;
        transition: 0.2s ease;
    }
     .news-2:hover{
       transform: scale(0.9);
       width: 100%;
    }
     .news-3{
        width: 100%;
        margin: 5px;
        transition: 0.4s ease;
    }
      .news-3:hover{
       transform: scale(0.9);
       width: 100%;
    }
    .head-title{
        display:flex;
        flex-direction: row;
        width: 100%;
        height:100px;
        align-items: center;
        justify-content: space-between;
            padding: 10px 0;      
    }
    
   imgSpace{
        width: 25%;
        padding:30px;
    }
    title-space{
        width: 50%;
        padding:30px;
        margin-left: 20px;
        margin-right: 20px;
    }
    .logo{
        height: 80px;
        width: 50px;
    }
   
    .new-event-list a{
        text-decoration: none;
        color: white;
        padding: 5px;
        margin: 5px;
    }
    
    .h2title{
        font-size: 2.5rem;
        color: orangered;
        transition: cubic-bezier;
        transition-duration: infinite;
    }
    
    
</style>
</head>
<body>

    <div class="head-title">
        <div class="imgSpace">
            <img class="logo" src="logo.jpg">
        </div>
        <div class="title-space">
            <h2 class="h2title">Employee Grievances Management System</h2>
        </div>
    
        <div class="imgSpace">
            <img class="logo" src="logo.jpg">
        </div>
        
        
    </div>
    
    
    
    <jsp:include page="header.jsp"/>

<div class="bg-img">
     <div class="container-1">
    <button class="dropdown-button-1">Login</button>
    <div class="dropdown-content-1">
      <a href="admin-login.jsp">Admin</a>
      <a href="emp-login.jsp">Employee</a>
      <a href="hr-login.jsp">HR</a>
    </div>
    </div>
  
     <div class="container-2">
    <button class="dropdown-button-2">Register</button>
    <div class="dropdown-content-2">
      <a href="admin-reg.jsp">Admin</a>
      <a href="emp-reg.jsp">Employee</a>
      <a href="hr-reg.jsp">HR</a>
    </div>
    </div>
   
 
</div>
    <div class="updates">
        <marquee behavior="scroll" direction="left" loop="infinte"> <h4>Any Grievance sent by email will not be attended to / entertained. Please lodge your grievance at the website.</h4></marquee>

    </div>
    
    <section class="main-content">
        <div class="notice">
            <h4>ABOUT CPGRAMS</h4> 
            <p>Centralised Public Grievance Redress and Monitoring System (CPGRAMS) is an online platform available to the citizens 24x7 to lodge their grievances to the public authorities on any subject related to service delivery. It is a single portal connected to all the Ministries/Departments of Government of India and States. Every Ministry and States have role-based access to this system. CPGRAMS is also accessible to the citizens through standalone mobile application downloadable through Google Play store and mobile application integrated with UMANG.</p>
         
            <p>The status of the grievance filed in CPGRAMS can be tracked with the unique registration ID provided at the time of registration of the complainant. CPGRAMS also provides appeal facility to the citizens if they are not satisfied with the resolution by the Grievance Officer. After closure of grievance if the complainant is not satisfied with the resolution, he/she can provide feedback. If the rating is ?Poor? the option to file an appeal is enabled. The status of the Appeal can also be tracked by the petitioner with the grievance registration number.</p>
        </div>
        <div class="new-event">
            <div class="title-news">News</div>
            
            <marquee behaviour="scroll" direction="up" loop="infinite" id="myMarquee">
            <div class="new-event-list">
                <div class="news-1">
                    <div style="background-color:red; display: inline-block; width: 30%; height: 30px;">
                        <a href="#">News 1</a>
                    </div>
                    <div style="background-color:red;display: inline-block;width: 95%;height: 30px;">
                          <a href="#">Content 1</a>
                    </div>
                </div>
                <div class="news-2">
                    <div style="background-color:blueviolet; display: inline-block; width: 30%;height: 30px;">
                           <a href="#">News 2</a>
                    </div>
                    <div style="background-color:blueviolet;display: inline-block;width: 95%;height: 30px;">
                         <a href="#">Content 2</a>
                    </div>
                </div>
                <div class="news-3">
                     <div style="background-color:orange; display: inline-block; width: 30%;height: 30px;">
                           <a href="#">News 3</a>
                    </div>
                    <div style="background-color:orange;display: inline-block; width: 95%;height: 30px;">
                         <a href="#">Content 3</a>
                    </div>
                </div>
                
            </div>
                </marquee>
        </div>
        
    </section> 
    
    <jsp:include page="footer.jsp"/>
   
    <script>
        var marquee = document.getElementById("myMarquee");

marquee.addEventListener("mouseover", function() {
  marquee.stop();
});

marquee.addEventListener("mouseout", function() {
  marquee.start();
});

        </script>
  </body>
</html>
