<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> user information </title>
</head>
<body>
<%
   String u =request.getParameter("user");
    String p = request.getParameter("pwd");
%>
<%=p %>
<%=u %>

</body>
</html>