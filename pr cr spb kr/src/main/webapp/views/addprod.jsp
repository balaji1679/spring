<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./html_css_js.jsp"%>
</head>
<body style="background-color: #008B8B;">
	<div class="container mt-3">
		<h1>Add Product</h1>

		<form action="products">
			<div class="form-group">
				<label for="product_Name">Product Name</label><input type="text"
					class="form-control" id="product_Name"
					aria-describedby="product_Name"
					placeholder="Enter The Product Name" name="pName">
			</div>

			<div class="form-group">
				<label for="product_Description">Product Description</label><input
					type="text" class="form-control" id="product_Description"
					aria-describedby="product_Description"
					placeholder="Enter The Product Description" name="pDes">
			</div>
			<div class="form-group">
				<label for="product_Brand">Product Brand</label><input type="text"
					class="form-control" id="product_Brand"
					aria-describedby="product_Brand"
					placeholder="Enter The Product Brand" name="pBrand">
			</div>

			<div class="form-group">
				<label for="product_Price">Product Price</label><input type="text"
					class="form-control" id="product_Price"
					aria-describedby="product_Price"
					placeholder="Enter The Product Price" name="pPrice">
			</div>


			<div class="container text-center">
				<a href="${pageContext.request.contextPath }/"
					class="btn btn-outline-danger">Back To Home</a>
				<button type="submit" class="btn btn-primary">Add</button>
			</div>

		</form>

	</div>


</body>
</html>