<%@  taglib  prefix = "form"  uri = "http://www.springframework.org/tags/form"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuarios</title>
</head>
<body>
	<h1>Listado de usuarios</h1>
	<p>Rol a buscar: ${rol}</p>
	
	<h3>Listado</h3>
	<p>${error } </p>
	<c:forEach items="${usuarios}" var="user">
		<p>${user.email} - ${user.rol} </p>
	</c:forEach>
</body>
</html>