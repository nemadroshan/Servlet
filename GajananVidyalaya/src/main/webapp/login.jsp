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
  background-image: url('https://previews.123rf.com/images/tharinsinlapachai/tharinsinlapachai1710/tharinsinlapachai171000019/87333144-blurred-of-wrinkled-paper-for-background-color-filter-pastel-.jpg');
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
<body>
	<div class="topnav">
	<a class="inactive" href="#home"><i style="font-family: sans-serif;">Shree Gajanan Vidyalaya</i></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a class="active" href="#home">Home</a> <a class="active" href="#about">About us</a> <a
			href="#contact" class="active">Contact</a>
		<div class="login-container">
			<form action="login" method="post">
				<input type="text" placeholder="Username" name="name"> <input
					type="password" placeholder="Password" name="pwd">&nbsp;
				<button type="submit">Login</button>
			</form>
		</div>
	</div>
	<br>

	<h2 style="text-align: center;">Welcome to Shree Gajanan Vidyalaya Nagpur .. </h2>
		<!-- Result form   -->
	<div draggable="true">
		<form action="gresult" method="post">
			<fieldset>
				<legend>
					<b>Student Input Section:</b>
				</legend>

				Name:&nbsp;&nbsp;<input type="text" id="txtName" name="sname"><br>
				<br> Roll Num:&nbsp;<input type="text" id="txtClass"
					name="rollnum"> <br /> <br /> <br /> <br /> <input
					type="submit" value="Get Result" style="height: 90">&nbsp;<input
					type="reset" value="reset">

			</fieldset>
		</form>
	</div>
	<hr>
	<div>
		<h3>About Us</h3>
		<span>
			<h4>
				<p><i>
				The location of Gajanan Vidyalay is Ayodhya Nagar, Nagpur. It is a State Board school, with a team of 35 dedicated and professional faculties, which are here to ensure that the children get the most from their education.

Gajanan Vidyalay was started in the year 1984. The primary medium of instruction is Marathi and the student teacher ratio is 42:1. The school tries to provide best learning environment.

The school provides education to students from class 6 to 12. 1473 is approximately the current student strength of this school. 3045 books are there in the library of this school.

The school has given exceptional results in the academic sphere and its students have excelled in extra co-curricular activities too. This school has 100% of students qualifying the examination and out of these 20% scored first grade.
		</i>		</p>
			</h4>
		</span>
	</div>
	<hr>
	<div>
		<h2>Contact us</h2>
		<span>
		<center>
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3721.9660891754475!2d79.11128481445597!3d21.113918090242635!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bd4b8adb403febf%3A0xfce1753e07aee515!2sGajanan%20Vidyalaya!5e0!3m2!1sen!2sin!4v1573758864354!5m2!1sen!2sin" width="1300" height="400" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
		 </center>
		 <pre>
		<h3>
			Address : Oppsite to Durga Mata Mandir, New Subedar Layout, Nagpur.
			Ph No    : 0712 - 2704893
			email    : info@shreegajananvidyala.com
		</h3>
		</pre>
		</span>
		<span>
		
		</span>
	</div>
</body>
</html>