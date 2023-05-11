<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TravelGuide</title>
    <link rel="stylesheet" type=text/css href="<%=request.getContextPath() %> /style/style2.css"/>
</head>

<body>
<div class="menu-bar">
<ul>
<li class="active"><a href="#"><i class="fa fa-home"></i>Country</a>
    <div class="sub-menu-1">
         <ul>
            <!-- this is the code for china details -->
            <li class="hover-me"><a href="#">China</a><i class="fa fa-angle-right"></i>
                <div class="sub-menu-2">
                    <ul>
                        <li class="hover-me"><a href="https://www.booking.com/city/cn/beijing.html">beijing</a><i class="fa fa-angle-right"></i></li>
                    </ul>

                    <ul>
                        <li class="hover-me"><a href="https://www.booking.com/city/tw/chiayi-city.html">Chiayi</a><i class="fa fa-angle-right"></i></li>
                    </ul>  
                </div>
            </li>


             <!-- this is the code for India details -->
            <li class="hover-me"><a href="#">India</a><i class="fa fa-angle-right"></i>
                <div class="sub-menu-2">
                    <ul>
                        <li class="hover-me"><a href="https://www.makemytrip.com/hotels/mumbai-hotels.html">Mumbai</a><i class="fa fa-angle-right"></i></li>
                    </ul>
                    <ul>
                        <li class="hover-me"><a href="https://www.makemytrip.com/hotels/bangalore-hotels.html">Bangalore</a><i class="fa fa-angle-right"></i></li>
                    </ul>

                   
                </div>
            </li>



            <!-- this is the code for Russia details -->
            <li class="hover-me"><a href="#">Russia</a><i class="fa fa-angle-right"></i>
                <div class="sub-menu-2">
                    <ul>
                        <li class="hover-me"><a href="https://www.tripadvisor.in/Tourism-g298484-Moscow_Central_Russia-Vacations.html">Moscow</a><i class="fa fa-angle-right"></i></li>
                    </ul>
                    <ul>
                        <li class="hover-me"><a href="https://www.tripadvisor.in/Hotels-g665309-Yakutsk_Sakha_Yakutia_Republic_Far_Eastern_District-Hotels.html">Yakutsk</a><i class="fa fa-angle-right"></i></li>
                    </ul>
                     
                </div>
            </li>
         </ul>
    </div>

</li>
</ul>

</div>
</body>
</html>