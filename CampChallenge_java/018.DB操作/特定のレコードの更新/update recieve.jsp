<%-- 
    Document   : update recieve
    Created on : 2018/08/07, 11:27:53
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
            Connection c = null;
            PreparedStatement ps = null;
            PreparedStatement ps2 = null;
            ResultSet rs = null;
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/TASK?serverTimezone=JST", "GEEKJOB", "password");
                ps = c.prepareStatement("update profiles set name = ?, age = ?, tel = ?, birthday = ? where profilesID = ?");
                ps.setString(1,request.getParameter("name"));
                ps.setByte(2,Byte.parseByte(request.getParameter("age")));
                ps.setString(3, request.getParameter("tel"));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                ps.setDate(4, new java.sql.Date(sdf.parse(request.getParameter("birthday")).getTime()));
                ps.setByte(5, Byte.parseByte(request.getParameter("profilesID")));
                int result = ps.executeUpdate();
                out.print(result + "行変更" + "<br>");

                ps2 = c.prepareStatement("select * from profiles");
                rs = ps2.executeQuery();
                while(rs.next()){
                    out.print(rs.getString("profilesID") + "<br>");
                    out.print(rs.getString("name") + "<br>");
                    out.print(rs.getString("age") + "<br>");
                    out.print(rs.getString("tel") + "<br>");
                    out.print(rs.getString("birthday") + "<br>");
                }
                c.close();
                ps.close();
                ps2.close();
                rs.close();
            }catch(SQLException sql_e){
                out.print("例外発生" + sql_e.toString());
            }catch(Exception e){
                out.print("例外発生" + e.toString());
            }
        %>
    </body>
</html>
