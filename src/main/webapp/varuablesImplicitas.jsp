<%-- 
    Document   : varuablesImplicitas
    Created on : 9/09/2024, 8:36:55 p. m.
    Author     : SUA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EL y variables implicitas</h1>
        
        <ul>
            <li>nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente: ${header["user-agent"]}</li>
            <li> ${cookie.JSESSIONID.value}</li>
            <li>web server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro: ${param.usuario}</li>
        </ul>
    </body>
</html>
