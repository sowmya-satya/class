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
<title>AddClass</title>
</head>
<body>
	<div class="container-text" style="border: 1px solid black">
		<form action="/addClass" method="post" id="classform">
			<div class="form-group">
				<label for="section">Section:</label> <select name="section">
					<option value="A">A</option>
					<option value="B">B</option>
					<option value="C">C</option>
					<option value="D">D</option>
				</select>
			</div>
			<div class="form-group">
				<label for="teacherName">Class Teacher Name</label> <input
					type="text" class="form-control" id="teacherName"
					placeholder="Enter class teacher name" name="teacherName">
			</div>
			<div class="form-group">
				<label for="numberOfStudents">Number Of Students</label> <input
					type="number" class="form-control" id="numberOfStudents"
					placeholder="Enter number of students" name="numberOfStudents">
			</div>
			<div class="button">
				<button type="submit" class="btn btn-primary" value="submit">Submit</button>
			</div>
		</form>
	</div>
	<script>
		$('#classform').validate({
			rules : {
				teacherName : {
					required : true,
					lettersonly : true,
					minlength : 3,
					maxlength : 8
				},
				numberOfStudents : {
					required : true,
					numbersonly : true,
				},
				section : {
					required : true
				}
			}

		});
	</script>
</body>
</html>