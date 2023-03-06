package org.example.model.entities;

import java.util.List;

public class Cocinero {

    private String nombre;

    private String apellidos;

    private Coche coche;

    private List<Recibo> recibo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Recibo> getRecibo() {
        return recibo;
    }

    public void setRecibo(List<Recibo> recibo) {
        this.recibo = recibo;
    }
}
