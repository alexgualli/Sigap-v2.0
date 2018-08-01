/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.servlet;

import ec.gob.sigap.entidades.Consumo;
import ec.gob.sigap.entidades.Medidor;
import ec.gob.sigap.implementacion.ImpConsumo;
import ec.gob.sigap.implementacion.ImpMedidor;
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
public class ServIngresoConsumo extends HttpServlet {

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
            int lecturaanterior = Integer.parseInt(request.getParameter("txtlecturaanterior"));

            int lecturaactual = Integer.parseInt(request.getParameter("txtlecturaactual"));
            int consumo = Integer.parseInt(request.getParameter("txtconsumo"));
            String fechaemision = request.getParameter("txtfechaemision");

            String medidor = request.getParameter("txtmedidor");
        

            ImpConsumo imp = new ImpConsumo();
            Consumo consum = new Consumo();
            ImpMedidor impmed = new ImpMedidor();
            Medidor medid = new Medidor();
            medid.setCodigo(medidor);
            Medidor codmed = medid;
            consum.setLecturaAct(lecturaactual);
            consum.setLecturaAnt(lecturaanterior);
            consum.setFecha(fechaemision);
            consum.setMedidor(codmed);

            try {
                imp.insertar(consum);
            } catch (Exception ex) {
                Logger.getLogger(ServIngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
             request.getRequestDispatcher("FormularioConsumo.jsp").forward(request, response);

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
