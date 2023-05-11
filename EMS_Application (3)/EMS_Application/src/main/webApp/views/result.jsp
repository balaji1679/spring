<%@page import="com.ems.controller.EmployeeController"%>
<%@page import="com.ems.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="header.jsp">
		<jsp:param name="headerId" value="headerId"/>
</jsp:include>

	<div class="text-center container-md">
		<br/>
		<h1 class="h2 mb-2 fw-normal">Successful</h1>
		<br/>
</div>
<div class="text-center container-md">
<p class="text-success">${editSuccessMsg}</p>
</div>


<div class="container-md">

<div class="row">

<div class="col-md-4">
</div>
<div class="col-md-4">

<form action="edit" method="get">
	<%
		Employee emp = (Employee) request.getAttribute("employee");
		if(emp !=null)
		{
		int empId = emp.getEmpId();
		String empName = emp.getEmpName();
		long phone = emp.getPhone();
		String dept = emp.getDept();
	%>
	<div class="mb-3">
	<label class="form-label">Employee Id: </label>
	<input class="form-control"type="text" name="empId" value="<% out.print(empId);%>" readonly>
	</div>
	<div class="mb-3">
	<label class="form-label">Employee Name: </label>
	<input class="form-control"type="text" name="empName" value="<% out.print(empName);%>" readonly>
	</div>
	<div class="mb-3">
	<label class="form-label">Employee Phone: </label>
	<input class="form-control" type="text" name="phone" value="<% out.print(phone);%>" readonly>
	</div>
	<div class="mb-3">
	<label class="form-label">Employee Department: </label>
	<input class="form-control" type="text" name="dept" value="<% out.print(dept);%>" readonly>
	</div>
	<%} %>
	</form>
	

	
</div>

<div class="col-md-4">
</div>
</div>
</div>
</body>
</html>