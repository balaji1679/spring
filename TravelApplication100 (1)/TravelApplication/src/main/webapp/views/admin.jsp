<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To Food Corner</title>
 <link rel="stylesheet" type=text/css href="<%=request.getContextPath() %> /style/style2.css"/>
</head>
<body>
<div class="menu-bar">
	<div align="center">
		<h1>----Login For Admin---</h1>
		<form action="adminlogin" method="post">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required /></td>
				</tr>
			</table>
			<input type="submit" value="Login" />
		</form>
	</div>
</div>	
</body>
</html>