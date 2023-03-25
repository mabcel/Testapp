<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learner's Academy</title>
</head>
<body>

<div class="maincontainer">

<div class="container">

<form action="AcademyController" method="get">
<h2 class="item">Teachers</h2>

	
	<div class="item" >
	<span style="color:white">Teacher: </span> 
	<select class="tb" name="Teachers">
	<option value="1">Ariel Mann</option>
	<option value="2">Phil Tay</option>
	<option value="3">Sandra Phish</option>
	<option value="4">John Kuma</option>
	<option value="5">Albert Quinn</option>
	<option value="6">Goldie Yarn</option>
	</select></div>
	
	<div> <h2>Classes</h2> </div>
	
	<div class="item" >
	<span style="color:white">Classes: </span> 
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
	
	<div> <h2>Subjects </h2> </div>
	
	
	<div class="item" >
	<span style="color:white">Subjects: </span> 
	<select class="tb" name="Subjects">
	<option value="1">Programming</option>
	<option value="2">Data Structures</option>
	<option value="3">Digital Systems</option>
	<option value="4">Network Security</option>
	<option value="5">SQL</option>
	<option value="6">Java</option>
	<option value="7">Python</option>
	<option value="8">AWS</option>
	</select></div>

	
	
	<div ><input type="submit" value="SUBMIT" class="btn"  /></div>
</form>
</div>



</div>



	
</body>
</html>
