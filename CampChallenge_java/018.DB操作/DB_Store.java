/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
@WebServlet(urlPatterns = {"/DB_Store"})
public class DB_Store extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try{
                Connection db_con = null;
                PreparedStatement db_st = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TASK?serverTimezone=JST","GEEKJOB","password");
                db_st = db_con.prepareStatement("insert into profiles(profilesID, name, tel, age, birthday) values (?,?,?,?,?)");
                db_st.setInt(1, 5);
                db_st.setString(2, "山田太郎");
                db_st.setString(3, "000-1111-2222");
                db_st.setInt(4, 55);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                db_st.setDate(5, new java.sql.Date(sdf.parse("1969-05-05").getTime()));
                int result = db_st.executeUpdate();
                out.print(result + "行を追加しました");
                db_con.close();
                db_st.close();
        
                }catch(SQLException sql_e){
                    out.print("例外が発生しました" + sql_e.toString());
                }catch(Exception e){
                    out.print("例外が発生しました" + e.toString());
                }
            }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
