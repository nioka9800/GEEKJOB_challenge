<%-- 
    Document   : query_string_output
    Created on : 2018/07/19, 16:55:30
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
            out.print(request.getParameter("total"));
            out.print("円");
            out.print("<br>");
            out.print(request.getParameter("count"));
            out.print("個");
            out.print("<br>");
            out.print(request.getParameter("type"));
            
            Double per = Double.parseDouble(request.getParameter("total")) / Double.parseDouble(request.getParameter("count"));
            out.print("単価は" + per + "円");
            
            out.print("<br>");
            
            if(Double.parseDouble(request.getParameter("total")) >= 5000){
                out.print(Double.parseDouble(request.getParameter("total")) * 0.05 + "ptプレゼント！");
            }else if(Double.parseDouble(request.getParameter("total")) >= 3000){
                out.print(Double.parseDouble(request.getParameter("total")) * 0.04 + "ptプレゼント！");
            }
        %>
    </body>
</html>
