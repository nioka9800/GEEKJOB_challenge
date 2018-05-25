<%-- 
    Document   : 3-1
    Created on : 2018/05/25, 15:55:31
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int hen = 13;
            final int tei = 17;
            out.print(hen+tei);
            
            
            out.print(hen-tei);
            out.print(hen*tei);
            out.print(hen/tei);
            out.print(hen%tei);
            
        %>
                    
    </body>
</html>
