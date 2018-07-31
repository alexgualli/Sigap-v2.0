/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author paul
 */
public class Factura {
    
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    private int codigo;
    private Cliente cliente;
    private Usuario usuario;
    private String observacion;
    private String estado;
    private Date fechaEmi;
    private double total;
    private double descuento;
    private Medidor medidor;
    private Deuda deuda;

    public Factura() {
    }

    public Factura(int codigo, Cliente cliente, Usuario usuario, String observacion, String estado, Date fechaEmi, double total, double descuento, Medidor medidor, Deuda deuda) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.usuario = usuario;
        this.observacion = observacion;
        this.estado = estado;
        this.fechaEmi = fechaEmi;
        this.total = total;
        this.descuento = descuento;
        this.medidor = medidor;
        this.deuda = deuda;
    }
    
    public Factura(int codigo, Cliente cliente, Usuario usuario, String observacion, String estado, String fechaEmi, double total, double descuento, Medidor medidor, Deuda deuda) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.usuario = usuario;
        this.observacion = observacion;
        this.estado = estado;
        try {
            this.fechaEmi =sdf.parse(fechaEmi);
        } catch (ParseException e) {
            System.err.println("No se ha podido definir las fechas. " + e.getMessage());
        } 
        this.total = total;
        this.descuento = descuento;
        this.medidor = medidor;
        this.deuda = deuda;
    }
    
    public void setFechaEmi(String fechaEmi) {
        try {
            this.fechaEmi = sdf.parse(fechaEmi);
        } catch (ParseException e) {
            System.err.println("No se ha podido definir la fecha de inicio. " + e.getMessage());
        }

    }

    public Deuda getDeuda() {
        return deuda;
    }

    public void setDeuda(Deuda deuda) {
        this.deuda = deuda;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaEmi() {
        return fechaEmi;
    }

    public void setFechaEmi(Date fechaEmi) {
        this.fechaEmi = fechaEmi;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Medidor getMedidor() {
        return medidor;
    }

    public void setMedidor(Medidor medidor) {
        this.medidor = medidor;
    }
    
    @Override
    public String toString(){
        return this.estado+" "+this.fechaEmi+" "+this.total;
    }
    
}
