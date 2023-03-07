package org.example.model.entities;

public class Coche {

    private Integer id;
    private String matricula;

    private String modelo;

    private Integer conductorId;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getConductorId() {
        return conductorId;
    }

    public void setConductorId(Integer conductorId) {
        this.conductorId = conductorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
