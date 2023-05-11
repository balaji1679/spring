<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./html_css_js.jsp"%>
</head>
<body style="background-color: #5F9EA0;">
	<div class="container mt-3">
		<h1>Update Product</h1>
		<form action="${pageContext.request.contextPath }/handle-product"
			method="post">
			<input type="hidden" value="${prods.product_Id }" name="product_Id">
			<div class="form-group">
				<label for="product_Name">Product Name</label><input type="text"
					class="form-control" id="product_Name"
					aria-describedby="product_Name" name="product_Name"
					placeholder="Enter The Product Name" value="${prods.product_Name }">
			</div>
			<div class="form-group">
				<label for="product_Description">Product Description</label><input
					type="text" class="form-control" id="product_Description"
					aria-describedby="product_Description" name="product_Description"
					placeholder="Enter the Product Discription"
					value="${prods.product_Description }">
			</div>
			<div class="form-group">
				<label for="product_Brand">Product Brand</label><input type="text"
					class="form-control" id="product_Brand"
					aria-describedby="product_Brand" name="product_Brand"
					placeholder="Enter the Product Brand"
					value="${prods.product_Brand }">
			</div>
			<div class="form-group">
				<label for="product_Price">Product Price</label><input type="text"
					class="form-control" id="product_Price"
					aria-describedby="product_Price" name="product_Price"
					placeholder="Enter Product Price" value="${prods.product_Price }">
			</div>
			<div class="container text-center">
				<a href="${pageContext.request.contextPath }/"
					class="btn btn-outline-danger">Back To Home</a>
				<button type="submit" class="btn btn-primary">Update</button>
			</div>
		</form>
	</div>
</body>
</html>