<%-- 
    Document   : admin-login
    Created on : 23 May, 2023, 8:51:34 AM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Registration</title>
       
               <script>
    // Function to retrieve query parameter from URL
    function getQueryParam(param) {
      var urlParams = new URLSearchParams(window.location.search);
      return urlParams.get(param);
    }

    // Function to display alert message
    function showAlert() {
      var message = getQueryParam('message');
      if (message === 'success') {
        alert('Registration successful! , Click Ok to redirect login page' );
        window.location.href = 'admin-login.jsp';
       
      }else if (message === 'duplicateEmp') {
        alert('Employee Id NOT AVAILABLE \n Create Another');
    }
    //duplicateUser duplicateEmpUser
     else if (message === 'duplicateUser') {
        alert('user Id NOT AVAILABLE \n Create Another');
      }
      
      else if (message === 'duplicateEmpUser') {
        alert('Both Employee Id and User Id NOT AVAILABLE \n Create Another');
      }
      else if (message === 'error') {
        alert('Registration failed!');
      }
    }

    // Call the showAlert function on page load
    window.onload = showAlert;
  </script>
        <style>
                
        * {
  box-sizing: border-box;
}

body {
  font-family: Arial, sans-serif;
  margin: 0;
  padding: 0;
  background-color: bisque;
}

.container {
  max-width: 500px;
  margin: 0 auto;
  padding: 20px;

}

.container h2{
    background-color: navy;
    padding:10px;
    border-radius: 5px;
    color:white;
}

form {
  background-color: bisque;
  border-radius: 5px;
  padding: 30px;
}

h2 {
  text-align: center;
  margin-bottom: 30px;
}

.input-group {
  margin-bottom: 20px;
}

.input-group label {
  display: block;
  margin-bottom: 5px;
}

.input-group input {
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border-radius: 5px;
  border: 1px solid #ccc;
}
.input-group input[type="radio"] {
  width: 100%;
  padding: 0;
  font-size: 16px;
  border-radius: 5px;
  border: 1px solid #ccc;
}



button {
  display: block;
  width: 100%;
  padding: 10px;
  font-size: 16px;
  text-align: center;
  color: #ffffff;
  background-color: #4CAF50;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

button:hover {
  background-color: #45a049;
}

.c1{
   width: 50%; 
}

.c2{
    width: 50%;
}
    </style>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
       
        <div class="container">
            
                
             
            <form action="validateAdminReg.jsp" onsubmit="return validateForm()">
      <h2>Admin Register</h2>
      <div class="input-group">
        <label for="empid">Employee Id</label>
        <input type="number" id="empid" placeholder="Enter your Emp ID" name="empid" value="<%= session.getAttribute("empid") %> required>
      </div>
      <div class="input-group">
        <label for="fullname">Full Name</label>
        <input type="text" id="fullname" placeholder="Enter your Full Name" name="name" value="<%= session.getAttribute("name") %>" required>
      </div>
      <div class="input-group">
        <label for="email">Email</label>
        <input type="email" id="email" placeholder="Enter your Email" name="email" value="<%= session.getAttribute("email") %>" required>
      </div>
      
      <div class="input-group">
        <label for="contact">Contact</label>
        <input type="number" id="mob" placeholder="Enter your Contact number" name="contact" value="<%= session.getAttribute("contact") %>" required>
      </div>
      
      <div class="input-group">
        Male
        <input type="radio" id="gender" value="male"  name="gender" value="<%= session.getAttribute("gender") %>" required>
      Female
        <input type="radio" id="gender" value="female" name="gender" value="<%= session.getAttribute("gender") %>" required>
      </div>
      
      <div class="input-group">
        <label for="state">State</label>
        <input type="text" id="state" placeholder="State"  name="state" value="<%= session.getAttribute("state") %>" required>
      </div>
      
      <div class="input-group">
        <label for="userid">User Id</label>
        <input type="text" id="state" placeholder="Create a User Id"  name="userid" value="<%= session.getAttribute("userid") %>" required>
      </div>
      
       <div class="input-group">
        <label for="pass">Password</label>
        <input type="password" id="password1" placeholder="Create a Password"  name="pass1" required>
      </div>
      
       <div class="input-group">
        <label for="pass">Confirm Password</label>
        <input type="password" id="password2" placeholder="Create a Password"  name="pass2" required>
      </div>
      
      <button type="submit">Register</button>
    </form>
  </div>
                
             
        <script>
            
      function validateForm() {
  var pass1 = document.getElementById("password1").value;
  var pass2 = document.getElementById("password2").value;
  var num1=document.getElementByID("mob").value;
   if (pass1 !== pass2) {
    alert("Passwords do not match");
    return false;
  }
   if(num1.length !==10){
       alert("Number should be 10 Digits only")
   }
  
  return true;
  }
        </script>
        
        
        
        <jsp:include page="footer.jsp"/>
        
       
    </body>
</html>
