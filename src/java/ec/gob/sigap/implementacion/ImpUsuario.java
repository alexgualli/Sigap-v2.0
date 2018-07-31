/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.implementacion;

import ec.gob.sigap.accesodatos.Parametro;
import ec.gob.sigap.entidades.Usuario;
import ec.gob.sigap.accesodatos.Coneccion;
import ec.gob.sigap.dao.contrato.IntUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NuevoUsuario
 */
public class ImpUsuario implements IntUsuario {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Usuario usuario) throws Exception {
        int insert = 0;
        String sql = "INSERT INTO usuario(nombre, clave, tipo, apellido, correo, nivel, direccion, cedula, genero, nombre_usuario)\n"
                + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, usuario.getNombre()));
        prts.add(new Parametro(2, usuario.getClave()));
        prts.add(new Parametro(3, usuario.getTipo()));
        prts.add(new Parametro(4, usuario.getApellido()));
        prts.add(new Parametro(5, usuario.getCorreo()));
        prts.add(new Parametro(6, usuario.getNivel()));
        prts.add(new Parametro(7, usuario.getDireccion()));
        prts.add(new Parametro(8, usuario.getCedula()));
        prts.add(new Parametro(9, usuario.getGenero()));
        prts.add(new Parametro(10, usuario.getNombreUsu()));
        if (usuario.getCodigo() != 0) {
            sql = "INSERT INTO usuario(nombre, clave, tipo, apellido, correo, nivel, direccion, cedula, genero,nombre_usuario, codigo)\n"
                    + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            prts.add(new Parametro(11, usuario.getCodigo()));

        }
        try {
            insert = con.querySet(sql, prts);
        } catch (Exception e) {
            throw e;
        }

        return insert;
    }

    @Override
    public Usuario obtenerCodigo(int id) throws Exception {
        Usuario usuario = null;

        String sql = "SELECT codigo, nombre, clave, tipo, apellido, correo, nivel, direccion, \n"
                + "       cedula, genero, nombre_usuario\n"
                + "  FROM usuario where codigo = ?;";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, id));
        try {
            ResultSet rst = con.queryGet(sql, prts);
            while (rst.next()) {
                usuario = new Usuario();
                usuario.setCodigo(rst.getInt("codigo"));
                usuario.setNombre(rst.getString("nombre"));
                usuario.setClave(rst.getString("clave"));
                usuario.setTipo(rst.getString("tipo"));
                usuario.setApellido(rst.getString("apellido"));
                usuario.setCorreo(rst.getString("correo"));
                usuario.setNivel(rst.getInt("nivel"));
                usuario.setCedula(rst.getString("cedula"));
                usuario.setGenero(rst.getString("genero"));
                usuario.setNombreUsu(rst.getString("nombre_usuario"));

            }
        } catch (Exception e) {
            throw e;
        }

        return usuario;
    }

    @Override
    public Usuario obtenerLogin(String nombre, String clave) throws Exception {
        Usuario usuario = null;

        String sql = "SELECT codigo, nombre, clave, tipo, apellido, correo, nivel, direccion, \n"
                + "       cedula, genero, nombre_usuario \n"
                + "  FROM usuario where nombre_usuario = ? and clave = ? ;";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, nombre));
        prts.add(new Parametro(2, clave));
        try {
            ResultSet rst = con.queryGet(sql, prts);
            while (rst.next()) {
                usuario = new Usuario();
                usuario.setCodigo(rst.getInt("codigo"));
                usuario.setNombre(rst.getString("nombre"));
                usuario.setClave(rst.getString("clave"));
                usuario.setTipo(rst.getString("tipo"));
                usuario.setApellido(rst.getString("apellido"));
                usuario.setCorreo(rst.getString("correo"));
                usuario.setNivel(rst.getInt("nivel"));
                usuario.setCedula(rst.getString("cedula"));
                usuario.setGenero(rst.getString("genero"));
                usuario.setNombreUsu(rst.getString("nombre_usuario"));
            }
        } catch (Exception e) {
            throw e;
        }

        return usuario;
    }

    @Override
    public List<Usuario> obtenerTodos() throws Exception {
        List<Usuario> lista = new ArrayList<>();

        String sql = "SELECT codigo, nombre, clave, tipo, apellido, correo, nivel, direccion, \n"
                + "       cedula, genero, nombre_usuario\n"
                + "  FROM usuario order by nombre ASC;";
        try {
            ResultSet rst = con.queryGet(sql);
            while (rst.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rst.getInt("codigo"));
                usuario.setNombre(rst.getString("nombre"));
                usuario.setClave(rst.getString("clave"));
                usuario.setTipo(rst.getString("tipo"));
                usuario.setApellido(rst.getString("apellido"));
                usuario.setCorreo(rst.getString("correo"));
                usuario.setNivel(rst.getInt("nivel"));
                usuario.setCedula(rst.getString("cedula"));
                usuario.setGenero(rst.getString("genero"));
                usuario.setNombreUsu(rst.getString("nombre_usuario"));
                lista.add(usuario);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

        return lista;
    }

    @Override
    public int actualizar(Usuario usuario) throws Exception {
        int update = 0;

        String sql = "UPDATE usuario\n"
                + "   SET nombre=?, clave=?, tipo=?, apellido=?, correo=?, nivel=?, \n"
                + "       direccion=?, cedula=?, genero=?, nombre_usuario=?\n"
                + " WHERE codigo=?;";

        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, usuario.getNombre()));
        prts.add(new Parametro(2, usuario.getClave()));
        prts.add(new Parametro(3, usuario.getTipo()));
        prts.add(new Parametro(4, usuario.getApellido()));
        prts.add(new Parametro(5, usuario.getCorreo()));
        prts.add(new Parametro(6, usuario.getNivel()));
        prts.add(new Parametro(7, usuario.getDireccion()));
        prts.add(new Parametro(8, usuario.getCedula()));
        prts.add(new Parametro(9, usuario.getGenero()));
        prts.add(new Parametro(10, usuario.getNombreUsu()));
        prts.add(new Parametro(11, usuario.getCodigo()));

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
        String sql = "DELETE FROM public.usuario "
                + "WHERE codigo = ?;";
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
    public Usuario obtenerCorreoUsuario(String dato) throws Exception {
        Usuario usuario = null;

        String sql = "SELECT codigo, nombre, clave, tipo, apellido, correo, nivel, direccion, \n"
                + "       cedula, genero, nombre_usuario\n"
                + "  FROM usuario WHERE nombre_usuario='"+dato+"' OR correo='"+dato+"' ";
        try {
            ResultSet rst = con.queryGet(sql);
            while (rst.next()) {
                usuario=new Usuario();
                usuario.setCodigo(rst.getInt("codigo"));
                usuario.setNombre(rst.getString("nombre"));
                usuario.setClave(rst.getString("clave"));
                usuario.setTipo(rst.getString("tipo"));
                usuario.setApellido(rst.getString("apellido"));
                usuario.setCorreo(rst.getString("correo"));
                usuario.setNivel(rst.getInt("nivel"));
                usuario.setCedula(rst.getString("cedula"));
                usuario.setGenero(rst.getString("genero"));
                usuario.setNombreUsu(rst.getString("nombre_usuario"));

            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

        return usuario;
    }

    @Override
    public int actualizarClave(Usuario usuario) throws Exception {
        int update = 0;

        String sql = "UPDATE usuario\n"
                + "   SET clave=? \n"
                + " WHERE nombre_usuario='"+usuario.getNombreUsu()+"' OR correo='"+usuario.getCorreo()+"' ;";

        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, usuario.getClave()));

        try {
            update = con.querySet(sql, prts);
        } catch (Exception e) {
            throw e;
        }

        return update;
    }

    @Override
    public int obtenerNivel(String usua, String clave) throws Exception {
        int nivel =0;
        String sql = "SELECT nivel "
                + "FROM usuario  "
                + "WHERE nombre_usuario = ? and clave = ?";
        List<Parametro> prts = new ArrayList<>(); 
        System.out.println(usua+" "+clave);
        prts.add(new Parametro(1, usua));
        prts.add(new Parametro(2, clave));        
        try {
            ResultSet rst = con.queryGet(sql,prts);
            while (rst.next()) {                
                nivel= rst.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        
        return nivel;
    }

}
