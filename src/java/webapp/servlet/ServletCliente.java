/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webapp.modelo.Consulta;
import webapp.modelo.Cliente;

/**
 *
 * @author diego
 */
public class ServletCliente extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String nit=request.getParameter("nit");
        String tel=request.getParameter("tel");
        String dir=request.getParameter("dir");
        int telefono= Integer.parseInt(tel);
        Cliente NuevoCliente = new Cliente();
        Boolean valor=NuevoCliente.AddCliente(nombre, apellido, nit, telefono, dir);
        if(valor){
            request.getSession().setAttribute("msj", "El cliente se gurado con exito");
        }else{
            request.getSession().setAttribute("msj", "Error! No fue posible crear cliente");

        }
        
            response.sendRedirect("template/cliente/index.jsp");

        
       // Consulta con = new Consulta();
       // con.Autenticacion(usuario, pass);
       // System.out.println(usuario+" "+pass);
        
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
            //Cliente AddCliente = new Cliente();
            //AddCliente.setNombre("nombre");
        } catch (SQLException ex) {
            Logger.getLogger(ServletCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
