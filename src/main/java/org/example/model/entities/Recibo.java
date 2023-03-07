package org.example.model.entities;

import java.util.Date;
import java.util.List;

public class Recibo {

    private int importe;

    private String fecha;

    private String descripcion;
    private Cocinero facturadaPor;

    private Cliente comprador;

    private List<ItemFactura> items;

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Cocinero getFacturadaPor() {
        return facturadaPor;
    }

    public void setFacturadaPor(Cocinero facturadaPor) {
        this.facturadaPor = facturadaPor;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }
}
