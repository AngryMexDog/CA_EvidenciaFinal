<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="controlador.muestraIMC" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EVID FINAL</title>
	</head>
	
<body>

	<h1>ACIVIDAD FINAL DEL PROYECTO</h1>
	<%-- Código del segmento de las cookies--%>
	<br><br>
	
	<form action="muestraIMC" method="post">
	

		Peso: <br>
		<input type="text" name="peso" value=""><br>
		
		Altura: <br>
		<input type="text" name="altura" value=""><br>
		
		<input type="submit" value="Calcular">
	
	</form>
	
</body>
</html>