package org.example.model.entities.models;

import org.bson.types.ObjectId;

public class Coche {

    private ObjectId id;
    private String matricula;

    private String modelo;

    private ObjectId conductorId;

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

    public ObjectId getConductorId() {
        return conductorId;
    }

    public void setConductorId(ObjectId conductorId) {
        this.conductorId = conductorId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", conductorId=" + conductorId +
                '}';
    }
}
