<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="modelo.IMC" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultados</title>
</head>
	<body>

	<%
		IMC m=(IMC) request.getAttribute("ResultIMC");
	%>
	
		<h1>Prueba de que funciona la página de resultados</h1>
		
		El peso <%= m.getPeso() %> kg y la altura de <%= m.getAltura()%> m dan un IMC de <%= m.getImc()%><br><br>
		
		
		<a href="index.jsp"> Volver a capturar datos </a>
	</body>
</html>