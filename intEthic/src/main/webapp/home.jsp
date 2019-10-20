
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
  <a href ="Registration_Form.html"><li><i>Add Student</i></li></a>
  <a href =#><li><i>View Studnet By Name</i></li></a>
  <a href ="delete.html"><li><i>delete Student</i></li></a>
  <a href ="display_listStudent.jsp"><li><i>View All Students</i></li></a>
</ul> <br><br>
<h3> You Are Successfully LogOut</h3>
<a href="logout">Logout</a>
<h4 style="text-align: center;color: maroon;">Contact :: Tech-Nrn Software Private Ltd </h4>