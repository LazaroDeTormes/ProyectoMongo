package org.example.model.entities.models;

import org.bson.types.ObjectId;

import java.util.List;

public class Cocinero {

    private ObjectId id;
    private String nombre;

    private String apellidos;

    private ObjectId cocheId;

    private List<ObjectId> reciboId;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ObjectId getCocheId() {
        return cocheId;
    }

    public void setCocheId(ObjectId cocheId) {
        this.cocheId = cocheId;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<ObjectId> getReciboId() {
        return reciboId;
    }

    public void setReciboId(List<ObjectId> reciboId) {
        this.reciboId = reciboId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cocinero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cocheId=" + cocheId +
                ", reciboId=" + reciboId +
                '}';
    }
}
