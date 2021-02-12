<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<jsp:useBean id="carro" class="com.ead.javabeans.Automovel"></jsp:useBean>

<jsp:setProperty property="marca" name="carro" value="Fiat" />
<jsp:setProperty property="modelo" name="carro" value="Siena" />
<jsp:setProperty property="ano" name="carro" value="2010" />

<h1>Dados do veículo</h1>

<p>
Marca: <jsp:getProperty property="marca" name="carro"/><br/>
Modelo: <jsp:getProperty property="modelo" name="carro"/><br/>
Ano: <jsp:getProperty property="ano" name="carro"/><br/>

<b><jsp:getProperty property="mensagem" name="carro"/></b>

</p>

