<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servelet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Empresas</title>
    </head>
    
    <body>
        <c:if test="${not empty empresa.nome}">
            <h1>empresa ${ empresa.nome } cadastrada com sucesso</h1>
        </c:if> 
            
        <h1>Empresas cadastradas</h1>
        <ul>
        <c:forEach items="${empresas}" var="empresa">
            
            <li>
                ${empresa.nome} - Data Abertura: <fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/> 
                <a href="/gerenciador/remove-empresa?id=${empresa.id}">Excluir</a>
                <a href="/gerenciador/mostrar-empresa?id=${empresa.id}">Editar</a>
            </li> <!<!-- empresa.getNome() -->
        </c:forEach>
        </ul>
    </body>
</html>
