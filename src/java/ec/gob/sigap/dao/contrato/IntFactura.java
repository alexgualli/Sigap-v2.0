/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.dao.contrato;

import ec.gob.sigap.entidades.Factura;
import java.util.List;

/**
 *
 * @author paul
 */
public interface IntFactura {
    
    public int insertar(Factura factura) throws Exception;

    public Factura obtenerCodigo(int id) throws Exception;
    
    public List<Factura> obtenerTodos() throws Exception;
      
    public int actualizar(Factura factura) throws Exception;

    public int eliminar(int id) throws Exception;
    
}
