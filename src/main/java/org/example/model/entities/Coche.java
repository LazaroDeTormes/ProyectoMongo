package org.example.model.entities;

public class Coche {

    private String matricula;

    private String modelo;

    private Cocinero conductor;

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

    public Cocinero getConductor() {
        return conductor;
    }

    public void setConductor(Cocinero conductor) {
        this.conductor = conductor;
    }
}
