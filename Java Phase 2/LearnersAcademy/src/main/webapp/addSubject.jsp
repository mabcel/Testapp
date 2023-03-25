<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>
<h2>Add Subject</h2>
<form action="AcademyControllerc" method="post">
	<label>Subject ID</label>
	<input type="number" name="suid"><br/>
	<label>Subject Name</label>
	<input type="text" name="subname"><br/>
	<!--<label>Subject ID</label>
	<input type="number" name="sutid"><br/>
	<label>URL</label>
	<input type="url" name="imageUrl"><br/> -->
	<input type="submit" value="Save Subject">
	<input type="reset" value="reset">
</form>
</body>
</html>