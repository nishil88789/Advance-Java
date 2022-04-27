<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marksheet</title>
</head>
<body bgcolor="rosybrown">
	<form action="MarksheetCtr" method="post">
		<h1 align="center">Marksheet</h1>
		<table align="center">
			<tr>
				<th>ID</th>
				<td><input types="number" name="id" required></td>
			</tr>
			<tr>
				<th>Roll No</th>
				<td><input type="number" name="rollno" required></td>
			</tr>
			<tr>
				<th>First Name</th>
				<td><input type="text" name="fname" required></td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td><input type="text" name="lname" required></td>
			</tr>
			<tr>
				<th>PHY</th>
				<td><input type="number" name="phy" required></td>
			</tr>
			<tr>
				<th>CHEM</th>
				<td><input type="number" name="chem" required></td>
			</tr>
			<tr>
				<th>MATHS</th>
				<td><input type="number" name="maths" required></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Submit"><input
					type="reset" value="Reset"></td>
			</tr>

		</table>
	</form>
</body>
</html>