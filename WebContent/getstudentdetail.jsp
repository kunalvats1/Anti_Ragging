<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.util.List" %>
      <%@page import="pojo.studetails"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="images/favicon.png" type="image/png">
<link href="css/style3.css" rel='stylesheet' type='text/css' >
<title>Complains</title>
</head>
<body background="images/service-bg.png" width=100%; height=:auto;>
<h1 align="center" style="color:white; font-family:Bungee Inline;" >Complain Details</h1>
<table border="1" cellpadding="2" cellspacing="4">
<tr>
<td>Complain Title</td>
<td>Complain Description</td>
<td>Student Name</td>
<td>E-Mail</td>
<td>Year</td>
<td>Father Name</td>
<td>Rollno</td>
<td>course</td>
<td>College</td>
<td>Ph-Number</td>
</tr>
<%
List<studetails> stu_list=(List)request.getAttribute("stulist");
for(studetails e:stu_list)
{
	%>
	<tr>
	<td><%= e.getComptitle()%></td>
	<td><%= e.getCompdes()%></td>
	<td><%= e.getStuname()%></td>
	<td><%= e.getEmail()%></td>
	<td><%= e.getYear()%></td>
	<td><%= e.getFname() %></td>
	<td><%= e.getRollno() %></td>
	<td><%= e.getCourse() %></td>
	<td><%= e.getCollege() %></td>
	<td><%= e.getPhno()%></td>
	
	</tr>
	<%	
}
%>
</table>
<br><br><br>
<a href="displaycomplain"><input type="button" value="Take Action" class="btn btn--lg btn--blue"></a>
</body>
</html>