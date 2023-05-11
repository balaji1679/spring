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
				<h2 class="text-center mb-3">____Perform ALL CRUD
					Operations____</h2>
				<table class="table table-striped">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Product ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Product Brand</th>
							<th scope="col">Product Price</th>
							<th scope="col">Action- (Delete/Update/View)</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${lists }" var="p">
							<tr>
								<th scope="row">${p.product_Id }</th>
								<td><b>${p.product_Name }</b></td>
								<td>${p.product_Description }</td>
								<td>${p.product_Brand }</td>
								<td>${p.product_Price }</td>

								<td><a href="Delete-prod/${p.product_Id }"><i
										class="fa-solid fa-trash-can text-danger"
										style="font-size: 20px;"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<a href="Update-prod/${p.product_Id}"><i
										class="fa-solid fa-eraser text-primary"
										style="font-size: 20px;"></i></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<a href="View-one/${p.product_Id}"><i
										class="fa-solid fa-eye text-secondary"
										style="font-size: 20px;"></i> </a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-prod" class="btn btn-outline-success">Add Product</a>
				</div>
				<br> <br>
			</div>
		</div>
</body>
</html>
