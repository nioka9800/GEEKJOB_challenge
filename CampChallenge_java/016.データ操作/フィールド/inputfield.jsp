<%-- 
    Document   : inputfield
    Created on : 2018/07/23, 15:27:45
    Author     : guest1Day
--%>
<%@ page import= "javax.servlet.RequestDispatcher" %>
<%@ page import="java.io.IOException" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%
    HttpSession hs = request.getSession();
    String name = (String)hs.getAttribute("Data");
    String sex = (String)hs.getAttribute("Data2");
    String hobby = (String)hs.getAttribute("Data3");
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action = "./inputfield" method = post>
            <p>name: <br>
                <input type="text" size="20" name="name" value="<% if(name!=null){out.print(name);} %>" > <br>
            <p>sex: <br>
                male<input type="radio" name="sex"  value="<% if(sex!=null){out.print(sex);} %>" > <br>
                female<input type="radio" name="sex"  value="<% if(sex!=null){out.print(sex);} %>" > <br>
            <p>hobby: <br> 
                <textarea name="hobby" rows="3" cols="30" value="<% if(hobby!=null){out.print(hobby);} %>" > </textarea> <br>

                <input type="submit" value="send"> 
        </form>
    </body>
</html>
