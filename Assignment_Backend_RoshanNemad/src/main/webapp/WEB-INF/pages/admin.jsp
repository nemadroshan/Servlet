<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
		<h2>	Welcome Admin</h2> : <br>
	 <h3>	<c:out value="${user.name}"></c:out>  <c:out value="${ user.lastName}"></c:out></h3>
	 <a href="login.htm">Go Back</a>
</body>
</html>