package org.example.finalworkapi.Domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "sparepart")
public class SparePart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSparePart")
    protected int idSparePart;

    @JoinColumn(name = "sparePart")
    protected String sparePart;

    @JoinColumn(name = "stock")
    protected int stock;

    @JoinColumn(name = "price")
    protected double price;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually


    public SparePart(int idSparePart, String sparePart, int stock, double price) {
        this.idSparePart = idSparePart;
        this.sparePart = sparePart;
        this.stock = stock;
        this.price = price;
    }

    public SparePart() {}

    public SparePart(int idSparePart) {
        this.idSparePart = idSparePart;
    }

    public int getIdSparePart() {
        return idSparePart;
    }

    public void setIdSparePart(int idSparePart) {
        this.idSparePart = idSparePart;
    }

    public String getSparePart() {
        return sparePart;
    }

    public void setSparePart(String sparePart) {
        this.sparePart = sparePart;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}