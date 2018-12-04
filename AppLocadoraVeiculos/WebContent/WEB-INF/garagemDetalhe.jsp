<%@page import="negocio.Garagem"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalhe da Garagem</title>
</head>
<body>

	<%
	Garagem c = (Garagem)request.getAttribute("garagem");
	%>

	<form action="GaragemController" method="post">
		<input type="submit" value="Cadastrar">
		
		<hr>
		
				
		
	</form>
</body>
</html>