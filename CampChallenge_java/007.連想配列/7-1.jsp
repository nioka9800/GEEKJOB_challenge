<%-- 
    Document   : 7-1
    Created on : 2018/05/28, 15:51:36
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
        <%@page import = "java.util.HashMap"%>
        <%
            HashMap<String,String> task1 = new HashMap<String,String>();
            HashMap<String,String> task2 = new HashMap<String,String>();
            HashMap<String,String> task3 = new HashMap<String, String>();
            HashMap<String,String> task4 = new HashMap<String, String>();
           task1.put("1","AAA");
           task2.put("hello","world");
           task3.put("soeda", "33");
           task4.put("20","20");
           out.print(task1);
        %>    
            
    </body>
</html>
