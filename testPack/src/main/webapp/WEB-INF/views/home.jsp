<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Home Page</title>
</head>
<body>
<div class="container-fluid">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
                <li data-target="#myCarousel" data-slide-to="4"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <img class="img-responsive center-block" src="resources/imageProject/elec_1.jpg" alt="first slide" height="20%" width="40%">
                    <div class="container">
                        <div class="carousel-caption">
                            <h2 style="color:black;">WELCOME TO THE ONLINE STORE</h2>
                            <p style="color:black;">Here You can Browse And Opt Your Chocie.Order Now For Your Amazing New Arrivals</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="img-responsive center-block" src="resources/imageProject/travel_1.jpg" alt="Second slide" height="10%" width="20%">
                    <div class="container">
                        <div class="carousel-caption">
                            
                            <p style="color:black;">online shopping can make your life more easier</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="img-responsive center-block" src="resources/imageProject/b_img3.jpg" alt="Third slide" height="15%" width="30%">
                    <div class="container">
                        <div class="carousel-caption">
                          <!--<h1></h1>
                            <p>live Freely,Work Happily And Drive Safely!!</p>  -->  
                        </div>
                    </div>
                </div>
                 <div class="item">
                    <img class="img-responsive center-block" src="resources/imageProject/travel_2.jpg" alt="forth slide" height="20%" width="40%">
                    <div class="container">
                        <div class="carousel-caption">
                           <!-- <h1>Any car can be a "cool" car</h1>
                            <p>your life,your car...you own it!!</p> --> 
                        </div>
                    </div>
                </div> 
                
                <div class="item">
                    <img class="img-responsive center-block" src="resources/imageProject/b_img2.jpg" alt="forth slide" height="15%" width="30%">
                    <div class="container">
                        <div class="carousel-caption">
                         <!-- <h1>Any car can be a "cool" car</h1>
                            <p>your life,your car...you own it!!</p> -->   
                        </div>
                    </div>
                </div> 
                
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" ></span>
                <span class="sr-only">Next</span>
            </a>
        </div><!-- /.carousel -->

</div>
</body>
</html>