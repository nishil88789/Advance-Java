<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Forgot Password</h1>
	<%
		String s = (String) request.getAttribute("error");
	%>
	<%
		if (request.getAttribute("error") != null) {
	%>
	<h3 align="center">
		<font color="red"><%=s%></font>
	</h3>
	<%
		}
	%>
    <form action="ForgotPasswordCtl" method="post">
		<table align="center">
			<tr>
				<td>Enter Email-Id</td>
				<td><input type="text" name="emailid" id=" "></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="ShowMyPassword"></td>
			</tr>
		</table>

	</form>
</body>
</html>