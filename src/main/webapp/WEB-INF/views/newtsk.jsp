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
<h1> Add a New Task</h1>

	<form:form modelAttribute="form">
		<form:errors path="" element="div"/>
		<div>
			<from:label path="name">Task Name</from:label>
			<form:input path="name"/>
			<form:errors path="name" />
		</div>
		 
		<div>
			<from:label path="startDate">Start Date</from:label>
			<form:input type="date" path="startDate"/>
			<form:errors path="startDate" />
		</div>
		
		<div>
			<from:label path="endDate">End Date</from:label>
			<form:input type="date" path="endDate"/>
			<form:errors path="endDate" />
		</div>

		<div>
			<from:label path="description">Task Description</from:label>
			<form:input path="description"/>
			<form:errors path="description" />
		</div>
		<div>
			<from:label path="email">Task Email</from:label>
			<form:input type="email" path="email"/>
			<form:errors path="email" />
		</div>
		<div>
			<label for="severity">Severity:</label>
  			<select id="severity" name="severity">
   				<option value="high">High</option>
    			<option value="medium">Medium</option>
    			<option value="low">Low</option>
  			</select>

		</div>
		





		<div>
			<input type="submit" class="btn btn-danger" value="Add Task"/>
		</div>
		

		</form:form>
</div>
</body>
</html>