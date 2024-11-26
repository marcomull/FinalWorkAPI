package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRequest")
    protected int idRequest;

    @ManyToOne
    @JoinColumn(name ="idMechanic")
    protected Mechanic idMechanic;

    @ManyToOne
    @JoinColumn(name ="idLogistics")
    protected Logistics idLogistics;

    @Temporal(TemporalType.DATE)
    @JoinColumn(name ="requestDate")
    protected Date requestDate;

    @JoinColumn(name = "description")
    protected String description;

    @JoinColumn(name = "state")
    protected String state;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually


    public Request(int idRequest, Mechanic idMechanic, Logistics idLogistics, Date requestDate, String description, String state) {
        this.idRequest = idRequest;
        this.idMechanic = idMechanic;
        this.idLogistics = idLogistics;
        this.requestDate = requestDate;
        this.description = description;
        this.state = state;
    }

    public Request() {}

    public Request(int request) {
        this.idRequest = request;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public Mechanic getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(Mechanic idMechanic) {
        this.idMechanic = idMechanic;
    }

    public Logistics getIdLogistics() {
        return idLogistics;
    }

    public void setIdLogistics(Logistics idLogistics) {
        this.idLogistics = idLogistics;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

