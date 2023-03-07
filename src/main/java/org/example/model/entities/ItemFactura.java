package org.example.model.entities;

public class ItemFactura {

    private Integer id;
    private Integer cantidad;

    private Integer platoId;

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPlatoId() {
        return platoId;
    }

    public void setPlatoId(Integer platoId) {
        this.platoId = platoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
