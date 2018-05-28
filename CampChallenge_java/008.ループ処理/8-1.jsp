<%-- 
    Document   : 8-1
    Created on : 2018/05/28, 17:01:15
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
            for(int i=1;i<20;i++){
            int a = i*8; 
            out.print(a);
            }
        %>            
            
    </body>
</html>
