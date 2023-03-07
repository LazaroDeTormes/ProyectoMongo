package org.example.model.entities;

import java.util.List;

public class Cocinero {

    private Integer id;
    private String nombre;

    private String apellidos;

    private Integer cocheId;

    private List<Integer> reciboId;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCocheId() {
        return cocheId;
    }

    public void setCocheId(Integer cocheId) {
        this.cocheId = cocheId;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Integer> getReciboId() {
        return reciboId;
    }

    public void setReciboId(List<Integer> reciboId) {
        this.reciboId = reciboId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
