<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@page import="pojo.studetails"%>
  <%@page import="java.util.List" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="shortcut icon" href="images/favicon.png" type="image/png">
<link href="css/style3.css" rel='stylesheet' type='text/css' >
<title>Action</title>
</head>
<body background="images/service-bg.png" width=100%; height=:auto;>
<form action="Action" method="post">
<table align="center">
<tr><td><h2>Roll-No</h2></td>
<td><input type="text" name="rollno" style="height:25px; width:435px;" >
</td>
</tr>
<tr>
<td><br> </td>
<td><br> </td>
</tr>
<%
//List<studetails> stu_list=(List)request.getAttribute("stulist");
//studetails e=stu_list.get(0);

%>
<tr><td><h2>Action</h2></td>
<td><textarea rows="10" cols="60" name="action"></textarea></td>
</tr>
<tr>
<td><br> </td>
<td><br> </td>
</tr>
<tr>
<td><br> </td>
<td><br> </td>
</tr>
<tr>
<td><input type="submit" class="btn btn--lg btn--blue" name="button" value="Post">
</table>
</form>
</body>
</html>