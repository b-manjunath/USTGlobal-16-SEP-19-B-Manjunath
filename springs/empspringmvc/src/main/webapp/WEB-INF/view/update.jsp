<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>
	<fieldset>
		<legend style="color: green">Register</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><select name="gender" required="required">
							<option>select</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>