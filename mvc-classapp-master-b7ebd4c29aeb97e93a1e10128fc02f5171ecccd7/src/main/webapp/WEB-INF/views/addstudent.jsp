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

<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>
<title>add student</title>
</head>
<body>
	<div class="container-text" style="border: 1px solid black">
		<form action="/addStudent" method="post" id="studentform">
			<div class="form-group">

				<select id="section" name="section">
					<option value="A">A</option>
					<option value="B">B</option>
					<option value="C">C</option>
				</select><br>

			</div>
			<div class="form-group">
				<label for="studentName">Student Name</label> <input type="text"
					class="form-control" id="studentName"
					placeholder="Enter student name" name="studentName">
			</div>
			<div class="form-group">
				<label for="dateOfBirth">Date of Birth</label> <input type="date"
					class="form-control" id="dateOfBirth" name="dateOfBirth">
			</div>
			<div class="form-group">
				<label for="age">Age</label> <input type="number"
					class="form-control" id="age" placeholder="Enter age" name="age">
			</div>


			<div class="button">
				<button type="submit" class="btn btn-primary" value="submit">Submit</button>
			</div>
		</form>
	</div>
	<!-- <script>
		$.validator.addMethod("dateOfBirth", function(value, element) {
			var curDate = new Date();
			var inputDate = new Date(value);
			if (inputdate > curDate)
				return true;
			return false;
		}, "Invalid date!");

		$('#personform').validate({
			rules : {
				studentName : {
					required : true,
					lettersonly : true,
					minlength : 3,
					maxlength : 8
				},

				age : {
					required : true,
					numbersonly : true,
					maxlength : 2
				},
				dateOfBirth : {
					required : true,
					dateOfBirth : true
				}

			}
		});
	</script> -->
</body>
</html>