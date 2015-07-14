<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<c:set var="context" value="${pageContext.request.contextPath}" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Haiki hikes</title>
<!-- Bootstrap core CSS -->
<link rel='stylesheet'
	href="${context}/webjars/bootstrap/3.1.0/css/bootstrap.min.css">
</head>

<body>

	<div class="container">
		<h1>Add hike</h1>
		<!-- commandName = backing object -->
		<form:form commandName="hike">
			<div class="form-group">
				<label>Title</label>
				<form:input path="title" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Description</label>
				<form:textarea path="description" class="form-control" />
			</div>
			<button type="submit" class="btn btn-default">Add</button>
		</form:form>

		<hr class="featurette-divider">

		<h1>Remove hike</h1>
		<form:form method="DELETE" commandName="hike" class="form-inline">
			<p class="help-block">Delete some hike with this title</p>
			<div class="form-group">
				<label>Title</label>
				<form:input path="title" class="form-control" />
			</div>
			<button type="submit" class="btn btn-default">Remove</button>
		</form:form>

		<hr class="featurette-divider">

		<h1>All hikes</h1>
		<table class="table">
			<c:forEach items="${hikeList.hikes}" var="element">
				<tr>
					<td>${element.title}</td>
					<td>${element.description}</td>
				</tr>
			</c:forEach>
		</table>

		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<!-- 	<script type="text/javascript" src="jquery-1.8.3.js"></script> -->

		<script src="${context}/webjars/bootstrap/3.1.0/js/bootstrap.min.js"></script>
		<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
		<!-- 	<script src="../../assets/js/vendor/holder.min.js"></script> -->
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<!-- 	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
	</div>
</body>
</html>