<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>
<h2>Add Student</h2>
<form action="AcademyControllers" method="post">
	<label>Student ID</label>
	<input type="number" name="stid"><br/>
	<label>Student Name</label>
	<input type="text" name="stname"><br/>
	<!--<label>Teacher ID</label>
	<input type="number" name="stid"><br/>
	<label>URL</label>
	<input type="url" name="imageUrl"><br/> -->
	<input type="submit" value="Save Student">
	<input type="reset" value="reset">
</form>
</body>
</html>