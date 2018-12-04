<%@page import="negocio.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalhe do Cliente</title>
</head>
<body>

	<%
	Cliente c = (Cliente)request.getAttribute("cliente");
	%>

	<form action="ClienteController" method="post">
		<input type="submit" value="Cadastrar">
		
		<hr>
		
		<h3>Nome</h3>
		<input type="text" name="nome" value="<%=c.getNome()%>">
		
		<h3>CPF</h3>
		<input type="text" name="cpf" value="<%=c.getCpf()%>">
		
		<h3>Telefone</h3>
		<input type="text" name="telefone" value="<%=c.getTelefone()%>">
		
		<h3>Endereço</h3>
		<input type="text" name="endereco" value="<%=c.getTelefone()%>">
		
		<h3>Idade</h3>
		<input type="text" name="idade" value="<%=c.getIdade()%>">
		
		<h3>Renda</h3>
		<input type="text" name="renda" value="<%=c.getRendaMensal()%>">
	</form>
</body>
</html>