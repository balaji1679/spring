<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> UPDATE PRODUCT</h1>

<form action="updateprod" method="post">
		<table>
		<tr>
				<td>Enter Product Id </td>
				<td><input type="number" name="pid" /></td>
			</tr>
			<tr>
				<td>Enter New Product Name</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>Enter New Brand Name</td>
				<td><input type="text" name="brandname" /></td>
			</tr>
			
			<tr>
				<td>Enter New Product price</td>
				<td><input type="number" name="price" /></td>
			</tr>
			<tr>
			<td><button type="submit">Update</button></td>
			</tr>
			
			
			</table>
			</form>
		
		
</body>
</html>