package org.example.finalworkapi.Application.DTOs.SparePartDTO;

public class SparePartDTO {

    protected int idSparePart;
    protected String sparePart;
    protected int stock;
    protected double price;

    public SparePartDTO(int idSparePart, String sparePart, int stock, double price) {
        this.idSparePart = idSparePart;
        this.sparePart = sparePart;
        this.stock = stock;
        this.price = price;
    }

    public SparePartDTO() {}

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
