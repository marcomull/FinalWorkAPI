package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "administrator")
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idAdministrator;
    protected String email;
    protected String password;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public Administrator(){
    }

    public Administrator(int idAdministrator, String email, String password) {
        this.idAdministrator = idAdministrator;
        this.email = email;
        this.password = password;
    }

    public int getIdAdministrator() {
        return idAdministrator;
    }

    public void setIdAdministrator(int idAdministrator) {
        this.idAdministrator = idAdministrator;
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
