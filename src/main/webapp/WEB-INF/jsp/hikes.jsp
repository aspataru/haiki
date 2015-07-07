<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Haiki hikes</title>
</head>
<body>
	<!-- commandName = backing object -->
	<form:form commandName="hike">
		<table>
			<tr>
				<td>Enter hike name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enter hike name"></td>
			</tr>
		</table>

	</form:form>
	<h1>Haiki hikes</h1>
	<p>${hikeList.hikes[0].name}</p>
	<p>${hikeList.hikes[0].description}</p>
	<p>${hikeList.hikes[1].name}</p>
	<p>${hikeList.hikes[1].description}</p>
</body>
</html>