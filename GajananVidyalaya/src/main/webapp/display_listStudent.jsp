<%@page import="java.sql.SQLException"%>
<%@page import="com.intEthic.dao.StudentDaoImpl"%>
<%@page import="com.intEthic.dao.StudentDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%
    Connection con =StudentDaoImpl.getConnection();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image: url('https://previews.123rf.com/images/tharinsinlapachai/tharinsinlapachai1710/tharinsinlapachai171000019/87333144-blurred-of-wrinkled-paper-for-background-color-filter-pastel-.jpg');
}
</style>
</head>
<body>
	<table border="1">

		<tr>
			<td>Name</td>
			<td>Fathers Name</td>
			<td>Roll Number</td>
			<td>Physics</td>
			<td>Chemistry</td>
			<td>English</td>
			<td>Biology</td>
			<td>Percentage</td>
			<td>outOF</td>
		</tr>
		
		<%
			Statement st = null;
			ResultSet rs = null;
			String sql ="SELECT NAME,FNAME,P_MARK,C_MARK,B_MARK,E_MARK,OUTOF,PERCENTAGE,ROLLNUM FROM CURD_STUDENT";
			try{
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
		%>
		<tr>
		<td> <%=rs.getString("name") %> </td>
		<td> <%=rs.getString("fname") %> </td>
		<td> <%=rs.getString("rollnum") %> </td>
		<td> <%=rs.getString("p_mark") %> </td>
		<td> <%=rs.getString("c_mark") %> </td>
		<td> <%=rs.getString("b_mark") %> </td>
		<td> <%=rs.getString("e_mark") %> </td>
		<td> <%=rs.getString("percentage") %> </td>
		<td> <%=rs.getString("outof") %> </td>
		</tr>
		<%
			}
			}catch(SQLException se){
				se.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
		%>
	</table>
	<a href="logout">Logout</a> &nbsp;&nbsp;<a href="home.jsp">home</a>&nbsp;&nbsp;
	<a href="StudentExcelSheet">Generate Exel</a>&nbsp;&nbsp;<a href="StudentPDF">Generate PDF</a>
</body>
</html>