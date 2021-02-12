<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <c:out value="Exemplo de JSTL" />
    
    <c:set var="aluno" value="${param.nome}"  />
    <br/>
    <c:out value="${aluno }">
    		Nenhum nome informado
    </c:out>