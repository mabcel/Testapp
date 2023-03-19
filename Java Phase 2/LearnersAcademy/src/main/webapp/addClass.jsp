<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>
<h2>Add Class</h2>
<form action="AcademyController" method="post">
	<label>Class ID</label>
	<input type="number" name="cid"><br/>
	<label>Class Name</label>
	<input type="text" name="cname"><br/>
	<!--<label>Teacher ID</label>
	<input type="number" name="ctid"><br/>
	<label>URL</label>
	<input type="url" name="imageUrl"><br/> -->
	<input type="submit" value="Save Class">
	<input type="reset" value="reset">
</form>
</body>
</html>