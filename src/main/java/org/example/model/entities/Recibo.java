package org.example.model.entities;

import java.util.Date;
import java.util.List;

public class Recibo {

    private Integer id;
    private Integer importe;

    private String fecha;

    private String descripcion;
    private Integer cocineroId;

    private Integer compradorId;

    private List<Integer> items;

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public Integer getCocineroId() {
        return cocineroId;
    }

    public void setCocineroId(Integer cocineroId) {
        this.cocineroId = cocineroId;
    }

    public Integer getCompradorId() {
        return compradorId;
    }

    public void setCompradorId(Integer compradorId) {
        this.compradorId = compradorId;
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

    public List<Integer> getItems() {
        return items;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
