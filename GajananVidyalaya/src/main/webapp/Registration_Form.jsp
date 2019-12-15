<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style type="text/css">

a {
	text-decoration: none;
}

body {
	background-color: #F5F7FA;
	background-image:
		url("https://www.transparenttextures.com/patterns/45-degree-fabric-light.png");
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

	<form action="addurl" method="get">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="container">
					<div class="row">
						<div class="col-lg-12 text-center">
							<h2>Student Form</h2>
							<hr><br>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<input type="text" class="form-control" placeholder="First name"
								name="sname">
						</div>
						<div class="col-md-4">
							<input type="text" class="form-control" placeholder="Middle name"
								name="fname">
						</div>
						<div class="col-md-4">
							<input type="text" class="form-control" placeholder="Last name"
								name="lname">
						</div>
					</div>
					<!--row  end-->
					<br>
					<div class="row">
						<div class="col-md-6">
							<input type="text" class="form-control" placeholder="Physics"
								name="pm">
						</div>
						<div class="col-md-6">
							<input type="text" class="form-control" placeholder="Chemistry"
								name="cm">
						</div>
					</div>
					<!--row  end-->
					<br>
					<div class="row">
						<div class="col-md-6">
							<input type="text" class="form-control" placeholder="Biology"
								name="bm">
						</div>
						<div class="col-md-6">
							<input type="text" class="form-control" placeholder="English"
								name="em">
						</div>
					</div>
					<!--row  end-->
					<br>
					<div class="row">

						<div class="col-md-12 col-lg-12 col-sm-12">
						<div class="form-group">
							<input type="reset" class="btn btn-info" value="Reset"> <input
								type="submit" class="btn btn-info" value="Submit">
						</div>
						</div>
					</div>
				</div>
				<!--container  end-->
			</div>
			<!--pannel body  end-->
		</div>
		<!-- pannel  end-->

	</form>

<!-- old form  -->
	<%-- <h2 align="center" style="color: red">Insert Studnet marks in
		below form</h2>
	<br>
	<div align="center">
		<form action="addurl" method="post">
			<table style="border: groove;">
				<tr>
					<td>Student Name ::</td>
					<td><input type="text" name="sname" /></td>
				</tr>
				<tr>
					<td>Fathers Name ::</td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td>Physics Marks ::</td>
					<td><input type="text" name="pm" /></td>
				</tr>
				<tr>
					<td>Chemistry Marks ::</td>
					<td><input type="text" name="cm" /></td>
				</tr>
				<tr>
					<td>Biology Marks ::</td>
					<td><input type="text" name="bm" /></td>
				</tr>
				<tr>
					<td>English Marks ::</td>
					<td><input type="text" name="em" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit" /><input type="reset" value="reset"></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
		<!-- message -->

		<h4 align="center"
			style="font-style: italic; font-family: sans-serif;">${result }</h4>
	</div>
 --%>
	<a href="home.jsp">home</a> &nbsp;&nbsp;
	<a href="logout">Logout</a>
</body>
</html>