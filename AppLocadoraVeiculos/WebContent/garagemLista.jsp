<%@page import="negocio.Garagem"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/estilos.css">
<meta charset="ISO-8859-1">
<title>Garagem Lista</title>
</head>
<body>
	<% 
	List<Garagem> garagens = (List<Garagem>)request.getAttribute("garagem");
	%>
	
	<h3>Garagem</h3>
	
	<%if(garagens != null) {%>	
	<table border="1">
		<tr>
			<th width="150">Forma de Pagamento</th>
						
		</tr>
		<%for(Garagem c : garagens) {%>		
		<tr>
											
						
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