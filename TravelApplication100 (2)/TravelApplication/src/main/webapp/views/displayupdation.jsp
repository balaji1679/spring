<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ page import="com.travel.entity.Country"%>
<%@page import="java.util.List"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TITANS TRAVEL GUIDE ONLINE APPLICATION</title>
</head>
<body>
<%List<Country> list=(List<Country>)request.getAttribute("countries");
for(Country c:list){
	int id=c.getCountryId();
	String countryName=c.getCountryName();
	String cityName=c.getCityName();
	String hotelName=c.getHotelName();
	String hotelDesc=c.getHotelDesc();
	out.println("Country Id="+id+" Country Name="+countryName+" CityName="+cityName+" HotelName="+hotelName+" Hotel Description="+hotelDesc);
	%>
	<br>
<% 
}
%>



</body>
</html>