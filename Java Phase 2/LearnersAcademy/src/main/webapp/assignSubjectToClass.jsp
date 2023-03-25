<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>

<div class="container1">

<form action="AcademyController" method="get">
<h1 class="item">Subjects</h1>
	<div class="item" ><input type="text" placeholder="Subject ID" class="tb" name="suid" /></div>
	<div class="item" ><input type="text" placeholder="Subject Name" class="tb"  name="subname" /></div>
	<div class="item" >
	<div style="color:white; margin: 10px; text-align:center;">Select Class</div> 
	<select class="tb" name="Classes">
	<option value="1">Software Engineering</option>
	<option value="2">Machine Learning</option>
	<option value="3">Data Science</option>
	<option value="4">Project Management</option>
	<option value="5">Computer Science</option>
	<option value="6">Cloud Computing</option>
	<option value="7">Cyber Security</option>
	<option value="8">Artificial Intelligence</option>
	</select></div>
	<div ><input type="submit" value="SUBMIT" class="btn"  /></div>
<!-- <div class="Data"><a href="ReadData">Read Data Entries</a></div>  -->	
</form>
</div>

</body>
</html>
