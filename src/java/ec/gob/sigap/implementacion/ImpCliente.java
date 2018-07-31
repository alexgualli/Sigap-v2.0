/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.implementacion;

import ec.gob.sigap.accesodatos.Coneccion;
import ec.gob.sigap.accesodatos.Parametro;
import ec.gob.sigap.dao.contrato.IntCliente;
import ec.gob.sigap.entidades.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ImpCliente implements IntCliente {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Cliente cliente) throws Exception {

        int insert = 0;
        String sql = "INSERT INTO cliente(nombre, apellido, direccion, cedula, correo, fecha_nac, codigo_discapacidad, telefono, edad)\n"
                + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, cliente.getNombre()));
        prts.add(new Parametro(2, cliente.getApellido()));
        prts.add(new Parametro(3, cliente.getDireccion()));
        prts.add(new Parametro(4, cliente.getCedula()));
        prts.add(new Parametro(5, cliente.getCorreo()));
        prts.add(new Parametro(6, cliente.getFechaNac()));
        prts.add(new Parametro(7, cliente.getCodigoDis()));
        prts.add(new Parametro(8, cliente.getTelefono()));
        prts.add(new Parametro(9, cliente.getEdad()));

        if (cliente.getCodigo() != 0) {
            sql = "INSERT INTO cliente(nombre, apellido, direccion, cedula, correo, fecha_nac, codigo_discapacidad, telefono, edad, codigo)\n"
                    + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            prts.add(new Parametro(10, cliente.getCodigo()));
        }
        try {
            insert = con.querySet(sql, prts);

        } catch (Exception e) {
            throw e;
        }

        return insert;

    }

    @Override
    public Cliente obtenerCodigo(int id) throws Exception {

        Cliente cliente = null;
        String sql = "SELECT codigo, nombre, apellido, direccion, cedula, correo, fecha_nac, \n"
                + "       codigo_discapacidad, telefono, edad\n"
                + "  FROM cliente "
                + "WHERE codigo = ?; ";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, id));
        try {
            ResultSet rst = con.queryGet(sql, prts);
            while (rst.next()) {
                cliente = new Cliente();
                cliente.setCodigo(rst.getInt("codigo"));
                cliente.setNombre(rst.getString("nombre"));
                cliente.setApellido(rst.getString("apellido"));
                cliente.setDireccion(rst.getString("direccion"));
                cliente.setCedula(rst.getString("cedula"));
                cliente.setCorreo(rst.getString("correo"));
                cliente.setFechaNac(rst.getString("fecha_nac"));
                cliente.setCodigoDis(rst.getInt("codigo_discapacidad"));                
                cliente.setTelefono(rst.getString("telefono"));
                cliente.setEdad(rst.getInt("edad"));

            }
        } catch (Exception e) {
        }
        return cliente;
    }

    @Override
    public List<Cliente> obtenerTodos() throws Exception {
        
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT codigo, nombre, apellido, direccion, cedula, correo, fecha_nac, \n"
                + "       codigo_discapacidad, telefono, edad\n"
                + "  FROM cliente order by apellido ASC;";
        try {
            ResultSet rst = con.queryGet(sql);
            while (rst.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rst.getInt("codigo"));
                cliente.setNombre(rst.getString("nombre"));
                cliente.setApellido(rst.getString("apellido"));
                cliente.setDireccion(rst.getString("direccion"));
                cliente.setCedula(rst.getString("cedula"));
                cliente.setCorreo(rst.getString("correo"));
                cliente.setFechaNac(rst.getString("fecha_nac"));
                cliente.setCodigoDis(rst.getInt("codigo_discapacidad"));                
                cliente.setTelefono(rst.getString("telefono"));
                cliente.setEdad(rst.getInt("edad"));
                lista.add(cliente);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw  e;
        }

        return lista;
    }

   

    @Override
    public int actualizar(Cliente cliente) throws Exception {
        int update = 0;
        String sql = "UPDATE cliente\n"
                + "   SET nombre=?, apellido=?, direccion=?, cedula=?, correo=?, \n"
                + "       fecha_nac=?, codigo_discapacidad=?, telefono=?, \n"
                + "       edad=?\n"
                + " WHERE codigo=?;";

        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, cliente.getNombre()));
        prts.add(new Parametro(2, cliente.getApellido()));
        prts.add(new Parametro(3, cliente.getDireccion()));
        prts.add(new Parametro(4, cliente.getCedula()));
        prts.add(new Parametro(5, cliente.getCorreo()));
        prts.add(new Parametro(6, cliente.getFechaNac()));
        prts.add(new Parametro(7, cliente.getCodigoDis()));        
        prts.add(new Parametro(8, cliente.getTelefono()));
        prts.add(new Parametro(9, cliente.getEdad()));
        prts.add(new Parametro(10, cliente.getCodigo()));
        try {
            update = con.querySet(sql, prts);
        } catch (Exception e) {
            throw e;
        }
        return update;
    }

    @Override
    public int eliminar(int id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM cliente\n"
                + " WHERE codigo = ?;";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, id));
        try {
            delete = con.querySet(sql, prts);
        } catch (Exception e) {
            throw e;
        }
        return delete;
    }

    @Override
    public List<Cliente> obtenerCedNom(String dato) throws Exception {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT codigo, nombre, apellido, direccion, cedula, correo, fecha_nac, \n"
                + "       codigo_discapacidad, telefono, edad\n"
                + "  FROM cliente WHERE nombre LIKE '" + dato + "%' OR cedula LIKE '" + dato + "%' "
                + "order by apellido ASC;";
        try {
            ResultSet rst = con.queryGet(sql);
            while (rst.next()) {

                Cliente cliente = new Cliente();
                cliente.setCodigo(rst.getInt("codigo"));
                cliente.setNombre(rst.getString("nombre"));
                cliente.setApellido(rst.getString("apellido"));
                cliente.setDireccion(rst.getString("direccion"));
                cliente.setCedula(rst.getString("cedula"));
                cliente.setCorreo(rst.getString("correo"));
                cliente.setFechaNac(rst.getString("fecha_nac"));
                cliente.setCodigoDis(rst.getInt("codigo_discapacidad"));                
                cliente.setTelefono(rst.getString("telefono"));
                cliente.setEdad(rst.getInt("edad"));
                lista.add(cliente);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

        return lista;
    }

    @Override
    public int obtenerCodCed(String cedula) throws Exception {
        int codigo =0;
        String sql = "SELECT codigo \n"
                + "  FROM cliente "
                + "WHERE cedula=?";
        List<Parametro> prts = new ArrayList<>();
        
        prts.add(new Parametro(1, cedula));
        
        try {
            ResultSet rst = con.queryGet(sql,prts);
            while (rst.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rst.getInt("codigo"));
                codigo= cliente.getCodigo();
            }
        } catch (SQLException e) {
            throw e;
        }
        
        return codigo;
    }
    
    
    @Override
    public Cliente obtenerCed(String dato) throws Exception {
        
        Cliente cliente = null;
        
        String sql = "SELECT codigo, nombre, apellido, direccion, cedula, correo, fecha_nac, \n"
                + "       codigo_discapacidad, telefono, edad\n"
                + "  FROM cliente "
                + " WHERE cedula=? ";
        
        List<Parametro> prts = new ArrayList<>();
        
        prts.add(new Parametro(1, dato));
        
        try {
            ResultSet rst = con.queryGet(sql, prts);
            while (rst.next()) {
                cliente = new Cliente();
                cliente.setCodigo(rst.getInt("codigo"));
                cliente.setNombre(rst.getString("nombre"));
                cliente.setApellido(rst.getString("apellido"));
                cliente.setDireccion(rst.getString("direccion"));
                cliente.setCedula(rst.getString("cedula"));
                cliente.setCorreo(rst.getString("correo"));
                cliente.setFechaNac(rst.getString("fecha_nac"));
                cliente.setCodigoDis(rst.getInt("codigo_discapacidad"));                
                cliente.setTelefono(rst.getString("telefono"));
                cliente.setEdad(rst.getInt("edad"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

        return cliente;
    }

}
