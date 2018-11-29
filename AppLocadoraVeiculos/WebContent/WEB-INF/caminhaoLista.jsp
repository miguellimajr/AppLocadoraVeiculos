<%@page import="negocio.Caminhao"%>
<%@page import="negocio.Caminhao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Caminhão Lista</title>
</head>
<body>
	<% 
	List<Caminhao> caminhoes = (List<Caminhao>)request.getAttribute("caminhoes");
	%>
	
	<h3>Caminhões</h3>
	
	<%if(caminhoes != null) {%>	
	<table border="1">
		<tr>
			<th width="150">Nome</th>
			<th width="150">Placa</th>
			<th width="75">Marca</th>
			<th width="75">Modelo</th>
			<th width="75">Ano</th>
			<th width="75">Valor do Carro</th>
			<th width="75">Valor do Seguro</th>
			<th width="75">Quantidade de Eixos</th>
			<th width="75">Tipo de Caçamba</th>
		</tr>
		<%for(Caminhao c : caminhoes) {%>		
		<tr>
			<td align="center"><%=c.getNome()%></td>
			<td align="center"><%=c.getPlaca()%></td>
			<td align="center"><%=c.getMarca()%></td>
			<td align="center"><%=c.getModelo()%></td>
			<td align="center"><%=c.getAno()%></td>
			<td align="center"><%=c.getValorCarro()%></td>
			<td align="center"><%=c.getSeguro()%></td>
			<td align="center"><%=c.getEixos()%></td>
			<td align="center"><%=c.getTipoCacamba()%></td>					
						
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