<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>viewdetails</title>
</head>
<body>
	<div class="container text-center" style="border: 1px solid black">
		<form action="/get-student-details" method="post">
			<div class="form-group">
				<label for="section">Section:</label> <select name="section">
					<option value="A">A</option>
					<option value="B">B</option>
					<option value="C">C</option>
					<option value="D">D</option>
				</select>
			</div>
			<div class="button">
				<button type="submit" class="btn btn-primary" value="submit">Submit</button>
			</div>
		</form>
	</div>
</body>
<body>
	<table align="center" border="1" width="80%" cellpadding="2">

		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Date of Birth</th>
			<th>Age</th>
			<th>Section</th>
		</tr>
		<c:forEach var="students" items="${student}">
			<tr>
				<th>${students.studentId}</th>
				<th>${students.studentName}</th>
				<th>${students.dateOfBirth}</th>
				<th>${students.age}</th>
				<th>${students.section}</th>
		</c:forEach>
	</table>
</body>
</html>