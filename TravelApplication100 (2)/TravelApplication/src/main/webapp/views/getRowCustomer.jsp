<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.travel.entity.Country"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>



<%Country c=(Country)request.getAttribute("country"); %>

    <div align="center">
    <h2>WELCOME TO THE TRAVEL GUIDE FOR TRAVELLERS</h2>
    <h3>Details For selected Country Id </h3>
    <h3>Edit Details which you want to update</h3>
    <form action="/displayupdation" method="post">
    <table>
    	<tr>
            <td>Country Id</td>
            <td><input type="number" name="countryid" value="<%=c.getCountryId() %>" required /></td>
        </tr>
        <tr>
            <td>Country Name</td>
            <td><input type="text" name="countryname" value="<%=c.getCountryName()%>" required /></td>
        </tr>
        
        <tr>
            <td>City Name</td>
            <td><input type="text" name="cityname" value="<%=c.getCityName()%>" required /></td>
        </tr>
        
        <tr>
            <td>Hotel Name</td>
            <td><input type="text" name="hotelname" value="<%=c.getHotelName()%>" required /></td>
        </tr>
        
        <tr>
            <td>Hotel Description</td>
            <td><input type="text" name="hoteldesc" value="<%=c.getHotelDesc()%>" required /></td>
        </tr>
        
    </table>
    <a href = "customer">Explore more</a>
    </form>
   </div>
</body>
</html>