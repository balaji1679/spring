<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h2>WELCOME TO THE TRAVEL GUIDE FOR TRAVELLERS</h2>
      	<div align="center">
		<h1>Add Country</h1>
		<form action="/addcountry" method="post">
			<table>
				<tr>
					<td>Country Name:</td>
					<td><input type="text" name="CountryName" required /></td>

				</tr>
				<tr>				
				    <td>City Name:</td>
					<td><input type="text" name="CityName" required /></td>
				</tr>
								<tr>
					<td>Hotel Name:</td>
					<td><input type="text" name="HotelName" required /></td>

				</tr>
				<tr>				
				    <td>Hotel Description:</td>
					<td><input type="text" name="HotelDesc" required /></td>
				</tr>
			</table>
			<input type="submit" value="Add" />
		</form>
	</div>
      
</body>
</html>