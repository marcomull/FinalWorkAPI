package org.example.finalworkapi.Domain.Entities;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "sparepart")
public class SparePart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSparePart")
    protected int idSparePart;

    @ManyToOne
    @JoinColumn(name = "idLogistics")
    protected Logistics idLogistics;

    @ManyToOne
    @JoinColumn(name = "idMechanic")
    protected Mechanic idMechanic;

    @Temporal(TemporalType.DATE)
    @JoinColumn(name = "arrivalDate")
    protected Date arrivalDate;

    @JoinColumn(name = "sparePart")
    protected String sparePart;

    @JoinColumn(name = "quantity")
    protected int quantity;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually

    public SparePart() {
    }

    public SparePart(int idSparePart, Logistics idLogistics, Mechanic idMechanic, Date arrivalDate, String sparePart, int quantity) {
        this.idSparePart = idSparePart;
        this.idLogistics = idLogistics;
        this.idMechanic = idMechanic;
        this.arrivalDate = arrivalDate;
        this.sparePart = sparePart;
        this.quantity = quantity;
    }

    public SparePart(int sparePart) {
        this.idSparePart = sparePart;
    }

    public int getIdSparePart() {
        return idSparePart;
    }

    public void setIdSparePart(int idSparePart) {
        this.idSparePart = idSparePart;
    }

    public Logistics getIdLogistics() {
        return idLogistics;
    }

    public void setIdLogistics(Logistics idLogistics) {
        this.idLogistics = idLogistics;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Mechanic getIdMechanic() {
        return idMechanic;
    }

    public void setIdMechanic(Mechanic idMechanic) {
        this.idMechanic = idMechanic;
    }
}
