<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<style>
div{
   margin-bottom:10px;
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1> Register new Employee</h1>

	<form:form modelAttribute="reg">
		<form:errors path="" element="div"/>
		<div>
			<from:label path="name">Employee Name</from:label>
			<form:input path="name"/>
			<form:errors path="name" />
		</div>
		
		<div>
			<from:label path="password">Employee Password</from:label>
			<form:input path="password" type="password"/>
			<form:errors path="password" />
		</div>
		
		<div>
			<input type="submit" class="btn btn-danger" value="Add Employee"/>
		</div>
		
		</form:form>
</div>
</body>
</html>