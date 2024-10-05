package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.*;

//
@Entity
@Table(name = "typemaintenance")
public class TypeMaintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idTypeMaintenance;
    protected String nameType;
    protected String description;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public TypeMaintenance() {
    }

    public TypeMaintenance(int idTypeMaintenance, String nameType, String description) {
        this.idTypeMaintenance = idTypeMaintenance;
        this.nameType = nameType;
        this.description = description;
    }

    public int getIdTypeMaintenance() {
        return idTypeMaintenance;
    }

    public void setIdTypeMaintenance(int idTypeMaintenance) {
        this.idTypeMaintenance = idTypeMaintenance;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
