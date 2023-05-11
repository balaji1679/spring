<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD Product</h1>

<form action="addprd"  method="post">
	Name:<input type="text" name="pname">
	<hr>
	
	brandName:<input type="text" name="brandname">
	<hr>
	price:<input type="number" name="price">
	<hr>

	<button type="submit">Added</button>
	</form>

</body>
</html>