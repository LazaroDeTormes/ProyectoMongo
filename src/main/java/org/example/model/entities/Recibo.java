package org.example.model.entities;

import java.util.Date;
import java.util.List;

public class Recibo {

    private int importe;

    private Date fecha;

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
}
