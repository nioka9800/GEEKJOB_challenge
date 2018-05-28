<%-- 
    Document   : 6-4-2
    Created on : 2018/05/28, 14:20:54
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
        <%@page import = "java.util.ArrayList"%>
        <%
            ArrayList<String>datas=new ArrayList<String>();
            datas.add("10");
            datas.add("100");
            datas.add("soeda");
            datas.add("hayashi");
            datas.add("-20");
            datas.add("118");
            datas.add("END");
            datas.set(3,"33");
            out.print(datas.get(3));
        %>            
    </body>
</html>
