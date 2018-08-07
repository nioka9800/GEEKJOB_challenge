<%-- 
    Document   : recieve form
    Created on : 2018/08/06, 14:02:59
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*"%>
<%@page import = "java.text.SimpleDateFormat"%>
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
            PreparedStatement db_ps2 = null;
            ResultSet db_rs = null;
//            例外が発生するプログラムなのでtry文
            try{
//                libファイル内にあるmysql用のjdbcドライバのインスタンス生成
                Class.forName("com.mysql.jdbc.Driver").newInstance();
//                データベースに接続
                db_c = DriverManager.getConnection("jdbc:mysql://localhost:3306/TASK?serverTimezone=JST","GEEKJOB","password");
//                実行するSQL文を記述
                db_ps = db_c.prepareStatement("insert into profiles(profilesID, name, age, tel, birthday) values(?,?,?,?,?)");
                db_ps.setByte(1, Byte.parseByte(request.getParameter("profilesID")));
                db_ps.setString(2, request.getParameter("name"));
                db_ps.setByte(3, Byte.parseByte(request.getParameter("age")));
                db_ps.setString(4, request.getParameter("tel"));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                db_ps.setDate(5, new java.sql.Date(sdf.parse(request.getParameter("birthday")).getTime()));
                int result = db_ps.executeUpdate();
                out.print(result + "行追加");
                db_ps2 = db_c.prepareStatement("select * from profiles");
                db_rs = db_ps2.executeQuery();
//                データがある分while文を回す
                while(db_rs.next()){
                    out.print(db_rs.getString("profilesID") + "<br>");
                    out.print(db_rs.getString("name") + "<br>");
                    out.print(db_rs.getString("age") + "<br>");
                    out.print(db_rs.getString("tel") + "<br>");
                    out.print(db_rs.getString("birthday") + "<br>");      
                }
                db_c.close();
                db_ps.close();
                db_ps2.close();
                db_rs.close();
            }catch(SQLException sql_e){
                out.print("例外発生" + sql_e.toString());
            }catch(Exception e){
                out.print("例外発生" + e.toString());
            }
        %>
    </body>
</html>
