<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="images/favicon.png" type="image/png">
    <title>Registration</title>
    <link rel="stylesheet" href="css/style2.css">
    <link rel="stylesheet" href="css/style3.css">
    <script src="js/validate.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Alegreya+Sans+SC|Cinzel|Courgette|Lobster|Maven+Pro|Permanent+Marker|Prompt|Roboto" rel="stylesheet">
</head>
<body background="images/service-bg.png" width=100%; height=:auto; >
  <h1 align="center" style="color:white; ">Registration Form</h1>
   <form action="Registration" method="post" name="register">
       <table align="center" class="tag">
       
              <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
            <tr>
               <td> Student Name </td>
               <td><input type="text" name="stuname"  class="a"></td>
           </tr>
           <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
           <tr>
               <td> Password </td>
               <td><input type="password" name="pwd"  class="a" ></td>
           </tr>
           <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
            <tr>
               <td> Retype-Password </td>
               <td><input type="password" name="pwd1"  class="a" ></td>
           </tr>
            <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
            <tr>
               <td> Roll-No </td>
               <td><input type="text" name="rollno"  class="a"></td>
           </tr>
            <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
              <tr>
               <td> Course </td>
               <td><input type="text" name="course"  class="a"></td>
           </tr> 
              <tr>
               <td><br>  </td>
               <td><br></td>
               <tr>
                   </tr> 
              <tr>
               <td><br>  </td>
               <td><br></td>
               <tr>
                   <td> <input type="reset" value="Cancel" name="button" class="button1"></td>
                   <td> <input type="submit" value="Submit" name="button" class="button2"></td>
               </tr>
          </table>
   </form>
</body>
</html>