/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.corba.se.impl.protocol.giopmsgheaders.AddressingDispositionHelper;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
@WebServlet(urlPatterns = {"/method8"})
public class method8 extends HttpServlet {
public String[] user_profile(String a){
        

    String[] profA = {"1","技育太郎","東京","男","プログラマー"};
    String[] profB = {"2","技育花子","北海道","女","システムエンジニア"};
    String[] profC = {"3","技育三郎","大阪","男","Webエンジニア"}; 
    
    if(a.equals(profA[0])){
        return profA;
    }else if(a.equals(profB[0])){
        return profB;
    }else if(a.equals(profC[0])){
        return profC;
    }else{
        return null;
    }
    
    
    }
    
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
        
            String[] a = user_profile("1");
            String[] b = user_profile("2");
            String[] c = user_profile("3");
            for (String string : a) {
                if (string == a[0]) {
                    continue;
                }
                out.print(string);
            }
            out.print("<br>");
            for (String string : b) {
                if(string == b[0]){
                    continue;
                }
                out.print(string);
            }
            out.print("<br>");
            for (String string : c) {
                if (string == c[0]) {
                    continue;
                }
                out.print(string);
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
