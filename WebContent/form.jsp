<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
<link href="css/style2.css" rel='stylesheet' type='text/css' >
<link href="css/style3.css" rel='stylesheet' type='text/css' >
<link href="https://fonts.googleapis.com/css?family=Bungee+Inline|Cinzel" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cinzel" rel="stylesheet">
<link rel="shortcut icon" href="images/favicon.png" type="image/png">
<title>Form</title>
</head>
<body background="images/service-bg.png" alt="Not Avialable"  width="auto" height="auto" border="0px">
   <h1 class="header" style="color:white; font-family: sans-serif; text-align: center; font-size: 32px;">
Student Complain</h1>
      <form action="DisplayData" method="post" >
       <table align="center" class="tag">
              <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
            <tr>
               <td> Complain Title </td>
               <td><input type="text" name="stuname"  class="a"></td>
           </tr>
           <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
           <tr>
             
               <td> Complain Description</td>
              <td><textarea rows="6" cols="33" name="cdes" placeholder="max 100 words"></textarea>
             </td>
           </tr>
           <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
            <tr>
               <td> Student name </td>
               <td><input type="text" name="name"  class="a" ></td>
           </tr>
            <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
            <tr>
               <td>Father's Name</td>
               <td><input type="text" name="fname"  class="a"></td>
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
               <tr>
                   </tr> 
                <tr>
               <td> College </td>
               <td><input type="text" name="college"  class="a"></td>
           </tr> 
              <tr>
               <td><br>  </td>
               <td><br></td>
               <tr>
                   <tr>
                   </tr> 
                   <tr>
               <td> Course </td>
               <td><input type="text" name="course"  class="a"></td>
           </tr> 
              <tr>
               <td><br>  </td>
               <td><br></td>
               <tr>
                   <tr>
                   </tr> 
                   <tr>
               <td> Year </td>
               <td><input type="text" name="year"  class="a"></td>
           </tr> 
              <tr>
               <td><br>  </td>
               <td><br></td>
               <tr>
                   <td>Ph-No </td>
               <td><input type="text" name="phno"  class="a"></td>
           </tr> 
              <tr>
               <td><br>  </td>
               <td><br></td>
               <tr>
                   <td>E-Mail </td>
               <td><input type="text" name="email"  class="a"></td>
           </tr> 
              <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>
               <tr>
                   <td> <input type="reset" value="Cancel" name="button" class="button1"></td>
                   <td> <input type="submit" value="Submit" name="button" class="button2"></td>
               </tr>
                  <tr>
               <td><br>  </td>
               <td><br></td>
           </tr>         
          </table>
   </form>
   
      
       <h1 align="center" style="color:white;">Already File the Complain Want to Check the status</h1>
  <br><br>
    <br><br>
      
  <center>
   <a href="action.jsp" class="btn btn--lg btn--blue">Check Status</a>
      </center>
    
</body>
</html>