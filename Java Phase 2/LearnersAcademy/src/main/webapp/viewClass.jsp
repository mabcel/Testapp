<%@page import="java.util.Iterator"%>
<%@page import="com.entity.Classes"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object obj = request.getAttribute("listOfClasses");
List<Classes> ll = (List)obj;
Iterator<Classes> li = ll.iterator();
while(li.hasNext()){
	Classes c = li.next();
	%>
	<div>
<img  src="<%=p.getImageUrl()%>"  width="200" height="200">
<span>Name : <%=p.getPname() %> Price :<%=p.getPrice() %></span>
</div>
	<% 
}
%>
</body>
</html><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>