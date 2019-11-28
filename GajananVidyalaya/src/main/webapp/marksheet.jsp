<%@page import="com.intEthic.dto.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    StudentDTO dto1  = (StudentDTO)session.getAttribute("dto");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MarksSheet</title>
<script type="text/javascript">
function myFunction() {
	  window.print();
	}
</script>
</head>

<style>
body{
background-image: url('https://previews.123rf.com/images/tharinsinlapachai/tharinsinlapachai1710/tharinsinlapachai171000019/87333144-blurred-of-wrinkled-paper-for-background-color-filter-pastel-.jpg');
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
table#t01 {
  width: 100%;    
  background-color: #f1f1c1;
}
</style>

<body>

<table id="t01">
<tr>
<td colspan="2" style="font-size: 50"><center><h3>Shree Gajanan Vidyalaya Nagpur</h3></center></td>


</tr>

  <tr>
    <th>First Name</th>
    <th><%= dto1.getName() %></th> 
  </tr>
  <tr>
    <td>Fathers Name</td>
    <td><%= dto1.getFname() %></td>
  </tr>
  
  <tr>
    <td>Roll Number</td>
    <td><%= dto1.getRollNum() %></td>
  </tr>
  
  <tr>
    <td>Physcics</td>
    <td><%= dto1.getPhysics_marks() %></td>
  </tr>
  <tr>
    <td>Chemistry</td>
    <td><%= dto1.getChemistry_mark() %></td>
  </tr>
  <tr>
    <td>Biology</td>
    <td><%= dto1.getBio_marks() %></td>
  </tr>
  
  <tr>
  <td>English</td>
  <td><%= dto1.getEnglish_marks()%></td>
  </tr>
    <tr>
    <% 
    String result ="fail";
    if(dto1.getPercentage() > 35)
    	result =  "pass";
    %>
    <td>Result</td>
    <td><%= result %></td>
  </tr>
  <tr>
    <td>CgPa</td>
    <td><%= dto1.getPercentage() %></td>
  </tr>
  <tr>
    <td>Out OF</td>
    <td><%= dto1.getOutOf() %></td>
  </tr>
</table>
<br>
<br>

<input type="button" onclick="myFunction()" size="40"  value="Print">&nbsp;&nbsp;
<button><a href="logout">Logout</a> </button>
</body>
</html>