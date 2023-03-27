<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alterar-empresa" var="linkServletNovaEmpresa"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Alterando empresa</h1>
        
        <form action="${linkServletNovaEmpresa}" method="POST">
            
            <label for="name">Nome da Empresa</label>
            <input type="text" name="name" value="${empresa.getNome()}"/>
            
            <label for="dtCadastro">Data do cadastro</label>
            <input type="text" name="dtCadastro" value="<fmt:formatDate value="${empresa.getData()}" pattern="dd/MM/yyyy"/>"/>
            <input type="hidden" name="id" value="${empresa.getId()}">
            
            <input type="submit" value="Enviar" />
            
        </form>
    </body>
</html>
