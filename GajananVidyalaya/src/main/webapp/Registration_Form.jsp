<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<style>
body{
background-image: url('https://previews.123rf.com/images/tharinsinlapachai/tharinsinlapachai1710/tharinsinlapachai171000019/87333144-blurred-of-wrinkled-paper-for-background-color-filter-pastel-.jpg');
}
</style></head>
<body>
<h2 align="center" style=" color: red">Insert Studnet marks in below form</h2><br>
	<div align="center">
		<form action="addurl" method="post">
			<table style="color:Blue;border:groove;">
				<tr>
					<td>Student Name ::</td>
					<td><input type="text" name="sname"/></td>
				</tr>
				<tr>
					<td>Fathers Name ::</td>
					<td><input type="text" name="fname"/></td>
				</tr>
				<tr>
					<td>Physics Marks ::</td>
					<td><input type="text" name="pm"/></td>
				</tr>
				<tr>
					<td>Chemistry Marks ::</td>
					<td><input type="text" name="cm"/></td>
				</tr>
				<tr>
					<td>Biology Marks ::</td>
					<td><input type="text" name="bm"/></td>
				</tr>
				<tr>
					<td>English Marks ::</td>
					<td><input type="text" name="em"/></td>
				</tr>
				<tr >
					<td colspan="2" align="center"><input type="submit" value="Submit"/><input type="reset" value="reset" ></td>
				</tr>
			</table>
		</form>
	</div>
	<div>
	<!-- message -->
	
	 <h4 align="center" style="font-style: italic;font-family: sans-serif;">${result }</h4>
	</div>
	
	<a href="home.jsp">home</a> &nbsp;&nbsp;<a href="logout">Logout</a>
</body>
</html>