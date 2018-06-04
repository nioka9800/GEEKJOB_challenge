<%-- 
    Document   : 8-2
    Created on : 2018/06/04, 10:36:21
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
            int n = 1000;
            while(n<=100==false){
                n/=2;
            }
            out.print(n);
        %>    
    </body>
</html>
