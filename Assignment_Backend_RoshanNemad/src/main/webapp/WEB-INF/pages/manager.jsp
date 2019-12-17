<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Dashboard</title>
</head>
<body>
	<h2>Welcome Manager</h2> :
	<br>
	<h3><c:out value="${user.name}"></c:out>  <c:out value="${ user.lastName}"></c:out></h3>
	<a href="login.htm">Go back</a>
</body>
</html>