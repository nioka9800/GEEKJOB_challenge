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

/**
 *
 * @author guest1Day
 */
@WebServlet(urlPatterns = {"/DB_Disp"})
public class DB_Disp extends HttpServlet {

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
                Connection db_c = null;
                PreparedStatement db_ps = null;
                ResultSet db_r = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_c = DriverManager.getConnection("jdbc:mysql://localhost:3306/TASK?serverTimezone=JST","GEEKJOB","password");
                db_ps = db_c.prepareStatement("select * from profiles");
                db_r = db_ps.executeQuery();
                while(db_r.next()){
                    out.print(db_r.getString("profilesID") + "<br>");
                    out.print(db_r.getString("name") + "<br>");
                    out.print(db_r.getString("tel") + "<br>");
                    out.print(db_r.getString("age") + "<br>");
                    out.print(db_r.getString("birthday") + "<br>");
                }
                }catch(SQLException sql_e){
                    out.print("例外発生" + sql_e.toString());
                }catch(Exception e){
                    out.print("例外発生" + e.toString());
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
