package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idMechanic;
    protected String email;
    protected String password;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Mechanic() {
    }

    public Mechanic(int idMechanic, String email, String password) {
        this.idMechanic = idMechanic;
        this.email = email;
        this.password = password;
    }

    public Mechanic(int idMechanic) {
        this.idMechanic = idMechanic;
    }

    public Mechanic(String mechanic) {
        this.email = mechanic;
    }

    public int getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(int idMechanic) {
        this.idMechanic = idMechanic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
