<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout</title>
<style>
a{
  text-decoration: none;
  color: white;
}
body{
background-color: #211900;
background-image: url("https://www.transparenttextures.com/patterns/45-degree-fabric-light.png");
}
</style>
</head>
<body>
<%
	session.invalidate();
%>
<h1> You Are SuccessFully Loged out</h1>
   <a  href="login.jsp"> Go TO Login</a>
</body>
</html>