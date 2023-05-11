
<html>
<head>
<%@include file="./html_css_js.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

</head>
<body style="background-color: #cccccc;">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3" style="">Shopping Details!!</h1>
				<h2 class="text-center mb-3">____Product added successfully____</h2>
				<table class="table table-striped">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Product Brand</th>
							<th scope="col">Product Price</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><b>${prods.product_Name }</b></td>
							<td>${prods.product_Description }</td>
							<td>${prods.product_Brand }</td>
							<td>${prods.product_Price }</td>
						</tr>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Back To Home</a>
				</div>
				<br> <br>
			</div>
		</div>
</body>
</html>
