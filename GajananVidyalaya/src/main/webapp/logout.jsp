<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout</title>
<style>
body{
background-image: url('https://previews.123rf.com/images/tharinsinlapachai/tharinsinlapachai1710/tharinsinlapachai171000019/87333144-blurred-of-wrinkled-paper-for-background-color-filter-pastel-.jpg');
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