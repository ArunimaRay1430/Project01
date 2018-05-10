<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		
<title>Sign Up</title>
<link href='<c:url value="/resources/css/registration.css"></c:url>' rel="stylesheet">
<link href='<c:url value="/resources/css/login.css"></c:url>' rel="stylesheet">


<script type="text/javascript"
	src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	$('#form').validate({
		rules:{
			firstName:{required:true},
			lastName:{required:true},
			contact:{required:true,number:true,minlength:10,maxlength:10},
			password:{required:true,minlength:5,maxlength:10},
		},
		messages:{
			firstName:{required:"Firstname is mandatory"},
			contact:{required:"Phonenumber is required"},
			
		}
	})
})

</script>

</head>
<body>

<c:if test="${errorMessage!=null }">
<div align="center">
<span style="color:red">${errorMessage }</span>
</div>
</c:if>
	<div class="container">
<c:url var="url" value="/all/registerUser"></c:url>
<form:form action="${url }" id="form">
<p align="center"><b>Customer Details</b></p>

	


			<div class="form-group">
				<form:label path="firstName">Enter First Name</form:label>
				<form:input path="firstName" class="form-control"
					 />
			</div>
			<div class="form-group">
				<form:label path="lastName">Enter Last Name</form:label>
				<form:input path="lastName" class="form-control"
					 />
			</div>
			<div class="form-group">
				<form:label path="contact">Enter Contact Number</form:label>
				<form:input path="contact" class="form-control"
					 />
			</div>
			
			<div class="form-group">
				<form:label path="userAddress">Enter User Address</form:label>
				<form:textarea path="userAddress" class="form-control"
					/>
			</div>
			
			<hr>
			<p align="center"><b>Login credentials</b><br></p>
			
			<div class="form-group">
				<form:label path="userId">Enter Username</form:label>
				<form:input path="userId" class="form-control"  />
			</div>
			<div class="form-group">
				<form:label path="password">Enter Password</form:label>
				<form:input type="password" path="password" class="form-control"
				 />
			</div>

			<br>
			<button type="submit" >Register</button>
		</form:form>
	</div>
</body>
</html>
