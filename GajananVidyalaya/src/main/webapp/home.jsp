<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style>
body {
	background-color: #F5F7FA;
	background-image:
		url("https://www.transparenttextures.com/patterns/45-degree-fabric-light.png");
}
a{
  text-decoration: none;
  color: white;
}
</style>
</head>
<body>
<div>
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
			<a class="navbar-brand" href="#">Shree Gajanan Vidyalaya </a>
			<div align="right">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="home.jsp">Home</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="Registration_Form.jsp">Add Student</a></li>
					<li class="nav-item"><a class="nav-link" href ="display_listStudent.jsp">View Student</a></li>
					<li class="nav-item"><a class="nav-link" href="delete.html">Delete Student</a></li>
					<li class="nav-item"><a class="nav-link" href="logout">log out</a></li>
				</ul>
			</div>
		</nav>
	</div><br><br><br><br>

<h1 style="color: red; text-align: center;">
	<i> Student Report Generation And Management System &nbsp;!!!!</i>
</h1><br>
<div align="left">
<%
 String uname =(String)session.getAttribute("name");
 out.println("Welcome "+ uname);
 %>
 </div>

<br>
<ul style="list-style-type:circle;volume: medium; color: white;">
  <a href ="Registration_Form.jsp"><li><i>Add Student</i></li></a>
  <a href ="delete.html"><li><i>delete Student</i></li></a>
  <a href ="display_listStudent.jsp"><li><i>View All Students</i></li></a>
</ul> <br><br>

<a href="logout">Logout</a> &nbsp;&nbsp;<a href="home.jsp">home</a>
<h4 style="text-align: center;color: maroon;">Contact :: Tech-Nrn Software Private Ltd </h4>
</body>
</html>