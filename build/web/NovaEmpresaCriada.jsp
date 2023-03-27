<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <c:if test="${not empty empresa.nome}">
            <h1>empresa ${ empresa.nome } cadastrada com sucesso</h1>
        </c:if> 
        <c:if test="${empty empresa.nome}">
            <h1>Nenhuma empresa cadastrada com sucesso</h1>
        </c:if> 
    </body>
</html>
    