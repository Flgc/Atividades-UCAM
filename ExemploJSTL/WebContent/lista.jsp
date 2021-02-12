<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:out value="Exemplo de JSTL" />

<c:set var="aluno" value="${param.nome}" />
<br />
<c:out value="${aluno }">
    		Nenhum nome informado
    </c:out>

<jsp:useBean id="carro" class="com.ead.javabeans.Automovel" />

<h1>Lista de Veículos</h1>

<c:forEach var="item" items="${carro.listaVeiculos}">
    Marca: <c:out value="${item.marca}" />
	<br />
    Modelo: <c:out value="${item.modelo}" />
	<br />
    Ano: <c:out value="${item.ano}" />
	<br />
	<br />
</c:forEach>