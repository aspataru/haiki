<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!-- TODO add templates -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Haiki hikes</title>
</head>
<link rel='stylesheet' href='/webjars/bootstrap/3.1.0/css/bootstrap.min.css'>
<link rel='stylesheet' href='/webjars/bootstrap/3.1.0/js/bootstrap.min.js'>

<body>
	<!-- commandName = backing object -->
	<form:form commandName="hike">
		<table>
			<tr>
				<td>Hike title</td>
				<td><form:input path="name" /></td>
				<td>Hike description</td>
				<td><form:input path="description" /></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>

	</form:form>
	<h1>Haiki hikes</h1>
	<%-- 	<p>${hikeList.hikes[0].name}</p> --%>
	<%-- 	<p>${hikeList.hikes[0].description}</p> --%>
	<%-- 	<p>${hikeList.hikes[1].name}</p> --%>
	<%-- 	<p>${hikeList.hikes[1].description}</p> --%>
	<table>
	<c:forEach items="${hikeList.hikes}" var="element">
		<tr>
			<td>${element.name}</td>
			<td>${element.description}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>