<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servelet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Empresas</title>
    </head>
    
    <body>
        <h1>Empresas cadastradas</h1>
        <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li> ${empresa.nome}</li> <!<!-- empresa.getNome() -->
        </c:forEach>
        </ul>
    </body>
</html>
