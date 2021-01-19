<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringRest</title>
</head>
<body>
<h2>Spring Rest - API's</h2>

<hr>
<a href="test/rest">Hello - without forward slash</a>

<hr>
<a href="${pageContext.request.contextPath}/test/rest">Hello - with forward slash</a>

<hr>
<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>

</body>
</html>