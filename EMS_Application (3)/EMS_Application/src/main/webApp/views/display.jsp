<%@page import="com.ems.controller.EmployeeController"%>
<%@page import="com.ems.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All Employees</title>
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
		<h1 class="h2 mb-2 fw-normal">Display All Employees</h1>
		<br/>
	
	<table class="table">
			<thread>
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee Phone</th>
				<th>Employee Department</th>
			</tr>
			</thread>
			<tbody>
			<%
				Employee[] emparr = (Employee[]) request.getAttribute("emparr");
				
				for(Employee emp: emparr)
				{%>
						
				<tr>
					<td><%out.println(emp.getEmpId());%></td>
					<td><%out.println(emp.getEmpName());%></td>
					<td><%out.println(emp.getPhone());%></td>
					<td><%out.println(emp.getDept());%></td>
				</tr>
				<% }%>
			</tbody>
		</table>
</div>
</body>
</html>