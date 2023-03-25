<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>
<h2>Add Teacher</h2>
<form action="AcademyControllert" method="post">
	<label>Teacher ID</label>
	<input type="number" name="tid"><br/>
	<label>Teacher Name</label>
	<input type="text" name="tname"><br/>
	<!--<label>Teacher ID</label>
	<input type="number" name="tcid"><br/>
	<label>URL</label>
	<input type="url" name="imageUrl"><br/> -->
	<input type="submit" value="Save Teacher">
	<input type="reset" value="reset">
</form>
</body>
</html>