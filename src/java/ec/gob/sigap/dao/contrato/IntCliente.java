/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.dao.contrato;

import ec.gob.sigap.entidades.Cliente;
import java.util.List;

/**
 *
 * @author paul
 */
public interface IntCliente {
    
    public int insertar(Cliente cliente) throws Exception;

    public Cliente obtenerCodigo(int id) throws Exception;
    
    public List<Cliente> obtenerTodos() throws Exception;
        
    public List<Cliente> obtenerCedNom(String dato) throws Exception;
    
    public Cliente obtenerCed(String dato) throws Exception;
    
    public int obtenerCodCed(String cedula) throws Exception;    
        
    public int actualizar(Cliente usuario) throws Exception;

    public int eliminar(int id) throws Exception;
    
}
