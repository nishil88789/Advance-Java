<%@ page errorPage="ErrorPage.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <%
   int age;
   
    age = Integer.parseInt(request.getParameter("age"));   
   
   %>
   <p>
   
   your age is :<%=age %>years
   </p>
</body>
</html>