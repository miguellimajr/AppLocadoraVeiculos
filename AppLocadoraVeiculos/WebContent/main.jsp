<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
</head>
<body>

	<form action="AppController" method="get">
	<input type ="hidden" name ="tela" value="clienteLista.jsp">
	<input type="submit" value="Cliente">	
	</form>
		
	<form action="AppController" method="get">
	<input type="submit" value="Caminhão">
	<input type ="hidden" name ="tela" value="caminhaoLista.jsp"></form>
		
	<form action="AppController" method="get">
	<input type="submit" value="Carro de Passeio">
	<input type ="hidden" name ="tela" value="passeioLista.jsp"></form>
	
	<form action="AppController" method="get">
	<input type="submit" value="Empréstimo">
	<input type ="hidden" name ="tela" value="emprestimoLista.jsp"></form>
		
	<form action="AppController" method="get">
	<input type="submit" value="Garagem">
	<input type ="hidden" name ="tela" value="garagemLista.jsp"></form>




</body>
</html>