<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   C JSP
	<%
	 request.setAttribute("C", "Workshop");
	
	String m =(String)request.getAttribute("A");
	String n =(String)request.getAttribute("B");
	String o =(String)request.getAttribute("C");
	
	%>
	<%=m%>
	<%=n%>
    <%=o%>

</body>
</html>