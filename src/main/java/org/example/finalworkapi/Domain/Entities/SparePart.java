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

    @JoinColumn(name = "sparePart")
    protected String sparePart;

    @JoinColumn(name = "stock")
    protected int stock;

    @JoinColumn(name = "price")
    protected int price;

    // Constructors, getters, setters
    // You can generate these using your IDE or manually


    public SparePart(int idSparePart, String sparePart, int stock, int price) {
        this.idSparePart = idSparePart;
        this.sparePart = sparePart;
        this.stock = stock;
        this.price = price;
    }

    public SparePart() {}

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}