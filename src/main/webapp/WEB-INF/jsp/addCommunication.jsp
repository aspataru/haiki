<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add communication</title>
</head>
<body>

	<!-- commandName = backing object -->
	<form:form commandName="communication">
		<table>
			<tr>
				<td>Enter communication title</td>
				<td><form:input path="title" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="Enter communication title"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>