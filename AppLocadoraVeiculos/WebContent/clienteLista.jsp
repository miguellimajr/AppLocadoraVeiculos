<%@page import="java.util.ArrayList"%>
<%@page import="negocio.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/estilos.css">
<title>Clientes Lista</title>
</head>
<body>
	<% 
// 	List<Cliente> clientes = (List<Cliente>)request.getAttribute("clientes");
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	clientes.add(new Cliente(1, "123", "nome", "12345678", "rua tal", 10, 100f));
	clientes.add(new Cliente(1, "123", "nome", "12345678", "rua tal", 10, 100f));
	clientes.add(new Cliente(1, "123", "nome", "12345678", "rua tal", 10, 100f));
	clientes.add(new Cliente(1, "123", "nome", "12345678", "rua tal", 10, 100f));
	%>
	
	<h3>Clientes</h3>
	
	<%if(clientes != null) {%>	
	<table border="1">
		<tr>
			<th width="150">Nome</th>
			<th width="150">CPF</th>
			<th width="75">Telefone</th>
			<th width="75">Endereço</th>
			<th width="75">Idade</th>
			<th width="75">Renda Mensal</th>			
		</tr>
		<%for(Cliente c : clientes) {%>		
		<tr>
			<td align="center"><%=c.getNome()%></td>
			<td align="center"><%=c.getCpf()%></td>
			<td align="center"><%=c.getTelefone()%></td>
			<td align="center"><%=c.getEndereco()%></td>
			<td align="center"><%=c.getIdade()%></td>
			<td align="center"><%=c.getRendaMensal()%></td>							
						
			<td align="center">
				<form action="AppController" method="post">
					<input type="hidden" name="id" value="<%=c.getId()%>">
					<input type="submit" value="Alterar">
				</form>
				<form action="ClienteController" method="post">
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