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
		<h1>Update Row</h1>
		<form action="/getrow" method="post">
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