package org.example.model.entities.models;

import org.bson.types.ObjectId;

import java.util.List;

public class Recibo {

    private ObjectId id;
    private int importe;

    private String fecha;

    private String descripcion;
    private ObjectId cocineroId;

    private ObjectId compradorId;

    private List<ItemFactura> items;

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public ObjectId getCocineroId() {
        return cocineroId;
    }

    public void setCocineroId(ObjectId cocineroId) {
        this.cocineroId = cocineroId;
    }

    public ObjectId getCompradorId() {
        return compradorId;
    }

    public void setCompradorId(ObjectId compradorId) {
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

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Recibo{" +
                "id=" + id +
                ", importe=" + importe +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cocineroId=" + cocineroId +
                ", compradorId=" + compradorId +
                ", items=" + items +
                '}';
    }
}
