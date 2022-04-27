<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Information</title>
</head>
<body>
<%   String f =request.getParameter("userfname");
String l = request.getParameter("userlname");
String g =request.getParameter("gender");
String e = request.getParameter("email");
String c =request.getParameter("contact");
String a = request.getParameter("Address");
String d = request.getParameter("Address2");
String o = request.getParameter("Address3");
String q = request.getParameter("DOB");
String r = request.getParameter("s");
String z = request.getParameter("b");
%>
<%=f %>
<%=l %>
<%=g %>
<%=e %>
<%=c %>
<%=a %>
<%=d %>
<%=o %>
<%=q %>
<%=r %>
<%=z %>

</body>
</html>