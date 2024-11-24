package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Logistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idLogistics;
    protected String email;
    protected String password;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Logistics() {
    }

    public Logistics(int idLogistics, String email, String password) {
        this.idLogistics = idLogistics;
        this.email = email;
        this.password = password;
    }

    public Logistics(String logistics) {
        this.idLogistics = Integer.parseInt(logistics);
    }

    public int getIdLogistics() {
        return idLogistics;
    }

    public void setIdLogistics(int idLogistics) {
        this.idLogistics = idLogistics;
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
