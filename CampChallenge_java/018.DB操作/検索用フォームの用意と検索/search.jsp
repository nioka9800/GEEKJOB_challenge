<%-- 
    Document   : search
    Created on : 2018/08/06, 13:07:07
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            Connection db_c = null;
            PreparedStatement db_ps = null;
            ResultSet db_rs = null;
            try{
    //          Class.forNameメソッドでlibファイル内にあるmysql用のjdbcドライバのインスタンス生成  
                Class.forName("com.mysql.jdbc.Driver").newInstance();
    //          データベースに接続  
                db_c = DriverManager.getConnection("jdbc:mysql://localhost:3306/TASK?serverTimezone=JST","GEEKJOB","password");
    //          prepareStatementメソッドで実行するSQL文を記述
                db_ps = db_c.prepareStatement("select * from profiles where name = ?");
                db_ps.setString(1, request.getParameter("name"));
                db_rs = db_ps.executeQuery();
//              nextメソッドでデータ分while文を回す  
                while(db_rs.next()){
                    out.print(db_rs.getString("profilesID") + "<br>");
                    out.print(db_rs.getString("name") + "<br>");
                    out.print(db_rs.getString("age") + "<br>");
                    out.print(db_rs.getString("tel") + "<br>");
                    out.print(db_rs.getString("birthday") + "<br>");
                }
//              closeメソッドでデータ保存  
                db_c.close();
                db_ps.close();
                db_rs.close();
//              例外処理     
            }catch(SQLException sql_e){
                out.print("例外発生" + sql_e.toString());
            }catch(Exception e){
                out.print("例外発生" + e.toString());
            }
        %>
    </body>
</html>
