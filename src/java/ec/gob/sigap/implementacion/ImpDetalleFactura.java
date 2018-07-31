/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.implementacion;

import ec.gob.sigap.accesodatos.Coneccion;
import ec.gob.sigap.accesodatos.Parametro;
import ec.gob.sigap.dao.contrato.IntDetalleFactura;
import ec.gob.sigap.entidades.DetalleFactura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class ImpDetalleFactura implements IntDetalleFactura {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(DetalleFactura detalle) throws Exception {
        int insert = 0;
        String sql = "INSERT INTO public.detalle_factura"
                + "(descripcion, codigo_factura, subtotal, codigo_consumo, \n"
                + "            codigo_servicio, m3_minimo, costo_minimo, costo_excedente, consumo_actual, \n"
                + "            consumo_anterior, consumo, m3_excedente, valor_m3_excedente)\n"
                + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, detalle.getDescripcion()));
        prts.add(new Parametro(2, detalle.getFactura().getCodigo()));
        prts.add(new Parametro(3, detalle.getSubtotal()));
        prts.add(new Parametro(4, detalle.getConsumo().getCodigo()));
        prts.add(new Parametro(5, detalle.getServicio().getCodigo()));
        prts.add(new Parametro(6, detalle.getM3Min()));
        prts.add(new Parametro(7, detalle.getCostoMin()));
        prts.add(new Parametro(8, detalle.getCostoExc()));
        prts.add(new Parametro(9, detalle.getConsumoAct()));
        prts.add(new Parametro(10, detalle.getConsumoAnt()));
        prts.add(new Parametro(11, detalle.getConsumoValor()));
        prts.add(new Parametro(12, detalle.getM3Exc()));
        prts.add(new Parametro(13, detalle.getValorM3Exc()));

        if (detalle.getCodigo() != 0) {
            sql = "INSERT INTO public.detalle_factura(\n"
                    + "            descripcion, codigo_factura, subtotal, codigo_consumo, \n"
                    + "            codigo_servicio, m3_minimo, costo_minimo, costo_excedente, consumo_actual, \n"
                    + "            consumo_anterior, consumo, m3_excedente, valor_m3_excedente, codigo)\n"
                    + "    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            prts.add(new Parametro(14, detalle.getCodigo()));
        }
        try {
            insert = con.querySet(sql, prts);
        } catch (Exception e) {
            throw e;
        }
        return insert;
    }

    @Override
    public DetalleFactura obtenerCodigo(int id) throws Exception {

        ImpFactura impFactura = new ImpFactura();
        ImpServicio impServicio = new ImpServicio();
        ImpConsumo impConsumo = new ImpConsumo();

        DetalleFactura detalle = null;
        String sql = "SELECT codigo, descripcion, codigo_factura, subtotal, codigo_consumo, \n"
                + "       codigo_servicio, m3_minimo, costo_minimo, costo_excedente, consumo_actual, \n"
                + "       consumo_anterior, consumo, m3_excedente, valor_m3_excedente\n"
                + "  FROM detalle_factura"
                + " WHERE codigo=?;";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, id));
        try {
            ResultSet rst = con.queryGet(sql, prts);
            while (rst.next()) {
                detalle = new DetalleFactura();
                detalle.setCodigo(rst.getInt("codigo"));
                detalle.setDescripcion(rst.getString("descripcion"));
                detalle.setFactura(impFactura.obtenerCodigo(rst.getInt("codigo_factura")));
                detalle.setSubtotal(rst.getDouble("subtotal"));
                detalle.setConsumo(impConsumo.obtenerCodigo(rst.getInt("codigo_consumo")));
                detalle.setServicio(impServicio.obtenerCodigo(rst.getInt("codigo_servicio")));
                detalle.setM3Min(rst.getDouble("m3_minimo"));
                detalle.setCostoMin(rst.getDouble("costo_minimo"));
                detalle.setCostoExc(rst.getDouble("costo_excedente"));
                detalle.setConsumoAct(rst.getDouble("consumo_actual"));
                detalle.setConsumoAnt(rst.getDouble("consumo_anterior"));
                detalle.setConsumoValor(rst.getDouble("consumo"));
                detalle.setM3Exc(rst.getDouble("m3_excedente"));
                detalle.setValorM3Exc(rst.getDouble("valor_m3_excedente"));

            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
        return detalle;
    }

    @Override
    public List<DetalleFactura> obtenerTodos() throws Exception {
        ImpFactura impFactura = new ImpFactura();
        ImpServicio impServicio = new ImpServicio();
        ImpConsumo impConsumo = new ImpConsumo();

        List<DetalleFactura> lista = new ArrayList<>();
        String sql = "SELECT codigo, descripcion, codigo_factura, subtotal,"
                + " codigo_consumo, codigo_servicio, m3_minimo, costo_minimo, "
                + "costo_excedente, consumo_actual, consumo_anterior, consumo,"
                + " m3_excedente, valor_m3_excedente "
                + "FROM detalle_factura order by codigo_factura ASC;";

        try {
            ResultSet rst = con.queryGet(sql);
            while (rst.next()) {
                DetalleFactura detalle = new DetalleFactura();
                detalle.setCodigo(rst.getInt("codigo"));
                detalle.setDescripcion(rst.getString("descripcion"));
                detalle.setFactura(impFactura.obtenerCodigo(rst.getInt("codigo_factura")));
                detalle.setSubtotal(rst.getDouble("subtotal"));
                detalle.setConsumo(impConsumo.obtenerCodigo(rst.getInt("codigo_consumo")));
                detalle.setServicio(impServicio.obtenerCodigo(rst.getInt("codigo_servicio")));
                detalle.setM3Min(rst.getDouble("m3_minimo"));
                detalle.setCostoMin(rst.getDouble("costo_minimo"));
                detalle.setCostoExc(rst.getDouble("costo_excedente"));
                detalle.setConsumoAct(rst.getDouble("consumo_actual"));
                detalle.setConsumoAnt(rst.getDouble("consumo_anterior"));
                detalle.setConsumoValor(rst.getDouble("consumo"));
                detalle.setM3Exc(rst.getDouble("m3_excedente"));
                detalle.setValorM3Exc(rst.getDouble("valor_m3_excedente"));
                lista.add(detalle);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }

        return lista;
    }

    @Override
    public int actualizar(DetalleFactura detalle) throws Exception {
        int update = 0;
        String sql = "UPDATE public.detalle_factura\n"
                + "   SET descripcion=?, codigo_factura=?, subtotal=?, codigo_consumo=?, \n"
                + "       codigo_servicio=?, m3_minimo=?, costo_minimo=?, costo_excedente=?, \n"
                + "       consumo_actual=?, consumo_anterior=?, consumo=?, m3_excedente=?, \n"
                + "       valor_m3_excedente=?\n"
                + " WHERE codigo=?;";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, detalle.getDescripcion()));
        prts.add(new Parametro(2, detalle.getFactura().getCodigo()));
        prts.add(new Parametro(3, detalle.getSubtotal()));
        prts.add(new Parametro(4, detalle.getConsumo().getCodigo()));
        prts.add(new Parametro(5, detalle.getServicio().getCodigo()));
        prts.add(new Parametro(6, detalle.getM3Min()));
        prts.add(new Parametro(7, detalle.getCostoMin()));
        prts.add(new Parametro(8, detalle.getCostoExc()));
        prts.add(new Parametro(9, detalle.getConsumoAct()));
        prts.add(new Parametro(10, detalle.getConsumoAnt()));
        prts.add(new Parametro(11, detalle.getConsumoValor()));
        prts.add(new Parametro(12, detalle.getM3Exc()));
        prts.add(new Parametro(13, detalle.getValorM3Exc()));
        prts.add(new Parametro(14, detalle.getCodigo()));
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
        String sql = "DELETE FROM public.detalle_factura\n"
                + " WHERE codigo=?;";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, id));
        try {
            delete = con.querySet(sql, prts);
        } catch (Exception e) {
            throw e;
        }
        return delete;
    }

}
