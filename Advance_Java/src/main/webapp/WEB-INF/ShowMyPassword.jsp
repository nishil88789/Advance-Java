<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String s = (String)request.getAttribute("pass");
	%>
	<%if(request.getAttribute("pass")!=null){ %>
	<h2 align="center">
	<font color="blue" >Hi User, You're Password is---<%= s%></font>
	</h2>
	<%} %>


</body>
</html>