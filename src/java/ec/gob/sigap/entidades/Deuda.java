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
public class Deuda {
    private int codigo;
    private double valor;
    private int mesesPen;
    private Cliente cliente;

    public Deuda() {
    }

    public Deuda(int codigo, double valor, int mesesPen, Cliente cliente) {
        this.codigo = codigo;
        this.valor = valor;
        this.mesesPen = mesesPen;
        this.cliente = cliente;
    }

    
    
    @Override
    public String toString(){
        return this.mesesPen+" "+this.valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMesesPen() {
        return mesesPen;
    }

    public void setMesesPen(int mesesPen) {
        this.mesesPen = mesesPen;
    }
    
}
