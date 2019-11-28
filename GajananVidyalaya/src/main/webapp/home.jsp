<html>
<head>
<style>
body{
background-image: url('https://previews.123rf.com/images/tharinsinlapachai/tharinsinlapachai1710/tharinsinlapachai171000019/87333144-blurred-of-wrinkled-paper-for-background-color-filter-pastel-.jpg');
}
</style>
</head>
<body>
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
<ul style="list-style-type:circle;volume: medium; color: red;">
  <a href ="Registration_Form.jsp"><li><i>Add Student</i></li></a>
  <a href ="delete.html"><li><i>delete Student</i></li></a>
  <a href ="display_listStudent.jsp"><li><i>View All Students</i></li></a>
</ul> <br><br>

<a href="logout">Logout</a> &nbsp;&nbsp;<a href="home.jsp">home</a>
<h4 style="text-align: center;color: maroon;">Contact :: Tech-Nrn Software Private Ltd </h4>
</body>
</html>