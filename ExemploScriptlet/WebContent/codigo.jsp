<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (request.getMethod().equals("POST")) {
		String cpf = request.getParameter("cpf");
		out.print("Você informou o CPF: " + cpf);
		out.print("<br/");
	} else {
	%>
	<form action="" method="post">
		Informar o CPF: <input type="text" name="cpf" size="15"> <input
			type="submit" value="Enviar">
	</form>
	<%
	}
	%>
</body>
</html>