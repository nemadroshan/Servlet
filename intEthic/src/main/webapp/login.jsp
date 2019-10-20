<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">



<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color: #e9e9e9;
}

.topnav a {
	float: left;
	display: block;
	color: black;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #2196F3;
	color: white;
}

.topnav .login-container {
	float: right;
}

.topnav input[type=text] {
	padding: 6px;
	margin-top: 8px;
	font-size: 13px;
	border: none;
	width: 120px;
}

.topnav .login-container button {
	float: right;
	padding: 6px 10px;
	margin-top: 8px;
	margin-right: 14px;
	background-color: #555;
	color: white;
	font-size: 13px;
	border: none;
	cursor: pointer;
}

.topnav .login-container button:hover {
	background-color: green;
}

@media screen and (max-width: 600px) {
	.topnav .login-container {
		float: none;
	}
	.topnav a, .topnav input[type=text], .topnav .login-container button {
		float: none;
		display: block;
		text-align: left;
		width: 100%;
		margin: 0;
		padding: 14px;
	}
	.topnav input[type=text] {
		border: 1px solid #ccc;
	}
}
</style>
</head>
<body bgcolor="pink">
	<div class="topnav">
		<a class="active" href="#home">Home</a> <a href="#about">About</a> <a
			href="#contact">Contact</a>
		<div class="login-container">
			<form action="login" method="post">
				<input type="text" placeholder="Username" name="name"> <input
					type="password" placeholder="Password" name="pwd">&nbsp;
				<button type="submit">Login</button>
			</form>
		</div>
	</div>
	<br>
	<h3 style="text-align: center;">Welcome to Xyz School</h3>
	<!-- Result form   -->
<div >
<form action="result" method="post">
		<fieldset style="width: 600px">
			<legend>
				<b>Student Input Section:</b>
			</legend>

			Name:<input type="text" id="txtName" name="sname"> Roll Num:<input
				type="text" id="txtClass" name="rollnum"> <br /> <br /> <br />
			<br /> <input type="submit" value="Get Result">&nbsp;<input
				type="reset" value="reset">
				
		</fieldset>
	</form>
</div>

</body>
</html>