<%@page import="negocio.Caminhao"%>
<%@page import="negocio.Passeio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalhe do Carro de Passeio</title>
</head>
<body>

	<%
	Passeio c = (Passeio)request.getAttribute("passeio");
	%>

	<form action="PasseioController" method="get">
		<input type="submit" value="Cadastrar">
		
		<hr>
		
		<h3>Nome</h3>
		<input type="text" name="nome" value="<%=c.getNome()%>">
		
		<h3>Placa</h3>
		<input type="text" name="placa" value="<%=c.getPlaca()%>">
		
		<h3>Marca</h3>
		<input type="text" name="marca" value="<%=c.getMarca()%>">
		
		<h3>Modelo</h3>
		<input type="text" name="modelo" value="<%=c.getModelo()%>">
		
		<h3>Ano</h3>
		<input type="text" name="ano" value="<%=c.getAno()%>">
		
		<h3>Valor do Carro</h3>
		<input type="text" name="valor" value="<%=c.getValorCarro()%>">
		
		<h3>Valor do Seguro</h3>
		<input type="text" name="seguro" value="<%=c.getSeguro()%>">
		
		<h3>Tipo de Teto</h3>
		<input type="text" name="teto" value="<%=c.getTipoDeTeto()%>">
		
		<h3>Tipo de Banco</h3>
		<input type="text" name="banco" value="<%=c.getTipoDeBanco()%>">
		
		<h3>R�dio</h3>
		<input type="text" name="radio" value="<%=c.getRadio()%>">
	</form>
</body>
</html>