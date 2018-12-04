<%@page import="negocio.Emprestimo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
<meta charset="ISO-8859-1">
<title>Clientes Lista</title>
</head>
<body>
	<% 
	List<Emprestimo> emprestimos = (List<Emprestimo>)request.getAttribute("emprestimos");
	%>
	
	<h3>Empréstimos</h3>
	
	<%if(emprestimos != null) {%>	
	<table border="1">
		<tr>
			<th width="150">Forma de Pagamento</th>
						
		</tr>
		<%for(Emprestimo c : emprestimos) {%>		
		<tr>
			<td align="center"><%=c.getFormaDePagamento()%></td>
								
						
			<td align="center">
				<form action="AppController" method="post">
					<input type="hidden" name="id" value="<%=c.getId()%>">
					<input type="submit" value="Alterar">
				</form>
				<form action="EmprestimoController" method="post">
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