package org.example.model.entities.models;

import org.bson.types.ObjectId;

public class ItemFactura {

    private ObjectId id;
    private int cantidad;

    private ObjectId platoId;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ObjectId getPlatoId() {
        return platoId;
    }

    public void setPlatoId(ObjectId platoId) {
        this.platoId = platoId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
