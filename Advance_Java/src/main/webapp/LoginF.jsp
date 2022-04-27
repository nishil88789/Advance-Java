<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%@ include file="Header.jsp" %>
	<center>
		<img alt="" src="C:\Advance Java\download.png">
	</center>
	<form action="LoginCtl" method="post">
		<table align="center">
			<h1 align="center">LOGIN</h1>

			
			<%
				String error = (String) request.getAttribute("eror");
				if (error != null) {
			%>
			<center>
				<font color="red"><%=error%></font>
			</center>
			<%
				}
			%>
			<tr>
				<th>Username*</th>
				<td><input type="text" name="user"></td>
				<td>
					<%
						String s1 = (String) request.getAttribute("errorlogin");
					%> <%
 	if (s1 != null) {
 %> <font color="red"><%=s1%></font> <%
 	}
 %>
				</td>
			</tr>
			<tr>
			<th>Password*</th>
			<td><input type="password" name="pwd"></td>

			<td>
				<%
					String s2 = (String) request.getAttribute("errorpass");
				%> <%
 	if (s2 != null) {
 %> <font color="red"><%=s2%></font> <%
 	}
 %>
			</td>
		</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Submit"><a href="ForgotPasswordView.jsp">Forget Password</a></td>
			</tr>
			<tr>
			<th></th>
			<td><a href="RegistrationForm1.jsp">Create New Account</a></td>
			</tr>
		</table>
	</form>
	<%@ include file="Footer.jsp" %>
</body>
</html>