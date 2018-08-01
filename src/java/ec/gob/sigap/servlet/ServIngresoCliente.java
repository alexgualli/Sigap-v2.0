/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.servlet;

import ec.gob.sigap.entidades.Cliente;
import ec.gob.sigap.entidades.Deuda;
import ec.gob.sigap.implementacion.ImpCliente;
import ec.gob.sigap.implementacion.ImpDeuda;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paul
 */
public class ServIngresoCliente extends HttpServlet {

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
            String nombre = request.getParameter("txtnombre");
            String apellido = request.getParameter("txtapellido");
            String direccion = request.getParameter("txtdireccion");
            String cedula = request.getParameter("txtcedula");
            String correo = request.getParameter("txtcorreo");
            String fechaNac = request.getParameter("txtfechanac");
            String telefono = request.getParameter("txttelefono");
            int edad = Integer.parseInt(request.getParameter("txtedad"));
            int codigdis = Integer.parseInt(request.getParameter("txtcodis"));
            int codigodeu = 0;
            
            ImpCliente impcliente = new ImpCliente();
            ImpDeuda impDeuda = new ImpDeuda();
            
            Cliente cliente = new Cliente();
            Cliente cliente2 = new Cliente();
            Deuda deuda = new Deuda();
       
            cliente.setApellido(apellido);
            cliente.setCedula(cedula);
            cliente.setCodigoDis(codigdis);
            cliente.setDireccion(direccion);
            cliente.setFechaNac(fechaNac);
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setEdad(edad);
            
            if(correo!=""){
                cliente.setCorreo(correo);                
            }
            else{
                cliente.setCorreo(cedula+"@sigap.com");                
            }     
            
            if(telefono!=""){
                cliente.setTelefono(telefono);                
            }
            else{
                cliente.setTelefono("1111111111");                
            }  
            
            try {                
                impcliente.insertar(cliente);                 
            } catch (Exception ex) {
                Logger.getLogger(ServIngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try {
                cliente2=impcliente.obtenerCed(cedula);                     
                codigodeu=cliente2.getCodigo();
                deuda.setCodigo(codigodeu);
                deuda.setCliente(cliente2);
                impDeuda.insertar(deuda);
            } catch (Exception ex) {
                Logger.getLogger(ServIngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            request.getRequestDispatcher("FormularioCliente.jsp").forward(request, response);
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
