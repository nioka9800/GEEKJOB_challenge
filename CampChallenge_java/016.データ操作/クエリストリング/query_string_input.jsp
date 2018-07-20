<%-- 
    Document   : query_string_input
    Created on : 2018/07/19, 16:04:06
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
        <form action="./query_string_output.jsp" method="get">
        <p>購入した商品の総量:
            <input type="text" name="total" size="3"><br>
        <p>購入した商品の数量:
            <input type="text" name="count" size="3"><br>
        <p>商品種別:<br>
            1<input type="radio" name="type" value="雑貨"><br>
            2<input type="radio" name="type" value="生鮮食品"><br>
            3<input type="radio" name="type" value="その他"><br>
            
            <input type="submit" value="send">
        </form>
    </body>
</html>
