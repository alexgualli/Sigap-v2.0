/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.servlet;

import ec.gob.sigap.entidades.Usuario;
import ec.gob.sigap.implementacion.ImpUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author paul
 */
public class ServLogeo extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
             HttpSession sesion = request.getSession();//crear sesion
            
             String nombre=request.getParameter("txtnombre");
            String pass=request.getParameter("txtclave");
                 
            ImpUsuario impusuario = new ImpUsuario();
            Usuario usuario= new Usuario();
               
            try {
                usuario=impusuario.obtenerLogin(nombre, pass);
                int nivel= usuario.getNivel();
                
            switch(nivel){
                case 1:{
                    sesion.setAttribute("nombre", nombre);
                    sesion.setAttribute("password", pass);
                    sesion.setAttribute("nivel", nivel);
                    
                    request.getRequestDispatcher("FormularioPrincipal.jsp").forward(request, response);
            
                    break;
                }
                case 2:{
                    sesion.setAttribute("nombre", nombre);
                    sesion.setAttribute("password", pass);
                    sesion.setAttribute("nivel", nivel);
                    
                    request.getRequestDispatcher("FormularioPrincipal_1.jsp").forward(request, response);
                 
                    
                    break;
                }
                default:{
                    String error="Credenciales incorrectas";
                    request.getSession().setAttribute("error", error);
                    
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                
                    break;
                }
            }
             
            } catch (Exception ex) {
                Logger.getLogger(ServLogeo.class.getName()).log(Level.SEVERE, null, ex);
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
