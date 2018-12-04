<%@page import="negocio.Passeio"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
<meta charset="ISO-8859-1">
<title>Caminhão Lista</title>
</head>
<body>
	<% 
	List<Passeio> carros = (List<Passeio>)request.getAttribute("caminhoes");
	%>
	
	<h3>Caminhões</h3>
	
	<%if(carros != null) {%>	
	<table border="1">
		<tr>
			<th width="150">Nome</th>
			<th width="150">Placa</th>
			<th width="75">Marca</th>
			<th width="75">Modelo</th>
			<th width="75">Ano</th>
			<th width="75">Valor do Carro</th>
			<th width="75">Valor do Seguro</th>
			<th width="75">Tipo de Teto</th>
			<th width="75">Tipo de Banco</th>
			<th width="75">Rádio</th>
		</tr>
		<%for(Passeio c : carros) {%>		
		<tr>
			<td align="center"><%=c.getNome()%></td>
			<td align="center"><%=c.getPlaca()%></td>
			<td align="center"><%=c.getMarca()%></td>
			<td align="center"><%=c.getModelo()%></td>
			<td align="center"><%=c.getAno()%></td>
			<td align="center"><%=c.getValorCarro()%></td>
			<td align="center"><%=c.getSeguro()%></td>
			<td align="center"><%=c.getTipoDeTeto()%></td>
			<td align="center"><%=c.getTipoDeBanco()%></td>
			<td align="center"><%=c.getRadio()%></td>				
			
							
						
			<td align="center">
				<form action="AppController" method="post">
					<input type="hidden" name="id" value="<%=c.getId()%>">
					<input type="submit" value="Alterar">
				</form>
				<form action="UsuarioController" method="post">
					<input type="hidden" name="id" value="<%=c.getId()%>">
					<input type="submit" value="Excluir">
				</form>
			</td>
		</tr>
		<%}%>
	</table>
	<%}%>
</body>
	
	



</body>
</html>