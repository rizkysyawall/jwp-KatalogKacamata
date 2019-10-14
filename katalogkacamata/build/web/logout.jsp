<%-- 
    Document   : logout
    Created on : 18-Dec-2017, 23:43:40
    Author     : rizky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%session.invalidate();%>
        <meta http-equiv="refresh" content="0; url=login" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
    </body>
</html>
