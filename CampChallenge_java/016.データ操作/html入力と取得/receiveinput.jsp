<%-- 
    Document   : receiveinput
    Created on : 2018/07/18, 15:08:37
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
        request.setCharacterEncoding("UTF-8");
        out.print(request.getParameter("name"));
        out.print("<br>");
        out.print(request.getParameter("sex"));
        out.print("<br>");
        out.print(request.getParameter("hobby"));
        %>
    </body>
</html>
