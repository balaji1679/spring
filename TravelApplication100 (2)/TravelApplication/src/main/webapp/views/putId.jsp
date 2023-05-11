<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taking input as an id from customer</title>
</head>
<body>
       
      	<div align="center">
      	 <h2>WELCOME TO THE TRAVEL GUIDE FOR TRAVELLERS</h2>
		<h1>Search Hotel</h1>
		
		<h3>Country Code For India:1</h3>
		<h3>Country Code For China:2</h3>
		<h3>Country Code For Russia:3</h3>
		
		<form action="/getRowCustomer" method="post">
			<table>
				<tr>
					<td>Enter id</td>
					<td><input type="number" name="countryid" required /></td>
				</tr>
            </table>
            <input type="submit" value="Get Details"/>
		</form>
	</div>
</body>
</html>