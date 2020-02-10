<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>


<title>menu</title>
</head>
<body>
	<h1>Menu Page</h1>
	<form action="/class" method="post">
		<button type="submit">Insert Class</button>
	</form>
	<form action="/student" method="post">
		<button type="submit">Insert Student</button>
	</form>
	<form action="/viewDetails" method="post">
		<button type="submit">Display page</button>
	</form>
</body>
</html>