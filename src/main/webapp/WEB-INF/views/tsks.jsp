<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<style>
div {
	margin-bottom: 10px;
}
</style>


<title>Insert title here</title>
</head>
<body>
	<div align="center">

		<h1 style="color: blue">List of Tasks</h1>

		<div class="container">
			<table class="table table-striped">
				
				<thead>
					<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>START DATE</th>
						<th>END DATE</th>
						<th>DESCRIPTION</th>
						<th>EMAIL</th>
						<th>SEVERITY</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${tasks}" var="tsks">
						<tr>
							<td>${tsks.id}</td>
							<td>${tsks.name}</td>
							<td>${tsks.startDate}</td>
							<td>${tsks.endDate}</td>
							<td>${tsks.description}</td>
							<td>${tsks.email}</td>
							<td>${tsks.severity}</td>
							<td><a type="button" class="btn btn-success" href="/editingtsk/${tsks.id}">Edit</a></td>
							<td><a type="button" class="btn btn-success" href="/deletingtsk/${tsks.id}">Delete</a></td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		
		</div>
		
		
		</br>
		<div>
			<form action="/addtsk" id="linkId">
				<input type="submit" class="btn btn-danger" value="Add a New Task" />
			</form>
		</div>
		<div>
			<form action="/edittsk" id="linkId">
				<input type="submit" class="btn btn-danger" value="Edit a Task" />
			</form>
		</div>
		<div>
			<form action="/deletetsk" id="linkId">
				<input type="submit" class="btn btn-danger" value="Delete a Task" />
			</form>
		</div>
		<div>
			<form action="/home" id="linkId">
				<input type="submit" class="btn btn-danger" value="Log Out" />
			</form>
		</div>
	</div>
</body>
</html>