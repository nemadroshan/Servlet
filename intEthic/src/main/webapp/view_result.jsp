<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.intEthic.dao.StudentDaoImpl"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body> 
	<%
		String sname = request.getParameter("sname");
		int rollnum = Integer.parseInt(request.getParameter("rollnum"));
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = StudentDaoImpl.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	<h2>Report Card</h2>

	<table border="1">
		<%
			try {
				String getStudentByName = "SELECT NAME,FNAME,P_MARK,C_MARK,B_MARK,E_MARK,OUTOF,PERCENTAGE,ROLLNUM FROM CURD_STUDENT WHERE ROLLNUM ="+rollnum;
				st = con.createStatement();
				rs =st.executeQuery(getStudentByName);
				while (rs.next()) {
		%>
		<tr>
			<td>Name</td>
			<td><%=rs.getString("name")%></td>
		</tr>
		<tr>
			<td>Fathers Name</td>
			<td><%=rs.getString("fname")%></td>
		</tr>
		<tr>
			<td>Roll Number</td>
			<td><%=rs.getString("rollnum")%></td>
		</tr>
		<tr>
			<td>Physics</td>
			<td><%=rs.getString("p_mark")%></td>
		</tr>
		<tr>
			<td>Chemistry</td>
			<td><%=rs.getString("c_mark")%></td>
		</tr>
		<tr>
			<td>Biology</td>
			<td><%=rs.getString("b_mark")%></td>
		</tr>
		<tr>
			<td>English</td>
			<td><%=rs.getString("e_mark")%></td>
		</tr>
		<tr>
			<td>Percentage</td>
			<td><%=rs.getString("percentage")%></td>
		</tr>
		<tr>
			<td>outOF</td>
			<td><%=rs.getString("outof")%></td>
		</tr>
		<%
			} //while
			} //try
			catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</table>
</body>

</body>
</html>