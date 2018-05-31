<%-- 
    Document   : 8-1-2
    Created on : 2018/05/28, 17:23:45
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
            String a = "A";
            int total=0;
            for(int i=0;i<30;i++){
                out.print(a);
            }
        %>
        
    </body>
</html>
