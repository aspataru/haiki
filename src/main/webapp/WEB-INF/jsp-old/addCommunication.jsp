<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add communication</title>

<style>
.error {
	color: #ff0000
}

.errorBlock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>

</head>
<body>

	<!-- commandName = backing object -->
	<form:form commandName="communication">
		<!-- path asterisk = any error -->
		<form:errors path="*" cssClass="errorBlock" element="div"/>
		<table>
			<tr>
				<td>Enter communication title</td>
				<td><form:input path="title" cssErrorClass="error"/></td>
				<td><form:errors path="title" cssClass="error"/></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit"
					value="Enter communication title"></td>
			</tr>
		</table>

	</form:form>

</body>
</html>