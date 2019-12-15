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
	Connection con = StudentDaoImpl.getConnection();
%>
<!DOCTYPE html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap Table with Add and Delete Row Feature</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style type="text/css">
body {
	color: #404E67;
	background: #F5F7FA;
	font-family: 'Open Sans', sans-serif;
}

.table-wrapper {
	width: 700px;
	margin: 30px auto;
	background: #fff;
	padding: 20px;
	box-shadow: 0 1px 1px rgba(0, 0, 0, .05);
}

.table-title {
	padding-bottom: 10px;
	margin: 0 0 10px;
}

.table-title h2 {
	margin: 6px 0 0;
	font-size: 22px;
}

.table-title .add-new {
	float: right;
	height: 30px;
	font-weight: bold;
	font-size: 12px;
	text-shadow: none;
	min-width: 100px;
	border-radius: 50px;
	line-height: 13px;
}

.table-title .add-new i {
	margin-right: 4px;
}

table.table {
	table-layout: fixed;
}

table.table tr th, table.table tr td {
	border-color: #e9e9e9;
}

table.table th i {
	font-size: 13px;
	margin: 0 5px;
	cursor: pointer;
}

table.table th:last-child {
	width: 100px;
}

table.table td a {
	cursor: pointer;
	display: inline-block;
	margin: 0 5px;
	min-width: 30px;
}

table.table td a.add {
	color: #27C46B;
}

table.table td a.edit {
	color: #FFC107;
}

table.table td a.delete {
	color: #E34724;
}

table.table td i {
	font-size: 19px;
}

table.table td a.add i {
	font-size: 24px;
	margin-right: -1px;
	position: relative;
	top: 3px;
}

table.table .form-control {
	height: 32px;
	line-height: 32px;
	box-shadow: none;
	border-radius: 2px;
}

table.table .form-control.error {
	border-color: #f50000;
}

table.table td .add {
	display: none;
}
</style>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$('[data-toggle="tooltip"]').tooltip();
						var actions = $("table td:last-child").html();
						// Append table with add row form on add new button click
						$(".add-new")
								.click(
										function() {
											$(this)
													.attr("disabled",
															"disabled");
											var index = $(
													"table tbody tr:last-child")
													.index();
											var row = '<tr>'
													+ '<td><input type="text" class="form-control" name="name" id="name"></td>'
													+ '<td><input type="text" class="form-control" name="fname" id="dept"></td>'
													+ '<td><input type="text" class="form-control" name="rollnum" id="rollnum"></td>'
													+ '<td><input type="text" class="form-control" name="physics" id="phy"></td>'
													+ '<td><input type="text" class="form-control" name="chemistry" id="che"></td>'
													+ '<td><input type="text" class="form-control" name="english" id="eng"></td>'
													+ '<td><input type="text" class="form-control" name="biology" id="bio"></td>'
													+ '<td><input type="text" class="form-control" name="percentage" id="per"></td>'
													+ '<td><input type="text" class="form-control" name="outof" id="outof" value ="400" disabled></td>'
													+ '<td>' + actions
													+ '</td>' + '</tr>';
											$("table").append(row);
											$("table tbody tr").eq(index + 1)
													.find(".add, .edit")
													.toggle();
											$('[data-toggle="tooltip"]')
													.tooltip();
										});
						// Add row on add button click
						$(document).on(
								"click",
								".add",
								function() {
									var empty = false;
									var input = $(this).parents("tr").find(
											'input[type="text"]');
									input.each(function() {
										if (!$(this).val()) {
											$(this).addClass("error");
											empty = true;
										} else {
											$(this).removeClass("error");
										}
									});
									$(this).parents("tr").find(".error")
											.first().focus();
									if (!empty) {
										input.each(function() {
											$(this).parent("td").html(
													$(this).val());
										});
										$(this).parents("tr").find(
												".add, .edit").toggle();
										$(".add-new").removeAttr("disabled");
									}
								});
						// Edit row on edit button click
						$(document).on(
								"click",
								".edit",
								function() {
									$(this).parents("tr").find(
											"td:not(:last-child)").each(
											function() {
												$(this).html(
														'<input type="text" class="form-control" value="'
																+ $(this)
																		.text()
																+ '">');
											});
									$(this).parents("tr").find(".add, .edit")
											.toggle();
									$(".add-new").attr("disabled", "disabled");
								});
						// Delete row on delete button click
						$(document).on("click", ".delete", function() {
							$(this).parents("tr").remove();
							$(".add-new").removeAttr("disabled");
						});
					});
</script>
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
	</div>
	<br>
	<br>
	<div align="center">
	<br>
		<div class="container-fluid">
			<div>
				<div class="table-title">
					<div class="row">
						<div class="col-sm-8">
							<h2 align="left">
								Student <b>Details</b>
							</h2>
						</div>
						<div class="col-sm-4">
							<button type="button" class="btn btn-info add-new">
								<i class="fa fa-plus"></i> Add New
							</button>
						</div>
					</div>
				</div>
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Name</th>
							<th>Fathers Name</th>
							<th>Roll Number</tdh>
							<th>Physics</th>
							<th>Chemistry</th>
							<th>English</th>
							<th>Biology</th>
							<th>Percentage</th>
							<th>outOF</th>
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<%
							Statement st = null;
							ResultSet rs = null;
							String sql = "SELECT NAME,FNAME,P_MARK,C_MARK,B_MARK,E_MARK,OUTOF,PERCENTAGE,ROLLNUM FROM CURD_STUDENT";
							try {
								st = con.createStatement();
								rs = st.executeQuery(sql);
								while (rs.next()) {
									String rollNum = rs.getString("rollnum");
									double per = Double.parseDouble(rs.getString("percentage"));
									String result = "";
									if (per > 35)
										result = "pass";
									else
										result = "fail";
						%>
						<tr>
							<td id="name"><%=rs.getString("name")%></td>
							<td><%=rs.getString("fname")%></td>
							<td><%=rs.getString("rollnum")%></td>
							<td><%=rs.getString("p_mark")%></td>
							<td><%=rs.getString("c_mark")%></td>
							<td><%=rs.getString("b_mark")%></td>
							<td><%=rs.getString("e_mark")%></td>
							<td><%=per%></td>
							<td><%=result%></td>
							<td><a class="add" title="Add" data-toggle="tooltip"><i
									class="material-icons">&#xE03B;</i></a> <a class="edit"
								title="Edit" data-toggle="tooltip" href="#"><i
									class="material-icons">&#xE254;</i></a> <a class="delete"
								title="Delete" data-toggle="tooltip"
								href="deleteurl?rollnum=<%=rollNum%>"><i
									class="material-icons">&#xE872;</i></a></td>
						</tr>
						<%
							}
							} catch (SQLException se) {
								se.printStackTrace();
							} catch (Exception e) {
								e.printStackTrace();
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
		
		<!-- pdf and exel buttons  -->
		<div>
			<button class="btn btn-danger">
				<a href="StudentExcelSheet" style="text-decoration: none; color:white ">Generate Exel</a>
			</button>
			&nbsp;&nbsp;
			<button class="btn btn-success" >
				<a href="StudentPDF"  style="text-decoration: none; color:white ">Generate PDF</a>
			</button>
		</div>
	</div>
</body>
</html>