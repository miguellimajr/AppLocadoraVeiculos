<%@page import="negocio.Emprestimo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalhe do Empréstimo</title>
</head>
<body>

	<%
	Emprestimo c = (Emprestimo)request.getAttribute("emprestimo");
	%>

	<form action="EmprestimoController" method="post">
		<input type="submit" value="Cadastrar">
		
		<hr>
		
		<h3>Forma de Pagamento</h3>
		<input type="text" name="nome" value="<%=c.getFormaDePagamento()%>">		
		
	</form>
</body>
</html>