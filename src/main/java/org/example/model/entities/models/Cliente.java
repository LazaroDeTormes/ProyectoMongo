package org.example.model.entities.models;

import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

public class Cliente {

    private ObjectId id;
    private String nombre;
    private String apellidos;
    private String fecha;
    private List<ObjectId> reciboId;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<ObjectId> getReciboId() {
        return reciboId;
    }

    public void setRecibo(List<ObjectId> reciboId) {
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
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha='" + fecha + '\'' +
                ", reciboId=" + reciboId +
                ", correo='" + correo + '\'' +
                '}';
    }
}
