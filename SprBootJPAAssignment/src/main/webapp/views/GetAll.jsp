<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>GET ALL PRODUCTS</h1>
<form action="getall">
<!-- <h1>List<Product> prodlist = (List<Product>) request.getAttribute("products"); </Product></Product></h1>-->
<%
Product p = (Product) request.getAttribute("product");
	%>

</form>
</body>
</html>