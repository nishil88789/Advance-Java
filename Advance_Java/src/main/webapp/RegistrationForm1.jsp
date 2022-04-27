<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="teal">
	<form action="RegistrationCtl" method="post">

		<h1 align="center">Registration Form</h1>
		<%
			String error1 = (String) request.getAttribute("error1");
			if (error1 != null) {
		%>
		<center>
			<h1>
				<font color="red"><%=error1%></font>
			</h1>
		</center>
		<%
			}
		%>

		<hr>
		<table align="center">

			<tr>
				<th>First Name</th>
				<td><input type="text" name="fname"></td>
				<td>
					<%
						String ferror = (String) request.getAttribute("ferror");
						if (ferror != null) {
					%>
					<center>
						<font color="red"><%=ferror%></font>
					</center> <%
 	}
 %>
				</td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td><input type="text" name="lname"></td>
				<td>
					<%
						String lerror = (String) request.getAttribute("lerror");
						if (lerror != null) {
					%>
					<center>
						<font color="red"><%=lerror%></font>
					</center> <%
 	}
 %>
				</td>
			</tr>
			<tr>
				<th><label for="date">Date of Birth</label></th>
				<td><input type="date" name="dob" id="date"></td>
			</tr>
			<tr>
				<th>Email Address</th>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<th>Contact</th>
				<td><input type="number" id="quantity" name="contact"></td>

			</tr>
			<th>Gender</th>
			<td><input type="radio" name="gender" value="Male">Male
				<input type="radio" name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<th>Address</th>
				<td><input type="text area" placeholder="line1" name="add"></td>
			</tr>

			<th>Language</th>
			<td><input type="radio" name="subject" value="HTML">HTML
				<input type="radio" name="subject" value="CSS">CSS <input
				type="radio" name="subject" value="PYTHON">PYTHON <input
				type="radio" name="subject" value="JAVA SCRIPT">JAVA SCRIPT</td>
			</tr>

			<tr>
				<th>PWD</th>
				<td><input type="number" id="quantity" name="pwd"></td>

			</tr>

			<tr>
				<th></th>
				<td><input type="submit" value="Register"><a
					href="LogInView.jsp"> <input type="button"
						value="All Ready Registered"></a></td>
			</tr>
		</table>

	</form>
	<hr>