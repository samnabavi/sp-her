<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<style>
div {
	margin-bottom: 10px;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<p>Welcome ${correctemp.name}!!</p>


	<div>
		<form action="/addtsk">
			<input type="submit" class="btn btn-danger" value="Add a New Task" />
		</form>
	</div>
	<div margin-up=30px;>
		<form action="/listtsk">
			<input type="submit" class="btn btn-danger" value="See All Tasks" />
		</form>
	</div>
	<div>
		<form action="edittsk" margin-up=30px;>
			<input type="submit" class="btn btn-danger" value="Edit a Task" />
		</form>
	</div>
	<div>
		<form action="deletetsk">
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