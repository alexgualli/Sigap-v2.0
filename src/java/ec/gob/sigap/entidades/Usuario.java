/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.entidades;

/**
 *
 * @author paul
 */
public class Usuario {
    private int codigo;
    private String nombre;
    private String clave;
    private String tipo;
    private String apellido;
    private String correo;
    private int nivel;
    private String direccion;
    private String cedula;
    private String genero;
    private String nombreUsu;
    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String clave, String tipo, String apellido, String correo, int nivel, String direccion, String cedula, String genero, String nombreUsu) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clave = clave;
        this.tipo = tipo;
        this.apellido = apellido;
        this.correo = correo;
        this.nivel = nivel;
        this.direccion = direccion;
        this.cedula = cedula;
        this.genero = genero;
        this.nombreUsu = nombreUsu;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString(){
        return this.nombreUsu+" "+this.correo+" "+this.clave;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }
    
    
    
    
}
