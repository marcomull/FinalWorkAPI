package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idDriver;
    protected String nameDriver;
    protected int licenseName;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Driver() {
    }

    public Driver(int idDriver, String nameDriver, int licenseName) {
        this.idDriver = idDriver;
        this.nameDriver = nameDriver;
        this.licenseName = licenseName;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public int getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(int licenseName) {
        this.licenseName = licenseName;
    }

}
