<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%= response.encodeURL("validacao") %>"  method="post">
		Usu�rio: <input type="text" name="nome" size="10"><br />
		Senha: <input type="password" name="senha" size="10"><br />
		<input type="submit" value="Enviar">
	</form>
</body>
</html>