package org.example.model.entities;

import java.util.Date;
import java.util.List;

public class Cliente {

    private Integer id;
    private String nombre;
    private String apellidos;
    private String fecha;
    private List<Integer> reciboId;
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

    public List<Integer> getReciboId() {
        return reciboId;
    }

    public void setRecibo(List<Integer> reciboId) {
        this.reciboId = reciboId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
