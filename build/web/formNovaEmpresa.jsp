<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/nova-empresa" var="linkServletNovaEmpresa"/>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <form action="${linkServletNovaEmpresa}" method="POST">
            <label for="name">Nome da Empresa</label>
            <input type="text" name="name"/>
            
            <label for="dtCadastro">Data do cadastro</label>
            <input type="text" name="dtCadastro"/>
            <input type="submit" value="Enviar" />
            
        </form>
    </body>
</html>
