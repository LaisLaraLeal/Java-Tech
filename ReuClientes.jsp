<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import = "model.Cliente"%>
<%@page import = "java.util.ArrayList"%>
<% 
ArrayList<Cliente> lista= (ArrayList<Cliente>) request.getAttribute("Clientes"); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>


<div class="container">
<table class="table table-dark">
  <thead>
    <tr>
					<th scope="col">Código</th>
					<th scope="col">Data</th>
					<th scope="col">Cliente</th>
					<th scope="col">Opções</th>
				</tr>
  </thead>
  
  <tbody>
  
  <%
  for(int i=0;i<lista.size();i++){
  %>

				<tr>
					<td><%=lista.get(i).getIdcliente()%></td>
					<td><%=lista.get(i).getNome()%></td>
					<td><%=lista.get(i).getTelefone()%></td>
					<td><a href="">Editar</a>
					&nbsp;|&nbsp;
					<a href="">Apagar</a>
					
					</td>
				</tr>

				<%
				}
				%>
   
  </tbody>
</table>
</div>

<!-- JavaScript (Opcional) -->
    <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>

</html>